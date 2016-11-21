public class Population extends Item {


    private int count;

    public Population(){
	count = 0;
    }
    public Population(int c){
        count = c;
    }


    /**
     * Gets the name of the item in the text adventure game.
     *
     * @return the name of the item
     */
    public String getName(){
	return "Population";
    }



    /**
     * Gets the description of the item in the text adventure game.
     *
     * @return the description of the item 
     */
    public String getDescription(){
	return "The amount of people in your kingdom";
    }


    /**
     * Gets the count of how many instances of the item there are. 
     * For example, a pack of gum item might have 5 pieces of gum.
     *
     * @return the number of instances in this item
     */
    public int getCount(){
	return count;
    }


    /**
     * Uses a positive number of instances of the item. 
     *
     * @param positiveNum a positive number of items to use
     * @throws IllegalArgumentException if positive num is non-positive OR
     * exceeds the count of instances of the item
     */
    public void use(int positiveNum) throws IllegalArgumentException{
	if(positiveNum >= 0 && positiveNum <= count )
	    {
		count = count - positiveNum;
	    }
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
	Population m = new Population(100);
	System.out.println(m.getName());
	System.out.println(m.getDescription());
	System.out.println(m.getCount());
	m.use(100);
	System.out.println(m.getCount());
	m.combine(new Population(1000));
	System.out.println(m.getCount());
    }
}
