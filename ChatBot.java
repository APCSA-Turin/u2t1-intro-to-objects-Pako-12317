public class ChatBot {

    // instance variables
    private String name;
    private int number;
 
    // constructor
    public ChatBot(String chatBotName, int faveNum) {
        name = chatBotName;
        number = faveNum;
    }
 
    // void method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! How are you today?");
    }
 
    // void method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }
 
    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }
 
    // void method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = Math.absExact(yourNumber - number);  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }
 
    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
 
    // method that returns a goodbye message -- note that this method does not print a string, but
    // rather RETURNS a string
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }

    public double AbsoluteVal(double x){
        x= Math.abs(x);
        return(x);
    }

    public int yearsToMinutes (int years){
        return(years*525600);
    }

    public void apples(){
        System.out.println("I like apples! Do you also like apples?");
    }

    public void human () {
        System.out.println("How is it being human?");
    }

    public String guessingRand(double a){
       double x = Math.random();
       x = Math.abs(x-a);
        return("You number is "+x+" away from the number.");
    }

    public String Amazing(int z){
        return(z+" is an amazing number of adventures!");
    }
 } 