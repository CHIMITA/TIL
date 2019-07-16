//10112 박지원
package 빙고게임만들기;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Bingo extends Frame { // Frame을 상속 받는다.
	
	String numStr[] = { "참새", "두루미", "황새", "비둘기", "까오기", "오리", "타조", "부엉이", "올빼미", "뱁새", "꿩", "닭", "구관조", "잉꼬", "매",
			"거위", "독수리", "콘돌", "봉황", "공작", "까치", "까마귀", "앵무새", "꾀꼬리", "고니" };

	Button[] bu = new Button[numStr.length]; // 보다 쉽게 코딩 할 수 있게 버튼을 배열로 생성한다.

	public Bingo() {

		setTitle("빙고 게임"); // Frame의 제목을 "빙고 게임"으로 한다.
		setSize(400, 400); // Frame의 크기를 400*400으로 한다.
		setVisible(true); // Frame이 보여지게 한다.
		setLayout(new GridLayout(5, 5)); // Frame의 레이아웃을 GridLayout으로 하고 5 * 5로 설정한다.

		Random ra = new Random();

		for (int i = 0; i < numStr.length; i++) {
			bu[i] = new Button(); // bu[i] 버튼을 생성한다.
			bu[i].addMouseListener(new MouseAdapter() { // bu[i]에 마우스리스너 이벤트를 추가한다.
				@Override
				public void mouseClicked(MouseEvent e) { // 마우스로 클릭을 할 때

					changeColor(e); // changeColor 메소드를 불러온다.
				}

			});

			add(bu[i]); // bu[i]를 추가한다.
		}

		for (int i = 0; i < numStr.length; i++) {
			String Bird = numStr[ra.nextInt(numStr.length)]; // 문자열에 numStr[]를 랜덤하게 넣어준다.
			while (true) { // 조건이 참일 때
				if (!overlap(Bird, bu)) { // !는 반대로 하는 것이다. (true는 false로 false는 true로 )
					bu[i].setLabel(Bird); // 버튼에 문자열 버튼을 넣어준다.
					break;
				} else {
					Bird = numStr[ra.nextInt(numStr.length)];
				}
			}
		}

		addWindowListener(new WindowAdapter() { // 'X' 버튼을 눌렀을 때
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// 프로그램을 종료한다.
			}
		});
	}

	boolean overlap(String BiNa, Button[] But) {
		boolean b = false;
		for (int i = 0; i < But.length; i++) {
			if (BiNa == But[i].getLabel()) {
				b = true;
			}
		}
		return b; // b를 반환한다.
	}

	static void changeColor(MouseEvent e) {

		Button b = (Button) e.getSource(); // 버튼을 마우스로 클릭시, 그 버튼을 b라는 버튼에 복사한다.
		b.setBackground(Color.LIGHT_GRAY); // 버튼의 색을 밝은 회색으로 한다.
	}

}
