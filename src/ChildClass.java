
public class ChildClass extends ParentClass{

	public void audio()
	{
		System.out.println("new audio");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	
	
	
	public static void main(String[] args) {

		
		ParentClass cs=new ChildClass(); 
		cs.audio();
		cs.colour();
		cs.gear();
		cs.ac();
		
		
		
		
		
	}

}
