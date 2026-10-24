//Create a program to find the Least Common Multiple (LCM) of two numbers

import java.util.Scanner;
public class inputchallange30 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcom to least common number :");
    System.out.println("Please Enter Your number :");
    int firstNum = input.nextInt();

    System.out.println("Now enter the Second number:");
    int secondNum = input.nextInt();
    
   int lcm = lcm(firstNum , secondNum);
    System.out.println("LCM of the Two number is :" +lcm);
   } 

   public static int lcm(int firstNum , int secondNum){
      int i=1;
      while(i<=secondNum){

        int factor = firstNum * i;
        if(factor % secondNum == 0){
            return factor ;
        }
        i++;
      }
      return 0; //unreachable
   }
}
