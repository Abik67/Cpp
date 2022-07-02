//2. Find the length of a string without using library function.

import java.util.*;

public class Lengths{
	public static void main(String[]args){
		int i=0;
		String str;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input the string: ");
			
		str=sc.nextLine();
		int n=str.length();
		
		System.out.print("Length of the string is: "+n);
	}
}