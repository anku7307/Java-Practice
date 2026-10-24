// create a program using for loop to display if a number prime or not
import java.util.Scanner;
 public class PrimeOrNotprime{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       System.out.println("Welcome to prime number checker\n");
       System.out.print("Please enter the number:");
        int num = input.nextInt();
        //boolean isPrime = isPrime(num);
        System.out.println("Your number is " +
               (isPrime(num) ? "Prime" : " Not Prime"));
    }

        public static boolean isPrime(int num){
            for(int i =2; i<num; i++){
                if(num % i==0){
                    return false;
                }

            }
            return true;
        
    }
}
