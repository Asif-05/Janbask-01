package javaprograms;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int j=0;
		
		String s=null;
		try
		{
			System.out.println(s.length());
		}
		
		catch(NullPointerException np)
		{
			System.out.println(np.getMessage());
			System.out.println("Dont find len of null value");
		}
		
		try
		{
			System.out.println(i/j);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Dont divide a number by zero");
			
		}
		
		finally
		{
			System.out.println("Program Executed Successfully");
		}
		System.out.println("Selenium");

	}

}
