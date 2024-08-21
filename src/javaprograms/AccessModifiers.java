package javaprograms;

public class AccessModifiers {
	
	private int mark=90;
	
	protected float avg=75.4f;
	
	int num1=50;
	
	static String empid="#A100"; // static is a non access modifier
	
    final int num2=200;  // can't inherit 
    
    public int add(int a, int b)   // a,b are the parsameters(local variables used in method)
    {
    	return a+b;
    }
     	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers a=new AccessModifiers();
		
		System.out.println(a.mark);
		
		
		
		
		System.out.println(empid);
		
	    System.out.println(a.add(2, 3));  // 2,3  are arguements passed to the parameters
		
		
		
		
		
		
		
		
		
	}

}
