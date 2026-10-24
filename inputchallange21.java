


//Create a program that shows bitwise Leftshift of numbers

import java.util.Scanner;
public class inputchallange21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Showing casing the bitwise LeftShift operator");
        System.out.println("Please enter the  number :");
        int num = input.nextInt();
       

        int result = num<<1;
        System.out.println("Result is :" + result);
    }
}
