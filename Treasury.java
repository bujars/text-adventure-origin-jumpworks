import java.util.*;

public class Treasury implements Inventory
{
    ArrayList<Item> playerInventory; 
    
    public Treasury()
    {
	playerInventory = new ArrayList<Item>();
    }

    public void addItem(Item item)
    {
	if (hasItem(item)){
	    for(Item i : playerInventory){
		i.combine(item);
	    }
	}
	playerInventory.add(item);
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

    public boolean hasItem(Item item){
	for(Item i : playerInventory){
	    if (i.equals(item)){
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

    public String toString(){
	String allItems = "";
	for (Item i : playerInventory){
	    allItems += i.toString();
	    allItems += "\n";
	}
	return
	    "Treasury Information\n" +
	    "Items:{\n\n" + allItems + "};\n";
	    
    }

    public static void main(String[] args){
	Treasury t = new Treasury();
	t.addItem(new SpellBook());
	t.addItem(new MagicWand());
	t.addItem(new Money());
	System.out.println(t.toString());
	//System.out.println(t.hasItem("SpellBook"));
	//System.out.println(t.getItem("SpellBook"));
    }
}
