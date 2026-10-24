
// Create a program to find me the maximum and minimum element in an array
import java.util.Scanner;
public class inputchallange40 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       System.out.println("Welcome to the count number of occerence :");
       System.out.println("Please enter the number of elements: ");
       int size = input.nextInt();
       int[] numArray = new int[size];
       
       int i = 0;
       while(i<size){
        System.out.print("Pease enter element number " + (i+1) + ": ");  //i+1 means position ya size i is a index index start 0 
        numArray[i] = input.nextInt();
        i++;
       }
       int max = max(numArray);
       int min = min(numArray);
       System.out.println("Max of the Array is :" +max);
       System.out.println("Min of the Array is :" +min);
    }
     public static int min(int[] numArray){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i<numArray.length){
            if(min>numArray[i]){
                min = numArray[i];
            }
            i++;
        }
        return min;
     }
      public static int max(int[] numArray){
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i<numArray.length){
            if(max<numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;
     }
}
