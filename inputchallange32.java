//create a program to check weater a given number is prime
import java.util.Scanner;
public class inputchallange32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Welcome to the prime number checker:");
       System.out.println("Please enter the your number :");
       int num = input.nextInt();

       boolean isPrime = isPrime(num);
       if(isPrime){
        System.out.println("Your number is Prime ");
       }
       else{
        System.out.println("Your number is not prime");
       }

    }
    public static boolean  isPrime(int num){
          
        int i=2;
        while(i < num){
            if(num % i== 0){
             return  false;
            }
            i++;
        }

        return true;

    }
}
