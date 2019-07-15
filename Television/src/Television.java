//10112 ������
public class Television {// Television Ŭ������ �����Ѵ�.

	boolean isSupply = false;
	boolean isPowerOn = false;
	String inputType;
	int volume = 0;
	int curChannel = 0;

	void supplyOn() { // void �޼ҵ�� ��ȯ���� ���� �� ���ȴ�.
		System.out.println("������ ���޵Ǿ����!");
		isSupply = true; // isSupply�� ���� ���϶�
	}

	void supplyOff() {
		System.out.println("������ ���ܵǾ����!");
		isSupply = false;
		isPowerOn = false;
		inputType = null;
		curChannel = 0;
		volume = 0;
		// ��� ����� ������ ���ܵǸ� ������ �ʱ�ȭ �ȴ�.
	}

	void supply(int sup) {// ���� sup�� �����Ѵ�.
		switch (sup) {// ������ sup�� ���̴�.
		case 1:
			supplyOn(); // 1���� ���� ���� �� supplyOn�Լ��� �ҷ��´�.

			break;
		case 2:
			supplyOff(); // 2���� �������� �� supplyOff�Լ��� �ҷ��´�.

			break;
		default:
			System.out.println("��ȣ�� Ȯ���ϼ���!");// 1, 2�� ������ �ٸ� ���� �Է¹����� �� ������ ��µȴ�.
			break;
		}
	}

	void powerOn() {
		if (isSupply) { // ������ isSupply�� ��
			isPowerOn = true;// isPowerOn�� ���϶�
			System.out.println("TV�� �������!");// ""�ȿ� ������ ��µȴ�.
		}

		else // ���ǿ� ���� ���� ��
			System.out.println("������ ���޵��� �ʾҾ���!");
	}

	void powerOff() {
		if (isSupply) {
			isPowerOn = false;// isPowerOn�� ������ ��
			System.out.println("TV�� �������!");// ""�ȿ� ������ ��µȴ�.
		} else {// ������ ���� ���� �ʾ��� ��
			System.out.println("������ ���޵��� �ʾҾ�� �̤� \n������ ���� �ϰ� ���� �ϼ���!");// ""�ȿ� ������ ��µȴ�.
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

		default:// 1~2���� ������ �ٸ� ���� �Է� �޾��� ��
			System.out.println("��ȣ�� Ȯ���ϼ���! ");// ""�ȿ� ������ ��µȴ�.
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
			System.out.println("��ȣ�� Ȯ���ϼ���! ");
			break;
		}
	}

	void setInputType(int type) {
		if (isPowerOn) {
			switch (type) {
			case 1:
				inputType = "����Ƽ�񿡿�!";
				System.out.println("�ܺ��Է� : " + inputType);

				break;
			case 2:
				inputType = "���ͳ�Ƽ�񿡿�!";
				System.out.println("�ܺ��Է� : " + inputType);
				break;
			case 3:
				System.out.println("��ǻ�Ϳ� ����Ǿ����!");
				inputType = "HDMI-PC";
				System.out.println("�ܺ��Է� : " + inputType);
				break;
			default:
				break;
			}
		} else {
			System.out.println("������ ���޵��� �ʾҾ�� �̤� \n������ ���� �ϰ� ���� �ϼ���!");
		}
	}

	void volumeUp() {
		if (isPowerOn) {
			if (volume < 50) {// ������ 50���� ���� ��

				volume++;// ������ 1�� �����Ѵ�.

				System.out.println("���� ���� : " + volume);
			} else {// 50�� �Ѿ�� ��
				System.out.println("50������ ���� ���ּ���!");// ""�ȿ� ������ ��µȴ�.
			}
		} else {
			System.out.println("������ ���޵��� �ʾҾ�� �̤� \n������ ���� �ϰ� ���� �ϼ���!");
		}
	}

	void volumeDown() {
		if (isPowerOn) {
			if (volume > 0) {// volum�� 0���� Ŭ ��

				volume--;// volum�� 1�� �����Ѵ�.

				System.out.println("���� ���� : " + volume);
			} else {// volum�� 0�� �Ѿ� �����Ҷ�
				System.out.println("������ -�� �� ���̾��?!\n�ٽ� �����ϼ���!");// ""�Ͽ� ������ ��µȴ�.
			}
		} else {
			System.out.println("������ ���޵��� �ʾҾ�� �̤� \n������ ���� �ϰ� ���� �ϼ���!");
		}
	}

	void volume(int vol) {
		switch (vol) {
		case 1:
			volumeUp();// volumUp �Լ��� �ҷ��´�.
			break;
		case 2:
			volumeDown();// volumDown �Լ��� �ҷ��´�.
		default:
			break;
		}
	}

	void setMute() {
		if (isPowerOn) {
			System.out.println("���Ұſ���!");
			volume = 0;// volum���� 0���� �ʱ�ȭ�Ѵ�.
		} else {
			System.out.println("������ ���޵��� �ʾҾ�� �̤� \n������ ���� �ϰ� ���� �ϼ���!");
		}
	}

	void setChannel(int channel) {
		if (isPowerOn) {
			switch (inputType) { // ������ ���ڿ��� inputType�� ��
			case "����Ƽ�񿡿�!":
				if (isPowerOn) {
					curChannel = channel;// curChannel�� channel�� �����Ѵ�.
					switch (channel) {
					case 6:
						curChannel = 6;
						System.out.println("SBS");// ä�� 5���� �������ش�
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
				System.out.println("���� ä�� : " + curChannel);
				break;
			case "���ͳ�Ƽ�񿡿�!":
				while (true) {// ������ ���� �� �ݺ��ȴ�.

					if (0 < channel && channel < 1000) {// 1~999���� ����ǰ� �ϴ� ���ǹ��̴�.
						curChannel = channel;
						System.out.println("���� ä�� : " + curChannel);
					} else {// ���ǿ� ���� ���� ��
						System.out.println("1~999���� �Է��ϼ���!;;");
					}
					break;
				}

			default:
				break;
			}
		} else {
			System.out.println("������ ���޵��� �ʾҾ�� �̤� \n������ ���� �ϰ� ���� �ϼ���!");
		}
	}
}