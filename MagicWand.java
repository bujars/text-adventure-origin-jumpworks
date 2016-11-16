public class MagicWand extends Item {

    private int count;
    
    public MagicWand(){
	count = 1;
    }

    /**
     * Gets the name of the item in the text adventure game.
     *
     * @return the name of the item
     */
    public  String getName(){
	 return "MagicWand";
    }

    /**
     * Gets the description of the item in the text adventure game.
     *
     * @return the description of the item     
     */
    public  String getDescription(){
	    return "A MagicWand helps anyone who uses it, to perform a spell that they have thought of in their mind. If the person does not have enough experience with spells, the wand will produce a spell opposite of what intended";
    }


    /**
     * Gets the count of how many instances of the item there are. 
     * For example, a pack of gum item might have 5 pieces of gum.
     *
     * @return the number of instances in this item
     */
    public int getCount(){
        return 1;
    }


    /**
     * Uses a positive number of instances of the item. 
     *
     * @param positiveNum a positive number of items to use
     * @throws IllegalArgumentException if positive num is non-positive OR
     *         exceeds the count of instances of the item
     */
    public  void use(int positiveNum) throws IllegalArgumentException{
	if(count > 0 && positiveNum < count )
	    {
		count = count - positiveNum;
	    }
    }

    public void combine(Item sameKind) throws IllegalArgumentException{
	if(!sameKind.getName().equals(this.getName())){
	    throw new IllegalArgumentException("sameKind { " + 
					       sameKind + " }\n" +
					       "does not have the same name " +
					       "as this item { " + this + 
					       " }");
	}
	else if(!sameKind.getDescription().equals(this.getDescription())){
	    throw new IllegalArgumentException("sameKind { " + 
					       sameKind + " }\n" +
					       "does not have the same " +
					       "description as this item { " + 
					       this + " }");
	}
	count += sameKind.getCount();
	sameKind.use(getCount());
    }

    public static void main(String[] args){
	SpellBook sb = new SpellBook;
    }
}