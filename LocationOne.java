public class LocationOne implements Location 
{
    public String getName()
    {
	return "LocationOne";
    }
    public String enter(Player p) throws InterruptedException
    {
	return "LocationOneNext";
    }
}