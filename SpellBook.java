public class SpellBook extends Item{
    int count;
    public SpellBook(){
	count = 1;
    } 
    
    public String getName(){
	return "SpellBook";
    }

    public String getDescription(){
	return "This item can be used to find chant maical spells";
    }

    public int getCount(){
	return count;
    }

    public void use(int positiveNum) throws IllegalArgumentException{
	count -= positiveNum;
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
	
    }
}
