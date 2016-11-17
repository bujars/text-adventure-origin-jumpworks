public class SpellBook extends Item{
    int count;
    public SpellBook(){
	count = 1;
    } 
    
    public String getName(){
	return "SpellBook";
    }

    public String getDescription(){
	return "This item can be used to find chant magical spells";
    }

    public int getCount(){
	return count;
    }

    public void use(int positiveNum) throws IllegalArgumentException{
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
	sameKind.use(sameKind.getCount());
    }

    public static void main(String[] args){
        SpellBook sb = new SpellBook();
	MagicWand mw = new MagicWand();
	SpellBook sb1 = new SpellBook();
	MagicWand mw1 = new MagicWand();
	System.out.println(sb.toString());
	System.out.println(mw.toString());
	System.out.println(sb1.toString());
	System.out.println(mw1.toString());
	sb.combine(sb1);
	mw.combine(mw1);
	System.out.println(sb.toString());
	System.out.println(mw.toString());
	System.out.println(sb1.toString());
	System.out.println(mw1.toString());
    }
}
