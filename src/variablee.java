
public class variablee {
	
	
	String name;
	String address;
	static String city="bng";
	
	
	
	 variablee(String name,String address)
	{
		this.name=name;
		this.address=address;
	
		
	}
	 public void getData()
	 {
		 System.out.println(name+"  "+address+" "+city);
	 }

	public static void main(String[] args) {
     
		
		variablee vr=new variablee("dontknow","btm");
		vr.getData();
	
		
		
	}

}
