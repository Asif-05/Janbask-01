package javaprograms;

public class Inter2 implements Inter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inter2 in=new Inter2();
		
		in.autiomation();

	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Good Evening");
	}

	@Override
	public void autiomation() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

}
