package april1st2025;

public class VariablesConcepts {

    public static void main(String[] args) {

        //Variable is nothing but a temporary storage of data
        //Scope of the variable is during the execution of the program


        //Once the program execution is completed, all the variables are disposed off the memory

        //Rules to be followed while declaring the variable:
        //1. It should start with a small letter
        //2. It should not start with a capital letter or a number or a special character
        //3. It should not have any whitespaces in between
        //4. We should not use any JAVA Keywords.

        //Data Types in JAVA:
        //1. Primitive Data Types: int, char, boolean, float, double, long, short, byte
        //2. Non Primitive Data Types: String, Array, Class, Interface, Enum, etc...............

        //Syntax of declaring a variable:
        //dataType variableName;

        int a1; //Accepts a range of values from -2^31 to 2^31-1
        char b2; //Accepts a single value like 'A', 'a', '4', '#', ' '
        boolean c3; //Accepts true or false
        float d4; //Accepts upto 5 to 6 decimal places
        double e5; //Accepts upto 16 decimal places
        long f6; //Accepts a range of values from -2^63 to 2^63-1
        short g7; //Accepts a range of values from -32768 to 32767
        byte h8; //Accepts a range of values from -128 to 127

        //Syntax of initializing a variable:
        //variableName = value;

        a1=-59634;
        b2='A';
        c3=true;
        d4=3.144f; //f is used to specify that the value is a float value
        e5=3.64;
        f6=1234567890123456789L; //L is used to specify that the value is a long value
        g7=12345;
        h8=127;

        //Common Ranges of ASCII Values:
        //A-Z = 65-90
        //a-z = 97-122
        //0-9 = 48-57
        //' ' = 32

        //Whenever we are using any character in arithmetic operation, we have to take the ASCII Value of the given character
        //-59568.504
        System.out.println(b2+a1-d4+e5);

        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c3);
        System.out.println(d4);
        System.out.println(e5);
        System.out.println(f6);
        System.out.println(g7);
        System.out.println(h8);

        //From JDK 10 onwards, JAVA is providing a feature called as var
        //var eliminates the need of specifying the data type of the variable

        var i10=false;

        var i11=9539;

        var i12='B';

        var i13=3.14f;

        System.out.println(i10);
        System.out.println(i11);
        System.out.println(i12);
        System.out.println(i13);

    }
}
