package javaprograms;

public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark=80;
		String name="java";
		
		try
		{
			if((mark<=70)&&(name=="java"))
			{
				throw new Exception("Marks should be greater than 70 ");
			}
		}
		
		catch(Exception re)
		{
			System.out.println(re);
			System.out.println(re.getMessage());
		}
		
		finally
		{
			System.out.println("Program executed Successfully");
		}
	}

}


		
		
	


