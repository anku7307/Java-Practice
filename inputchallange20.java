

//Create a program that shows bitwise compliment of two numbers

import java.util.Scanner;
public class inputchallange20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Showing casing the bitwise compliment(NOT) operator");
        System.out.println("Please enter the  number :");
        int num = input.nextInt();
       

        int result = ~num;
        System.out.println("Result is :" + result);
    }
}
