/*
 * Main app for game
 */
package escape;

import java.util.Scanner;

public class App {
    // Global Variables
    Scanner input = new Scanner(System.in); // For input

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
     * Banner Method (WIP)
     */
    public void banner() {
        String escapeBanner = "\n"
        + "          _           _            _              _                   _          _ \n"
        + "         /\\ \\        / /\\         /\\ \\           / /\\                /\\ \\       /\\ \\ \n"
        + "        /  \\ \\      / /  \\       /  \\ \\         / /  \\              /  \\ \\     /  \\ \\ \n"
        + "       / /\\ \\ \\    / / /\\ \\__   / /\\ \\ \\       / / /\\ \\            / /\\ \\ \\   / /\\ \\ \\ \n"
        + "      / / /\\ \\_\\  / / /\\ \\___\\ / / /\\ \\ \\     / / /\\ \\ \\          / / /\\ \\_\\ / / /\\ \\_\\ \n"
        + "     / /_/_ \\/_/  \\ \\ \\ \\/___// / /  \\ \\_\\   / / /  \\ \\ \\        / / /_/ / // /_/_ \\/_/ \n"
        + "    / /____/\\      \\ \\ \\     / / /    \\/_/  / / /___/ /\\ \\      / / /__\\/ // /____/\\ \n"
        + "   / /\\____\\/  _    \\ \\ \\   / / /          / / /_____/ /\\ \\    / / /_____// /\\____\\/ \n"
        + "  / / /______ /_/\\__/ / /  / / /________  / /_________/\\ \\ \\  / / /      / / /______ \n"
        + " / / /_______\\\\ \\/___/ /  / / /_________\\/ / /_       __\\ \\_\\/ / /      / / /_______\\ \n"
        + " \\/__________/ \\_____\\/   \\/____________/\\_\\___\\     /____/_/\\/_/       \\/__________/ \n\n"
        +"\t\t\t   Made By: Parker Cranfield\n";
        System.out.println(escapeBanner);
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
     * Dumby Method, don't have purpose as of right now
     * @return
     */
    public void gameInit(Player player) {
        System.out.print("Please enter name: ");
        String name = input.next();
        player.setPlayerName(name);
    }

    /**
     * Game loop
     * @param game
     */
    public void gameStart(App game, Player player) {
        System.out.println("Welcome " + player.getPlayerName() + " to 'Escape'!");
        game.commands();
    }

    /**
     * Main Method within the App - sets everything up
     * @param args
     */
    public static void main(String[] args) {
        App game = new App();
        Player player = new Player("Player 1");
        game.gameInit(player);
        game.wait(2000);
        game.banner();
        game.gameStart(game, player);
    }
}
