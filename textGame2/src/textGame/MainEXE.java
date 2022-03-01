package textGame;

import java.util.Scanner;

public class MainEXE {
		
	public static void main (String[] arg) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		
		//控制迴圈
		String switcH;
		
		//主角變數放外面方便控制迴圈
		MainCharacter mainCharacter;
		
		//整個遊戲包迴圈.之後可以做reStart
		do {			
			System.out.println("Welcome!");
			RulesAndMethod.textDelay();
			
			System.out.print("請輸入暱稱:");
			String name = scanner.next();; 					
			RulesAndMethod.textDelay();			
			System.out.println("你好阿\"" + name + "\"");
			
			//開始遊戲時new一個新角色.基礎HP.ATK.DEF可至MainCharacter class自由調整+random
			mainCharacter = new MainCharacter(name);
			RulesAndMethod.textDelay();
			//讀規則
			RulesAndMethod.rules();
			switcH = scanner.next();
			if(switcH.toLowerCase().equals("go")) {
				RulesAndMethod.textDelay();
				System.out.println("Game start!");
				RulesAndMethod.textDelay();
				RulesAndMethod.callCondition(mainCharacter);
				RulesAndMethod.textDelay();
				
				do{					
					//scanner寫在別的class.method再用那個method不知道行不行
					//如果可以.下面go的do while迴圈內可合併成一個method
					String choice;
					do {					
						RulesAndMethod.go();
						choice = scanner.next();
						RulesAndMethod.afterGo(choice, mainCharacter);
					}while(!(choice.equals("1")||choice.equals("2")) && mainCharacter.getHp()>0);
					
					//go完遇到怪物.接著battle
					if(mainCharacter.getHp()>0) {
						RulesAndMethod.battle(mainCharacter);
					}else {
						//打之前沒HP就直接結束
						System.out.println("沒HP了...( ´•̥̥̥ω•̥̥̥` )\nGame Over!");
						System.out.println("最終得分:"+RulesAndMethod.score);
					}
					switcH = "stop";
						
					//打完HP>0就繼續,HP<0就離開
				}while(mainCharacter.getHp()>0);
				
			}else {
				System.out.println("不玩?那88(╬ﾟдﾟ)╭∩╮");
				mainCharacter.setHp(0);
				switcH = "stop";
			}
		}while(!switcH.equals("stop") || mainCharacter.getHp()>0);
		scanner.close();
	}
	
}
