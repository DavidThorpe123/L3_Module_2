import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class AssignmentTwo {
	
	AssignmentTwo() {
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String fileName = jfc.getSelectedFile().getAbsolutePath();
			System.out.println(fileName);
			try {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				
				String line = br.readLine();
				char[] c = line.toCharArray();
				for (int i = 0; i < c.length; i++) {
					c[i] = decode(c[i]);
				}
				
				
				br.close();
				try {
					FileWriter fw = new FileWriter("src/intro_to_file_io/test.txt");
					
					/*
					NOTE: To append to a file that already exists, add true as a second parameter when calling the
					      FileWriter constructor.
					      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
					*/
					
					fw.write(c);
						
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	public static char decode(char c) {
		return --c;
		
	}
	public static void main(String[] args) {
		AssignmentTwo a2 = new AssignmentTwo();
	}

}

//Copyright © 2018 by David Thorpe