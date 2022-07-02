//4.Find a nearest lesser and greater element in an array

import java.util.Scanner;

public class SmallGreat{
	public static void main(String[]args){
		
		Scanner sr = new Scanner(System.in);
		int n= sr.nextInt();
		int x= sr.nextInt();
		int arr[] = new int[n-1];
		
		for(int i=0;i<n-1;i++){
			
			arr[i]= sr.nextInt();
		}
		
		int greater=10000000, smaller=10000000;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]> x && arr[i]<greater)
				greater=arr[i];
			if(arr[i]<x && smaller<arr[i])
				smaller=arr[i];
		}
		if(smaller !=-10000000)
			System.out.println(smaller);
		else
			System.out.println("No small element");
		if(greater !=10000000)
			System.out.println(greater);
		else 
			System.out.println("No great element");
	}
}