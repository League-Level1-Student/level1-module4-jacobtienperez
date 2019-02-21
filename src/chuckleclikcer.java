import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class chuckleclikcer implements Runnable, MouseListener {

	JFrame frame;
	JButton but;
	JPanel pan;
	JButton punch;
	
public static void main(String[] args) {
chuckleclikcer c = new chuckleclikcer();
c.Clicker();
  
}
public void Clicker() {
	 frame = new JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 pan = new JPanel();
	 but = new JButton();
	but.setText("Joke");
	but.addMouseListener(this);
	but.setSize(50, 100);
	
	pan.add(but);
	 punch = new JButton();
	punch.setText("punchline");
	punch.addMouseListener(this);
	punch.setSize(50, 100);
	pan.add(punch);
	frame.add(pan);
	
	frame.pack();
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == but) {
		JOptionPane.showMessageDialog(null, "What do you call a snake mixed with a dessert");
		
	}
	else if(e.getSource() == punch) {
	JOptionPane.showMessageDialog(null, "a piethyon");	
	}
		}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void run() {
	// TODO Auto-generated method stub
	
}


}

