import java.util.Scanner;

public class Airthmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     System.out.println("Welcome to Airthmatic Operator");
      System.out.println("please enter A number ");
         int a = input.nextInt();
         System.out.println("Please Enter B number ");
         int b= input.nextInt();

         System.out.println("Apply the All Airthmatic Operator ");
         System.out.println("Addition " +(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multipication "+(a*b));
        System.out.println("Division "+(a/b));
        System.out.println("Modulas operator "+(a%b));
    }
}
