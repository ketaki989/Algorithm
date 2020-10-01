package CCI;
import java.util.*;
public class UniqueString {
	
	//BruteForce Approach O(N^2)..
	public boolean bruteForce(String str){
		for(int  i = 0; i < str.length()-1; i++){
			for(int j = i+1; j < str.length(); j++){
				if(str.charAt(i) ==str.charAt(j)){
					return false;
				}
			}
		}
		
		return true;
	}
	int MAX_CHAR = 256;    
	boolean uniqueCharacters(String str) 
	{ 
		// If length is greater than 256, 
	    // some characters must have been repeated 
	    if (str.length() > MAX_CHAR) 
	    	return false; 
	  
	    boolean[] chars = new boolean[MAX_CHAR]; 
	    Arrays.fill(chars, false); 
	  
	    for (int i = 0; i < str.length(); i++) { 
	    	int index = (int)str.charAt(i); 
	    	System.out.println("Index :"+index);
	  
	            /* If the value is already true, string 
	               has duplicate characters, return false */
	        if (chars[index] == true) 
	        	return false; 
	  
	        chars[index] = true; 
	    } 
	  
	        /* No duplicates encountered, return true */
	    return true; 
	} 
	
	
	 boolean OptimaluniqueCharacters(String str) 
	 {
		 System.out.println("Optimal Solution...");
	        // Assuming string can have characters a-z 
	        // this has 32 bits set to 0 
	        int checker = 0; 
	  
	        for (int i = 0; i < str.length(); i++) { 
	            int bitAtIndex = str.charAt(i) - 'a'; 
	            System.out.println("BitAtIndex"+bitAtIndex);
	  
	            // if that bit is already set in checker, 
	            // return false
	            int a = 1 << bitAtIndex;
	            System.out.println("a: "+a);
	            int b = checker & a;
	            System.out.println("b:"+b);
	            boolean c = b > 0;
	            System.out.println("c:"+c);
	            
	            
	            if ((checker & (1 << bitAtIndex)) > 0) 
	                return false; 
	  
	            // otherwise update and continue by 
	            // setting that bit in the checker 
	            checker = checker | (1 << bitAtIndex); 
	        } 
	  
	        // no duplicates encountered, return true 
	        return true; 
	    } 
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		UniqueString ustr = new UniqueString();
		//BruteForce Approach..
		if(ustr.bruteForce(str)){
			System.out.println("Unique String..");
		}else{
			System.out.println("Not Unique String...");
		}
		//With Extra Data Structure...
		if (ustr.uniqueCharacters(str)) 
            System.out.println("The String " + str 
                               + " has all unique characters"); 
        else
            System.out.println("The String " + str
                               + " has duplicate characters"); 
		
		//Without Extra Data Structure...
		if (ustr.OptimaluniqueCharacters(str)) 
            System.out.println("The String " + str 
                               + " has all unique characters"); 
        else
            System.out.println("The String " + str
                               + " has duplicate characters"); 

	}
}
