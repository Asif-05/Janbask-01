package javaprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Creating object of class inside main() method
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
 
        System.out.println("Enter an integer");
 
        // Taking integer input
        int a = Integer.parseInt(br.readLine());
 
        System.out.println("Enter a String");
 
        String b = br.readLine();
 
        // Printing input entities above
        System.out.printf("You have entered:- " + a
                          + " and name as " + b);

	}

}
