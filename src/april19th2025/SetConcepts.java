package april19th2025;

import java.util.HashSet;
import java.util.Set;

public class SetConcepts {

    public static void main(String[] args) {

        //Set:

        //1. It is an interface
        //2. It does not allow duplicate values
        //3. It does allow null values
        //4. Data will be stored in a random order
        //5. Implemented in hashset, LinkedHashSet, TreeSet

        //Syntax of creating a set:
        //Set<dataType> setName=new HashSet<dataType>();

        Set<Integer> s1=new HashSet<>();

        s1.add(532);
        s1.add(1);
        s1.add(5032);
        s1.add(593);
        s1.add(-53894);
        s1.add(1);

        System.out.println(s1);

        //Prints the size of the set
        System.out.println(s1.size());

        System.out.println(s1.isEmpty());

        System.out.println(s1.contains(593));
        System.out.println(s1.contains(-53535));

        //Removes the value from the set
        s1.remove(1);

        System.out.println(s1);

        //Iterate over a set:
        //Using for each loop we iterate over a set:

        //for(int i=0;i<s1.size();i++)
        for(Integer i : s1) //Reading an individual integer from a set of integers
        {
            System.out.println(i);
        }


    }
}
