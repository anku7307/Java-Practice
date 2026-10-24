import  java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name= input.nextLine();
        System.out.println("Good Morning " +name);

       System.out.println(name + " Also tell me your age");
       int age = input.nextInt();
       System.out.println("your Age is :" + age);


    
    }
}
