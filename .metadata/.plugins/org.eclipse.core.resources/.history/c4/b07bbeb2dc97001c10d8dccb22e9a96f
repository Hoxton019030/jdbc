package textGame;

import java.util.Random;
import java.util.Scanner;

public class RulesAndMethod {
	//分數設在battle方法外才不會每次call battle()分數都歸0
	static int score = 0;
	
	//遊戲規則，攻擊階段輸入888可直接秒殺怪物，輸入000可快速結束遊戲
	static void rules() throws InterruptedException {
		System.out.println("遊戲規則:輸入數字1.2.3選擇路線和攻擊方式，前進直到HP歸計分\nKeep going until U die(ノ▼Д▼)ノ");
		textDelay();
		System.out.println("輸入\"go\"開始遊戲");
	}
	
	//呼叫當前狀態
	static void callCondition(MainCharacter x) {
		System.out.println(
				"*****************"+
				"\n名稱:"+x.getName()+
				"\n目前HP:"+x.getHp()+
				"\n目前ATK:"+x.getAtk()+
				"\n目前DEF:"+x.getDef()+
				"\n*****************"
				);
	}
			
	//前進選項
	static void go() {
	Random ran = new Random();
	String[] goList = {
			"前面出現一條岔路,要怎麼走?\n\"1.向左\"/\"2.向右\":",
			"前面出現一面山壁,要怎麼走?\n\"1.爬上山\"/\"2.繞道走\":",
			"前面出現一條河,要怎麼走?\n\"1.游過去\"/\"2.繞道走\":",
			"前面出現一個山洞,要怎麼走?\n\"1.往內走\"/\"2.繞道走\":",
			"前面出現一個廢墟,要怎麼走?\n\"1.走進去\"/\"2.趕快閃\":"
			};
	System.out.println(goList[ran.nextInt(goList.length)]);
	}
	
	//選擇前進or not
	static void afterGo(String choice, MainCharacter x) throws InterruptedException {
		Random r = new Random();
		if(choice.equals("1")||choice.equals("2")) {
			textDelay();
			System.out.println(".");
			textDelay();
			System.out.println("...");
			textDelay();
			System.out.println(".....");
			textDelay();
			System.out.println("順利向前走");
			textDelay();
		}else {
			textDelay();
			x.setHp(x.getHp()-10);
			System.out.println("(HP-10!!!目前HP:"+x.getHp()+")");
			textDelay();
			System.out.println(RulesAndMethod.accident[r.nextInt(RulesAndMethod.accident.length)]);
			textDelay();
		}
	}
	
	//不前進發生意外選項
	static String[] accident = {
			"踩到香蕉皮滑倒HP-10... (◉３◉)\n起身之後發現",
			"被路邊可愛的狗勾嚇到摔倒HP-10... (◉３◉)\n起身之後發現",
			"低頭發現踩到狗屎HP-10... ㅍ_ㅍ\n抬頭之後發現",
			"一個恍神被鳥屎滴到HP-10... ㅍ_ㅍ\n回過神之後發現"						
	};
		
