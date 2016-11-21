public class King implements Player{
    private int health;
    private Treasury inventory;
    
    public King(){
	health = 0;
	inventory = new Treasury();
	getInventory().addItem(new Money());
	getInventory().addItem(new Happiness());
	getInventory().addItem(new Population());
    }

    public King (int h){
	health = h;
	inventory = new Treasury();
	getInventory().addItem(new Money());
	getInventory().addItem(new Happiness());
	getInventory().addItem(new Population());
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
	health += delta; 
    }

    /**
     * Gets the player's inventory
     *
     * @return the player's {@link Inventory}
     */
    public Inventory getInventory(){
	return inventory;
    }

    public String toString(){
	return "Player Class King\n" +
	    "Health:{ " + health + " }\n" +
	    "Inventory:{\n" + getInventory().toString() + "};\n";
    }

    public static void main(String[] args){
	King k = new King();
	System.out.println(k.toString());
	k.changeHealth(-50);
	k.getInventory().addItem(new Money(100));
	System.out.println(k.toString());
	System.out.println(k.toString());
    }
}
