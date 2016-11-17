public class AdvancedItem extends Item{
    String NAME;
    String DESCRIPTION;
    int count;
    
    public AdvancedItem (){
	NAME = "Item";
	DESCRIPTION = "Something";
	count = 1;
    }

    public AdvancedItem (String name, String description){
	NAME = name;
	DESCRIPTION = description;
	count = 1;
    }

    public AdvancedItem (String name, String description, int amount){
	NAME = name;
	DESCRIPTION = description;
	count = amount;
    }
    public String getName(){
        return NAME;
    }

    public String getDescription(){
	return DESCRIPTION;
    }

    public int getCount(){
	return count;
    }

    public void use(int positiveNum){
	if (positiveNum < 0){
	    throw new IllegalArgumentException("Not a positve Number");
	}
	count -= positiveNum;
    }

    public void combine(Item sameKind) throws IllegalArgumentException{
	if(!sameKind.getName().equals(this.getName())){
	    throw new IllegalArgumentException("sameKind \n{\n" + 
					       sameKind + " }\n" +
					       "does not have the same name " +
					       "as this item \n{ " + this + 
					       " }");
	}
	else if(!sameKind.getDescription().equals(this.getDescription())){
	    throw new IllegalArgumentException("sameKind \n{\n" + 
					       sameKind + " }\n" +
					       "does not have the same " +
					       "\ndescription as this item \n{ " + 
					       this + " }");
	}
	count += sameKind.getCount();
    }

    public static void main(String[] args){
	String name = "Wand";
	String desc = "Allows the user to do magic";
	AdvancedItem ai = new AdvancedItem(name, desc, 3);
	System.out.println(ai.toString());
	ai.use(2);
	System.out.println(ai.toString());
    }
}
