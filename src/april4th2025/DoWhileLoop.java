package april4th2025;

public class DoWhileLoop {

    public static void main(String[] args) {

        //Do-while loop:
        //Loop runs atleast once irrespective of whether the condition is satisfied or not

        //Syntax of do-while loop:
        //do { //Block of code to be executed } while(condition to be satisfied);

        int a=40;

        do {
            System.out.println(a);
        }
        while (a!=40);

        //50-300
        //-250
        a=50-30*10;

        do {
            System.out.println(a); //-250
            break; //Break statement is used to terminate the loop
        }
        while (a%6==0 || !(a%7==0)); //! => Not operator

        System.out.println("***********************************************************");

        String s="Sample_Data";
        do {
            System.out.println(a);
            break;
        }
        while (s.substring(0,s.length()-1).length()!=0); //Sample_Data

        System.out.println("***********************************************************");


    }
}
