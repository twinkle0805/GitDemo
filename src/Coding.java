
public class Coding {

	public static void main(String[] args) {

	/*
		///Written Original string and Reverse string
		String original ="HELLO,JAVA ".toLowerCase();
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse+= original.charAt(i);
		}
				
		
		System.out.println("original:"+original);
		
		System.out.println("reverse:"+reverse);
		
		
		///Written only reverse String
		String text = "Hello, world!";
	      
	    for (int i = text.length() - 1; i >= 0; i--) {
	         System.out.print( text.charAt(i));
	    }
 
	    
	   String name="Name";
	   String name1="Name";
	   String name2 =new String("Name");
	   
	   System.out.println(name==name1);
	   
	   System.out.println(name==name2);

	  
		
		
		
		int x=10;
		int y=10;
		
		System.out.println(x==y);
		
		
		
		

		int num=10;
	       for(int j=num; j>=1;j--)
	       {
	    	   System.out.println(j);
	       }

	
	     ///find all duplicate characters in a string
		//One way
		String s = "abcdefh";
		char[] character = s.toCharArray();

		boolean isNotDuplicate = false;

		for (int i = 0; i < s.length(); i++) {
			boolean isDuplicate = false;

 			for (int j = i + 1; j < s.length(); j++) {
				if (character[i] == character[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (isDuplicate) {
				System.out.println(character[i]);
				isNotDuplicate = true; 
			}
		}

		if (!isNotDuplicate) {
			System.out.println("No duplicates are found!");
		}
	}

	
	      //find all duplicate characters in a string
	     //Secondway
		 String str = "beautiful beach";
	      char[] carray = str.toCharArray();
	     System.out.println("The string is:" + str);
	    System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[i]+ " ");
	               break;
	            }
	         }
	      }
	           
	           
	        
	           
	      
	      String ss="abcde";
	      
	      char[] ca=ss.toCharArray();
	      
	      System.out.println("original string:"+ ss);
	      
	      System.out.print("duplicate character:"+" ");
	      
	      for(int i=0;i<ss.length();i++)
	      {
	    	  
	    	  for(int j=i+1;j<ss.length();j++)
	    	  {
	    		  if(ca[i]==ca[j])
	    		  {
	    			  System.out.print(ca[j]+" ");
	    			
	    		  }
	    		
	    	  }
	    
		
		
		String Strr="This Is A string";
		
		 int count=0;
		 
		 
		 for(int i=0;i<Strr.length();i++)
		 {
			 if(Strr.charAt(i)!=' ')
				 
			 {
				 
				 count++;
			 }
		 }
		 System.out.println(count);
		
	
		//Find the duplicate number in array
		 int[] arr= {1,2,3,4,5,6,7,7,8};
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j]) {
					 
					 System.out.println(arr[j]);
				 }
			 }
				 
			
		 }
		
		*/
	
		  int count = 0, num = 0003452745454;

		    while (num != 0) {
		      // num = num/10
		     num /= 10;
		      ++count;
		    }

		    System.out.println("Number of digits: " + count);
	    
	      } 
      
	}

