package april3rd2025;

public class LoopsConcepts {

    public static void main(String[] args) {

        //Loops:
        //Keep on repeating the same thing until the condition is satisfied

        //In Java there are four different types of loops:
        //1. while
        //2. do-while
        //3. for
        //4. forEach

        //while:
        //Keeps on running until the condition is satisfied

        //SYntax:
        //while(block of code) { //Statements to be executed }

        int l=30;

        while(l<40)
        {
            System.out.println(l);
            l=l+1;
        }

        System.out.println("***********************************************************");

        l=30;

        while(l>30) //Condition is not satisfied
        {
            System.out.println(l);
        }

        System.out.println("***********************************************************");

        l=50-30*10-200; //-450

        while (l>204 && l<500)
        {
            System.out.println(l);
            l=l+5;
        }

        System.out.println("***********************************************************");

        String k="Sample_Data";

        while(k.length()!=0)
        {
            System.out.println(k); //Sample_Data
            k=k.substring(0,k.length()-1);
        }

        System.out.println("***********************************************************");

        k="Sample_Data";
        while (k.length()%2!=0)
        {
            System.out.println(k.codePointAt(k.length()-1)); //97
            k=k.substring(k.length()-4);
        }
    }
}
