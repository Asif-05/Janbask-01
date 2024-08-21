package javaprograms;

public class StrProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String product_id="#456ASC";
		
		String name="Laptop";
		
		String price="$75";
		
		String s1=new String();  // another way of creating a string 
		
		String [] myTools={"Selenium","QTP/UFT","QC/ALM","Jmeter"};
		
		System.out.println("The Purchase Details:"+" "+product_id+" "+name+" "+price);
		
		for(String i:myTools)
		{
			System.out.println("The tool name is: "+i);
		}
		
		
		
		

	}

}
