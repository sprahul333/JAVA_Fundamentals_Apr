package april19th2025;

import java.util.Arrays;

public class ArrayConcepts {

    public static void main(String[] args) {

        //Array is a collection of homogenous set of data

        //Syntax of creating an array:
        //dataType[] variableName=new dataType[size of the array];

        //here we declare the size of the array upfront so as to decide how much memory should be allocated in the heap

        int a1[]=new int[5];

        System.out.println(Arrays.toString(a1));

        //Fills the complete array with value as 10
        Arrays.fill(a1,10);

        System.out.println(Arrays.toString(a1));

        //Copying the array a1 into another array whose size is 10
        int b1[]=Arrays.copyOf(a1,10);

        //First five values will be filled with 10 and the remaining values will be filled with zero
        System.out.println(Arrays.toString(b1));

        //Fills the array from 5th index to 10th index position with value as 20
        Arrays.fill(b1,5,10,20);

        System.out.println(Arrays.toString(b1));

        //Copies the values of array b1 from 5th index position to 10th index position to a different array
        int c1[]=Arrays.copyOfRange(b1,5,10);

        System.out.println(Arrays.toString(c1));

        System.out.println(c1[3]); //Refers to a value that is present at 3rd index position
        System.out.println(c1[1]); //Refers to a value that is present at 1st index position

        //Fill the array with some diffenret values

        for(int i=0;i<c1.length;i++)
        {
            c1[i]=c1.length-(i*i);
        }

        System.out.println(Arrays.toString(c1));

        //Sort this array in ascending order
        Arrays.sort(c1);

        System.out.println(Arrays.toString(c1));

        //Search for an element in the array
        //If it is found, it will return the index position of the value
        //If it is not found, it will return a -ve value
        System.out.println(Arrays.binarySearch(c1,1));
        System.out.println(Arrays.binarySearch(c1,2));

//        Arrays.parallelSort(c1); //It is used when the size of the array is huge and needs to sorted quickly

        //Replaces the values in the array with the given condition
        Arrays.setAll(c1, i->c1[i]*c1[i]);

        System.out.println(Arrays.toString(c1));

        //Sorts the data in the array that is present between 2nd and 4th index position
        //Inclusive of start index position and exclusive of end index position
        Arrays.sort(c1,1,3);

        System.out.println(Arrays.toString(c1));
    }
}
