//8. Copy one string to another string.

import java.util.*;
public class Copy
{
	public static void main(String[]args)
	{
		String strO,strC;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input the string: ");
		strO=sc.nextLine();
		
		strC=strO;
		
		System.out.println("The first string is: "+strO);
		System.out.println("The first string is: "+strC);

	}
}
			