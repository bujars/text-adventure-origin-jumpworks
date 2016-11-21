import java.util.*;

public class TheKingsGame implements Game{
    @Override
    public List<Location> getLocations(){
	List<Location> levels = new ArrayList<Location>();
        levels.add(new Tutorial());
	levels.add(new Village());
	levels.add(new City());
	levels.add(new Kingdom());
	levels.add(new Depression());
	levels.add(new PoorLevel());
	return levels;
    }

    @Override
    public Player getPlayer(){
	return new Teacher();
    }
    
    public static void main(String[] args){
	
    }
}
