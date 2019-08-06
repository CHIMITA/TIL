//10112 박지원
import java.util.Scanner;

public class ScoreTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     int process;
	     int studentcnt = 0;
	     String[][] student = new String[5][5]; // 학생의 정보를 담는 문자열.
	     String[][] grade = new String[5][3];  // 
	     
	     System.out.println("성적 처리 프로그램입니다.");
	     System.out.println("아래 내용을 읽고 처리하고자 하는 명령을 입력하여 실행하시기 바랍니다. \n");
	     
	     while (true) {
	        System.out.println("\n[입력형식] 1. 성적입력  2.성적처리 3.성적표확인 4.프로그램종료");
	        System.out.print("[실행번호 입력 1~4] : ");
	       
	        process = sc.nextInt();
	        
	        if (process <= 0 || process > 5) { //!=는 process와 1이 같지 않으면 참 , 같으면 거짓이다.
	           
	        	System.out.println("ERROR : 올바른 처리 숫자를 입력하시길 바랍니다.");
		           System.out.println("\n[입력형식] 1. 성적입력  2.성적처리 3.성적표확인 4.프로그램종료");
		           System.out.print("[실행번호 입력 1~4] : ");
		           process = sc.nextInt();
		           studentcnt -= 1;
	        } else {
	           if (process == 1) {
	              if (studentcnt == 5) {
	                 System.out.println("학생 데이터를 추가하지 못합니다.");
	                 System.out.println("성적 처리를 하시기 바랍니다^^");
	              } else {
	                 while (true) {
	                    int i = 0;
	                    System.out.printf("%d번째 학생의 이름을 입력하세요 : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    i++;
	                    System.out.printf("%d번째 학생의 국어점수 입력하세요 : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    i++;
	                    System.out.printf("%d번째 학생의 수학점수 입력하세요 : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    i++;
	                    System.out.printf("%d번째 학생의 영어점수 입력하세요 : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    i++;
	                    System.out.printf("%d번째 학생의 과학점수 입력하세요 : ", studentcnt + 1);
	                    student[studentcnt][i] = sc.next();
	                    break;
	                 }
	              }
	           } else if (process == 2) {
	              if (studentcnt != 5) {
	                 System.out.println("모든 자료가 입력되지 않아 성적처리를 할 수 없습니다.");
	                 System.out.println("모든 성적을 입력하시길 바랍니다.");
	              } else {
	                 for (int i = 0; i < 5; i++) {
	                    grade[i][0] = Integer.toString(Integer.valueOf(student[i][1])
	                          + Integer.valueOf(student[i][2]) + Integer.valueOf(student[i][3])
	                          + Integer.valueOf(student[i][4]));
	                    grade[i][1] = Integer.toString(Integer.valueOf(grade[i][0]) / 4 +1 );
	                    if (Integer.valueOf(grade[i][1]) >= 90) {
	                       grade[i][2] = "1등급";
	                    } else if (Integer.valueOf(grade[i][1]) >= 80
	                          && Integer.valueOf(grade[i][1]) <= 89) {
	                       grade[i][2] = "2등급";
	                    } else if (Integer.valueOf(grade[i][1]) >= 70
	                          && Integer.valueOf(grade[i][1]) <= 79) {
	                       grade[i][2] = "3등급";
	                    } else if (Integer.valueOf(grade[i][1]) >= 60
	                          && Integer.valueOf(grade[i][1]) <= 69) {
	                       grade[i][2] = "4등급";
	                    } else if (Integer.valueOf(grade[i][1]) >= 50
	                          && Integer.valueOf(grade[i][1]) <= 59) {
	                       grade[i][2] = "5등급";
	                    } else if (Integer.valueOf(grade[i][1]) >= 40
	                          && Integer.valueOf(grade[i][1]) <= 49) {
	                       grade[i][2] = "6등급";
	                    } else if (Integer.valueOf(grade[i][1]) >= 30
	                          && Integer.valueOf(grade[i][1]) <= 39) {
	                       grade[i][2] = "7등급";
	                    } else if (Integer.valueOf(grade[i][1]) >= 20
	                          && Integer.valueOf(grade[i][1]) <= 29) {
	                       grade[i][2] = "8등급";
	                    } else {
	                       grade[i][2] = "9등급";
	                    }
	                 }
	                 System.out.println("(--)(__)(--)(__)(--)(__)(--)(__)(--)(__)(--)(__)");
	                 System.out.println("성적 처리가 완료 되었습니다^^ 결과를 확인하세요.");
	              }
	           } else if (process == 3) {
	              System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	              System.out.println("학생명\t국어\t영어\t수학\t과학\t총점\t평균\t등급");
	              System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	              while (true) {
	                 for (int i = 0; i < 5; i++) {
	                    System.out.printf(student[i][0] + "\t" + student[i][1] + "\t" + student[i][2] + "\t"
	                          + student[i][3] + "\t" + student[i][4] + "\t" + grade[i][0] + "\t" + grade[i][1]
	                          + "\t" + grade[i][2] + "\n");
	                 }
	                 break;
	              }
	           } else if (process == 4) {
	              System.out.println("수고하셨습니다. 프로그램을 종료합니다.");
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
