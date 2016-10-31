import java.util.ArrayList;

public class LocationSeki2 implements Location{
    ArrayList<String> locations;
    int currentLoc;

    public LocationSeki2(String [] loc, int curLoc){
	for(int i = 0; i < loc.length;i++){
	    locations.add(loc[i]);
	}
	currentLoc = curLoc;
    }

    public String getName(){
	return locations.get(currentLoc);
    }

    public String enter(Player p) throws InterruptedException{
	if (currentLoc+1 < locations.size()){
	    return locations.get(currentLoc++);
	}
	return "";
    }
}
