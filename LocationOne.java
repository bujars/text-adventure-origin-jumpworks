public class LocationOne implements Location 
{
    private LocationOne firstLocation;
    public LocationOne()
    {
	firstLocation = "LocationOne";
    }
    public String getName()
    {
	return "LocationOne";
    }
    public String enter(Player p) throws InterruptedException
    {
	return "LocationTwo";
    }
}