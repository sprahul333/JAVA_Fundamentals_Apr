package april16th2025;

//Interface serves as a contract between the client and the developer
//Interface helps us achieve 100 percent abstraction (Methods without body is called as abstract method)
//In an interface, we do not write any logic for the methods, we just declare the methods
//All the methods in the interface are public by default

//All the variables in the interface are public, static, final by default
//We cannot create an object for the interface, neither we can have the constructors
public interface SampleInterface {

    int sum(int a, int b);
    int difference(int a, int b);
    int product(int a, int b);
    int multiply(int a, int b);
}
