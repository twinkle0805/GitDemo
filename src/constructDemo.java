
public class constructDemo {
	
	private constructDemo()
	{
		System.out.println("I am From The Constructor");
	}
	public constructDemo(int a)
	{
		System.out.println(a);
	}
	
	public constructDemo(String str)
	{
		System.out.println(str);
	}
	
	
	
	public void getData()
	{
		System.out.println("I Am From The Method");
	}

	
	
	public static void main(String[] args) {
		
		
		
	constructDemo cd=new constructDemo();
	constructDemo d=new constructDemo(8);
	constructDemo c=new constructDemo("Twinkle");
	}
	}

