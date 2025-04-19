package april8th2025;

//In the same java file, we can have multiple classes, but only one public class should be present
//When we have a public class, the name of the file should be same as the public class name

class Names
{
    String fName;
    String mName;
    String lName;
}

public class ObjectCreations {

    public static void main(String[] args) {

        //In order to access other class variables or methods, we need to create a reference of that class

        //Syntax of creating a reference of the class/Object of the class/Instance of the class:
        //ClassName referenceName = new ClassName();

        //Here referenceName can be anything of your choice, but it should follow the rules used to create a variable name
        //'new' Keyword is responsible for creating the object

        //n1 is just a reference name, where it is holding your object
        Names n1=new Names();

        //With the help of the object reference we can access the variables and methods of the class
        n1.fName="John";
        n1.mName="Doe";
        n1.lName="Jane";

        System.out.println(n1.fName);
        System.out.println(n1.mName);
        System.out.println(n1.lName);

        //We can create any number of objects of the same class

        System.out.println("***********************************************************");

        //n2 is just a reference name, where it is holding your object
        Names n2=new Names();

        n2.fName="Candy";
        n2.mName="Bob";
        n2.lName="Smith";

        System.out.println(n2.fName);
        System.out.println(n2.mName);
        System.out.println(n2.lName);
    }
}
