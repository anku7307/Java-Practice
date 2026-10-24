
import java.util.Scanner;
public class Relational{
    public static void main(String args[]){
     Scanner input = new Scanner(System.in);
     System.out.println("We;come to driving license portal");
     System.out.println("Enter the age :");
     int age = input.nextInt();

     if(age>=18){
        System.out.println("you are eligible to drive :");
     }
       else{
        System.out.println("Not Eligible to drive");
       }



    }
    }
