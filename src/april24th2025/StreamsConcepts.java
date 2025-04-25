package april24th2025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Every class inherits the Objects class
class Employees {

    private String name;
    private String department;
    private double salary;

    public Employees(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString()
    {
        return name+" "+department+" "+salary;
    }
}

public class StreamsConcepts {

    public static void main(String[] args) {

        List<Employees> employees = new ArrayList<>();

        employees.add(new Employees("John Smith", "IT", 100.0));
        employees.add(new Employees("Jane Doe", "HR", 200.0));
        employees.add(new Employees("Alice Johnson", "Finance", 300.0));
        employees.add(new Employees("Bob Brown", "IT", 400.0));
        employees.add(new Employees("Charlie Davis", "HR", 500.0));
        employees.add(new Employees("Eve White", "Finance", 600.0));

        //Streams helps us in quick processing of data or allows for lazy evaluation
        //It is a sequence of elements supporting sequential and parallel aggregate operations

        //Converting the data to the stream
        Stream<Employees> s2=employees.stream();

        //Process each and every data and print them
        //.forEach() --> Consumes each and every data that we send to it
        //.forEach() accepts a consumer interface and it is a terminal operation (it will not return anything or after this operation we cannot perform any other operation)

        s2.forEach(e-> System.out.println(e.getName()+" "+e.getDepartment()+" "+e.getSalary()));

        //Apply A FILTER that print the list of employees whose salary is greater than 200

        //.filter() function is used to apply the filters on the given set of data based on the condition
        //Accepts a predicate interface
        //Predicate interface is used to test the condition and return the boolean value

        //.filter() is an intermediate operation (it will return the stream object and we can perform any other operation after this)

        //Throws IllegalStateException as the stream is already consumed or closed
//        s2.filter(e-> e.getSalary()>200.0).forEach(e-> System.out.println(e.getName()+" "+e.getDepartment()+" "+e.getSalary()));

        System.out.println("****************************************************************");
        employees.stream().filter(e-> e.getSalary()>200.0).forEach(e-> System.out.println(e.getName()+" "+e.getDepartment()+" "+e.getSalary()));

        System.out.println("****************************************************************");

        //Apply A FILTER that print the list of employees whose salary is greater than 200 and department is IT
        employees.stream().filter(e-> e.getSalary()>200.0 && e.getDepartment().equalsIgnoreCase("IT")).forEach(e-> System.out.println(e.getName()+" "+e.getDepartment()+" "+e.getSalary()));

        System.out.println("****************************************************************");

        //Map Function is used to convert the data from one form to another
        //It is an intermediate operation (it will return the stream object and we can perform any other operation after this)

        //Accepts a function interface (it will take the input and return the output)

        //Print the list of employees with their names in uppercase
        employees.stream().map(s-> s.getName().toUpperCase()).forEach(s-> System.out.println(s));

        System.out.println("****************************************************************");

        //Print the list of employees with their names in uppercase and salary in 2 decimal points
        employees.stream().map(e-> e.getName().toUpperCase() + "-"+e.getSalary()+"0").forEach(s-> System.out.println(s));

        System.out.println("****************************************************************");

        //We use the comparator interface to sort the data
        //It is used to compare the two objects and return the result based on the condition

        Comparator<Employees> comparator = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());

        //Sort the employees
        employees.stream().sorted(comparator).forEach(s-> System.out.println(s));

        System.out.println("****************************************************************");


    }
}
