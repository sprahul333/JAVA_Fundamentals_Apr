package april21st2025;

public class SwitchCase {

    public static void main(String[] args) {

        //It is mainly used to replace the if else statements when we have more than 4 conditions

        //Syntax of switch:
        //switch(variable)
//        {
//            //case value1: block of code
//            //break;
//            //case value2: block of code
//            //break;
//            //default: block of code
//            //break;
//        }

        int a = 10;

        //If we do not use any break statement in the switch case, it will execute all the subsequent cases from where the match is found
        switch (a) {
            case 10:
                System.out.println("Value is 10");
                break;
            case 20:
                System.out.println("Value is 20");
                break;
            case 30:
                System.out.println("Value is 30");
                break;
            case 40:
                System.out.println("Value is 40");
                break;
            case 50:
                System.out.println("Value is 50");
                break;
            default:
                System.out.println("Value is not present in the above cases");
        }

        //Since JDK 7 onwards the switch case has been enhanced to support the String data type

        String s3="Java";

        switch (s3)
        {
            case "Java":
                System.out.println("Java is a programming language");
                break;
            case "Python":
                System.out.println("Python is a programming language");
                break;
            case "C++":
                System.out.println("C++ is a programming language");
                break;
            case "C#":
                System.out.println("C# is a programming language");
                break;
            case "JavaScript":
                System.out.println("JavaScript is a programming language");
                break;
            default:
                System.out.println("Language is not present in the above cases");
        }

        //From JDK 10 onwards, it supports the switch expression meaning we need not use any break statement
        //Automatically it will break the case when the match is found

        int k=40;

        switch (k)
        {
            case 10 -> System.out.println("Value is 10");
            case 20 -> System.out.println("Value is 20");
            case 30 -> System.out.println("Value is 30");
            case 40 -> System.out.println("Value is 40");
            case 50 -> System.out.println("Value is 50");
            default -> System.out.println("Value is not present in the above cases");
        }

        //From JDK 12 onwards, it supports switch expression with multiple values

        String s5="Hello";

        switch (s5)
        {
            case "Hello","Hello World","World" -> System.out.println("Value is Hello world");
            case "Java" -> System.out.println("Value is Java");
            case "Python" -> System.out.println("Value is Python");
            default -> System.out.println("Value is not present in the above cases");
        }

        //From JDK 14 onwards, it supports switch expression with return statement
        System.out.println(performOperations(50,40,'+'));

    }

    public static int performOperations(int a, int b, char op)
    {
        return switch (op)
        {
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;
            default -> throw new IllegalArgumentException("Invalid operation");
        };
    }
}
