package javaprograms;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="selenium";  // letter B is in second position
		
		String s2="SELENIUM";  // letter E is in fifth position   
		
		String n1="100";
		
		String n2="200";
		
		System.out.println(s1+" "+s2);
		
		System.out.println(n1+n2);
		
		System.out.println(s1.toUpperCase());
		
		if(s1==s2)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are different");
		}

		if(s1.equals(s2))
			
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are different");
		}
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));  // 2-5=-3
		System.out.println("The length of String s1: "+s1.length());
		
		
			
		
	}

}
