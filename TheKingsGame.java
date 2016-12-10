import java.util.*;

public class TheKingsGame implements Game{
    @Override
    public List<Location> getLocations(){
	List<Location> levels = new ArrayList<Location>();
        levels.add(new Tutorial());
	return levels;
    }

    @Override
    public Player getPlayer(){
	return new King();
    }
    
    public static void main(String[] args){
	
    }
}
