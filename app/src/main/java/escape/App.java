/*
 * Main app for game
 */
package escape;

public class App {

    // Init Game
    public boolean gameInit(Library usedLib) {
        System.out.println("-- Welcome, booting up --");
        System.out.println(usedLib.libraryInit());
        return true;
    }

    public void gameStart() {
    }

    // main
    public static void main(String[] args) {
        App game = new App();
        Library library = new Library();
        game.gameInit(library);
        game.gameStart();
    }
}
