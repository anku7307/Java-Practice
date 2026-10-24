//write a program to check if a given number is even or odd using bitwise operator
import java.util.Scanner;
public class inputchallange23 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     System.out.println("Welcome to odd/even calculator :");
     System.out.println("Please enter the number : ");
     int num = input.nextInt();
     if((num & 1)== 1){
       System.out.println("Your number is ODD");
     }
     else{
        System.out.println("Your number is even");
     }
    }
}
