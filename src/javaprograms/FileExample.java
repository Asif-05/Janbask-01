package javaprograms;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("D:/Training/selenium.xls");
		
		f.mkdir();
		boolean e=f.exists();
		
		f.createNewFile();
		
		System.out.println("Does the folder exist in the location??" +e);

	}

}
