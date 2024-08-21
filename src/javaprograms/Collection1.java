package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Set<Integer> marks=new HashSet<Integer>(); // HashSet is the class that implements the Set interface
		
		marks.add(95);
		marks.add(77);
		marks.add(86);
		marks.remove(77);
		marks.add(95);
		marks.add(95);
		marks.add(54);
		int s=marks.size();
		
		boolean res=marks.contains(95);
		
		System.out.println("The total number of marks is:"+marks.size());
		System.out.println("The value is present in the collection:"+res);
		System.out.println("set size is :"+s);
		
		for(int i:marks)
		{
			System.out.println("The marks is:"+i);
		}
		
		}

}
}
}
}

	


