public class InventoryBuBu implements Inventory
{
    ArrayList<Item> playerInventory; 
    
    public InventoryBuBu()
    {
	playerInventory = new ArrayList<Item>();
    }

    public void addItem(Item i)
    {
	playerInventory.add(i);
    }
    public boolean hasItem(String itemName)
    {
	boolean itemThere = false;
	for(int i = 0; i < playerInventory.size(); i++)
	    {
		if(playerInventory.get(i).equals(itemName))
		    {
			itemThere = true; 
		    }
	    }
	return itemThere;
    }
    public Item getItem(String itemName)
    {
	Item getItem;
	if(hasItem == true)
	    {
		for(int i = 0; i < playerInventory.size(); i++)
		    {
			if(playerInventory.get(i).equals(itemName))
			    {
				getItem = playerInventory.get(i);
			    }
		    }
	    }
    }
}
