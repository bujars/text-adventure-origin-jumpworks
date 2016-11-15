/**
 * Sample player for school based text adventure game.
 * @author Sean Stern
 * @version 1.0
 */
public class King implements Player{
    
    private int health;
    
    public King()
    {
	health = 100;
    }

    @Override
    public int getHealth()
    {
	return health;
    }

    @Override
	public void changeHealth(int delta){
	if(!(delta > health))
	{
	    health += delta;
	}
    }

    @Override
	public Inventory getInventory(){
        // Teachers have nothing but their education to
        // make it through school
        return null; 
    }
}