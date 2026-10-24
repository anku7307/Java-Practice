//Create a program that print pattern RightHalfPyramid , Reverse Right Half Pyramid  Left Half Pyramid 
import java.util.Scanner;
public class inputchallange37 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("We are here to print patterns");
        System.out.println("Please enter the no of rows :");
        int rows = input.nextInt();
        printFirstPattern(rows);
        printReverseFirstPattern(rows);
        printSecondPattern(rows);
    }


   public static void printReverseFirstPattern(int maxRows){
    System.out.println(" This Pattern is Reverse Right Half Pyramid");
         int rows  = maxRows;
         while(rows>0){
           // System.out.print("*");
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
         }
    }
   
    public static void printFirstPattern(int maxRows) {
        System.out.println(" This Pattern is Right Half Pyramid");
         int rows  = 0;
         while(rows< maxRows){
            System.out.print("*");
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
         }
    }

   public static void printSecondPattern(int maxRows){
     System.out.println("\n Here is Left Half Pyramid ");
     int rows = maxRows;
     while(rows > 0){
        //This loop print space
        int j=0;
        while(j<rows-1){
            System.out.print("  ");
            j++;
        }

        //This is loop prints stars
        int i = 0;
        while(i<= (maxRows - rows)){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        rows--;
     }
   }
}
