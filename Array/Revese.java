//3.Swap the first element with last, second to second last, and so on(reversing elements)

public class Revese{
	
	public static void main (String []args){
		Integer[] intArray = {1,2,3,4,5,6};
		
		System.out.println("Original Array: ");
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+ " ");
		
		System.out.println();
		
		System.out.println("Revers Order: ");
		for(int i=intArray.length-1;i>=0;i--)
			System.out.print(intArray[i]+ " ");
	}
}