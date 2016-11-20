public class King implements Player{
    private int health;
    private int population;
    private Treasury inventory;
    
    public King(){
	health = 100;
	population = 50;
	inventory = new Treasury();
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

    public int getPopulation(){
	return population;
    }

    public void changePopulation(int delta){
	population += delta;
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
	    "Population:{ " +  population  + " }\n" +
	    "Inventory:{\n" + getInventory().toString() + "};\n";
    }

    public static void main(String[] args){
	King k = new King();
	System.out.println(k.toString());
	//System.out.println(k.getHealth());
	k.changeHealth(-50);
	k.getInventory().addItem(new Money(100));
	System.out.println(k.toString());
	k.getInventory().getItem("Money").use(50);
	System.out.println(k.toString());
	//System.out.println(k.getHealth());
    }
}
