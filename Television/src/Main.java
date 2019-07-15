//10112 박지원
import java.util.Scanner;

public class Main {// Main클래스를 생성한다.
	public static void main(String[] args) {// 메인 메소드이다.

		Television tv = new Television();
		Scanner sc = new Scanner(System.in);

		int myDate = 0;
		int myInput;

		System.out.println("1.전력 공급 2.전원 ON/OFF 3.외부입력  4.볼륨 5.음소거");
		while (true) {// 조건이 참일 때 반복한다.

			System.out.print("실행할 번호를 선택하세요! >>>");
			myInput = sc.nextInt();

			switch (myInput) {
			case 1:
				System.out.print("1.공급해! 2.공급안해! >>");
				int sup = sc.nextInt(); // 변수 sup을 선언하고 sup에 입력받는다.
				tv.supply(sup);// Television클래스에 있는 supply함수를 불러오고 입력한 sup값을 통해 실행한다.
				break;
			case 2:
				System.out.print("1.On 2.Off >>");
				int pow = sc.nextInt();// 변수 pow을 선언하고 pow에 입력받는다.
				tv.power(pow);// Television클래스에 있는 power함수를 불러오고 입력한 pow값을 통해 실행한다.
				break;
			case 3:
				System.out.print("1.유선티비 2.인터넷티비 3.HDMI-PC >>>>");
				int cha = sc.nextInt();// 변수 cha을 선언하고 cha에 입력받는다.
				tv.setInputType(cha);// Television클래스에 있는 setInputType함수를 불러오고 입력한 cha값을 통해 실행한다.
				System.out.print("보고싶은 채널을 입력하세요!>>");
				int n = sc.nextInt();// 변수 n을 선언하고 n에 입력받는다.
				tv.setChannel(n);// Television클래스에 있는 setChannel함수를 불러오고 입력한 n값을 통해 실행한다.
				break;
			case 4:
				System.out.print("1.UP 2.DOWN>>");
				int vol = sc.nextInt();// 변수 vol을 선언하고 vol에 입력받는다.
				tv.volume(vol);// Television클래스에 있는 volum함수를 불러오고 입력한 vol값을 통해 실행한다.
				break;
			case 5:
				tv.setMute();// Television클래스에 있는 setChannel함수를 불러온다.
				break;
			default:// 1~5 외에 값을 입력 받았을 때
				System.out.println("1~5번만 선택하세요! ");// ""안에 있는 문장이 출력된다.

			}
		}
	}
}
