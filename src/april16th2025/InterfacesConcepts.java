package april16th2025;

//implements keyword is like a promise that the class is providing that I will maintain the logics for all the methods in the interface

//In Java we have three types of interfaces:
//1. Normal Interface --> Where it will contain abstract methods
//2. Functional Interface --> It will contain only one abstract method
//3. Marker Interface --> Rarely used

//Java supports implmentation of Multiple interfaces
public class InterfacesConcepts implements SampleInterface, SampleFunctionalInterface{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int difference(int a, int b) {
        return a-b;
    }

    @Override
    public int product(int a, int b) {
        return a*b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*2*b;
    }

    public static void main(String[] args) {
        InterfacesConcepts obj = new InterfacesConcepts();
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.difference(-41, 10));
        System.out.println(obj.product(10, 20));
        System.out.println(obj.multiply(12, 2));

    }

    @Override
    public void display() {
        System.out.println("This is the display method");
    }
}
