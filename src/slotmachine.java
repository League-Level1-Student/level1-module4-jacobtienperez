import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class slotmachine implements MouseListener, Runnable {
JFrame frame;
JPanel slot;
JPanel button;
JPanel message;
JButton spinner;
JLabel resultleft;
JLabel resultcenter;
JLabel resultright;
JLabel topmessage;
public static void main(String[] args) {
SwingUtilities.invokeLater(new slotmachine());
}

	
@Override
public void run() {
	// TODO Auto-generated method stub
	frame = new JFrame();
	message = new JPanel();
	slot = new JPanel();
	button = new JPanel();
	resultleft = new JLabel();
	resultright = new JLabel();
	resultcenter = new JLabel();
	spinner = new JButton();
	frame.setSize(800, 400);
	frame.setTitle("epic gamer spinner");
	frame.setVisible(true);
    frame.add(message, BorderLayout.NORTH);
    frame.add(button, BorderLayout.SOUTH);
   frame.add(slot, BorderLayout.CENTER);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   resultleft = loadImageFromComputer("7.png");
   resultright = loadImageFromComputer("bell.png");
   resultcenter = loadImageFromComputer("download.png");
  slot.add(resultleft, BorderLayout.WEST);
   slot.add(resultright, BorderLayout.EAST);
   slot.add(resultcenter, BorderLayout.CENTER);
   button.add(spinner);
   spinner.setText("spin to win");
   spinner.addMouseListener(this);
  
}
private void spinReels() {
	//clear reels panel
	//call spinReel for each reel
	//check for win
	//revalidate the reels panel
}
private int spinreel() {
	//set random value0-2
	//load image label based on random#
	//add label to reels panel
	//return random#
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()== spinner) {
	    System.out.println("d");
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
public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}


}
