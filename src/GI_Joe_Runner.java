import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GI_Joe_Runner {
public static void main(String[] args) {
//	int x;
	new GI_Joe().character();
	GI_Joe GIjoe = new GI_Joe();
	GIjoe.character();
	GIjoe.chosen();
}
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
//	int x;
//JOptionPane.showMessageDialog(null, "You have chosen " + x);
}
}

	
		
	
