//Create a program to check if the given array is sorted
import java.util.Scanner;
public class inputchallange41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the sorting in array");
        System.out.println("Please enter the element and No.");
          int size = input.nextInt();
          int[] numArray = new int[size];

          int i=0;
          while(i<size){
            System.out.println("Please enter the number" + (i+1) + ":");
            numArray[i] = input.nextInt();
            i++;
          }
          boolean isInc = isIncreasing(numArray);
          boolean isDec = isDecreasing(numArray);
          if(isInc || isDec){
            System.out.println("Your Array is Sorted");
          }
          else{
            System.out.println("Your Array is not sorted");
          }
    }

    public static boolean isDecreasing(int[] numArray){
        int i=1;
        while(i < numArray.length){
            if(numArray[i]>numArray[i-1]){
                return false;
            }
            i++;
        }
      return true;
    }

     public static boolean isIncreasing(int[] numArray){
        int i=1;
        while(i < numArray.length){
            if(numArray[i]<numArray[i-1]){
                return false;
            }
            i++;
        }
    
    return true;
     }
}
