package april4th2025;

public class ForLoopConcepts {

    public static void main(String[] args) {

        //For Loop:
        //Loop keeps on running until the condition is satisfied

        //Syntax of for loop:
        //for(initialization; condition; increment/decrement) { //Block of code to be executed }

        //Initialization: int i=0;
        //Condition: i<10;
        //increment/decrement: i=i+1;

        //Inside the for loop, we can declare a fresh variable and use it
        for(int i=0;i<10;i=i+1)
        {
            System.out.println(i);
        }

        System.out.println("***********************************************************");

        for(int i=40;i<50;i=i+5)
        {
            System.out.println(i);
        }

        System.out.println("***********************************************************");

        for(int i=50-30*10;i<50;i=i+1)
        {
            System.out.println(i);
        }

        System.out.println("***********************************************************");

        for(String j="Jack";j.length()!=0;j=j.substring(0,j.length()-1))
        {
            System.out.println(j); //Jack
        }

        System.out.println("***********************************************************");

        //for(;;)
        for(int j=0;;j=j+1) //Syntatically it is right
        {
            System.out.println(j);

            if(j==200)
                break;
        }

        System.out.println("***********************************************************");

        for(var i=0;i<20;i=i+1)
        {
            if(i==15)
                continue; //Skip that current run or current iteration

            System.out.println(i);
        }

        System.out.println("***********************************************************");

        //Nested loops

        for(int i=0;i<5;i=i+1)
        {
            for(int j=0;j<5;j=j+1)
            {
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }
    }
}
