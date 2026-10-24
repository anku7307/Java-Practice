
//create a program to print the fibnocci Series up to a certain number.
import java.util.Scanner;
public class inputchallange34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Fibnocci Series :");
        System.out.println("Please enter the your number :");
        int num = input.nextInt();
        System.out.println("Here is the fibonacci Series");
        printFibnocci(num);
    }

    public static void printFibnocci(int num){
        if (num < 0 ) return ;   
        System.out.print("0 ");
        if(num == 0) return;
          System.out.print("1 ");  
             
        int num1 = 0;
        int num2 = 1;
        while(num1+num2 <= num){
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
        
       
    }
}
