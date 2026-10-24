//Create a program to find the sum and average of all element in an array 
import java.util.Scanner;
public class inputchallange38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Welcome to Array sum and average ");
       System.out.println("Please enter the number of elements: ");
       int size = input.nextInt();
       int[] numArray = new int[size];

       int i = 0;
       while(i<size){
        System.out.print("Pease enter element number " + (i+1) + ": ");  //i+1 means position ya size i is a index index start 0 
        numArray[i] = input.nextInt();
        i++;

       }
         long sum = sum(numArray);
       int avg  = average(numArray);
       System.out.println("Sum of number is :" + sum);
        System.out.println("Average of number is :" + avg);
       

    }
    
       public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum = sum + numArray[i];  //sum + = numArray[i];
            i++;
        }

        return sum;

       }

       public static int average(int[] numArray){

          long sum = sum(numArray);
        return (int)(sum/numArray.length);

       }


}
