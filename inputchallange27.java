//create a program to sum all odd number from 1 to a specified number;
import java.util.Scanner;
public class inputchallange27 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Odd Sum :");
         System.out.println("Please enter the number :");
         int num = input.nextInt();
         int sum = oddSum(num);
         System.out.println("oddSum till " + num + " is: " + sum);
    }

    public static int oddSum(int num){
        int sum = 0;
        int i=1;
        while(i<=num){
            sum = sum+i;  //sum += i;
                i=i+2;  //i+=2;
        }

      return sum;
    }
}
