//10. Find maximum occurring character in a string.

import java.util.*;
public class Max{
	public static void main(String[]args){
		String str;
		int i,j,max;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input the string: ");
		str=sc.nextLine();
		
		int[] freq=new int[str.length()];
		char maxChar= str.charAt(0);
		char string[]=str.toCharArray();
		
		for(i=0;i<string.length;i++)
		{
			freq[i]=1;
			
			for(j=i+1;j<string.length;j++)
			{
				if(string[i] == string[j] && string[i]!= ' ' && string[i]!= '0')
				{
					freq[i]++;
					string[j]='0';
				}
			}
		}
		max=freq[0];
		for(i=0;i<freq.length;i++)
		{
			
			if(max<freq[i])
			{
				max=freq[i];
				maxChar=string[i];
			}
		}
	    System.out.println("The Highest frequency of character: '"+maxChar+"'");
		System.out.println("appears number of times: "+max);
	}
}