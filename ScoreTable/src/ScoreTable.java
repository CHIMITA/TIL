//10112 ������
import java.util.Scanner;

public class ScoreTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     int process;
	     int studentcnt = 0;
	     String[][] student = new String[5][5]; // �л��� ������ ��� ���ڿ�.
	     String[][] grade = new String[5][3];  // 
	     
	     System.out.println("���� ó�� ���α׷��Դϴ�.");
	     System.out.println("�Ʒ� ������ �а� ó���ϰ��� �ϴ� ����� �Է��Ͽ� �����Ͻñ� �ٶ��ϴ�. \n");
	     
	     while (true) {
	        System.out.println("\n[�Է�����] 1. �����Է�  2.����ó�� 3.����ǥȮ�� 4.���α׷�����");
	        System.out.print("[�����ȣ �Է� 1~4] : ");
	       
	        process = sc.nextInt();
	        
	        if (process <= 0 || process > 5) { //!=�� process�� 1�� ���� ������ �� , ������ �����̴�.
	           
	        	System.out.println("ERROR : �ùٸ� ó�� ���ڸ� �Է��Ͻñ� �ٶ��ϴ�.");
		           System.out.println("\n[�Է�����] 1. �����Է�  2.����ó�� 3.����ǥȮ�� 4.���α׷�����");
		           System.out.print("[�����ȣ �Է� 1~4] : ");
		           process = sc.nextInt();
		           studentcnt -= 1;
	        } else {
	           if (process == 1) {
	              if (studentcnt == 5) {
	                 System.out.println("�л� �����͸� �߰����� ���մϴ�.");
	                 System.out.println("���� ó���� �Ͻñ� �ٶ��ϴ�^^");
	              } else {
	                 while (true) {
	                    int i = 0;
	                    System.out.printf("%d��° �л��� �̸��� �Է��ϼ��� : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    i++;
	                    System.out.printf("%d��° �л��� �������� �Է��ϼ��� : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    i++;
	                    System.out.printf("%d��° �л��� �������� �Է��ϼ��� : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    i++;
	                    System.out.printf("%d��° �л��� �������� �Է��ϼ��� : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    i++;
	                    System.out.printf("%d��° �л��� �������� �Է��ϼ��� : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    break;
	                 }
	              }
	           } else if (process == 2) {
	              if (studentcnt != 5) {
	                 System.out.println("��� �ڷᰡ �Էµ��� �ʾ� ����ó���� �� �� �����ϴ�.");
	                 System.out.println("��� ������ �Է��Ͻñ� �ٶ��ϴ�.");
	              } else {
	                 for (int i = 0; i < 5; i++) {
	                    grade[i][0] = Integer.toString(Integer.valueOf(student[i][1])
	                          + Integer.valueOf(student[i][2]) + Integer.valueOf(student[i][3])
	                          + Integer.valueOf(student[i][4]));
	                    grade[i][1] = Integer.toString(Integer.valueOf(grade[i][0]) / 4 +1 );
	                    if (Integer.valueOf(grade[i][1]) >= 90) {
	                       grade[i][2] = "1���";
	                    } else if (Integer.valueOf(grade[i][1]) >= 80
	                          && Integer.valueOf(grade[i][1]) <= 89) {
	                       grade[i][2] = "2���";
	                    } else if (Integer.valueOf(grade[i][1]) >= 70
	                          && Integer.valueOf(grade[i][1]) <= 79) {
	                       grade[i][2] = "3���";
	                    } else if (Integer.valueOf(grade[i][1]) >= 60
	                          && Integer.valueOf(grade[i][1]) <= 69) {
	                       grade[i][2] = "4���";
	                    } else if (Integer.valueOf(grade[i][1]) >= 50
	                          && Integer.valueOf(grade[i][1]) <= 59) {
	                       grade[i][2] = "5���";
	                    } else if (Integer.valueOf(grade[i][1]) >= 40
	                          && Integer.valueOf(grade[i][1]) <= 49) {
	                       grade[i][2] = "6���";
	                    } else if (Integer.valueOf(grade[i][1]) >= 30
	                          && Integer.valueOf(grade[i][1]) <= 39) {
	                       grade[i][2] = "7���";
	                    } else if (Integer.valueOf(grade[i][1]) >= 20
	                          && Integer.valueOf(grade[i][1]) <= 29) {
	                       grade[i][2] = "8���";
	                    } else {
	                       grade[i][2] = "9���";
	                    }
	                 }
	                 System.out.println("(--)(__)(--)(__)(--)(__)(--)(__)(--)(__)(--)(__)");
	                 System.out.println("���� ó���� �Ϸ� �Ǿ����ϴ�^^ ����� Ȯ���ϼ���.");
	              }
	           } else if (process == 3) {
	              System.out.println("������������������������������������������������������������������������������������������������������������������������");
	              System.out.println("�л���\t����\t����\t����\t����\t����\t���\t���");
	              System.out.println("������������������������������������������������������������������������������������������������������������������������");
	              while (true) {
	                 for (int i = 0; i < 5; i++) {
	                    System.out.printf(student[i][0] + "\t" + student[i][1] + "\t" + student[i][2] + "\t"
	                          + student[i][3] + "\t" + student[i][4] + "\t" + grade[i][0] + "\t" + grade[i][1]
	                          + "\t" + grade[i][2] + "\n");
	                 }
	                 break;
	              }
	           } else if (process == 4) {
	              System.out.println("�����ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
	              System.exit(0);
	           }
	        }
	        if (studentcnt < 5)
	           studentcnt++;
	        else
	           studentcnt = 5;
	     }
	}
}
