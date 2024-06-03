import java.util.ArrayList;

public class uniquenumber {

	public static void main(String[] args) {

		int a[]= {1,1,1,2,2,4,4,17};
        ArrayList<Integer> ar=new ArrayList<Integer>();		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ar.contains(a[i]))
			{
				ar.add(a[i]);
			
				  k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
					    k++;
					}
				}
				// System.out.println(a[i]);
				 //System.out.println(k);
				 if(k==1)
				 {
					 System.out.println(a[i]+"is a unique number");
				 }
			}
		}
		
		
		
		
		
	}

}
