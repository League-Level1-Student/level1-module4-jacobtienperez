import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class piglatinUI implements MouseListener {
JFrame frame;
JPanel panel;
JButton but;
JTextField input;
JTextField trans;
PigLatinTranslator pigLatin;
public static void main(String[] args) {
	new piglatinUI().createUI();
}
public void createUI() {
	frame = new JFrame();
	panel = new JPanel ();
	but = new JButton();
	input = new JTextField();
	trans = new JTextField();
	frame.setVisible(true);
	pigLatin = new PigLatinTranslator();
	but.setText("Translate");
	panel.add(but);
	input.setSize(50, 80);
	input.setText("enter word here");
	trans.setSize(50, 80);
    trans.setText("translation");
	frame.add(panel);
	panel.add(input);
	panel.add(trans);
	panel.setSize(200,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
    
	
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
if(e.getSource().equals(but)) {
	String result = pigLatin(input.getText());
    String res = pigLatin.translate(result);
     trans.setText(res);
}
}
private String pigLatin(String text) {
	// TODO Auto-generated method stub
	return null;
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
