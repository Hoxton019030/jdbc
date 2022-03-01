package textGame;

import java.util.Random;

public class MainCharacter extends Character {
	
	//主角固定四個選項的攻擊方式
	private static String skill1 = "使出金剛腿";
	private static String skill2 = "使出獅吼功";
	private static String skill3 = "使出鐵頭功";
	private static String skill4 = "吐了一口口水";
	private static String atkMiss = "準備使出絕招如來神掌，結果突然看到旁邊有阿嬤在裸奔，嚇到手一滑...";
	private static String uniqueSkill = "挖鼻屎隨手一彈，結果打中敵人要害...";
	private static String endgameSkill = "準備使出踢擊，結果踢到小拇指...";
	
	static String[] atkList = {
			skill1,
			skill2,
			skill3,
			skill4,
			atkMiss,
			uniqueSkill,
			endgameSkill
	};
	
	@SuppressWarnings("unused")
	private  String job;
	
	//主角基礎素質
	public MainCharacter(String name) {
		Random r = new Random();
		setName(name);
		setHp(200+r.nextInt(100));  
		setAtk(50+r.nextInt(20));
		setDef(10+r.nextInt(5));
	}	
	
	//主角攻擊招式.隨機從array中選一
	@Override
	public void atk() {
		Random ran = new Random();
		String[] atk = {
				skill1,
				skill2,
				skill3,
				skill4,
				atkMiss
				};
		System.out.println(atk[ran.nextInt(atk.length)]);
	}
}
