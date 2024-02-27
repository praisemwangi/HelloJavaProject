import java.io.*;

public class Gettinginputfromuser {
    /**
     * Getting User Input
     * <p>
     * We have two ways
     * <p>
     * 1. BufferedReader class -> console line way
     * 2. JOptionPane Class -> GUI (Graphical User Interface).
     */


    public static void main(String[] args) {
        // Let's get user input using BufferReader class

        // create an instance of BufferReader class
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        // create a variable for holding the user input
        String userName = null;

        // use a try ... catch block to execute the code
        try {
            // ask the user for their name
            System.out.println("Please enter your name: ");
            userName = dataIn.readLine();
        } catch (IOException ex) {
            System.out.println("There was an Error reading the User Input...");
        }

        // output the user input
        System.out.println("Greetings " + userName);

        // write a java program that asks the user for their name and age. Then converts the age into minutes the user has lived.
        String name = "";
        int age = 0;

        try {
            System.out.print("Enter your name: ");
            name = dataIn.readLine();
            System.out.print("Enter  your age: ");
            age = dataIn.read();

    } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        // convert the user age into minutes
        int ageInMinutes = age * 365 * 24 * 60;

        // out the user info
        System.out.println("Hello " + name + " , you have lived for " + ageInMinutes + " minutes.");
}
}






































