import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentThree {
public static void main(String[] args) {
	File f = new File("src");
	appendToJava(f);
}
public static void appendToJava(File f) {
if (f.isFile() && f.getName().endsWith(".java")) {
	appendCopyright(f);
}
else if(f.isDirectory()) {
	File[] files = f.listFiles();
	for(File sub: files) {
		appendToJava(sub);
	}
}
}
public static void appendCopyright(File f) {
	try {
		FileWriter fw = new FileWriter(f, true);
		
		/*
		NOTE: To append to a file that already exists, add true as a second parameter when calling the
		      FileWriter constructor.
		      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
		*/
		
		fw.write("\n" + "//Copyright © 2018 by David Thorpe");
			
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

//Copyright © 2018 by David Thorpe