import java.util.ArrayList;

public class trycatch {

	public static void main(String[] args) {

		int i=1;
		int j=0;
		
		try
		{
			//boolean s= i>j;
			int s=j/i;
			System.out.println(s);
			
		}
		catch(Exception e)
		{
		   System.out.println("catch the exception");
		}
		
		ArrayList <String>a=new ArrayList<String>(); 
		    a.add("Twinkle");
		    a.add("Venkatesu"); 
		    System.out.println(a);
		
		
		
	}

}
