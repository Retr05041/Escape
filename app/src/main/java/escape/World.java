/**
 * World class - holds the game loop/world
 */

package escape;

import java.util.Scanner;

public class World {

    Boolean gameOver = false; // Tells the world if the game is over

    /**
     * Commands Method - Prints the commands the user has to their disposal
     * @return
     */
    public void commands() {
        System.out.println("================\n"
        + "Commands:\n"
        + " - go [direction]\n"
        + " - get [item]\n"
        + " - look\n"
        + " - quit\n"
        + "================");
    }

    /**
     * Type writer method, takes string and time (in milli) and types string char by char with a delay of time - https://stackoverflow.com/questions/35673302/java-typewriter-effect
     * @param input
     * @param time
     */
    public void typeWrite(String input, int time) {
        for (int i = 0; i < input.length(); i++) {
            // Prints each char using the for loop
            System.out.printf("%c", input.charAt(i));
            // Thread.sleep() needs to be a try catch thing but I don't know why yet
            wait(time);
        }
    }

    /**
     * 'Pause' method
     * @param timeMilli
     */
    public void wait(int timeMilli) {
        try {
            Thread.sleep(timeMilli);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Game loop
     * @param game
     */
    public void gameStart(Player player) {
        typeWrite("Hehehe... you really think you have what it takes....? to- ", 250);
        wait(500);
        App.banner();
        wait(2000);
        System.out.println("Welcome " + player.getPlayerName() + " to 'Escape'!");
        commands();

        // Game loop
        Scanner playerDecision = new Scanner(System.in); // For Players input
        while (!gameOver) {
            System.out.print("" + player.getPlayerName() + ">> ");
            String decision = playerDecision.nextLine();
        }
        playerDecision.close(); // Remember to close the scanner
    }
}
