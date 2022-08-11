/*
 * Library/helper methods for the App.java
 */
package escape;

public class Library {
    // Dumby method to check if library is working
    public String libraryInit() {
        return "-- library ready --";
    }

    // prints the commands for the user
    public String commands() {
        return "================\n"
        + "Commands:\n"
        + " - go [direction]\n"
        + " - get [item]\n"
        + " - look\n"
        + " - quit\n"
        + "================";
    }


    // Type writer method, takes string and time (in milli) and types string char by char with a delay of time - https://stackoverflow.com/questions/35673302/java-typewriter-effect
    public void typeWrite(String input, int time) {
        for (int i = 0; i < input.length(); i++) {
            // Prints each char using the for loop
            System.out.printf("%c", input.charAt(i));
            // Thread.sleep() needs to be a try catch thing but I don't know why yet
            wait(time);
        }
    }

    // Banner for game (WIP)
    public void banner() {
        String escapeBanner = "----------------------------------------------------------------------------------\n"
        +"|    ▄████████    ▄████████  ▄████████    ▄████████    ▄███████▄    ▄████████    |\n"
        +"|    ███    ███   ███    ███ ███    ███   ███    ███   ███    ███   ███    ███   |\n"
        +"|    ███    █▀    ███    █▀  ███    █▀    ███    ███   ███    ███   ███    █▀    |\n"
        +"|    ███▄▄▄       ███        ███          ███    ███   ███    ███   ███▄▄▄       |\n"
        +"|    ███▀▀▀       ██████████ ███          ██████████   ████████▀    ███▀▀▀       |\n"
        +"|    ███    █▄           ███ ███    █▄    ███    ███   ███          ███    █▄    |\n"
        +"|    ███    ███    ▄█    ███ ███    ███   ███    ███   ███          ███    ███   |\n"
        +"|    ██████████  ▄████████▀  ████████▀    ███    █▀   ▄████▀        ██████████   |\n"
        +"----------------------------------------------------------------------------------\n"
        +"\t\t\t   Made By: Parker Cranfield";
        System.out.println(escapeBanner);
    }

    // Pause method
    public void wait(int timeMilli) {
        try {
            Thread.sleep(timeMilli);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
