package april16th2025;

//Inheritance --> Taking the attributes or behaviour from the parent to the child

class Parent {
//
//    public Parent() {
//        System.out.println("Parent Constructor");
//    }

    public Parent(int age)
    {
        System.out.println("Parameterized constructor called");
        System.out.println("Age is " + age);
    }

    public void circle()
    {
        System.out.println("Inside circle");
    }

    public void rhombus()
    {
        System.out.println("Inside rhombus");
    }

    public void trapezium()
    {
        System.out.println("Inside trapezium");
    }
}

//extends --> It is inheriting the methods, variables from the parent class
//In Java, we can inherit only one class at a time
//Multiple inheritance is not allowed because of a diamond pattern

class Child extends Parent {

    //We can have equal or more than the number of arguments present in the parent class
    public Child(int age) {
        super(age);
    }

    public void square()
    {
        System.out.println("Inside square");
    }

    //Method Overriding --> Run time polymorphism
    //Method that is present in the parent class is also present in the child class, then the child class will override the logic present in the parent class
    @Override //To Check if the method is ovveridden
    public void rhombus()
    {
        //super is the keyword that is used to call the parent class method,variables, objects
        super.rhombus(); //Method that is present in the parent class
        System.out.println("Inside rhombus inside child class");
    }
}

public class InheritanceConcepts {

    public static void main(String[] args) {

        Child c = new Child(43);
        c.circle(); //This is the method that is present in the parent class (Inherited methods)
        c.square(); //Specialized methods
        c.rhombus(); //Ovveridden method
    }
}
