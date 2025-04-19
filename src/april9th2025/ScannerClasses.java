package april9th2025;

import java.util.Scanner;

public class ScannerClasses {

    public static void main(String[] args) {

        //For a long time we are seeing how do we write the data to the console
        //Now let us see how do we read the data from the console

        //Scanner Class helps us in reading the data from the console
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Sentence");
        String s1=sc.nextLine();

        System.out.println(s1);

        System.out.println("Enter the first Number: ");
        int a=sc.nextInt(); //Reading the integer from the console

        System.out.println("Enter the second Number: ");

        int b=0;
        if(sc.hasNextInt()) //sc.hasNextInt() --> Checks whether the next token is an integer or not
            b=sc.nextInt();
        else
            System.out.println("Please enter a valid integer value");

        System.out.println(a+b);

        System.out.println("Enter the third Number: ");
        double c=0.0;

        if (sc.hasNextDouble()) //sc.hasNextDouble() --> Checks whether the next token is an integer or not
        {
            c = sc.nextDouble(); //Reading a double value from the console
        }

        else {
            System.out.println("Please enter a valid double value");
            sc.close(); //Closing the scanner object, no further operations can be performed on the scanner object
            return; //Exit from the complete program
        }

        System.out.println("Enter the fourth Number: ");
        long d=sc.nextLong(); //Reading a long value from the console

        System.out.println(a+b+c+d);

        System.out.println("Enter the fifth Number: ");
        float e=sc.nextFloat();

        System.out.println("Enter the sixth Number: ");
        short f=sc.nextShort();

        System.out.println("Enter the seventh Number: ");
        byte g=sc.nextByte(); //Throws InputMismatch Exception, when we give a value that is beyond the given range

        System.out.println(a+b+c+d+e+f+g);
    }
}
