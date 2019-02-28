import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingtutor implements KeyListener {
	JFrame frame;
	JLabel letter;
	JPanel pan;
	char currentletter;
	String a = Character.toString(currentletter);
	Date timestart;
	int chartyped = 0;
	int charactersPerMinute;
	long gameInSeconds;
	long gameDuration;
	int accuracy;
	int numberOfCorrectCharactersTyped;

	public static void main(String[] args) {
		typingtutor t = new typingtutor();
		t.CreateUI();

	}

	
		private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		      Date timeAtEnd = new Date();
		      long gameDuration = timeAtEnd.getTime() - timestart.getTime();
		      long gameInSeconds = (gameDuration / 1000) % 60;
		      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		      int charactersPerMinute = (int) (charactersPerSecond * 60);
		      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
		}


	public void CreateUI() {
		frame = new JFrame();
		letter = new JLabel();
		pan = new JPanel();
		pan.add(letter);
		pan.addKeyListener(this);
		letter.setFont(letter.getFont().deriveFont(100.0f));
		letter.addKeyListener(this);
		frame.add(pan);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);

		currentletter = generateRandomLetter();

		String a = Character.toString(currentletter);

		letter.setText(a);
		frame.pack();
		timestart = new Date();

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char input = e.getKeyChar();
		if (chartyped == 100) {
			showTypingSpeed(numberOfCorrectCharactersTyped);
			accuracy = numberOfCorrectCharactersTyped/100 ;
			JOptionPane.showMessageDialog(null, "with an accuracy of" + accuracy +" %");
			frame.dispose();
		}
		if (input == currentletter) {
			System.out.println("good job");
			pan.setBackground(Color.green);
			chartyped++;
			numberOfCorrectCharactersTyped++;

		} else {
			pan.setBackground(Color.red);
			chartyped++;
		}
		System.out.println("You typed" + input);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentletter = generateRandomLetter();
		a = Character.toString(currentletter);
		letter.setText(a);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
