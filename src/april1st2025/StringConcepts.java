package april1st2025;

public class StringConcepts {

    public static void main(String[] args) {

        //Strings are nothing but a collection of characters

        //Syntax of declaring a string:
        //String variableName = "value";

        //All the rules that are applicable for declaring a variable are applicable for declaring a string

        //Data should be enclosed in double quotes
        //String is a non primitive data type

        String s2="Both of you are attending the sessions";

        //Prints the number of characters present in the string
        System.out.println(s2.length());

        //Converts the whole string to capital letters
        System.out.println(s2.toUpperCase());

        //Converts the whole string to small letters
        System.out.println(s2.toLowerCase());

        //Checks if the word "attending" is present in the string or not
        //Returns true if the above condition is satisfied else it is false
        System.out.println(s2.contains("attending"));
        System.out.println(s2.contains("sess"));
        System.out.println(s2.toUpperCase().contains("Both"));
        System.out.println(s2.contains(s2));

        s2="Both of you are attending the sessions";

        //Checks if the string is starting with the word 'Both'
        //Returns true if the above condition is satisfied else it is false
        System.out.println(s2.startsWith("Both"));
        System.out.println(s2.startsWith("the"));
        System.out.println(s2.startsWith("Both of You"));
        System.out.println(s2.toLowerCase().startsWith("Both"));
        System.out.println(s2.startsWith(s2));

        s2="Both of you are attending the sessions";

        s2="";

        //Checks if the given string is empty or not
        //Returns true if the above condition is satisfied else it is false
        System.out.println(s2.isEmpty());

        s2="           ";
        System.out.println(s2.isEmpty());

        //Checks if the given string is blank or not (Contains only white spaces)
        //Returns true if the above condition is satisfied else it is false
        System.out.println(s2.isBlank()); //JDK 11 function

        s2="Both of you are attending the sessions";

        //Repeats the same string for the given number of times
        System.out.println(s2.repeat(5)); //JDK 11 Function

        //Replaces the word 'Both' with 'All' in the given string
        //IF the given word to be replaced is not present in the string, then the original string is returned
        System.out.println(s2.replace("Both","All"));
        System.out.println(s2.replace("the","All"));
        System.out.println(s2.replace("Both of You","All of you"));

        s2="Both of you are attending the sessions";

        //Checks if the given string is ending with the word 'sessions'
        //Returns true if the above condition is satisfied else it is false
        System.out.println(s2.endsWith("sessions"));
        System.out.println(s2.endsWith("the"));
        System.out.println(s2.endsWith("sessions "));
        System.out.println(s2.toLowerCase().endsWith("SESSIONS"));
        System.out.println(s2.endsWith(s2));

        s2="        Hello World        ";

        //Removes the white spaces that is present at the start and end of the string
        System.out.println(s2.trim());
        System.out.println(s2.strip()); //JDK 11 Function

        //Removes the white spaces that is present at the end of the string
        System.out.println(s2.stripTrailing()); //JDK 11 Function

        //Removes the white spaces that is present at the start of the string
        System.out.println(s2.stripLeading()); //JDK 11 Function

        //A-Z = 65-90
        //a-z = 97-122

        //ASCII Value of 'H' = 72
        //ASCII Value of 'h' = 104
        String s3="Hello";
        String s4="hello";

        //Checks if both the strings are equal or not
        //Case Sensitive matters here
        //Returns true if the above condition is satisfied else it is false
        System.out.println(s3.equals(s4));

        //Checks if both the strings are equal or not irrespective of the case
        //Returns true if the above condition is satisfied else it is false
        System.out.println(s3.equalsIgnoreCase(s4));

        //Compares the two strings based on ascii values of each character (Case Sensitive is considered)
        //Returns 0 if both the strings are equal
        //Returns a positive value if the first string is greater than the second string
        //Returns a negative value if the first string is lesser than the second string
        System.out.println(s3.compareTo(s4));

        s3="Hello";
        s4="olleH";

        //Compares the two strings based on ascii values of each character (Case Sensitivity is not considered)
        //Returns 0 if both the strings are equal
        //Returns a positive value if the first string is greater than the second string
        //Returns a negative value if the first string is lesser than the second string
        System.out.println(s3.compareToIgnoreCase(s4));
    }
}
