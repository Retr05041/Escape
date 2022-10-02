/*
 * App Class - holds both the world and the player
 */
package escape;

import java.util.Scanner;

public class App {

    /**
     * Banner Method (WIP)
     */
    public static void banner() {
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
     * Gets users name for the game
     * @return
     */
    public static void playerInit(Player player) {
        Scanner nameInput = new Scanner(System.in); // For input
        System.out.print("Please enter name: ");
        String name = nameInput.nextLine();
        player.setPlayerName(name);
        nameInput.close();
    }

    /**
     * Main Method within the App - sets everything up
     * @param args
     */
    public static void main(String[] args) {
        World currentWorld = new World();
        Player player = new Player("Player 1");
        playerInit(player);
        currentWorld.gameStart(player);
    }
}
