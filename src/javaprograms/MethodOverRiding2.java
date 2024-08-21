package javaprograms;

public class MethodOverRiding2 extends MethodOverRiding1{
	
	public int add()
	{
		int a=100;
		int b=200;
		int c=300;
		
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverRiding2 m=new MethodOverRiding2();
			    	
		System.out.println(m.add());
		
			

	}

}
