package javaprograms;

public class Base extends Parent {
	
	void rr()
    {
        // referring parent class(i.e, class Parent)
        // instance variable(i.e, a)
        int a=100;
        System.out.println(a);
        System.out.println(super.a);

        // referring parent class(i.e, class Parent)
        // static variable(i.e, b)
        System.out.println(super.b);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b=new Base();
		
		b.rr();

	}

}
