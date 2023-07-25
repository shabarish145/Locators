package Package1;

public class PrivateA {
	
	private int data =20;
	
	private void msg()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		
		PrivateA  obj = new PrivateA();
		
		System.out.println(obj.data);
		obj.msg();
	
		

	}

}
