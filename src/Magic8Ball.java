import java.util.Random;

import javax.swing.JOptionPane;

import sun.applet.Main;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
public static void main(String[] args) {
	Random r = new Random();
	int random = r.nextInt(4);
	System.out.println(random);
	JOptionPane.showInputDialog(null, "Ask a question"); 
	if(random == 0) {
		JOptionPane.showMessageDialog(null, "YAAASSSSS");
	}
	if(random == 1) {
		JOptionPane.showMessageDialog(null, "Nah");
	
	}
	if(random==2) {
		JOptionPane.showMessageDialog(null, "google it");
	}
	if(random==3) {
		JOptionPane.showMessageDialog(null, "You have no life.");
	}
	
}
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
