package javaprograms;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Automation";
		String s2= "Java";
		String s3="SQL";
	    String s4="sql";
	    String s5="  Java Programming";
	    double a=-12.4567;
	    float b=20.73f;
	    char division='#';
	    char lesson='b';
	    @SuppressWarnings("unused")
		String [] tool={"Selenium","QTP"};
	    int i=100;
	    
	    boolean b1=Arrays.asList(tool).contains("QTP");
	    System.out.println(b);
		
	    String a1=Arrays.toString(tool);
	    System.out.println(a1);
		System.out.println(s1+" "+s2.concat(s3)+" "+s3.concat(s1));
		System.out.println(s1.charAt(5));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s4.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println("Before Trim method the length is :"+s5.length());
		System.out.println("After Trim method the length is :"+s5.trim().length());
		System.out.println(s1.length());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0, 4));
		System.out.println(s5.endsWith("Programming"));
		System.out.println(Math.abs(a));	
		System.out.println(Math.round(b));
		System.out.println(Math.random());
		System.out.println(Character.isLetter(division));
		System.out.println(Character.isUpperCase(lesson));
		
		
		
		
		
	}

}
