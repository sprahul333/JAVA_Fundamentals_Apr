package april19th2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapConcepts {

    public static void main(String[] args) {

        //Map:

        //1. It is an interface
        //2. Main purpose is to store the data in the form of key value pairs like a ledger book
        //3. Each Key value pair is known as an entry
        //4. One null key is allowed and multiple null values are allowed
        //5. Does not allow duplicate keys but allows duplicate values
        //6. Data will be stored in a random order
        //7. Implemented in HashMap, LinkedHashMap, TreeMap

        //Syntax of creating a map:
        //Map<KeyType,ValueType> mapName=new HashMap<KeyType,ValueType>();

        Map<String, Integer> m1=new HashMap<>();

        //Add the key value pairs
        m1.put("Java",1);
        m1.put("Python",2);
        m1.put("C++",3);
        m1.put("C#",4);
        m1.put(null,null);

        System.out.println(m1);

        //Prints the number of entries present in the map
        System.out.println(m1.size());

        //Returns true if the map does not have any key value pairs
        // else it returns false
        System.out.println(m1.isEmpty());

        //Prints the list of keys present in the map
        System.out.println(m1.keySet());

        //Prints the list of values present in the map
        System.out.println(m1.values());

        //Prints the value that is stored against the key "Java"
        System.out.println(m1.get("Java"));

        //Returns null if the key is not present in the map
        System.out.println(m1.get("JavaScript"));

        //Returns the value that is present against the key "JavaScript" else it returns -1
        System.out.println(m1.getOrDefault("JavaScript",-1));

        //Checking whether the map contains the key "Python"
        //Returns true if the above condition is satisfied else it is false
        System.out.println(m1.containsKey("Python"));
        System.out.println(m1.containsKey("JavaScript"));

        //Checking whether the map contains the value 4
        //Returns true if the above condition is satisfied else it is false
        System.out.println(m1.containsValue(4));
        System.out.println(m1.containsValue(10));

        //Prints the data in the map in the form of entries
        System.out.println(m1.entrySet());

        //Removes the key value pair whose key is null
        //If the given is not present it will not throw any exception neither it will return any value
        m1.remove(null);

        System.out.println(m1);

        m1.remove("Sample");

        System.out.println(m1);

        //Replacing the value of the key "Python" with 10
        m1.replace("Python",10);

        System.out.println(m1);

        //Adding the key value pair to the map if the key is not present
        //If the "Javascript" is already present in the map then it will not add the key value pair
        //else it will add the key value pair
        m1.putIfAbsent("Javascript",30);
        System.out.println(m1);

        m1.putIfAbsent("Python",30);
        System.out.println(m1);

        //Replaces the old value with the new value if the key is present
        m1.put("Java",45);

        System.out.println(m1);

        //Iterate over a map:

        //Returns the set of entries that are present in the map
        //Map.Entry<String,Integer> --> Represents the key value pair which is stored in the form of an entry
        Set<Map.Entry<String,Integer>> s1=m1.entrySet();

        for(Map.Entry<String,Integer> e:s1) //Reading an individual entry from the set of entries
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
