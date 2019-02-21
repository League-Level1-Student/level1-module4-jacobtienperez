import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingtutor implements KeyListener {
	JFrame frame;
	JLabel letter;
	JPanel pan;
	char currentletter;
	
	
	public static void main(String[] args) {
		typingtutor t = new typingtutor();
		t.CreateUI();
	}
	
	public void CreateUI() {
	frame = new JFrame();
	letter = new JLabel();
	pan = new JPanel();
	pan.add(letter);
	letter.setFont(letter.getFont().deriveFont(100.0f));
	frame.add(pan);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(200,200);
	
	
	
	
	
	
	currentletter = generateRandomLetter();
	
	String a = Character.toString(currentletter);
	
	letter.setText(a);
	frame.pack();
	
			

}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');}
		
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char input = e.getKeyChar();
		if(input == currentletter) {
			System.out.println("good job");
			
		}
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentletter = genera
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
