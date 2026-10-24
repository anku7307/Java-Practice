import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
          System.out.println("Welcome to Array sum and average ");
       System.out.println("Please enter the number of elements: ");
       int size = input.nextInt();
       int[] nums = new int[size];

       int i = 0;
       while(i<size){
        System.out.print("Pease enter element number " + (i+1) + ": ");  //i+1 means position ya size i is a index index start 0 
        nums[i] = input.nextInt();
        i++;
       }
       return nums;
    }
}
