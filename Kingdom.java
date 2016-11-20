import java.util.Scanner;
public class Kingdom extends HelperClass implements Location{
  public String getName()
    {
	return "Kingdom";
    }

    public String enter(Player p) throws InterruptedException
    {

    	Scanner sc = new Scanner(System.in);
	String question = "";
	String input = "";
	
	
	betterPrint("--You have leveled up to Kingdom--");
	nextLine();
	betterPrint("Gained 1000 Health, 1000 Money, and 1000 Population!");
	nextLine();
	betterPrint("Princess Bubblegum: My King! Congrats!");
	betterPrint("Princess Bubblegum: Ou has never had more faith in you more than now!");
	nextLine();
	betterPrint("-Door Knocks-");
	betterPrint("Princess Bubblegum: Your Highness, Peppermint Butler has come to see you.");
	betterPrint("Princess Bubblegum: I will let Peppermint Butler in at once!");
	nextLine();
	betterPrint("Peppermint Butler: My King, demons from the underworld are surfacing and coming to take over Ou!");
	betterPrint("Peppermint Butler: But we can defeat them before they reach the kingdom.");
	question = "Peppermint Butler: Can you please supply me an army and weapons?";
	
	if(askYesOrNo(question))
	{
		
		betterPrint("-1000 Gold, +1000 Happiness.");
		nextLine();
		betterPrint("*An army has created and equipted with top the line weapons*");
		betterPrint("Peppermint Butler: Oh My King! Thank You for Everything! The demons shall not win!");
		nextLine();
	}
	else
	{
		
		betterPrint("--The demons have attacked your Kingdom!--");
		nextLine();
		betterPrint("-1000 Gold, -1000 Happiness, -1000 Population.");
		nextLine();
		betterPrint("Peppermint Butler: I will eat your flesh!");
		nextLine();
	}
	
	return "Game Over";

	

    }


 public static void main(String[] args){
	Kingdom k = new Kingdom();
	try 
	{
	    k.enter(new Teacher());
	    System.out.println("Kingdom Class");
	} 
	catch (InterruptedException e)
	{
	    System.out.println("Something Broke");
	}
    }
}
