//7. Count total number of alphabets, digits and special characters in a string.

import java.util.*;

public class CountADS{
	private static Scanner sc;
	
	public static void main(String[]args){
		String str;
		int i,al,di,sp;
		al=di=sp=0;
		char ch;
		
		sc=new Scanner(System.in);
		System.out.println("Input the string: ");
		str=sc.nextLine();
		
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				al++;
			}
			else if(ch>='0' && ch<='9')
			{
				di++;
			}
			else
			{
				sp++;
			}
		}
		System.out.println("Number of Alphabets in the string is: "+al);
		System.out.println("Number of Digit in the sting is: "+di);
		System.out.println("Number of Special characters in the string is: "+sp);
	}
}