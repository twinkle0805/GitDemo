
public class parentLevel {
    
	String name="venkey";;
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
		
	}
	public void getData(int a,int b)
	{
		System.out.println(b);
	}
	
	public void getData()
	{
		System.out.println("i am from parent class");
	}
	
	
	
	
	public static void main(String[] args) {

		parentLevel pl=new parentLevel();
		pl.getData(8);
		pl.getData("Twinkle");
		pl.getData(01, 17);
		
		
		
		
		
		
		

	}

}
