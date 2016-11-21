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
	if(!(delta > health))
	{
		health += delta;
	}
	return null; 
    }

    /**
     * Gets the player's inventory
     *
     * @return the player's {@link Inventory}
     */
    public Inventory getInventory(){
	return null;
    }

    public static void main(String[] args){
	King k = new King();
	System.out.println(k.getHealth());
	k.changeHealth(-50);
	System.out.println(k.getHealth());
    }
}
