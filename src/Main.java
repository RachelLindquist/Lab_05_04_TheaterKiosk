public class Main {
    public static void main(String[] args) {
        //As people pass through an entry kiosk at the theater,
        // they are prompted to enter their age.
        // If they are 21 or older, they get a paper wrist band.
        // Code a logic program that asks the user to enter their age
        // and then if they are 21 or over displays a  message that they get a wrist band.
        // (Note that the program does nothing if they are not 21 or over…)

        //Test runs:   (insert the output widow copies here for the 2 test runs)


        System.out.println("How old are you? Please enter a number.");
        int personAge = 20;
        if (personAge >= 21) {
            System.out.println("You are 21 or older, please collect your wristband");
        }

    }

}