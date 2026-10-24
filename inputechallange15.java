
import java.util.Scanner;

//Create a proram that calculate grades nased on marks
public class inputechallange15 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to garde calculator :");
    System.out.println("Please enter your percentage ");
    float percentage = input.nextFloat();

    if(percentage >= 90){
        System.out.println(" Great ,you have got A");
    }
    else if(percentage >=75){
        System.out.println(" Good, You have got B ");
    }
    else if(percentage >=60){
        System.out.println("You have got C , Work harder next time");
    }
    else if(percentage >= 30){
        System.out.println("You have got D , You work to seriously need to ");
    }
    else{
        System.out.println("Sorry ,Failed the test ");
    }



        
   } 
}