	//戰鬥內容.包含敵人隨機攻擊+主角選項攻擊+攻防計算HP改變+勝負判定
	static void battle(MainCharacter x) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		//控制迴圈的開關
		int switch1 = r.nextInt(2);
		//每開始一次新戰鬥就new一個新敵人
		Enemy enemy = new Enemy(Enemy.enemyName[r.nextInt(Enemy.enemyName.length)]);
		System.out.println("遇到了敵人\"" + enemy.getName() + "\"");
		textDelay();
		System.out.println(
				"*****************"+
				"\n敵人名稱:"+enemy.getName()+
				"\n目前HP:"+enemy.getHp()+
				"\n目前ATK:"+enemy.getAtk()+
				"\n目前DEF:"+enemy.getDef()+
				"\n*****************"
				);
		textDelay();
		System.out.println("由隨機一方先攻");
		textDelay();
		do {
			if(switch1 == 1) {
				int enemyDmg = enemy.getAtk()+r.nextInt(5)-x.getDef();
				System.out.println("\"" + enemy.getName() + "\"攻擊");
				textDelay();
				System.out.print(enemy.getName());
				enemy.atk();
				textDelay();
				System.out.println("造成" + (enemyDmg) + "點傷害");
				textDelay();
				x.setHp(x.getHp()-(enemyDmg));
				RulesAndMethod.callCondition(x);
				textDelay();
			}else {
				System.out.println("\"" + x.getName() + "\"攻擊");
				textDelay();
				System.out.print(x.getName());
				System.out.println("請選擇攻擊方式:");
				textDelay();
				System.out.println("1." + MainCharacter.atkList[0]);
				System.out.println("2." + MainCharacter.atkList[1]);
				System.out.println("3." + MainCharacter.atkList[2]);
				System.out.println("4." + MainCharacter.atkList[3]);
				String atkchoice = scan.next();
				textDelay();
				if(atkchoice.equals("1") || atkchoice.equals("2") || atkchoice.equals("3") || atkchoice.equals("4")) {
					int dmg = x.getAtk()+r.nextInt(5)-enemy.getDef();
					System.out.println("對敵人"+MainCharacter.atkList[Integer.parseInt(atkchoice)-1]);
					textDelay();
					System.out.println("造成" + (dmg) + "點傷害");
					textDelay();
					enemy.setHp(enemy.getHp()-(dmg));
					System.out.println(
							"*****************"+
							"\n敵人名稱:"+enemy.getName()+
							"\n目前HP:"+enemy.getHp()+
							"\n目前ATK:"+enemy.getAtk()+
							"\n目前DEF:"+enemy.getDef()+
							"\n*****************"
							);
					textDelay();					
				}else if(atkchoice.equals("888")){
					int dmg = 999;
					System.out.println(MainCharacter.atkList[5]);
					textDelay();
					System.out.println("造成" + (dmg) + "點傷害");
					textDelay();
					enemy.setHp(enemy.getHp()-(dmg));
					System.out.println(
							"*****************"+
							"\n敵人名稱:"+enemy.getName()+
							"\n目前HP:"+enemy.getHp()+
							"\n目前ATK:"+enemy.getAtk()+
							"\n目前DEF:"+enemy.getDef()+
							"\n*****************"
							);
					textDelay();					
				}else if(atkchoice.equals("000")){
					int dmg = 999;
					System.out.println(MainCharacter.atkList[6]);
					textDelay();
					System.out.println("對自己造成" + (dmg) + "點傷害");
					textDelay();
					x.setHp(x.getHp()-(dmg));
					callCondition(x);
					textDelay();				
				}else {
					System.out.println("對敵人"+MainCharacter.atkList[4]);
					int dmg = r.nextInt(5);
					System.out.println("造成" + (dmg) + "點傷害");
					textDelay();
					System.out.println("\""+enemy.getName()+"\"抓了抓頭(´～`)");
					textDelay();
					System.out.println(
							"*****************"+
							"\n敵人名稱:"+enemy.getName()+
							"\n目前HP:"+enemy.getHp()+
							"\n目前ATK:"+enemy.getAtk()+
							"\n目前DEF:"+enemy.getDef()+
							"\n*****************"
							);
					textDelay();			
				}
			}
			switch1=(switch1==1?2:1);
		}while(x.getHp()>0 && enemy.getHp()>0);
	
		if(x.getHp()<=0) {
			System.out.println("\"" + enemy.getName() + "\"贏了!");
			textDelay();
			System.out.println("最終得分:" + score);
			textDelay();
			System.out.println("Game Over...");
			score = 0;
			scan.close();
		}else {
			System.out.println("恭喜~~~");
			textDelay();
			System.out.println("你打敗了\"" + enemy.getName() + "\"");
			textDelay();
			score += 10;
			System.out.println("目前分數:" + score);
			textDelay();
			System.out.println("繼續往前走");
			textDelay();
			System.out.println(".");
			textDelay();
			System.out.println("...");
			textDelay();
			System.out.println(".....");
			textDelay();
			
		}
	}
	
	
	//重新遊戲 粗胚
	static void reStrat(String switcH) {
		Scanner scan = new Scanner(System.in);
		do{			
			System.out.println("是否重來Y/N");
			String YN = scan.next();
			if(YN.toUpperCase().equals("Y")) {
				switcH = "go";
			}else if(YN.toUpperCase().equals("N")){
				switcH = "stop";
			}else {System.out.println("輸入錯誤，重新輸入");}
		}while(!switcH.equals("go") && !switcH.equals("stop"));
		scan.close();
	}
	
	
	//可以從這裡設定文字出現間格.數字代表是毫秒
	static void textDelay() throws InterruptedException {
		Thread.sleep(600);
	}
	
}
