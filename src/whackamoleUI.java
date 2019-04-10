import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class whackamoleUI implements MouseListener {
JFrame frame;
JPanel panel;
JButton but;

public static void main(String[] args) {
	whackamoleUI game = new whackamoleUI();
	game.makeui();
	game.makebuttons();

    
}
void makeui() {
	frame = new JFrame();
	frame.setVisible(true);
	panel = new JPanel();
	frame.add(panel);
	frame.setSize(300, 400);
}

void makebuttons() {
	Random r = new Random();
	int m = r.nextInt(24);
	panel.removeAll();
	for(int i = 0; i < 25; i++) {
		 but = new JButton();
		but.setPreferredSize(new Dimension (100,20));
		but.addMouseListener(this);
		if(i == m) {
			but.setText("monty mole");
			
		}
		panel.add(but);
	}
  panel.revalidate();
}

@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	JButton b = (JButton)
}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
