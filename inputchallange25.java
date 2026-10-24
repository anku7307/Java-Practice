public class inputchallange25 {
    public static void main(String[] args) {
        System.out.println("In Method Calling");
        printFirstPattern();
        printSecondPattern();
        printThirdPattern();
        System.out.println("Mthod calling complete");
    }


    public static void printFirstPattern(){
        // System.out.println("*");
        //  System.out.println("* *");
        //  System.out.println("* * *");
        //  System.out.println("* * * *");
        //  System.out.println("* * * * *");
        
    }
     public static void printSecondPattern(){
        // System.out.println("* * * * *");
        //  System.out.println("* * * *");
        //  System.out.println("* * *");
        //  System.out.println("* *");
        //  System.out.println("*");

        int rows=0;
         while(rows<5){
            System.out.print("*");
             int i=0;
             while(i<rows){
                System.out.print(" *");
                i++;
             }
             System.out.println();

            rows++;
         }
        
    }
     public static void printThirdPattern(){
        // System.out.println("        *");
        // System.out.println("      * *");
        // System.out.println("    * * *");
        // System.out.println("  * * * *");
        // System.out.println("* * * * *");
        
    }

}
