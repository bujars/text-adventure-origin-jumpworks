import java.util.*;

public class AdvancedEngine implements Engine{
    private Player player;
    private List<Location> locations;
    private String nextLocationName;

    /**
     * Constructor
     *
     * @param game The game that the engine will play
     */
    public AdvancedEngine(Game g){
        player = g.getPlayer();
        locations = g.getLocations(); 
        nextLocationName = null;
    }

    @Override
    public void start() throws InterruptedException{
	nextLocationName = locations.get(0).enter(player);
    }

    @Override
    public boolean isGameDone(){
	for(Location loc : locations){
	    if(loc.getName().equals(nextLocationName)){
		return false;
	    }
	}
	return true;
    }

    @Override
	public void goToNextState() throws InterruptedException, 
					   IllegalStateException{
	boolean ran = false;
	if (nextLocationName == "next"){
	    nestLocationNaem = locations.get(rand(0, locations.length()));
	    ran = true;
	}
	if (ran){
	    return;
	}
        throw new IllegalStateException("Location '" + nextLocationName + "'" +
					" is not defined for game.");
    }

    @Override
    public String toString(){
	String engineInfo;
	engineInfo =
            "*SimpleEngine Information*\n" + 
	    "Player:{ " + player.toString() + " };\n" + 
	    "Next Location:{ " + nextLocationName + " };\n";
	engineInfo += "All Locations:{ "; 
        for(Location loc : locations){
	    engineInfo += loc.getName() + " ";
	}
        engineInfo += "};\n";
        return engineInfo;
    }
}
