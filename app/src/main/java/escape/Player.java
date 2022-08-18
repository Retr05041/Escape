/*
 * Player class
 */
package escape;

public class Player {
    // Player name
    String playerName;
    String holdName = "Dumby";

    /**
     * Constructor for Player
     * @param name
     */
    public Player(String name) {
        this.playerName = name;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    /**
     * Setter for player name
     * @param newName
     */
    public void setPlayerName(String newName) {
        this.playerName = newName;
    }
    
    
}
