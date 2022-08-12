/*
 * Main app for game
 */
package escape;

public class App {

    // Init Game
    public boolean gameInit() {
        return true;
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

    // Main gameloop
    public void gameStart(App game) {
        game.commands();
    }

    // main
    public static void main(String[] args) {
        App game = new App();
        game.gameInit();
        game.wait(2000);
        game.banner();
        game.gameStart(game);
    }
}
