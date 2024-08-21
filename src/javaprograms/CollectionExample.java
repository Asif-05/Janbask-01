package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks1=79;  // variabkle
		
		int marks2[]= {100,80};  // array
		
		
		Set<Integer>marks3=new HashSet<Integer>();   // collection is a resizable array
		
		
		marks3.add(95);
		marks3.add(87);
		marks3.add(72);
		marks3.add(95);
		
		marks3.remove(87);
		
		boolean res=marks3.contains(72);
		int s=marks3.size();
		
		for(int i:marks3)
		{
			System.out.println(i);
		}
		
		System.out.println(res);
		System.out.println(s);
			
		

	}

}
