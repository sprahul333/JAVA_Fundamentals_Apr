package april2nd2025;

public class ConditionalStatements {

    public static void main(String[] args) {

        //Conditional

        //Syntax of if condition:
        //if(condition) { //Block of code to be executed }

        int k=400;

        // == --> Checks if the value present on the right hand side is same as value present on the left hand side
        if(k==500) //500=500
            System.out.println("Value of k is 500");

        k=200;

        // != --> Checks if the value present on the left hand side is not same as value present on the right hand side
        if(k!=300)
            System.out.println("Value of k is not 300");

        // % --> Remainder of the number
        if(k%4==0)
            System.out.println("Value of k is divisible by 4");

        k=40-200*10-200/10;

        //&& --> And Operator
        //Both the conditions should be satisfied, then it only return true else it returns false
        if(k%5==0 && k%7!=0)
            System.out.println("Value of k is divisible by 5 and not divisible by 7");

        //BODMAS -->
        //20-30-432+17
        //-10-432+17
        //-10-415
        //-425
        k=20-10*3-432+17;

        // || --> Or Condition
        //If any one of the condition is satisfied then it returns true else it returns false
        if(k%6==0 || k%3!=0)
            System.out.println("Value of k is divisible by 6 or not divisible by 3");


        //if else condition:

        k=30;

        if(k%7==0)
            System.out.println("Value of k is divisible by 7");
        else
            System.out.println("Value of k is not divisible by 7");

        k=30;

        //Nested If Else condition:
        String s2="Both of you are attending the sessions";

        if(s2.startsWith("of")) //Condition is satisfied
        {
            //30+10-20 => 20
            //20%3 =2 2==0 (Condition is not satisfied)
            if((k+10-20)%3==0)
                System.out.println("Value of k when modified is divisible by 3");
            else
                System.out.println("Value of k when not modified is not divisible by 3");
        }

        else
        {
            s2="Sample Understanding of if else condition";

            if(s2.length()%3==0)
                System.out.println("Length of the string is divisible by 3");
            else
                System.out.println("Length of the string is not divisible by 3");
        }

        //if -else if condition:

        k=50;

        if(k%9==0)
            System.out.println(k+" is divisible by 9");
        else if(k%8==0)
            System.out.println(k+" is divisible by 8");
        else if(k%7==0)
            System.out.println(k+" is divisible by 7");
        else if(k%6==0)
            System.out.println(k+" is divisible by 6");
        else if(k%5==0)
            System.out.println(k+" is divisible by 5");
        else
            System.out.println(k+" is not divisible by any of the above numbers");

        //Between if and an else we can have multiple else if blocks

    }
}
