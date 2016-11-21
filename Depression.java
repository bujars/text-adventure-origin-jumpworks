import java.util.Scanner;
public class Depression extends HelperClass implements Location{
  public String getName()
    {
	return "Depression";
    }

    public String enter(Player p) throws InterruptedException
    {

    	Scanner sc = new Scanner(System.in);
	String question = "";
	String input = "";
	
	betterPrint("--Your Kingdom has failed. Your Kingdom is in a state of Depression!--");
	nextLine();
	betterPrint("Lost 1000 Health, 1000 Money, and 1000 Population!");
	p.changeHealth(-1000);
	p.getInventory().addItem(new Money(-1000));
	nextLine();
	betterPrint("Princess Bubblegum: My King! What did you do to us!");
	betterPrint("Princess Bubblegum: No one believes in your power anymore! You have destroyed much of us!");
	nextLine();
	betterPrint("-Door Knocks-");
	betterPrint("Princess Bubblegum: Your Highness, Cake has come to see you.");
	betterPrint("Princess Bubblegum: I will let Cake in at once!");
	nextLine();
	betterPrint("Cake: My King, to be the great kingdom of OU, we need security.");
	betterPrint("Cake: My idea is to build a wall that will provide jobs and keep the city protected!");
	question = "Cake: Please protect the citzens of OU by giving me 1000 Money so I can bulid a wall?";
	
	if(askYesOrNo(question))
	{

		betterPrint("-1000 Money, +1000 Health.");
		p.changeHealth(1000);
		p.getInventory().getItem("Money").use(1000);
		nextLine();
		betterPrint("-- The Great Wall of OU was Built! --");
		betterPrint("Cake: Oh My King! Thank You for Everything! Our Kingdom will hopefully be saved.");
		nextLine();
	}
	else
	{
		
		betterPrint("--OZ has attacked your city!--");
		nextLine();
		betterPrint("-1000 Money, -1000 Health, -1000 Population.");
		p.changeHealth(-1000);
		p.getInventory().getItem("Money").use(1000);
		nextLine();
		betterPrint("Cake: I told you my king! Our people are ruined!");
		nextLine();
	}
	betterPrint("Princess Bubblegum: My King, what have you done?");
	betterPrint("Princess Bubblegum: Every decision you have made has led to our downfall.");
	betterPrint("Princess Bubblegum: Please my king, from now on, think of the people!");
	nextLine();
	betterPrint("Princess Bubblegum: My King! At last! I think our savor has come!");
	betterPrint("Princess Bubblegum: King Zues is here! His magic can work wonders! I'll let him in!!!");
	nextLine();
	betterPrint("King Zues: So, you need help! Of course!");
	betterPrint("King Zues: In order for you to get my help, I need all your riches, and objects.");
	betterPrint("King Zues: I will perform a spell that will multiply everything and make your city prosper");
	question = "King Zues: So, do we have a deal?";
	
	if(askYesOrNo(question))
	{
	    betterPrint("-- Magical Spell Performed --");
	    nextLine();
	    betterPrint("** Lost All Money. Lost All Objects. Lost All Population (Except you and Princess Bubblegum) **");
		nextLine();
		betterPrint("King Zues: Ha! I lied and destroyed your kingdom!");
		betterPrint("-- Muhahahahha......Game Over --");
	}
	else{
		betterPrint("-- Magical Spell Performed --");
		nextLine();
		betterPrint("** Lost All Money. Lost All Objects. Lost All Population(Except you and Princess Bubblegum) **");
		//p.getInventory().getItem("Money").use(getCount());
		nextLine();
		betterPrint("King Zues: Ha! Big Mistake! I performed a spell and destroyed your kingdom!");
		betterPrint("-- Muhahahahha......Game Over --");
	}
	
	return "Game Over";

	

    }
 public static void main(String[] args){
	Depression d = new Depression();
	King p = new King();
	p.getInventory().addItem(new Money());
	p.getInventory().addItem(new MagicWand());
	p.getInventory().addItem(new SpellBook());
	try {
	    d.enter(p);
	    System.out.println("Depression Class");
	    System.out.println(p.getInventory().toString());
	} catch (InterruptedException e){
	    System.out.println("Something Broke");
	}
    }
}
