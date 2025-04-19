package april16th2025;

//Lambda Expressions works only with functional interfaces
//It is the short hand form of writing the logic for the interfaces
public class LambdaExpressions {

    public static void main(String[] args) {

        //Here we are writing the code inside an anonymous class if we do not want to use implements keyword
        SampleFunctionalInterface s1=new SampleFunctionalInterface()
        {
            @Override
            public void display() {
                System.out.println("Hello World");
            }
        };

        s1.display();

        //Using Lamda Expressions:
        // -> arrow mark to represent the logic written for the method
        //If we are writing a single line of code, we need not maintain any curly braces
        //else we have to maintain curly braces, if we have multiple lines of data
        SampleFunctionalInterface s2=() -> System.out.println("Hello World from Lambda");
        s2.display();
    }
}
