package april25th2025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Players implements Comparable<Players>
{
    private String name;
    private String role;
    private int runs;
    private int wickets;
    private String country;

    public Players(String name, String role, int runs, int wickets, String country) {
        this.name = name;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public int compareTo(Players o) {

        //Comparing the name of the player that is present in the current object vs name of the player that is present in the object that is passed as a parameter
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Players [name=" + name + ", role=" + role + ", runs=" + runs+ ", wickets=" + wickets + ", country=" + country + "]";
    }
}

public class ContinuationOfStreams {

    public static void main(String[] args) {

        List<Players> playersList = new ArrayList<Players>();

        playersList.add(new Players("Virat Kohli","Batsman",13000,10,"India"));
        playersList.add(new Players("Rohit Sharma","Batsman",15000,20,"India"));
        playersList.add(new Players("MS Dhoni","Wicket Keeper",10000,0,"India"));
        playersList.add(new Players("Chris Gayle","Batsman",16000,150,"West Indies"));
        playersList.add(new Players("AB De Villiers","Batsman",9000,10,"South Africa"));
        playersList.add(new Players("Shane Warne","Bowler",5000,700,"Australia"));
        playersList.add(new Players("Brett Lee","Bowler",2000,300,"Australia"));
        playersList.add(new Players("Shikhar Dhawan","Batsman",6000,10,"India"));
        playersList.add(new Players("Ricky Ponting","Batsman",20000,0,"Australia"));
        playersList.add(new Players("Brian Lara","Batsman",20000,50,"West Indies"));
        playersList.add(new Players("Jacques Kallis","All Rounder",13000,300,"South Africa"));
        playersList.add(new Players("Kapil Dev","All Rounder",5000,400,"India"));
        playersList.add(new Players("Imran Khan","All Rounder",3000,200,"Pakistan"));
        playersList.add(new Players("Wasim Akram","Bowler",2000,400,"Pakistan"));

        //Sorting the players based on the name of the player
        //In this class, we are implementing the Comparable interface and overriding the compareTo method
        playersList.stream().sorted().forEach(s-> System.out.println(s));

        //Sorting the players based on the runs scored by the player
        //In this case we are using the Comparator interface and overriding the compare method

        System.out.println("*************************************************************************************");
        Comparator<Players> c1= (Players p1, Players p2) -> Integer.compare(p1.getRuns(), p2.getRuns());

        playersList.stream().sorted(c1).forEach(s-> System.out.println(s));

        System.out.println("*************************************************************************************");

        //Group the players based on the country
        //.groupingBy() is used to group the players based on the requirement
        //Whateever data we get after filtering the players based on the country, we can convert it into a list using Collectors.toList()

        //Return Type of .groupingBy() is Map<String, List<Players>>
        //.collect() is an intermediate operation.
        Map<String,List<Players>> dataOfPlayers=playersList.stream().collect(Collectors.groupingBy(s->s.getCountry(),Collectors.toList()));

        dataOfPlayers.forEach((k,v)->{;
            System.out.println("Country: "+k);
            System.out.println("**************************************************************************************");
            v.forEach(s->System.out.println(s.getName()));
            System.out.println("**************************************************************************************");
        });

        //Grouping the players based on the country and filter the data whose number of runs is greater than 8000
        Map<String,List<Players>> testData=playersList.stream().filter(s->s.getRuns()>8000).collect(Collectors.groupingBy(s->s.getCountry(),Collectors.toList()));

        testData.forEach( (k,v)->{
            System.out.println("Country: "+k);
            System.out.println("**************************************************************************************");
            v.forEach(s->System.out.println(s.getName()));
            System.out.println("**************************************************************************************");
        });

        System.out.println("**************************************************************************************");

        //Partitioning the players based on the country
        //Partitioning is used to divide the data into two parts
        //Returns a Map<Boolean, List<Players>>
        Map<Boolean, List<Players>> partionedData=playersList.stream().collect(Collectors.partitioningBy(s->s.getCountry().equalsIgnoreCase("India")));

        partionedData.forEach((k,v)->{
            System.out.println("Country: "+k);
            System.out.println("**************************************************************************************");
            v.forEach(s->System.out.println(s.getName()));
            System.out.println("**************************************************************************************");
        });

        System.out.println("**************************************************************************************");

    }

}
