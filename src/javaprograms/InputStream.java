package javaprograms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
	    String name=sc.nextLine();	
	    System.out.println("The name is :"+name);
	    
	    File fileObj=new File("D:/janbask.xls");
	    
	    fileObj.createNewFile();
	    System.out.println("Does the file exist:"+fileObj.exists());
  
	}

}
