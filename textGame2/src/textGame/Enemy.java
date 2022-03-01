package textGame;

import java.util.Random;

public class Enemy extends Character {
	
	//enemy基礎素質
	public Enemy(String name) {
		Random r = new Random();
		setName(name);
		setHp(100 + r.nextInt(100));  
		setAtk(30 + r.nextInt(10));
		setDef(r.nextInt(10));
	}
	

	public Enemy(String name, int hp, int atk, int def) {
		super(name, hp, atk, def);
	}

	
	//敵人名字.隨機從array中選一
	public enum enemyName{
		桑德蘭野兔,
		曼谷鷗,
		弗吉尼亞痣,
		南京江豚,
		俾斯麥小馬,
		貴大羚羊,
		伍爾弗漢普頓羚羊,
		彭蒂克頓斑鳩,
		蘭開夏賽馬,
		東莞海象,
		麥迪遜蟒蛇,
		加洛坎公豬,
		巴里斑馬,
		哈里斯堡灰狗,
		仰光鵝,
		阿比讓梭魚,
		喀布爾蟒蛇,
		小貓鼬,
		齋浦爾黑魚,
		紐里維金鴨子,
		伯明翰牛,
		溫州豹貓,
		首爾牡蠣,
		坎特伯雷長頸鹿,
		埃德蒙斯頓狐猴,
		萊斯特郡雷鳥,
		克蘭布魯克鷸,
		母蟻,
		德州捷豹,
		哈爾濱蝗蟲,
		金奈金剛鸚鵡,
		索爾茲伯里鬣狗,
		鄭州白鼬,
		名古屋巨嘴鳥,
		尼亞加拉母馬,
		亞利桑那小馬,
		柏林刺猬,
		多貝烏龜,
		默西塞德郡鷹,
		利茲眼鏡蛇,
		蒂爾森堡海豚,
		伊斯坦布爾浣熊,
		加蒂諾金槍魚,
		羅馬水獺;
		
		public static enemyName getRandomEnemyName(){
			Random random = new Random();
			return values()[random.nextInt(values().length)];
			
		}
		
	}
//	static String[] enemyName = {
//			"桑德蘭野兔",
//			"曼谷鷗",
//			"弗吉尼亞痣",
//			"南京江豚",
//			"俾斯麥小馬",
//			"貴大羚羊",
//			"伍爾弗漢普頓羚羊",
//			"彭蒂克頓斑鳩",
//			"蘭開夏賽馬",
//			"東莞海象",
//			"麥迪遜蟒蛇",
//			"加洛坎公豬",
//			"巴里斑馬",
//			"哈里斯堡灰狗",
//			"仰光鵝",
//			"阿比讓梭魚",
//			"喀布爾蟒蛇",
//			"小貓鼬",
//			"齋浦爾黑魚",
//			"紐里維金鴨子",
//			"伯明翰牛",
//			"溫州豹貓",
//			"首爾牡蠣",
//			"坎特伯雷長頸鹿",
//			"埃德蒙斯頓狐猴",
//			"萊斯特郡雷鳥",
//			"克蘭布魯克鷸",
//			"母蟻",
//			"德州捷豹",
//			"哈爾濱蝗蟲",
//			"金奈金剛鸚鵡",
//			"索爾茲伯里鬣狗",
//			"鄭州白鼬",
//			"名古屋巨嘴鳥",
//			"尼亞加拉母馬",
//			"亞利桑那小馬",
//			"柏林刺猬",
//			"多貝烏龜",
//			"默西塞德郡鷹",
//			"利茲眼鏡蛇",
//			"蒂爾森堡海豚",
//			"伊斯坦布爾浣熊",
//			"加蒂諾金槍魚",
//			"羅馬水獺"
//			};

	
	//敵人攻擊招式.隨機從array中選一
	@Override
	public void atk() {
		Random ran = new Random();
		String[] atk = {
				"對你使出踢擊",
				"對你使出拳擊",
				"對你使出頭槌",
				"對你吐了一口口水",
				"對你了一個放屁"
				};
		System.out.println(atk[ran.nextInt(atk.length)]);
	}
}
