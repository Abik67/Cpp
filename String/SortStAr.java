//11. Sort a string array in ascending order.

import java.util.Arrays;
 
public class SortStAr{
    public static void main(String[] args) {
        String arr[] = {"banana", "cherry", "apple"};
        System.out.println("Original : " + Arrays.toString(arr));
 
        Arrays.sort(arr);
        System.out.println("Sorted   : " + Arrays.toString(arr));
    }
}