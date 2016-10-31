public class LocationThree implements Location
{
    public String getName()
    {
	return "LocationThree";
    }
    public String enter(Player p) throws InterruptedException
    {
	return "LocationThreeNext";
    }
}