package april14th2025;

//Assignment: Prepare a calculator program, using Scanner, Loops and Objects, Methods
public class MethodDeclarations {

    public static void main(String[] args) {

        MethodDeclarations m = new MethodDeclarations();
        System.out.println(m.sumOfNumbers(40,50));

        //We cannot call any void method inside a print statement
//        System.out.println(m.display());
        m.display();

        System.out.println(m.sumOfNumbers(40,50.4));
        System.out.println(m.sumOfNumbers(40,50,60));
    }

    //We cannot have two methods having the same name in the same class but there is an exception:
    //We can have same method name with different arguments --> Method Overloading/Compile Time Polymorphism

    //What is the criteria that a method can be called as overloaded??
    //1. Different Number of Arguments
    //2. Different order of Arguments

    //************************RETURN TYPE OF A METHOD WILL NEVER PARTICIPATE IN METHOD OVERLOADING*******************************************

    //Purpose of method overloading:
    //1. Readbility of the code
    //2. Reusability of the code

    private int sumOfNumbers(int a, int b)
    {
        int c= a+b;
        //return keyword is used to return/give the expected value from the method
        return c;
    }

    private double sumOfNumbers(double a, int b)
    {
        double c= a+b;
        //return keyword is used to return/give the expected value from the method
        return c;
    }

    private double sumOfNumbers(int a, double b)
    {
        double c= a+b;
        //return keyword is used to return/give the expected value from the method
        return c;
    }

    private double sumOfNumbers(double a, double b)
    {
        double c= a+b;
        //return keyword is used to return/give the expected value from the method
        return c;
    }

    public int sumOfNumbers(int a, int b, int c)
    {
        int d= a+b+c;
        //return keyword is used to return/give the expected value from the method
        return c;
    }

    //If we do not specify any access modifier at the method, then it is considered as a default access modifier
    void display()
    {
        System.out.println("Hello World");
    }

    //Syntax of declaring a method:
    //accessModifier returnType methodName(arguments to be passed if any)

    //accessModifier ---> Defines the scope/visibility of the method
    //1. public -- method is accessible anywhere within the project
    //2. private -- method is accessible within that class
    //3. protected -- method is accessible within that package, outside of the package via inheritance
    //4. default -- method is accessible within that package

    //returnType --> Output that we are expecting from the method
    //It can be int, string, double, byte etc..... along with void

    //void means it simply executes the lines of code that are present in the method (Like a ROBOT)

    //methodName --> It can be any name of your choice but it should be readable and understandable
    //Follow the rules that are used to declare the variables

    //Arguments are optional for any method



}
