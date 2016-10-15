/**
 * Inventory where a player can accumulate items for use in a text adventure
 * @author Sean Stern
 * @version 1.0
 */
public interface Inventory{

    /**
     * Adds an {@link Item} to the inventory
     *
     * @param i the {@link Item} to be added to the inventory
     */
    public void addItem(Item i);

    /**
     * Uses an item named in the parameter, provided it exists in the inventory
     *
     * @param itemName the name of the item to be used
     * @return true if the item named was available to be used, false otherwise
     */
    public boolean useItem(String itemName);
}