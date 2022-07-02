//3. Separate the individual characters from a string.

import java.util.*;

public class Char{
	public static void main(String[]args){
		
		String str;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input the string: ");
		
		str=sc.nextLine();
		
		System.out.print("The characters of the string in reverse are: ");
	
		for(int i=0; i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
}