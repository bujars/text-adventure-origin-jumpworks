import java.util.*;

public class Treasury implements Inventory
{
    ArrayList<Item> playerInventory; 
    
    public Treasury()
    {
	playerInventory = new ArrayList<Item>();
    }

    public void addItem(Item i)
    {
	playerInventory.add(i);
    }
    
    public boolean hasItem(String itemName)
    {
	for(int i = 0; i < playerInventory.size(); i++)
	{
	    if(playerInventory.get(i).getName().equals(itemName))
	    {
		return true; 
	    }
	}
	return false;
    }
    
    public Item getItem(String itemName)
    {
	if(hasItem(itemName) == true)
	{
	    for(int i = 0; i < playerInventory.size(); i++)
	    {
		if(playerInventory.get(i).getName().equals(itemName))
		 {
		     return playerInventory.get(i);
		 }
	    }
        }
	return null;
    }

    public static void main(String[] args){
	Treasury t = new Treasury();
	t.addItem(new SpellBook());
	t.addItem(new MagicWand());
	System.out.println(t.hasItem("SpellBook"));
	System.out.println(t.getItem("SpellBook"));
    }
}
