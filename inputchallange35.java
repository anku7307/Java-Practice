//Create a program to check if a number is an  armstrong number
import java.util.Scanner;
public class inputchallange35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Welcome to the Armstrong Number :");
       System.out.print("Please enter the number :");
       int num = input.nextInt();
       boolean isArmstrong = isArmstrong(num);
       //System.out.println(isArmstrong);
       if (isArmstrong){
        System.out.println("Your number is Armstrong");
       }
       else{
        System.out.println("Your number is not armstrong number");
       }
    }

    public static boolean  isArmstrong(int num){
        int noOfDigits= noOfDigits(num);
        int numCopy = num;
       // System.out.println("No of digits:" +noOfDigits);
        int finalNumber = 0;
        while(num>0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber = finalNumber +pow(lastDigit , noOfDigits);

        }
        //System.out.println("Final NUmber is" + finalNumber );
        return finalNumber == numCopy;
    }
    
    public static int pow(int num1 ,int num2){
        int result = 1;
       int i=0;
       while(i<num2){
        result = result *= num1;
        i++;
       }
      //System.out.println("Power of" + num1 + " is " + num2);
        return result;
    }
    public static int noOfDigits(int num){
        int digits = 0;
        while(num>0){
            digits++;
            num/=10;

        }   
        return digits;     

    }
}
