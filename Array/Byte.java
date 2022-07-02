//1.Initialising byte array with decimal, octal and hexadecimal numbers

public class Byte{
	
	public static void main(String[]args){
		
		char arr1[]={10,20,30,40,50};
		char arr2[]={010,070,023,045,057};
		char arr3[]={0x10,0xAA,0x67,0xA1,0xFF};
		
		System.out.println("arr1...");
		for(int i=0;i<5;i++){
			System.out.print(arr1[i]+ "");
		}	
		
		System.out.println();
		
		System.out.println("arr2...");
		for(int i=0;i<5;i++){
			System.out.print(arr2[i]+ "");
		}
		
		System.out.println();
		
		System.out.println("arr3...");
		for(int i=0;i<5;i++){
			System.out.print(arr3[i]+ "");
		}
	}
}