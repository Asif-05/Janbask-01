package javaprograms;

public class MethodsEx1 {
	
	
	public void testing()
	{
		System.out.println("Selenium");
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public String add1(String s1, String s2)
	{
						
		return s1+s2;
	}

	public static void mul()
	{
		int x=10;
		int y=2;
		
		System.out.println(x*y);
	}
	
	public static void div(int c, int d)
	{
		
		System.out.println(c/d);
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsEx1 m=new MethodsEx1();  // MethodsEx1() is a constructor 
		
		m.testing();  // invoke the method
		System.out.println(m.add1("java","17"));
		System.out.println(m.add(3, 2));
		mul();
		div(10,2);

	}

}
