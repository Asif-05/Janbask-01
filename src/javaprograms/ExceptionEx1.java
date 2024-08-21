package javaprograms;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		int j=0;
		
		try
		{
			System.out.println(i/j);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
		}
		
		finally
		{
			System.out.println("Program Executed");
		}
		
		System.out.println("Selenium Automation");
		
		
		
	}

}
