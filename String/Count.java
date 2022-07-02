//5. Count the total number of words in a string.

import java.util.*;

public class Count{
	public static void main(String[]args){
		
		String str;
		int count=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input the string: ");
		
		str=sc.nextLine();
		
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		
		System.out.print("Total number of words in the string is: "+count);
	}
}