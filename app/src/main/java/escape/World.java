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
        + " - 'go [direction]' - Go in a direction, either 'north', 'east', 'south', or 'west'\n"
        + " - 'get [item]' - Pick up an item and add it to your inventory, ex. 'get flashlight'\n"
        + " - 'look' - Looks around the room your in\n"
        + " - 'quit - Quits the game'\n"
        + " - 'help' - Shows the commands again\n"
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
    public void gameStart(Player player, Scanner playerInput) {
        typeWrite("Hehehe... you really think you have what it takes....? to- ", 125);
        wait(500);
        App.banner();
        wait(2000);
        System.out.println("Welcome " + player.getPlayerName() + " to 'Escape'!");
        commands();

        // Game loop
        while (!gameOver) {

            System.out.print("" + player.getPlayerName() + ": ");
            String decision = playerInput.nextLine();
            String[] playerCommand = decision.split("\\s+"); // Lord I don't like regex - splits the players decision into single string commands

            switch (playerCommand[0]) {
                case "quit":
                    gameOver = true;
                    continue;
                
                case "help":
                    commands();
                    continue;
                
                case "go":
                    if (playerCommand.length > 1) {
                        switch (playerCommand[1]) {
                            case "north":
                                System.out.println("You went north");
                                continue;
                            case "east":
                                System.out.println("You went east");
                                continue;
                            case "south":
                                System.out.println("You went south");
                                continue;
                            case "west":
                                System.out.println("You went west");
                                continue;
                        
                            default:
                                System.out.println("Invalid command, please try again.");
                                continue;
                        }
                    } else {
                        System.out.println("Invalid command, please try again.");
                        continue;
                    }
            
                default:
                    System.out.println("Invalid command, please try again.");
                    continue;
            }
        }
        typeWrite("Guess you didn't have what it takes... shame...\n", 125);
    }
}
