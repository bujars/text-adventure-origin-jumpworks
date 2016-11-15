public class PlayerB implements Player
{
    private int health;
    public PlayerB()
    {
	health = 100;
    }

    public int getHealth()
    {
	return 100; 
    }
    public void changeHealth(int delta)
    {
	health = delta;
    }
    public Inventory getInventory()
    {
	return player.getInventory();
    }

}