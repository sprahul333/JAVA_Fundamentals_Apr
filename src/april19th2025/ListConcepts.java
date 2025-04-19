package april19th2025;

import java.util.ArrayList;
import java.util.List;

public class ListConcepts {

    public static void main(String[] args) {

        //List is a part of collection that helps us store heterogenous set of data

        //List:
        //1. It is an interface
        //2. It allows duplicate values
        //3. It stores null values
        //4. It preserves the Insertion Order (Follows the concept of FIFO)
        //5. It is implemented in ArrayList, LinkedList, Stack, Vector

        //Syntax of creating a list:
        //List<DataType> listName=new ArrayList<dataType>();

        //In the newer versions of JDK we need not mention the above syntax:
        //List<DataType> listName=new ArrayList<>();

        List<String> data=new ArrayList<>();

        data.add("Sample"); //.add() is used to add the data to the list
        data.add("Heroic");
        data.add("Heroic");
        data.add(null);
        data.add("Pooran");
        data.add("Pooran");

        System.out.println(data);

        //Prints the size of the list
        System.out.println(data.size());

        //Checks if the data is present in the list or not
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(data.isEmpty());

        //Checks if the list contains the word 'Pooran'
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(data.contains("Pooran"));
        System.out.println(data.contains("njsdgn"));

        //Gets the first value that is present in the list
        System.out.println(data.getFirst());

        //Gets the last value that is present in the list
        System.out.println(data.getLast());

        //Gets the data that is present at the 4th index position
        System.out.println(data.get(4));

        //Throws IndexOutOfBoundsIndexException as we are trying to access the list that is greater than the length
//        System.out.println(data.get(500));

        //Adds the value at the start
        data.addFirst("Narine");
        System.out.println(data);

        //Adds the value at the end of the list
        data.addLast("Sunil");
        System.out.println(data);

        data.removeFirst(); //Removes the first value from the list

        System.out.println(data);

        data.removeLast(); //Removes the last value from the list
        System.out.println(data);

        //Removes the data from the list based on the value that we pass
        data.remove(null);

        System.out.println(data);

        //prints the list in the reversed order
        System.out.println(data.reversed());

        //Prints the index position of the first occurence of the word 'Narine' in the given list
        //If it is not present it will return -1
        System.out.println(data.indexOf("Narine"));
        System.out.println(data.indexOf("Heroic"));

        //Prints the index position of the last occurence of the word 'Heroic' in the given list
        System.out.println(data.lastIndexOf("Heroic"));

//        data.clear(); //Erases the complete data from the list

        //Iterate over the list

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }
}
