import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AssignmentFour implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	ArrayList<String> tasks = new ArrayList<String>();

	AssignmentFour() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button1.setText("Add Task");
		button2.setText("Remove Task");
		button3.setText("Save");
		button4.setText("Load");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String task = JOptionPane.showInputDialog("Enter a task");
			tasks.add(task);
		}
		if (e.getSource() == button2) {
			String num = JOptionPane.showInputDialog("What number task would you like to remove?");
			int num1 = Integer.parseInt(num);
			tasks.remove(num1 - 1);
		}
		if (e.getSource() == button3) {
			String taskss = "";
			for (int i = 0; i < tasks.size(); i++) {
				taskss += (i + 1) + "." + tasks.get(i) + "\n";
			}
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/tasks.txt");
				fw.write(taskss);
				fw.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		if (e.getSource() == button4) {
			String taask = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/tasks.txt"));

				String line = br.readLine();
				while (line != null) {
					System.out.println(line);
					taask += line + "\n";
					line = br.readLine();
				}

				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, taask);
		}
	}
}
