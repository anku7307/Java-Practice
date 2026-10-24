// Create a program to find the number of occuerence of an element in an array
import java.util.Scanner;
public class inputchallange39 {
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
       System.out.println("Now enter the number you want to find ");
       int num = input.nextInt();
       int  occurrences = noOfOccurrences(numArray, num);
       System.out.println("Your element number was found " + occurrences + "times in the array");
       
}

      public static int noOfOccurrences(int[] numArray , int num){
        int occ=0;
        int i=0;
        while(i<numArray.length){
            if (numArray[i]==num) {
                occ++;
            }
            i++;
        }
         return occ;
   }
}
