/*
 * Main app for game
 */
package escape;

public class App {

    /**
     * Dumby Method, don't have purpose as of right now
     * @return
     */
    public boolean gameInit() {
        return true;
    }

    /**
     * Commands Method - Prints the commands the user has to their disposal
     * @return
     */
    public String commands() {
        return "================\n"
        + "Commands:\n"
        + " - go [direction]\n"
        + " - get [item]\n"
        + " - look\n"
        + " - quit\n"
        + "================";
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
        +"\t\t\t   Made By: Parker Cranfield";
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
     * Game loop
     * @param game
     */
    public void gameStart(App game) {
        game.commands();
    }

    /**
     * Main Method within the App - sets everything up
     * @param args
     */
    public static void main(String[] args) {
        App game = new App();
        game.gameInit();
        game.wait(2000);
        game.banner();
        game.gameStart(game);
    }
}
