import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AssignmentOne {
public static void main(String[] args) {
	String write = JOptionPane.showInputDialog("Write anything here.");
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");
		char[] c = write.toCharArray();
		for (int i = 0; i < c.length; i++) {
			c[i] = encode(c[i]);
		}
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
	

}
public static char encode(char c) {
	return ++c;
	
}
}

//Copyright © 2018 by David Thorpe