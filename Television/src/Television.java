//10112 酵走据
public class Television {// Television 適掘什研 持失廃陥.

	boolean isSupply = false;
	boolean isPowerOn = false;
	String inputType;
	int volume = 0;
	int curChannel = 0;

	void supplyOn() { // void 五社球澗 鋼発葵戚 蒸聖 凶 紫遂吉陥.
		System.out.println("穿径戚 因厭鞠醸嬢推!");
		isSupply = true; // isSupply税 葵戚 凧析凶
	}

	void supplyOff() {
		System.out.println("因厭戚 託舘鞠醸嬢推!");
		isSupply = false;
		isPowerOn = false;
		inputType = null;
		curChannel = 0;
		volume = 0;
		// 乞窮 奄管精 因厭戚 託舘鞠檎 竺舛戚 段奄鉢 吉陥.
	}

	void supply(int sup) {// 痕呪 sup研 識情廃陥.
		switch (sup) {// 繕闇戚 sup析 凶戚陥.
		case 1:
			supplyOn(); // 1腰聖 識澱 梅聖 凶 supplyOn敗呪研 災君紳陥.

			break;
		case 2:
			supplyOff(); // 2腰聖 識澱梅聖 凶 supplyOff敗呪研 災君紳陥.

			break;
		default:
			System.out.println("腰硲研 溌昔馬室推!");// 1, 2研 薦須廃 陥献 葵聖 脊径閤生檎 戚 庚舌戚 窒径吉陥.
			break;
		}
	}

	void powerOn() {
		if (isSupply) { // 繕闇戚 isSupply析 凶
			isPowerOn = true;// isPowerOn戚 凧析凶
			System.out.println("TV亜 佃然嬢推!");// ""照拭 庚舌戚 窒径吉陥.
		}

		else // 繕闇拭 限走 省聖 凶
			System.out.println("穿径戚 因厭鞠走 省紹嬢推ば!");
	}

	void powerOff() {
		if (isSupply) {
			isPowerOn = false;// isPowerOn戚 暗憎析 凶
			System.out.println("TV亜 襖然嬢推!");// ""照拭 庚舌戚 窒径吉陥.
		} else {// 穿径戚 因厭 鞠走 省紹聖 凶
			System.out.println("穿径戚 因厭鞠走 省紹嬢推 ぬば \n穿径聖 因厭 馬壱 叔楳 馬室推!");// ""照拭 庚舌戚 窒径吉陥.
		}
	}

	void power(int pow) {
		switch (pow) {
		case 1:
			powerOn();
			break;
		case 2:
			powerOff();
			break;

		default:// 1~2腰聖 薦須廃 陥献 葵聖 脊径 閤紹聖 凶
			System.out.println("腰硲研 溌昔馬室推! ");// ""照拭 庚舌戚 窒径吉陥.
			break;
		}
	}

	void setInput(int cha) {
		switch (cha) {
		case 1:
			setInputType(1);
			break;
		case 2:
			setInputType(2);
			break;

		case 3:
			setInputType(3);
			break;
		default:
			System.out.println("腰硲研 溌昔馬室推! ");
			break;
		}
	}

	void setInputType(int type) {
		if (isPowerOn) {
			switch (type) {
			case 1:
				inputType = "政識銅搾拭推!";
				System.out.println("須採脊径 : " + inputType);

				break;
			case 2:
				inputType = "昔斗掛銅搾拭推!";
				System.out.println("須採脊径 : " + inputType);
				break;
			case 3:
				System.out.println("陳濃斗人 尻衣鞠醸嬢推!");
				inputType = "HDMI-PC";
				System.out.println("須採脊径 : " + inputType);
				break;
			default:
				break;
			}
		} else {
			System.out.println("穿径戚 因厭鞠走 省紹嬢推 ぬば \n穿径聖 因厭 馬壱 叔楳 馬室推!");
		}
	}

	void volumeUp() {
		if (isPowerOn) {
			if (volume < 50) {// 瑳拳戚 50左陥 拙聖 凶

				volume++;// 瑳拳戚 1梢 装亜廃陥.

				System.out.println("薄仙 瑳拳 : " + volume);
			} else {// 50聖 角嬢穐聖 凶
				System.out.println("50猿走幻 竺舛 背爽室推!");// ""照拭 庚舌戚 窒径吉陥.
			}
		} else {
			System.out.println("穿径戚 因厭鞠走 省紹嬢推 ぬば \n穿径聖 因厭 馬壱 叔楳 馬室推!");
		}
	}

	void volumeDown() {
		if (isPowerOn) {
			if (volume > 0) {// volum戚 0左陥 適 凶

				volume--;// volum戚 1梢 姶社廃陥.

				System.out.println("薄仙 瑳拳 : " + volume);
			} else {// volum戚 0聖 角嬢 姶社拝凶
				System.out.println("瑳拳戚 -昔 暗 左写嬢推?!\n陥獣 竺舛馬室推!");// ""章拭 庚舌戚 窒径吉陥.
			}
		} else {
			System.out.println("穿径戚 因厭鞠走 省紹嬢推 ぬば \n穿径聖 因厭 馬壱 叔楳 馬室推!");
		}
	}

	void volume(int vol) {
		switch (vol) {
		case 1:
			volumeUp();// volumUp 敗呪研 災君紳陥.
			break;
		case 2:
			volumeDown();// volumDown 敗呪研 災君紳陥.
		default:
			break;
		}
	}

	void setMute() {
		if (isPowerOn) {
			System.out.println("製社暗拭推!");
			volume = 0;// volum葵聖 0生稽 段奄鉢廃陥.
		} else {
			System.out.println("穿径戚 因厭鞠走 省紹嬢推 ぬば \n穿径聖 因厭 馬壱 叔楳 馬室推!");
		}
	}

	void setChannel(int channel) {
		if (isPowerOn) {
			switch (inputType) { // 繕闇戚 庚切伸昔 inputType析 凶
			case "政識銅搾拭推!":
				if (isPowerOn) {
					curChannel = channel;// curChannel拭 channel聖 企脊廃陥.
					switch (channel) {
					case 6:
						curChannel = 6;
						System.out.println("SBS");// 辰確 5鯵研 識情背層陥
						break;
					case 7:
						curChannel = 7;
						System.out.println("KBS2");
						break;
					case 9:
						curChannel = 9;
						System.out.println("KBS1");
						break;
					case 11:
						curChannel = 11;
						System.out.println("MBC");
						break;
					case 13:
						curChannel = 13;
						System.out.println("EBS");
						break;
					}
				}
				System.out.println("薄仙 辰確 : " + curChannel);
				break;
			case "昔斗掛銅搾拭推!":
				while (true) {// 繕闇戚 凧析 凶 鋼差吉陥.

					if (0 < channel && channel < 1000) {// 1~999猿走 叔楳鞠惟 馬澗 繕闇庚戚陥.
						curChannel = channel;
						System.out.println("薄仙 辰確 : " + curChannel);
					} else {// 繕闇拭 限走 省聖 凶
						System.out.println("1~999猿走 脊径馬室推!;;");
					}
					break;
				}

			default:
				break;
			}
		} else {
			System.out.println("穿径戚 因厭鞠走 省紹嬢推 ぬば \n穿径聖 因厭 馬壱 叔楳 馬室推!");
		}
	}
}