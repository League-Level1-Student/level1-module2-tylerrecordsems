import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.omg.Messaging.SyncScopeHelper;

public class GI_Joe implements ActionListener {
String chosen;
	JButton Duke = new JButton();
	JButton SnakeEyes = new JButton();
	JButton Zartan = new JButton();
	JButton Flint = new JButton();
	JButton SgtSlaughter = new JButton();
//	JButton fourButton = new JButton();
//	JButton fiveButton = new JButton();
	//JButton sixButton = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void character(){
//	String Name = JOptionPane.showInputDialog( null, "Which GI_JOE would you like to be?");

		frame.add(panel);
	
frame.setVisible(true);

Duke.setText("Duke!");
SnakeEyes.setText("SnakeEyes!");
Flint.setText("Flint!");
SgtSlaughter.setText("Sgt. Slaughter!");
Zartan.setText("Zartan!");
//fourButton.setText("Spirit!");
//fiveButton.setText("RoadBlock!");
//sixButton.setText("Shipreck!");


frame.setBounds(450, 0, 500, 100);
panel.add(Duke);
panel.add(Zartan);
panel.add(SnakeEyes);
panel.add(Flint);

panel.add(SgtSlaughter);
//panel.add(fourButton);
//panel.add(fiveButton);
//panel.add(sixButton);
frame.setTitle("Which GI Joe would you like to be? YO JOE!!!");
//frame.pack();
Duke.addActionListener(this);
SnakeEyes.addActionListener(this);
Flint.addActionListener(this);
	
SgtSlaughter.addActionListener(this);
	Zartan.addActionListener(this);
	}
	public void chosen() {
		JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	if(arg0.getSource()==Duke) {
		chosen.equals("Duke!");
	}if(arg0.getSource()==SgtSlaughter) {
		chosen.equals("Sgt. Slaughter!");
	}if(arg0.getSource()==Zartan) {
		chosen.equals("Zartan!");
	}if(arg0.getSource()==SnakeEyes) {
		chosen.equals("SnakeEyes!");
	}if(arg0.getSource()==Flint) {
		chosen.equals("Flint!");
	}
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
	


		
	
}

