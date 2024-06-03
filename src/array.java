import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class array {

	public static void main(String[] args) {
	
		//Type one Array
		int a[] =new int[8];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		//a[8]=9;
		//a[9]=10;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		/// Type Two Array
		
		int b[] = {1,3,5,7,9,10,14};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
		//Type One String
		String s[]=new String[4];
		s[0]="hii";
		s[1]="hlo";
		s[2]="hwru";
		s[3]="bye";
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
		
		
		//Type Two String
		String ss[]= {"hiii","hello","how are you"};
		
		for(int i=0;i<ss.length;i++)
		{
			System.out.println(ss[i]);
		}
		
		//Finding The Minimum Value
		int ab[] [] = {{3,5,6},{4,2,7},{1,17,8,}};
		int min=ab[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(ab[i][j]<min)
				{
					min=ab[i][j];
				}
			}
		}
	     System.out.println(min);//1
	     
	 
	     //Finding The Maximum Value
	     int abc[] [] = {{3,5,6},{4,2,7},{1,17,8,}};
			int max=abc[0][0];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(ab[i][j]>max)
					{
						max=abc[i][j];
					}
				}
			}
	     System.out.println(max);
	     
	     //print the curent system time
	     
	     Date d=new Date();
	     SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
	     SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
         System.out.println(sd.format(d));
	     System.out.println(sdf.format(d));
	     System.out.println(d.toString());
	     
	     
	     
	     Calendar cal=Calendar.getInstance();
	     System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	     System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	     
	    
	     //ArrayList
	     
	     ArrayList<String> a1=new ArrayList<String>();
	     a1.add("apple");
	     a1.add("banana");
	     a1.add("cherry");
	     a1.add("mango");
	     a1.add("apple");
	     System.out.println(a1);
	     a1.remove(4);
	     System.out.println(a1);
	     System.out.println(a1.contains("cherry"));
	     System.out.println(a1.size());
	     for(int i=0;i<a1.size();i++)
	     {
	    	 String e=a1.get(i);
	    	 System.out.println("index: " +i+ ", value: "+e);
	     }
	     
	     
	     HashSet<String> hs=new HashSet<String>();
	     hs.add("INDIA");
	     hs.add("USA");
	     hs.add("UK");
	     hs.add("NEPAL");
	     hs.add("INDIA");
	     System.out.println(hs);
	     System.out.println(hs.remove("NEPAL"));
	     System.out.println(hs.isEmpty());
	     System.out.println(hs.size());
	     
	     
	     Iterator<String> i=hs.iterator();
	     while(i.hasNext())
	     {
	     System.out.println(i.next());
	    // System.out.println(i.next());

	      }
	     
	     List<String> l=new  LinkedList<String>();	     
	     l.add("rose");
	     l.add("Lotus");
	     l.add("Lily");
	     l.add("jasmin");
	     l.add("jasmin");

	     System.out.println(l);
	     
	     
	     
	     HashMap<Integer,String> hm=new HashMap<Integer,String>();
	     hm.put(1, "Hyd");
	     hm.put(2, "Bng");
	     hm.put(3, "mysore");
	     hm.put(4, "pune");
	     System.out.println(hm.get(3));
	     System.out.println(hm.remove(2));
	     Set sn=hm.entrySet();
	     
	     Iterator it=sn.iterator();
	     
	     while(it.hasNext())
	     {
	    	 System.out.println(it.next());
	    	 Map.Entry mp= (Map.Entry)it.next();
	    	 System.out.println(mp.getKey());
	    	 System.out.println(mp.getValue());
	     }
	     
	     
	     
	     
	     
	      
	      
	     
	}
	
	
	
	
	
	
	

}
