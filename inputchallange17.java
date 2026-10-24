//Create a program that shows bitwise AND of two numbers

import java.util.Scanner;
public class inputchallange17 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Show casing bitwise AND operator :");
    System.out.println("Please enter the 1st number ");
    int first =input.nextInt();
    System.out.println("Please enter the 2nd number ");
    int second = input.nextInt();

    int result = first & second;
    System.out.println("Result is : " + result);
}

}
