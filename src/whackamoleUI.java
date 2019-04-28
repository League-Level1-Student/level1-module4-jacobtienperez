import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class whackamoleUI implements MouseListener {
JFrame frame;
JPanel panel;
JButton but;
int hit;

public static void main(String[] args) {
	whackamoleUI game = new whackamoleUI();
	game.makeui();
	game.makebuttons();

    
}
if(hit==10) {
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");}
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
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	String text = but.getText();
	int miss = 0;
	int hit = 0;
	if(e.getSource().equals(but)) {
	  if(text == "monty mole") {
		 panel.removeAll(); 
		 panel.revalidate();
		 hit ++;
	  }
	  else {
		  but.setText("miss");
		  panel.removeAll();
		  panel.revalidate();
		  miss ++;
		  hit ++;}
	  }

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
