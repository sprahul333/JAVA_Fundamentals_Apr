package april19th2025;

import java.util.Arrays;

public class TwoDimensionalArray {

    //Transpose the 2d Array and rotate it by 90 degrees

    public static void main(String[] args) {
        //Data is stored in the form of rows and columns like a table
        //2D Array is an array of arrays

        //Syntax of storing the data of a 2d array:
        //dataType[][] variableName=new dataType[noOfRows][noOfColumns];

        int[][] a1=new int[3][3];

//        Arrays.fill(a1); //Will not work for 2d arrays, it is applicable for 1D arrays

        //Prints the data in a readable format
        System.out.println(Arrays.deepToString(a1));

        for(int i=0;i<a1.length;i++) //Iterating over the rows of data
        {
            Arrays.fill(a1[i],(i+1)*5);
        }

        System.out.println(Arrays.deepToString(a1));

        //Prints the data that is present 3rd row and 3rd columns
        System.out.println(a1[2][2]);

        //Prints the data that is present at 1st row and 1st column
        System.out.println(a1[0][0]);
    }
}
