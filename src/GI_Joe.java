import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.omg.Messaging.SyncScopeHelper;

public class GI_Joe {
String x;
	JButton leftButton = new JButton();
	JButton centerButton = new JButton();
	JButton rightButton = new JButton();
	JButton oneButton = new JButton();
	JButton twoButton = new JButton();
	JButton threeButton = new JButton();
	JButton fourButton = new JButton();
	JButton fiveButton = new JButton();
	JButton sixButton = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void character(){
//	String Name = JOptionPane.showInputDialog( null, "Witch GI_JOE would you like to be?");

		frame.add(panel);
	
frame.setVisible(true);

leftButton.setText("Duke!");
centerButton.setText("SnakeEyes!");
oneButton.setText("Flint!");
twoButton.setText("Lady Jay!");
threeButton.setText("Sgt. Slaughter");
rightButton.setText("Zartan!");
fourButton.setText("Spirit!");
fiveButton.setText("RoadBlock!");
sixButton.setText("Shipreck!");


frame.setBounds(450, 0, 500, 100);
panel.add(leftButton);
panel.add(rightButton);
panel.add(centerButton);
panel.add(oneButton);
panel.add(twoButton);
panel.add(threeButton);
panel.add(fourButton);
panel.add(fiveButton);
panel.add(sixButton);
frame.setTitle("Which GI Joe would you like to be? YO JOE!!!");
//frame.pack();
	leftButton.addActionListener((ActionListener) this);
	centerButton.addActionListener((ActionListener) this);
	rightButton.addActionListener((ActionListener) this);
	
	}
	public void chosen() {
		JOptionPane.showMessageDialog(null, "You have chosen " + x);
	}
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == leftButton) {
			x.equals("Duke!");
			chosen();
			frame.setVisible(false);
		}if (buttonPressed == centerButton) {
			x.equals("SnakeEyes!");
		}if (buttonPressed == oneButton) {
			x.equals("Flint!");
		}if (buttonPressed == twoButton) {
			x.equals("Lady Jay");
		}if (buttonPressed == threeButton) {
			x.equals("Sgt. Slaughter");
		}if (buttonPressed == rightButton) {
			x.equals("Zartan");
		}if (buttonPressed == fourButton) {
			x.equals("Spirit");
		}
		
	}
}
