import java.util.Scanner;
public class PoorLevel extends HelperClass implements Location{
    public String getName()
    {
	return "PoorLevel";
    } 
    public String enter(Player p) throws InterruptedException
    {
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	
	betterPrint("-- OH NO! --");
        nextLine();
	betterPrint("-- Your Kingdon has fallen! Every decision you made was wrong and has led to the Kingdom's downfall. --");
	nextLine();
	betterPrint("** -100 Health, -100 Money, -200 Population. **");
	p.changeHealth(-100);
	p.getInventory().getItem("Money").use(100);
	nextLine();
	betterPrint("Princess Bubblegum: My King! What have you done!");
	nextLine();
	betterPrint("Princess Bubblegum: We believed that everything you were doing was going to make our city prosper, but instead, it has made us poor!");
	betterPrint("Princess Bubblegum: People are crying, dying, and pleading for help!");
	betterPrint("Princess Bubblegum: I have sent out a message to all kingdoms for help! Hopefully one will help us!");
	nextLine();
	
	betterPrint("-- Five Days Later --");
	nextLine();
	
	betterPrint("Princess Bubblegum: My King, My King, someone is here to visit, I'll let them in at once!");
	nextLine();
	betterPrint("Middleclass Man: My King, I have come to plead for help.");
	betterPrint("Middleclass Man: A dragon is burning us to the ground! Soon we will all be dead!");
	question = ("Middleclass Man: Can You please lend me some object to defeat it? I know you are full of magical objects!");

	if(askYesOrNo(question)){
	    question = "Do you want to provide a Magic Wand?";
	    boolean b = false;
	    if(askYesOrNo(question))
		{
		    betterPrint("-- You have provided a Magic Wand! --");
		    p.getInventory().getItem("MagicWand").use(1);
		    nextLine();
		    b = true;
		    betterPrint("Middleclass Man: Oh my king! Soon we shall have the dragon defeated!");
		    betterPrint("Middleclass Man: The Kingdom will be saved!");
		    nextLine();
		    betterPrint("** +100 Health **");
		    p.changeHealth(100);
		    nextLine();
		    betterPrint("-- A couple hours later --");
		    nextLine();
		    betterPrint("-- Dragon Was Defeated, but loss of -1000 Population. Wand was also returned.");
		    p.getInventory().addItem(new MagicWand());
		    nextLine();
		}
	    else if(!b){
		question = "Do you want to provide a Spell Book?";
		if(askYesOrNo(question)){
		    b = true;
		    betterPrint("-- You have provided a Spell Book. --");
		    p.getInventory().getItem("SpellBook").use(1);
		    nextLine();
		    betterPrint("Middleclass Man: Oh my king! Soon we shall have the dragon defeated!");
		    betterPrint("Middleclass Man: The Kingdom will be saved!");
		    nextLine();
		    betterPrint("** +100 Health **");
		    p.changeHealth(100);
		    nextLine();
                    betterPrint("-- A couple hours later --");
                    nextLine();
                    betterPrint("-- Dragon Was Defeated, but loss of -1000 Population. SpellBook was also returned.");
                    p.getInventory().addItem(new SpellBook());
		    nextLine();
		}
		else{
		betterPrint("-- You lied. --");
		betterPrint("** -100 Health. -100 Population **");
		p.changeHealth(-100);
		nextLine();
		betterPrint("MiddleClass Man: You coward! I hope you burn in hell! You have ruined our kingdom!");
		nextLine();
		betterPrint("-- A couple hours later --");
		nextLine();
		betterPrint("** -10 Population. **"); 
		nextLine();
		betterPrint("-- Dragon burned only 10 people then got bored and fled. --");
		nextLine();
		}
	    } 
	}
	else{
	    betterPrint("** -100 Health. -100 Population **");
	    p.changeHealth(-100);
	    nextLine();
	    betterPrint("MiddleClass Man: You coward! I hope you burn in hell! You have ruined our kingdom!");
	    nextLine();
	    betterPrint("-- A couple hours later --");
	    nextLine();
	    betterPrint("** -10 Population. **");
	    nextLine();
	    betterPrint("-- Dragon burned only 10 people then got bored and fled. --");
	    nextLine();
	}
	betterPrint("Princess Bubblegum: My king, I hope what you did was right.");
	betterPrint("Princess Bubblegum: With our Kingdom now so poor, we can't lose everything that we have done to get here.");
	nextLine();
	betterPrint("Princess Bubblegum: My King, we have another visitor!");
	betterPrint("Princess Bubblegum: Let's hope they have come to put us in a better state! I will let them in at once!");
	nextLine();
	betterPrint("Bujar: Hello your Magesty! I am Bujar.");
	betterPrint("Bujar: I am a magician in learning, and I would love to help your city by providing many riches.");
	betterPrint("Bujar: All it takes is one spell, and a fine lady for my keepings.");
	question = "Bujar: Would you want me to perform the spell to save your city?";
	
	if(askYesOrNo(question)){
	    betterPrint("Bujar: Oh No! The spell went wrong! I accidently burned down all of your crops.");
	    betterPrint("Bujar: Well, that's all I got. Hope your find a better savor.");
	    nextLine();
	    betterPrint("** -100 Health. -20 Population. **");
	    p.changeHealth(-100);
	    nextLine();
	}
	else{
	    betterPrint("-- A hurricane took our part of the city. Your castle rumbled and a rock hit you. --");
	    betterPrint("**  -200 Population. -30 Health **");
	    p.changeHealth(-30);
	    nextLine();
	    betterPrint("Bujar: Your people have died and will continue to die from no help!");
	    nextLine();
	}
	betterPrint("Princess Bubblegum: Oh no my king. We are destroyed.");
	nextLine();
	return "Depression";
    }

    public static void main(String[] args){
	PoorLevel p = new PoorLevel();
	King k = new King();
	k.getInventory().addItem(new MagicWand());
	k.getInventory().addItem(new Money());
	k.getInventory().addItem(new SpellBook());
	try {
	    p.enter(k);
	    System.out.println("PoorLevel Class");
	    System.out.println(k.getInventory().toString());
	} catch (InterruptedException e){
	    System.out.println("Something Broke");
	}
    }
}