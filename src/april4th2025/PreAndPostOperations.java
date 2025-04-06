package april4th2025;

public class PreAndPostOperations {

    public static void main(String[] args) {

        int a=30;

        //Value of a will be increased by 1 but the updated value will not be displayed
        //Updated value will be stored in the temp or buffer memory
        //Post Increment
        System.out.println(a++); //30

        //Prints the updated value of a
        System.out.println(a); //31

        //Value of a will be decreased by 1 but the updated value will not be displayed
        //Updated value will be stored in the temp or buffer memory
        //Post Decrement
        System.out.println(a--); //31

        //Prints the updated value of a
        System.out.println(a); //30

        //Pre Increment
        //Value of a will be increased by 1 and the updated value will be displayed
        System.out.println(++a); //31

        //Pre Decrement
        //Value of a will be decreased by 1 and the updated value will be displayed
        System.out.println(--a); //30
    }
}
