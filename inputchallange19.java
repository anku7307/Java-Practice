
//Create a program that shows bitwise XOR of two numbers

import java.util.Scanner;
public class inputchallange19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Showing casing the bitwise XOR oerator");
        System.out.println("Please enter the 1st number :");
        int first = input.nextInt();
        System.out.println("please enter the second number :");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Result is :"+ result);
    }
}
