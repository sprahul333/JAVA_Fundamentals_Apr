package march31st2025;

public class SampleProgram {

    //JVM(Java Virtual Machine) --> This is the place where we execute our code
    //JVM recognises the method main and then only it will execute the required code

    //Inside the main method only we are writing the core logic or the task that we want to execute
    public static void main(String[] args)
    {
        //Console is nothing but a blackboard in school or marker board in colleges
        //Prints "Hello World !!!" onto the console and moves the cursor to the next line
        System.out.println("Hello World!!!");

        //Shortcut for using System.out.println:
        //Type sout followed by enter key --> Same shortcut is applicable in VS Code

        System.out.println("Today is a new programming day");

        //BODMAS Rule is followed to perform any arithmetic operation in any programming language
        //50-200*10+107
        //50-2000+107
        //157-2000
        //-1843
        System.out.println(50-200*10+321/3);

        System.out.println(false);

        // "" --> We are passing the data in the form of sentence
        // '' --> We are passing only single value (JAVA)

        //Prints the data onto the console
        System.out.print('k');

        System.out.print('&');

        // \n means it will print the data in a new line
        // \n is known as escape character
        System.out.println("\n Loving to learn more");

        System.out.println(50-46*12-300);

        //Prints the message "Error Occured" in red colour
        //System.err statements will be always executed at the end of the execution
        //No matter the order of execution
        System.err.println("Error Occured");

        System.out.println("Executing another line of code");
    }
}
