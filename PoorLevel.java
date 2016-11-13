import java.util.Scanner;


public class PoorLevel extends City
{
    public String getName()
    {
	return "PoorLevel";
    } 
    public String enter(Player p) throws InterruptedException
    {
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	
	betterPrint("OH NO!");
        nextLine();
	betterPrint("Your Kingdon has fall! With every decision made, every decision was wrong and has led to our downfall.");
	nextLine();
	betterPrint("Lost 100 Health, 100 Money, 200 Population Decrease");
	nextLine();
	betterPrint("Princess Bubblegum: My King! What have you done!");
	nextLine();
	betterPrint("Princess Bubblegum: We believed that everything you were doing, was going to make our city prosper, but instead, it has made us poor!");
	betterPrint("Princess Bubblegum: People are crying, dying, and pleading for help!");
	betterPrint("Princess Bubblegum: I have sent out a message to all kingdoms for help! Hopefully one will help us!");
	nextLine();
	betterPrint("Princess Bubblegum: My King, My King, someones here to visit, I'll let them in at once!");
	nextLine();
	betterPrint("Middleclass Man: My King, I have come to plead for help.");
	betterPrint("");
	return "Game Over";
    }
}