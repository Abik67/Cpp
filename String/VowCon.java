//9. Count total number of vowel or consonant in a string.

import java.util.*;
public class VowCon{
	public static void main(String[]args){
		int vCount=0,cCount=0;
		String str;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input the string:");
		str=sc.nextLine();
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				vCount++;
			}
			else 
				if(str.charAt(i)>= 'a' && str.charAt(i)<= 'z')
			{
				cCount++;
			}
		}
		System.out.println("Total number of vowel in the string: "+vCount);
		System.out.println("Total number of consonant in the string: "+cCount);
	}
}