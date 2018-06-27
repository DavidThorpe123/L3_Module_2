import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AssignmentFour {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;

	AssignmentFour() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		frame.pack();

	}

	public static void main(String[] args) {
		AssignmentFour afour = new AssignmentFour();
	}
}
