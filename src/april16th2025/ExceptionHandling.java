package april16th2025;

public class ExceptionHandling {

    //throws keyword is used at a method level so as to know that there is an equal chance that the code will fail
    public static void main(String[] args) throws RuntimeException
    {
        //Handling the errors that occur at the run time

        //try catch block is used to handle the errors at the run time efficiently
        //For one try block we can have multiple catch blocks

        //Syntax:

        try
        {
            //Block of code which is prone to failure
        }

        catch (Exception e)
        {
            //Block of code
        }

        //Exception is the parent class of all kinds of exceptions

        try
        {
//            String s1 = "Hello World";
//            System.out.println(s1.charAt(400));

            String s5="423.5236";

            //Converting the string to an integer
            System.out.println(Integer.parseInt(s5));
        }

        catch (NullPointerException e2)
        {
            System.out.println("Do not perform any null operations");
        }

        catch (StringIndexOutOfBoundsException e3)
        {
            System.out.println(e3.getMessage()); //Reason why the code got failed from JAVA Perspective
            System.out.println("Do not perform any index out of bounds as the length of the string is exceeding");
        }

        catch (NumberFormatException e4)
        {
            //Instead of throwing a default exception message, We are throwing our own custom exception
            throw new RuntimeException("Please check the number that you are performing");
        }

        catch (Exception e5) //This should be the last catch block
        {
            e5.printStackTrace(); //Prints the exact reason why the code got failed along with the exact logs
        }

        //Gets executed irrespective of what happens between try and a catch block
        //Use Cases
        //1. Close a DB Connection
        //2. Close a file operation
        //3. Close a web browser
        finally {
            System.out.println("Finally block");
        }
    }
}
