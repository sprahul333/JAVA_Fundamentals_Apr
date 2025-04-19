package april14th2025;

//Constructor is also a special type of method, which gets executed when the object is created
//All the constructors are methods, but not all the methods are constructors
class NBA
{
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getTeamCap() {
        return teamCap;
    }

    public void setTeamCap(double teamCap) {
        this.teamCap = teamCap;
    }

    public int getNoOfWins() {
        return noOfWins;
    }

    public void setNoOfWins(int noOfWins) {
        this.noOfWins = noOfWins;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    private String teamName;
    private double teamCap;
    private int noOfWins;
    private String captain;

    //Within the same class:
    //1. Only one default constructor will be there
    //2. There can be multiple parameterized constructors

    //Syntax of a default constructor:
    //ClassName() { //Block of code to be executed }

    //Below is the constructor that JAVA automatically creates for every class that we call
//    NBA() {
//
//    }

    //Constructor is a specialized version of the setter
    //Beauty of the constructor is that it gets executed the moment the object is created
    //Helps us to do the set of activities while creating the object
    NBA()
    {
        System.out.println("Default Constructor");

        teamName="LA";
        teamCap=234.5215532;
        noOfWins=50;
        captain="Lebron";
    }

    //Syntax of a parameterized constructor:
    //ClassName(set of arguments to be passed) { //Block of code to be executed }

    NBA(String teamName, double teamCap, int noOfWins, String captain)
    {
        this.teamName=teamName;
        this.teamCap=teamCap;
        this.noOfWins=noOfWins;
        this.captain=captain;
    }

    NBA(String teamName, double teamCap, int noOfWins)
    {
        this.teamName=teamName;
        this.teamCap=teamCap;
        this.noOfWins=noOfWins;
        this.captain="None";
    }

    public void display()
    {
        System.out.println("Team Name: "+teamName);
        System.out.println("Team Captain: "+teamCap);
        System.out.println("No. of Wins: "+noOfWins);
        System.out.println("Captain: "+captain);
    }
}

public class ConstructorsConcepts {

    public static void main(String[] args) {

        NBA nba = new NBA(); //Whenever an object is created, a default constructor will be executed
        nba.display();

        System.out.println("****************************************************************************************");

        //If we pass the arguments during the object creation, then we are referring to the parameterized constructor
        NBA nba2=new NBA("LAC",324.521,48,"Leonard");
        nba2.display();
        System.out.println(nba2.getCaptain());

        NBA nba3=new NBA("NYK",327.325,48);
        nba3.display();
    }

}


