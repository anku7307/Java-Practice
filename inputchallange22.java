



//Create a program that shows bitwise Righthift of numbers

import java.util.Scanner;
public class inputchallange22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Showing casing the bitwise RightShift operator");
        System.out.println("Please enter the  number :");
        int num = input.nextInt();
       

        int result = num>>1;
        System.out.println("Result is :" + result);
    }
}
