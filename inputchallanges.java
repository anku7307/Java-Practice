import java.util.Scanner;
public class inputchallanges {
    public static void main(String[] args) {
      Scanner  input = new Scanner(System.in);
     System.out.println("Welcome to peimeter of ractangle ");
     System.out.println("Please enter the all 4 side in cm: ");
     double a =input.nextDouble();
     double b =input.nextDouble();
     double c =input.nextDouble();
     double d =input.nextDouble();
     
     double perimeter = a+b+c+d;
     System.out.println("Result is :" +perimeter+"cm");
    }
}
