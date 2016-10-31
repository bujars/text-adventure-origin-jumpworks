public class LocationFour implements Location
{
    public String getName()
    {
	return "LocationFour";
    }
    public String enter(Player p) throws InterruptedException
    {
	return "LocationFourNext";
    }
}