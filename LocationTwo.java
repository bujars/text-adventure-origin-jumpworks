public class LocationTwo implements Location
{
    public String getName()
    {
	return "LocationTwo";
    }
    public String name(Player p) throws InterruptedException
    {
	return "LocationTwoNext";
    }
}