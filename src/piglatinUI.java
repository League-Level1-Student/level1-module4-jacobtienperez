import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class piglatinUI implements MouseListener {
JFrame frame;
JPanel panel;
JButton but;
JTextField input;
JTextField translate;
piglatintranslater pigLatin;
public static void main(String[] args) {
	
}
public void createUI() {
	frame = new JFrame();
	panel = new JPanel ();
	but = new JButton();
	input = new JTextField();
	translate = new JTextField();
	pigLatin = new piglatintranslater();
	but.setText("Translate");
	frame.add(but);
	frame.add(panel);
	frame.add(input);
	frame.add(translate);

	
}
@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
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
