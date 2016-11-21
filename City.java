import java.util.Scanner;
  
public class City extends HelperClass implements Location{

    
    public String getName()
    {
	return "City";
    }

    public String enter(Player p) throws InterruptedException
    {
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	    
	betterPrint("-- You Have Leveled Up to a City! --");
	nextLine();
	betterPrint("** Your city has prospered!!! **");
	betterPrint("** Gained 100 Health, 100 Money, 100 Population Growth! **");
	p.changeHealth(100);
	
	nextLine();
	betterPrint("Princess Bubblegum: Back To Work Now, Your Magesty!");
	nextLine();

	betterPrint("-- Two Weeks Later --");
	nextLine();
	betterPrint("Princess Bubblegum: My King! Princess Stern is here!");
	betterPrint("Princess Bubblegum: I will let them in at once!");
	nextLine();
	betterPrint("Princess Stern: My King, I've come from my kingdom of Oz!");
	betterPrint("Princess Stern: Our city is falling, birds are attacking, and witches are killing.");
	question = ("Princess Stern: Can you please lend me 10 gold and a magic wand? I will give you my spell book. ");

	if(askYesOrNo(question)){
	    betterPrint("** You have provided 10 gold!\n+10 Happiness. -10 Money. **");
	    nextLine();
	    betterPrint("Princess Stern: Oh Thank You My fellow King. My Kingdom will forever owe you.");
	    nextLine();
	}
	else{
	    betterPrint("-- Princess Stern uses a spell to make cuts in you. --");
	    nextLine();
	    betterPrint("** -50 Health. ** ");
	    p.changeHealth(-50);
	    nextLine();
	    betterPrint("Princess Stern: You coward! I hope you burn in hell along with your city!");
	    nextLine();
	    betterPrint("-- Spellbook was left behind by Princess Stern. Now in your possession --");
	    nextLine();
	}
	betterPrint("Princess Bubblegum: Okay. That was a good decision I believe.\n");
	nextLine();
	betterPrint("Princess Bubblegum: Now my king, our riches have grown.\nPrincess Bubblegum: We need to spend our money to get our people to work.");
	nextLine();
       	betterPrint("-- Next Day --");
	betterPrint("-- Peasant Miners uncovered burried gold. --");
	betterPrint("** +100 Money in your possession. **");
	nextLine();
	betterPrint("Princess Bubblegum: My King, My King, we have an urgent visitor.\nPrincess Bubblegum: I will let them in at once!");
	nextLine();
	betterPrint("Peasant: My King! I am so sorry to come out of no where.\nPeasant: My mother is sick! She needs help.");
	question = "Peasant: I am very poor as you can tell.\nPeasant: Can you please lend me 50 gold pieces?\nPeasant: Also, can you get our people to pray for her?";
	
	if(askYesOrNo(question))
	    {
		betterPrint("** +50 Happiness. -50 Money. **");
		betterPrint("Peasant: Thank You so much my king!\nPeasant: I don't know what I would do without my mother!\nPeasant: I hope some day I can repay you.\nPeasant: Thank You!");
		nextLine();
	    }
	else
	    {
		betterPrint("-- Peasant has attacked you with a bat. --");
		betterPrint("** -50 Health ** ");
		p.changeHealth(-50);
		nextLine();
		betterPrint("Peasant: My mother will die!\nPeasant: One day, us peasants will rule this city.\nPeasant: You will regret turning down our requests!");
		betterPrint("** -70 Happiness **");
		nextLine();
	    }


	return "PoorLevel";
    }


    public static void main(String[] args){
	City c = new City();
	try {
	    c.enter(new Teacher());
	    System.out.println("City class");
	} catch (InterruptedException e){
	    System.out.println("Something Broke");
	}
    }
}
