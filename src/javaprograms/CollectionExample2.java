package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> tech=new ArrayList<String>();
		
		tech.add("Java");
		tech.add("Python");
		tech.add("SQL");
		tech.add("Java");
	    tech.remove("Java");
	    
		
		System.out.println("The Number of Technologies:"+tech.size());
	
	
		for(String s:tech)
		{
			System.out.println("The length of data item is:"+s.length());
		}
		
		
		
		

	}



	}


