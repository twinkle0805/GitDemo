
public class ParentClass {
	
	String colour="Pink";
	//function overloading using inheritance
	public void car()
	{
		System.out.println("implemented of a car");
		
	}
	public void colour()
	{
		System.out.println(colour);
	}
	public void gear()
	{
		
		System.out.println("implemeted of a gear");
	}
    public void ac()
    {
    	System.out.println("implemented of a ac");
    }
    public void audio()
    {
    	System.out.println("implemented of a audio");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass pc=new ParentClass();
		pc.audio();
		pc.ac();
		pc.car();
		pc.gear();
		
		
		
	}

}
