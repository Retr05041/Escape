/*
 * Player class - details for a playher
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

    /**
     * Returns player's name
     * @return
     */
    public String getPlayerName() {
        return this.playerName;
    }

    /**
     * Sets player's name
     * @param newName
     */
    public void setPlayerName(String newName) {
        this.playerName = newName;
    }
    
    
}
