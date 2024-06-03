
public class Variable {

	int a=10;
	
	public void main()
	{
		int a=11;
		int b=a+this.a;
		System.out.println(a);
       System.out.println(this.a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {

		Variable v=new Variable();
		v.main();
		
		
		
		
		
	}

}
