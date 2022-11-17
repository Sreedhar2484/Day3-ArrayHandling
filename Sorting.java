//Java Program to sort the elements of an array in ascending order  
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args){
        int[] arr = new int[] {12,11,5,56,72,3,6,4};
        //invoking sort() method of the Arrays class  
        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order :");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        
        }
    }
}
