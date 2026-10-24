
import java.util.Scanner;

public class inputChallange2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Welcome to our calculator ");
    System.out.println("Please enter First number");
       int firstNum = input.nextInt();
       System.out.println("Now Please enter your Second Number: ");
       int secondNum = input.nextInt();
       int sum = firstNum+secondNum;
       System.out.println("Sum of your number is: " + sum );
    }
}
