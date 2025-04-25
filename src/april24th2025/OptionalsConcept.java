package april24th2025;

import java.util.Optional;

public class OptionalsConcept {

    public static void main(String[] args) {

        //Main Purpose of Optionals is to avoid NullPointerException

        //SInce JDK 8 onwards, Optional class is introduced to tackle null pointer efficiently

        String s2=null;

//        System.out.println(s2.length());

        //If the string is not null, it will return the value, else it will return the empty value
        System.out.println(Optional.ofNullable(s2));

        s2="Sarika";
        //If the string is not null, it will return the value, else it will return the default value
        //Optional.ofNullable(s2) --> If it is present it will return the value else it will return the default value
        //.orElse is not a lazy terminal operation
        //Sometimes what happens is that if the value is present also, the orElse part will be executed in some of the scenarios
        //Lazy terminal operation is to create a new object based on a condition
        System.out.println(Optional.ofNullable(s2).orElse("ABCDF"));

        //.orElseGet is a lazy terminal operation
        //Lazy terminal operation is to create a new object based on a condition

        //Will accept a supplier functional interface
        //Supplier Interface is used to supply the data to the JVM so as to process the required operations
        System.out.println(Optional.ofNullable(s2).orElseGet(() -> "ABCDF"));

//        s2=null;

        //.get() is used to get the value from the optional object
        //If we are pretty sure that we will get some value, we can use this method
        //By any chance, if the value is not present then it will throw NoSuchElementException
        System.out.println(Optional.ofNullable(s2).get());

        //.orElseThrow is used to throw an exception if the value is not present
        //If the value is present, it will return the value else it will throw an exception
        //Accepts a supplier functional interface
        //Supplier Interface is used to supply the data/information to the JVM so as to process the required operations
        System.out.println(Optional.ofNullable(s2).orElseThrow(() -> new RuntimeException("Value is not present")));

        //Checks if the value is present or not
        //Returns true if the value is present else it returns false
        System.out.println(Optional.ofNullable(s2).isEmpty());

        s2=null;

        //.ifPresent function is used to check if the value is present or not
        //If the value is present then it will execute the code inside the lambda expression
        //else it will not execute the code inside the lambda expression

        //.ifPresent() accepts a consumer interface
        //It is used to consume/process the data/information from the JVM and perform the required operations
        Optional.ofNullable(s2).ifPresent(s-> System.out.println(s));

    }
}
