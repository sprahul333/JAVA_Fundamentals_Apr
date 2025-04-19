package april8th2025;

class OuterClass
{
    int a=10;
    int b=20;

    class InnerClass //It can access all the variables and methods from OuterClass
    {
        int c=30;
        int d=40;

        public void display()
        {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
            System.out.println("d: " + d);
            dummy();
        }
    }

    public void display()
    {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public void dummy()
    {
        System.out.println("Dummy method of OuterClass");
    }
}

public class InnerClasses {

    public static void main(String[] args) {

        OuterClass p1=new OuterClass();

        //With the help of p1, we can access only the members of OuterClass along with the methods of OuterClass

        //Syntax of creating an object of InnerClass:
        //OuterClass.InnerClass i1=outerClassReference.new InnerClass();

        OuterClass.InnerClass i1=p1.new InnerClass();
        i1.display();

        p1.display();

    }
}
