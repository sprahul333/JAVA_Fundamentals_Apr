package april8th2025;

//In Java , when we have a class, it's main purpose is creating objects
class Players
{
    String name;
    int age;
    String country;

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}

public class ObjectReassignment {

    public static void main(String[] args) {

        Players p1=new Players();

        p1.name="Rohit";
        p1.age=38;
        p1.country="India";

        Players p2=new Players();

        p2.name="Virat";
        p2.age=35;
        p2.country="India";

        p1.display();

        System.out.println("***********************************************************");

        p2.display();

        p1=p2;

        System.out.println("***********************************************************");

        p1.display();

        p1=null; //Removing the reference of p1 (Deleting the object)

        //Throw NullPointerException because we are trying to perform an operation on a null object
        p1.display();
    }
}
