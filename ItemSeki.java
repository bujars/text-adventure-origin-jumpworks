public class ItemSeki extends Item{
    String name;
    String description;
    int count;

    public ItemSeki(){
	name = "Item";
	description = "desc";
	count = 1; 
    }
    
    public String getName(){
	return name;
    }

    public String getDescription(){
	return description;
    }

    public int getCount(){
	return count;
    }

    public void use(int positiveNum) throws  IllegalArgumentException{
	while (count > 0 && positiveNum > 0){
	    count--;
	    positiveNum--;
	}
    }
}
