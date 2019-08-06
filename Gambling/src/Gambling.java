import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.xml.transform.OutputKeys;

public class Gambling extends Frame {

	Panel contentPa = new Panel();
	Label label[] = new Label[4];
	Label meseege;

	int gamNum[] = new int[4];
	boolean same = true;

	Gambling() {

		setTitle("Welcome To The Gambling!");
		setState(50);
		setSize(700, 500);
		setVisible(true);

		contentPa.setLayout(null);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		for (int i = 0; i < 4; i++) {
			label[i] = new Label("0", label[i].CENTER);
			label[i].setFont(new Font("batang", Font.BOLD, 40));
			label[i].setBackground(Color.YELLOW);
			label[i].setSize(100, 50);
			label[i].setLocation(i * 150 + 50, 50);
			add(label[i]);
		}

		meseege = new Label("Start!", label[NORMAL].CENTER);
		meseege.setSize(100, 50);
		meseege.setLocation(210, 200);
		meseege.setFont(new Font(null, Font.BOLD, 15));
		add(meseege);
		addKeyListener(new GamblingListener());
		setVisible(true);
		contentPa.requestFocus();
	}

	class GamblingListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyChar() == '\n')
				playGamblingGame();
		}

		public void playGamblingGame() {
			gameMethod();
			inputMethod();
		}

		private void inputMethod() {
			for (int i = 0; i < 4; i++) {
				label[i].setText(Integer.toString(gamNum[i]));
			}
			if (!same)
				meseege.setText("OOUPS..");
			
			else
				meseege.setText("WOW PERPECT!!");
		}

		private void gameMethod() {
			for (int i = 0; i < 4; i++)
				gamNum[i] = (int) (Math.random() * 5);
			for (int i = 1; i < 4; i++)
				if (gamNum[i] != gamNum[i - 1]) {
					same = false;
					break;
				} else
					same = true;}
	}
}