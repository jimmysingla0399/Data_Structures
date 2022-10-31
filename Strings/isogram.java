package Strings;

import java.util.*;

//no repeating characters
//An Isogram is a word in which no letter occurs more than once.
public class isogram {

	static boolean isogram(String str) 
    { 
        // Convert the string in lower case letters 
        str = str.toLowerCase(); 
        int len1 = str.length(); 
  
        char arr[] = str.toCharArray(); 
  
        Arrays.sort(arr); 
        for (int i = 0; i < len1 - 1; i++) { 
            if (arr[i] == arr[i + 1]) 
                return false; 
        } 
        return true; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    if(isogram(s))
	    {
	    	System.out.print("Isogram");
	    	}
	    else
	    {
	    	System.out.print("Not isogram");
	}}

}
