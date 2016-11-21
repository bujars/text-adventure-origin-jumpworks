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
	p.changeHealth(1000);
        p.getInventory().addItem(new Money(1000));
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
	question = "Peppermint Butler: Can you please lend me 1000 gold to form an army and buy weapons? Also, can I get a magical object to use? We might need magic.";
	if(askYesOrNo(question)){
	    question = "Do you want to provide a Magic Wand?";
	    boolean b = false;
	    if(askYesOrNo(question)){
		betterPrint("-- You have provided a Magic Wand! --");
	        nextLine();
		b = true;
		betterPrint("-1000 Gold, +1000 Health.");
		p.changeHealth(1000);
		p.getInventory().getItem("Money").use(1000);
		nextLine();
		betterPrint("-- An army has been created and equipted with top the line weapons. --");
		nextLine();
		betterPrint("Peppermint Butler: Oh My King! Thank You for Everything! The demons shall not win!");
		nextLine();
		betterPrint("-- Two Hours Later --");
		nextLine();
		betterPrint("Princess Bubblegum: Yes! We defeated the demon army!");
		betterPrint("-- Wand was returned. --");
		nextLine();
	    }
	    else if(!b){
		question = "Do you want to provide a Spell Book?";
		if(askYesOrNo(question)){
		    b = true;
		    betterPrint("-- You have provided a Spell Book. --");
		    nextLine();
		    betterPrint("-1000 Gold, +1000 Health.");
		    p.changeHealth(1000);
		    p.getInventory().getItem("Money").use(1000);
		    nextLine();
		    betterPrint("-- An army has been created and equipted with top the line weapons. --");
		    nextLine();
		    betterPrint("Peppermint Butler: Oh My King! Thank You for Everything! The demons shall not win!");
		    nextLine();
		    betterPrint("-- Two Hours Later --");
		    nextLine();
		    betterPrint("Princess Bubblegum: Yes! We defeated the demon army!");
		    betterPrint("-- SpellBook was returned. --");
		    nextLine();
		}
		else if(b == false){
		    betterPrint("-- You Decided not to give a magical object. --");
		    betterPrint("-- -100 Health. -1000 Gold --");
		    p.changeHealth(-100);
		    p.getInventory().getItem("Money").use(1000);
		    nextLine();
		    betterPrint("Peppermint Butler: My king, if we die because of magic, it's all your fault!!");
		    nextLine();
		    betterPrint("-- Two Hours Later --");
		    nextLine();
		    betterPrint("Princess Bubblegum: Yes! We defeated the demon army!");
		    nextLine();
		}
	    }

	}
	else{
	    betterPrint("--The demons have attacked your Kingdom!--");
	    nextLine();
	    betterPrint("-1000 Gold, -1000 Health, -1000 Population.");
	    p.changeHealth(-1000);
	    p.getInventory().getItem("Money").use(1000);
	    nextLine();
	    betterPrint("Peppermint Butler: No! We are going to die! I hate you!");
	    nextLine();
	    betterPrint("-- Demons Leave After Attack --");
	    nextLine();
	}
	betterPrint("-- Five Hours Later --");
	nextLine();
	betterPrint("-- Demons came back with larger army  and they destroyed 3/4 of your Kingdom!-- ");
	return "PoorLevel";
    }

    public static void main(String[] args){
	Kingdom k = new Kingdom();
	//King p = new King(100);
	try 
	{
	    k.enter(new King());
	    System.out.println("Kingdom Class");
	    System.out.println(k.toString());
	} 
	catch (InterruptedException e)
	{
	    System.out.println("Something Broke");
	}
    }
}
