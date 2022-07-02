//1. input a string and print it.

import java.util.Scanner;
public class Strings{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Input the string: ");
			String s1= sc.nextLine();
			String s2= sc.nextLine();
			System.out.print("The string you entered is: ");
		    System.out.print(""+s1+", "+s2);
	}
}