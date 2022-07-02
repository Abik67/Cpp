//4. Print individual characters of string in reverse order.

import java.util.*;

public class CharR{
	public static void main(String[]args){
		
		String str;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input the string: ");
		
		str=sc.nextLine();
		
		System.out.print("The characters of the string in reverse are: ");
	
		for(int i=str.length()-1; i>=0;i--)
		{
			System.out.print(str.charAt(i)+" ");
		}
		}
}