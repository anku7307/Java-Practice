import java.util.Scanner;
public class inputChallange12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the gratest number ");
        System.out.println("Please enter a First number :");
        int a=input.nextInt();
        System.out.println("Now, enter a Second number :");
        int b= input.nextInt();
        System.out.println("Finally, enter a Third number :");
        int c= input.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is a gratest number :" +a);
        }
        else if(b>=c){
            System.out.println("B is a gratest number :"+b);
        }
        else{
            System.out.println(" C is a gratest number :" +c);
        }
    }
}
