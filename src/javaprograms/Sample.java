package javaprograms;

public class Sample {

	String name;
	
	
	public Sample(String name) {
		// TODO Auto-generated constructor stub
		
		this.name=name;
	}
	
	void details()
	{
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s=new Sample("Java");
		Sample s1=new Sample("Selenium");
			
		System.out.println(s.name);
		System.out.println(s1.name);
	    
			
		
	}

}
