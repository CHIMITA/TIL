//10112 박지원
public class Television {// Television 클래스를 생성한다.

	boolean isSupply = false;
	boolean isPowerOn = false;
	String inputType;
	int volume = 0;
	int curChannel = 0;

	void supplyOn() { // void 메소드는 반환값이 없을 때 사용된다.
		System.out.println("전력이 공급되었어요!");
		isSupply = true; // isSupply의 값이 참일때
	}

	void supplyOff() {
		System.out.println("공급이 차단되었어요!");
		isSupply = false;
		isPowerOn = false;
		inputType = null;
		curChannel = 0;
		volume = 0;
		// 모든 기능은 공급이 차단되면 설정이 초기화 된다.
	}

	void supply(int sup) {// 변수 sup를 선언한다.
		switch (sup) {// 조건이 sup일 때이다.
		case 1:
			supplyOn(); // 1번을 선택 했을 때 supplyOn함수를 불러온다.

			break;
		case 2:
			supplyOff(); // 2번을 선택했을 때 supplyOff함수를 불러온다.

			break;
		default:
			System.out.println("번호를 확인하세요!");// 1, 2를 제외한 다른 값을 입력받으면 이 문장이 출력된다.
			break;
		}
	}

	void powerOn() {
		if (isSupply) { // 조건이 isSupply일 때
			isPowerOn = true;// isPowerOn이 참일때
			System.out.println("TV가 켜졌어요!");// ""안에 문장이 출력된다.
		}

		else // 조건에 맞지 않을 때
			System.out.println("전력이 공급되지 않았어요ㅠ!");
	}

	void powerOff() {
		if (isSupply) {
			isPowerOn = false;// isPowerOn이 거짓일 때
			System.out.println("TV가 꺼졌어요!");// ""안에 문장이 출력된다.
		} else {// 전력이 공급 되지 않았을 때
			System.out.println("전력이 공급되지 않았어요 ㅜㅠ \n전력을 공급 하고 실행 하세요!");// ""안에 문장이 출력된다.
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

		default:// 1~2번을 제외한 다른 값을 입력 받았을 때
			System.out.println("번호를 확인하세요! ");// ""안에 문장이 출력된다.
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
			System.out.println("번호를 확인하세요! ");
			break;
		}
	}

	void setInputType(int type) {
		if (isPowerOn) {
			switch (type) {
			case 1:
				inputType = "유선티비에요!";
				System.out.println("외부입력 : " + inputType);

				break;
			case 2:
				inputType = "인터넷티비에요!";
				System.out.println("외부입력 : " + inputType);
				break;
			case 3:
				System.out.println("컴퓨터와 연결되었어요!");
				inputType = "HDMI-PC";
				System.out.println("외부입력 : " + inputType);
				break;
			default:
				break;
			}
		} else {
			System.out.println("전력이 공급되지 않았어요 ㅜㅠ \n전력을 공급 하고 실행 하세요!");
		}
	}

	void volumeUp() {
		if (isPowerOn) {
			if (volume < 50) {// 볼륨이 50보다 작을 때

				volume++;// 볼륨이 1씩 증가한다.

				System.out.println("현재 볼륨 : " + volume);
			} else {// 50을 넘어갔을 때
				System.out.println("50까지만 설정 해주세요!");// ""안에 문장이 출력된다.
			}
		} else {
			System.out.println("전력이 공급되지 않았어요 ㅜㅠ \n전력을 공급 하고 실행 하세요!");
		}
	}

	void volumeDown() {
		if (isPowerOn) {
			if (volume > 0) {// volum이 0보다 클 때

				volume--;// volum이 1씩 감소한다.

				System.out.println("현재 볼륨 : " + volume);
			} else {// volum이 0을 넘어 감소할때
				System.out.println("볼륨이 -인 거 보셨어요?!\n다시 설정하세요!");// ""암에 문장이 출력된다.
			}
		} else {
			System.out.println("전력이 공급되지 않았어요 ㅜㅠ \n전력을 공급 하고 실행 하세요!");
		}
	}

	void volume(int vol) {
		switch (vol) {
		case 1:
			volumeUp();// volumUp 함수를 불러온다.
			break;
		case 2:
			volumeDown();// volumDown 함수를 불러온다.
		default:
			break;
		}
	}

	void setMute() {
		if (isPowerOn) {
			System.out.println("음소거에요!");
			volume = 0;// volum값을 0으로 초기화한다.
		} else {
			System.out.println("전력이 공급되지 않았어요 ㅜㅠ \n전력을 공급 하고 실행 하세요!");
		}
	}

	void setChannel(int channel) {
		if (isPowerOn) {
			switch (inputType) { // 조건이 문자열인 inputType일 때
			case "유선티비에요!":
				if (isPowerOn) {
					curChannel = channel;// curChannel에 channel을 대입한다.
					switch (channel) {
					case 6:
						curChannel = 6;
						System.out.println("SBS");// 채널 5개를 선언해준다
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
				System.out.println("현재 채널 : " + curChannel);
				break;
			case "인터넷티비에요!":
				while (true) {// 조건이 참일 때 반복된다.

					if (0 < channel && channel < 1000) {// 1~999까지 실행되게 하는 조건문이다.
						curChannel = channel;
						System.out.println("현재 채널 : " + curChannel);
					} else {// 조건에 맞지 않을 때
						System.out.println("1~999까지 입력하세요!;;");
					}
					break;
				}

			default:
				break;
			}
		} else {
			System.out.println("전력이 공급되지 않았어요 ㅜㅠ \n전력을 공급 하고 실행 하세요!");
		}
	}
}