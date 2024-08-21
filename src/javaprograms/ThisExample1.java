package javaprograms;

public class ThisExample1 {
	
	String name;
	static int version;
	
    void details()
    {
    	String name="python";
    	int version=5;
    	
    	this.name="C#";
    	this.version=10;
    	
    	System.out.println(name);
    	System.out.println(version);
    	
    	System.out.println(this.name);
    	System.out.println(this.version);
    	    	   	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         ThisExample1 t=new ThisExample1();
         
         t.details();
		
	}

}
