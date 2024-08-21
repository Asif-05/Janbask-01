package javaprograms;

public class ThisKeyword {
	
	String name;
	int version;
	
	public ThisKeyword(String name, int version)
	{
		this.name=name;
		this.version=version;
	}

	public void details()
	{
		System.out.println("The technology name is :"+this.name);
		System.out.println("The version is :"+this.version);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword t=new ThisKeyword("Java",17);
		ThisKeyword t1=new ThisKeyword("Selenium",4);
		
		t.details();
		t1.details();
		
		t1.de
		
	     	
		

	}

}
