package april9th2025;

//For an integer/short/byte/long, default value is 0 (When no one assigns any value to the variable)
//For float/double, default value is 0.0 (When no one assigns any value to the variable)
//For char, default value is ' ' (When no one assigns any value to the variable)
//For String/Other Non Primitive Data Types, default value is null (When no one assigns any value to the variable)
//For Boolean, default value is false (When no one assigns any value to the variable)

//Encapsulation --> Hiding the data members of a class from the outside world and only allowing access to them through public methods.

class Tournaments
{
    //private means the variables or methods will be accessible only within the class

    //Variables that are declared at a class level are called as instance variables
    private String name;
    private int year;
    private String country;

    //If we want to access the above variables, we need to use the concept of getters and setters
    //Setters --> Helps us in assigning the values to the variables
    //Getters --> Helps us in getting the values of the variables

    //Variables that are declared at the method level are called as local variables
    public void setName(String name)
    {
        name=name; //Java Is ambiguous about the name, whether it is referring to the instance variable or local variable
        //But what does JAVA Do, since it is confused, it will not invovle in this operation and just prints the default value
    }

    public String getName()
    {
        return name;
    }

    public void setYear(int year)
    {
        this.year=year;
    }

    public int getYear()
    {
        return year;
    }

    public void setCountry(String country)
    {
        this.country=country;
    }

    public String getCountry()
    {
        return country;
    }

}

public class EncapsulationConcepts {

    public static void main(String[] args) {

        //Assigning the values to the variables outside of the class is a bad practice
        //The main reason behind is that any object can change the values of the variables at any time

        //In order to fix this thing, we have to ensure that the variables are private

        Tournaments t1 = new Tournaments();
        t1.setName("IPL");
        t1.setYear(2020);
        t1.setCountry("India");

        System.out.println(t1.getName());
        System.out.println(t1.getYear());
        System.out.println(t1.getCountry());

//        t1.name = "IPL"; //Throws a compilation error, since the variable is private
//        t1.year = 2020;
//        t1.country = "India";
    }
}
