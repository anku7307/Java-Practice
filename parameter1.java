public class parameter1 {
    public static void main(String[] args) {
       System.out.println(sumTwoNumber(4,7));
       System.out.println(sumTwoNumber(5,7));
       System.out.println(sumTwoNumber(4,81));
       System.out.println(sumTwoNumber(67,-67));
    }

    public static int sumTwoNumber(int first , int second){
          System.out.println("First number receved :" + first);
          System.out.println("Second number receved :" + second);
         int sum = first+second;
         return sum;
    }
}

