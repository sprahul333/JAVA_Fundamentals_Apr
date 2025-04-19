package april8th2025;

public class TernaryOperator {

    public static void main(String[] args) {

        //It is a shorthand form of single if else statement

        //Syntax:
        //variable = (condition) ? value_if_true : value_if_false;

        int h=506;

        System.out.println((h==500) ? true : false);

        String s="Sample_Data";

        System.out.println((s.length()%2==0)? s.substring(0,s.length()-1) : s.substring(0,s.length()-2));

        //Within a Ternary Operator, we cannnot write any print statement
        //Within a ternary operator, we can write a single statement, we cannot write a block of code

    }

}
