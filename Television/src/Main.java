//10112 ������
import java.util.Scanner;

public class Main {// MainŬ������ �����Ѵ�.
	public static void main(String[] args) {// ���� �޼ҵ��̴�.

		Television tv = new Television();
		Scanner sc = new Scanner(System.in);

		int myDate = 0;
		int myInput;

		System.out.println("1.���� ���� 2.���� ON/OFF 3.�ܺ��Է�  4.���� 5.���Ұ�");
		while (true) {// ������ ���� �� �ݺ��Ѵ�.

			System.out.print("������ ��ȣ�� �����ϼ���! >>>");
			myInput = sc.nextInt();

			switch (myInput) {
			case 1:
				System.out.print("1.������! 2.���޾���! >>");
				int sup = sc.nextInt(); // ���� sup�� �����ϰ� sup�� �Է¹޴´�.
				tv.supply(sup);// TelevisionŬ������ �ִ� supply�Լ��� �ҷ����� �Է��� sup���� ���� �����Ѵ�.
				break;
			case 2:
				System.out.print("1.On 2.Off >>");
				int pow = sc.nextInt();// ���� pow�� �����ϰ� pow�� �Է¹޴´�.
				tv.power(pow);// TelevisionŬ������ �ִ� power�Լ��� �ҷ����� �Է��� pow���� ���� �����Ѵ�.
				break;
			case 3:
				System.out.print("1.����Ƽ�� 2.���ͳ�Ƽ�� 3.HDMI-PC >>>>");
				int cha = sc.nextInt();// ���� cha�� �����ϰ� cha�� �Է¹޴´�.
				tv.setInputType(cha);// TelevisionŬ������ �ִ� setInputType�Լ��� �ҷ����� �Է��� cha���� ���� �����Ѵ�.
				System.out.print("������� ä���� �Է��ϼ���!>>");
				int n = sc.nextInt();// ���� n�� �����ϰ� n�� �Է¹޴´�.
				tv.setChannel(n);// TelevisionŬ������ �ִ� setChannel�Լ��� �ҷ����� �Է��� n���� ���� �����Ѵ�.
				break;
			case 4:
				System.out.print("1.UP 2.DOWN>>");
				int vol = sc.nextInt();// ���� vol�� �����ϰ� vol�� �Է¹޴´�.
				tv.volume(vol);// TelevisionŬ������ �ִ� volum�Լ��� �ҷ����� �Է��� vol���� ���� �����Ѵ�.
				break;
			case 5:
				tv.setMute();// TelevisionŬ������ �ִ� setChannel�Լ��� �ҷ��´�.
				break;
			default:// 1~5 �ܿ� ���� �Է� �޾��� ��
				System.out.println("1~5���� �����ϼ���! ");// ""�ȿ� �ִ� ������ ��µȴ�.

			}
		}
	}
}
