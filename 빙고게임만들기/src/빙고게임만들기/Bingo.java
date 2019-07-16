//10112 ������
package ������Ӹ����;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Bingo extends Frame { // Frame�� ��� �޴´�.
	
	String numStr[] = { "����", "�η��", "Ȳ��", "��ѱ�", "�����", "����", "Ÿ��", "�ξ���", "�û���", "���", "��", "��", "������", "�ײ�", "��",
			"����", "������", "�ܵ�", "��Ȳ", "����", "��ġ", "���", "�޹���", "�Ҳ���", "���" };

	Button[] bu = new Button[numStr.length]; // ���� ���� �ڵ� �� �� �ְ� ��ư�� �迭�� �����Ѵ�.

	public Bingo() {

		setTitle("���� ����"); // Frame�� ������ "���� ����"���� �Ѵ�.
		setSize(400, 400); // Frame�� ũ�⸦ 400*400���� �Ѵ�.
		setVisible(true); // Frame�� �������� �Ѵ�.
		setLayout(new GridLayout(5, 5)); // Frame�� ���̾ƿ��� GridLayout���� �ϰ� 5 * 5�� �����Ѵ�.

		Random ra = new Random();

		for (int i = 0; i < numStr.length; i++) {
			bu[i] = new Button(); // bu[i] ��ư�� �����Ѵ�.
			bu[i].addMouseListener(new MouseAdapter() { // bu[i]�� ���콺������ �̺�Ʈ�� �߰��Ѵ�.
				@Override
				public void mouseClicked(MouseEvent e) { // ���콺�� Ŭ���� �� ��

					changeColor(e); // changeColor �޼ҵ带 �ҷ��´�.
				}

			});

			add(bu[i]); // bu[i]�� �߰��Ѵ�.
		}

		for (int i = 0; i < numStr.length; i++) {
			String Bird = numStr[ra.nextInt(numStr.length)]; // ���ڿ��� numStr[]�� �����ϰ� �־��ش�.
			while (true) { // ������ ���� ��
				if (!overlap(Bird, bu)) { // !�� �ݴ�� �ϴ� ���̴�. (true�� false�� false�� true�� )
					bu[i].setLabel(Bird); // ��ư�� ���ڿ� ��ư�� �־��ش�.
					break;
				} else {
					Bird = numStr[ra.nextInt(numStr.length)];
				}
			}
		}

		addWindowListener(new WindowAdapter() { // 'X' ��ư�� ������ ��
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// ���α׷��� �����Ѵ�.
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
		return b; // b�� ��ȯ�Ѵ�.
	}

	static void changeColor(MouseEvent e) {

		Button b = (Button) e.getSource(); // ��ư�� ���콺�� Ŭ����, �� ��ư�� b��� ��ư�� �����Ѵ�.
		b.setBackground(Color.LIGHT_GRAY); // ��ư�� ���� ���� ȸ������ �Ѵ�.
	}

}
