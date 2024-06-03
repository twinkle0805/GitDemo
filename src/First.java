import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First {

	public static void main(String[] args) {
		
		
     int num = 1;
     String name="Twinkle";
     char letter ='M';
     double d=17.1;
     boolean c=true;
     
     System.out.println(num+"  "+name+"  "+letter+"  "+"  "+d+" "+c);
     
     
     
     //Array is liner data structure which is used to store homogenous type of data.
     //array stores multipule values in single variable
     //array Following indexing,indexing start from zero('0')
     //Drawback of array:- Size is fixed
     //we can write array in Two types
     
     //First way
     int[] numbers=new int[4];
         numbers[0]=1;
         numbers[1]=2;
         numbers[2]=3;
         numbers[3]=4;
         
         for(int i=0;i<numbers.length;i++)
         {
        	 System.out.println(numbers[i]);
         }
     
     //Second Way
         int[] number= {1,2,4,5,6,5,4};
        
        for(int i =0;i<number.length;i++)
        {
        	System.out.println(number[i]);
        }
        
        
        //array using strings
        //First Way
        String[] namee=new String  [4];
        namee[0]="rahul";
        namee[1]="hussain";
        namee[2]="ramana";
        namee[3]="pg";
        
        for(int i=0;i<namee.length;i++)
        {
        	System.out.println(namee[i]);
        }
        //Enhanced for loop
        for(String s:namee)
        {
        	System.out.println(s);        }
        
        
        //Second Way
        String[] namm={"rahul","hussain","ramana","pg"};
          for(int i=0;i<namm.length;i++)
          {
        	  System.out.println(namm[i]);
          }
          
          
          
          
         //Writing Multiplied by 2
           
           int [] tab= {1,2,4,6,8,10,3,1};
           
           for(int i=0;i<tab.length;i++)
           {
        	   if(tab[i] % 2==0)
        	   {
        		   System.out.println(tab[i]);
        		   //break;
        	   }
        	   else
        	   {
        		   System.out.println(tab[i]+"is not multipule of 2");
        	   }
           }
           
       	//Printing numbers in reverse order 
   		
   		int[] ar= {1,2,3,4,5,6,7,8};
   		
   		for(int i=ar.length-1;i>=0;i--)
   		{
   			System.out.println(ar[i]);
   		}
   		
   		
   		//Array list 
      //Diffrence between Array and Array list is Array size is fixed,Array list size is dynamic 
   		//
    ArrayList<String> al=new ArrayList<String>();
    al.add("rahul");
    al.add("hussain");
    al.add("ramana");
    al.add("pg");
    
    for(int i=0;i<al.size();i++)
    {
    	System.out.println(al.get(i));
    }
    System.out.print("********");
    System.out.println("   ");
    //Enhanced for loop
    for(String a:al)
    {
    	System.out.println(a);
    }
     
    //Check name present in array list or not
    //There is contain method This method tell you your searching text is there in a list or not
    //it is giving Boolean value
    System.out.println(al.contains("ramana"));
    
    
    
    
    //Converting array to array list
    String[] ss= {"Hello","hi","good morning","Happy"};
    List<String> namelist= Arrays.asList(ss);
    namelist.contains("hi");
    
    
    
    //String is an object and That represent sequence of characters.
    //String literal
    //if u have same multipule values with same name it won't create new object it refers existing data.
     String s="selenium";
     String s1="Selenium";
     
     //Craeting String using same new keyword
     //it will same Sting value it creats new object
     String s2=new String("java");
     String s3=new String("Postman");
     
     String ss1= "Rahul Shetty Academy";
    String[] splitedone =ss1.split("Shetty");
 
     System.out.println(splitedone[0]);
    System.out.println(splitedone[1]);
  System.out.println(splitedone[1].trim());
  
   for(int i=0; i<ss1.length();i++)
   {
	  System.out.println( ss1.charAt(i));
   }
   
   //Reverse String
   for(int i=ss1.length()-1;i>=0;i--)
   {
		  System.out.println( ss1.charAt(i));
         
   }
    
     
	}

}
