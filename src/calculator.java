import java.awt.Button;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.org.apache.xpath.internal.Arg;

import sun.net.www.ParseUtil;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class calculator implements MouseListener {
	
	JButton but1;
	JButton but2;
	JButton but3;
    JButton but4;
    JTextField num1;
     JTextField num2;
     JPanel pan;
     
    public static void main(String[] args) {
		calculator cal = new calculator();
		cal.createUI();
	}
    
 void createUI() {
	 num1 = new JTextField();
num2 = new JTextField();
 but1 = new JButton();
	 but2 = new JButton();
	 but3 = new JButton();
	 but4 = new JButton();
	JPanel pan = new JPanel();
	num1.setText("number");
	num2.setText("number");
	pan.add(num1);
	pan.add(num2);
	pan.add(but4);
	pan.add(but3);
	pan.add(but2);
	pan.add(but1);
	but1.addMouseListener(this);
	but2.addMouseListener(this);
	but3.addMouseListener(this);
	but4.addMouseListener(this);
	but1.setText("add");
	but2.setText("substract");
	but3.setText("multiply");
	but4.setText("divide");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(pan);

	
	frame.pack();
	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(but1)){
		double ad = Double.parseDouble(num1.getText());
		double ade = Double.parseDouble(num2.getText());
		 
		JOptionPane.showMessageDialog(null, (ad + ade));
		
	}
	if(e.getSource().equals(but2)) {
		double sub = Double.parseDouble(num1.getText());
		double subb = Double.parseDouble(num2.getText());
		JOptionPane.showMessageDialog(null, (sub - subb));
	}
	if(e.getSource().equals(but3)) {
		double mul = Double.parseDouble(num1.getText());
		double mult = Double.parseDouble(num2.getText());
		JOptionPane.showMessageDialog(null, (mul*mult));
	}
	if(e.getSource().equals(but4)) {
		double div = Double.parseDouble(num1.getText());
		double divi = Double.parseDouble(num2.getText());
		double divid = (div/divi);
		
		 if(divid==0) {
			JOptionPane.showMessageDialog(null, "The computer exploded"); 
			frame.
		 }
		 JOptionPane.showMessageDialog(null, (divid));
		 
		
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
}
