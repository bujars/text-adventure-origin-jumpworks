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
	p.getInventory().addItem(new Money(100));
	nextLine();
	betterPrint("Princess Bubblegum: Back To Work Now, Your Magesty!");
	nextLine();

	betterPrint("-Next Day--");
	nextLine();
	betterPrint("+635 Health, +274 Money, and +388 Population!");
	p.changeHealth(635);
	p.getInventory().addItem(new Money(274));
	nextLine();
	betterPrint("Princess Bubblegum: Hello your Highness.");
	betterPrint("Princess Bubblegum: Today will be a long day.");
	nextLine();
	betterPrint("-Door Knocks-");
	betterPrint("Princess Bubblegum: Your Highness, someone has come to see you.");
	betterPrint("Princess Bubblegum: I will let her in at once!");
	nextLine();
	betterPrint("Marie: It’s tragic!!! There’s no water for me to take a shower.\nMarie: I have this wand from my family past, so if you want it you can have it but please fix the water!");
	question = "Marie: I need water! Please my King, will you supply me with water?";
 
	if(askYesOrNo(question))
	    {
		betterPrint("** -666 Money, +109 Heath. **");
		p.changeHealth(109);
		p.getInventory().getItem("Money").use(666); 
		nextLine();
		betterPrint("-- The water was restored. --");
		betterPrint("Marie: I wish the best for you my King, I can finally take a shower!");
		nextLine();
		betterPrint("-- Magic Wand Now in Your Possession. --");
		p.getInventory().addItem(new MagicWand());
		nextLine();
	    }
	else
	    {
		betterPrint("--All the citizens are suffering without water--");
		nextLine();
		betterPrint("** -572 Health, -1000 Population.** ");
		p.changeHealth(-572);  
		nextLine();
		betterPrint("Marie: Shaking my head, you have failed me!");
		nextLine();
		betterPrint("-- Marie Dropped Wand. Wand now in your possession. --");
		p.getInventory().addItem(new MagicWand());
		nextLine();
	    }
    

	betterPrint("-- Two Weeks Later --");
	nextLine();
	betterPrint("Princess Bubblegum: My King! Princess Stern is here!");
	betterPrint("Princess Bubblegum: I will let them in at once!");
	nextLine();
	betterPrint("Princess Stern: My King, I've come from my kingdom of Oz!");
	betterPrint("Princess Stern: Our city is falling, birds are attacking, and witches are killing.");
	question = ("Princess Stern: Can you please lend me 10 Money and a magic wand? I will give you my spell book.");
	if(askYesOrNo(question)){
	    question = "Do you want to provide a Magic Wand?";
	    boolean b = false;
	    if(askYesOrNo(question)){
		betterPrint("-- You have provided a Magic Wand! --");
		p.getInventory().getItem("MagicWand").use(1);
		b = true;
		betterPrint("** -10 Money. +10 Health. **");
		p.changeHealth(10);
		p.getInventory().getItem("Money").use(10);
		nextLine();
		betterPrint("Princess Stern: Oh Thank You My fellow King. My Kingdom will forever owe you.");
		nextLine();
		betterPrint("-- Spellbook was left behind by Princess Stern. Now in your possession --");
		p.getInventory().addItem(new SpellBook());
		betterPrint("-- Wand was returned. --");
		p.getInventory().addItem(new MagicWand());
		nextLine();
	    }
	    else if(b == false){
		betterPrint("-- You Decided not to give a magical object. --");
		betterPrint("** -10 Money **");
		p.changeHealth(-100);
		p.getInventory().getItem("Money").use(10);
		nextLine();
		betterPrint("-- Princess Stern performs a self spell...Your Body is full of cuts. --");
		nextLine();
		betterPrint("** -50 Health. ** ");
		p.changeHealth(-50);
		nextLine();
		betterPrint("Princess Stern: You coward! I hope you burn in hell along with your city!");
		nextLine();
		betterPrint("-- Spellbook was left behind by Princess Stern. Now in your possession --");
		p.getInventory().addItem(new SpellBook());
		nextLine();
	    }
	}
	else{
	    betterPrint("-- Princess Stern performs a self spell...Your Body is full of cuts. --");
	    nextLine();
	    betterPrint("** -50 Health. ** ");
	    p.changeHealth(-50);
	    nextLine();
	    betterPrint("Princess Stern: You coward! I hope you burn in hell along with your city!");
	    nextLine();
	    betterPrint("-- Spellbook was left behind by Princess Stern. Now in your possession --");
	    p.getInventory().addItem(new SpellBook());
	    nextLine();
	}
	betterPrint("Princess Bubblegum: Okay. That was a good decision I believe.\n");
	nextLine();
	betterPrint("Princess Bubblegum: Now my king, our riches have grown.\nPrincess Bubblegum: We need to spend our money to get our people to work.");
	nextLine();
       	betterPrint("-- Next Day --");
	betterPrint("-- Peasant Miners uncovered burried gold. --");
	betterPrint("** +100 Money in your possession. **");
	p.getInventory().addItem(new Money(100));
	nextLine();
	betterPrint("Princess Bubblegum: My King, My King, we have an urgent visitor.\nPrincess Bubblegum: I will let them in at once!");
	nextLine();
	betterPrint("Peasant: My King! I am so sorry to come out of no where.\nPeasant: My mother is sick! She needs help.");
	question = "Peasant: I am very poor as you can tell.\nPeasant: Can you please lend me 50 Money?\nPeasant: Also, can you get our people to pray for her?";
	
	if(askYesOrNo(question))
	    {
		betterPrint("** +50 Health. -50 Money. **");
		p.changeHealth(-50);
		p.getInventory().getItem("Money").use(50);
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
		nextLine();
	    }


	return "City";
    }


    public static void main(String[] args){
	City c = new City();
	King k = new King();
	try {
	    c.enter(k);
	    System.out.println("City class");
	    System.out.println(k.getInventory().toString());
	} catch (InterruptedException e){
	    System.out.println("Something Broke");
	}
    }
}
