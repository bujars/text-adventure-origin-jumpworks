public class King implements Player{
    int health;
    public King(){
	health = 100;
    }

    /**
     * Gets the health of the player.
     *
     * @return the numeric health of the player
     */
    public int getHealth(){
	return health;
    }

    /**
     * Changes the health of the player.
     *
     * @param delta the numeric change to the health of the player
     */
    public void changeHealth(int delta){
	health+=delta;
    }

    /**
     * Gets the player's inventory
     *
     * @return the player's {@link Inventory}
     */
    public Inventory getInventory(){
	return null;
    }
}
