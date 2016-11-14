import java.util.Scanner;
public class Depression extends AdvancedLocation

{
  public String getName()
    {
	return "Depression";
    }

    public String enter(Player p) throws InterruptedException
    {

    	Scanner sc = new Scanner(System.in);
	String question = "";
	String input = "";
	
	/*System.out.println("**Your Kingdom has failed. You are in a state of Depression.**");
	Thread.sleep(1000);
	System.out.println("You're state depression of has reached the top");
	Thread.sleep(1000);
	System.out.println("Gained 100 Health, 100 Money, and 100 population growth");
	Thread.sleep(1000);
	System.out.println(\n**\n**[enter] TO CONTINUE \n**\n>);
	Thread.sleep(1000);
	System.out.println("Back to business.");
	Thread.sleep(1000);
	Thread.sleep(1000);
	System.out.println("Your Highness, Cake has you to see you.");
	Thread.sleep(1000);
	System.out.println("Cake: My King to be the great kingdom of OU, we need security. \n Please protect the citzens of OU by giving me 100 gold to bulid a wall.");
	*/
	
	betterPrint("--Your Kingdom has failed. You Kingdom is in a state of Depression!--");
	nextLine();
	betterPrint("Lost 1000 Health, 1000 Money, and 1000 Population!");
	nextLine();
	betterPrint("Princess Bubblegum: My King! What did you do to us!");
	betterPrint("Princess Bubblegum: No one believes in your power anymore! You have destroyed much of us!");
	nextLine();
	betterPrint("-Door Knocks-")
	betterPrint("Princess Bubblegum: Your Highness, Cake has come to see you.");
	betterPrint("Princess Bubblegum: I will let Cake in at once!");
	nextLine();
	betterPrint("Cake: My King, to be the great kingdom of OU, we need security.");
	betterPrint("Cake: My idea is to build a wall that will provide jobs and keep the city protected!")
	question = "Cake: Please protect the citzens of OU by giving me 1000 gold so I can bulid a wall.";
	
	if(askYesOrNo(question))
	{
		/*System.out.println("You have provided 100 gold \n+10 Happiness -100 Money");
		Thread.sleep(1000);
		System.out.println("Thank you my King, Ou is forever in your debt.");
		System.out.print("\n**\n**[enter] TO CONTINUE \n**\n>");
		sc.nextLine();
		Thread.sleep(1000);*/
		betterPrint("-1000 Gold, +1000 Happiness.");
		nextLine();
		betterPrint("**The Great Wall of OU was Built!**");
		betterPrint("Cake: Oh My King! Thank You for Everything! Our Kingdom will hopefully be saved.");
		nextLine();
	}
	else
	{
		/*System.out.println("You Lost 100 Happiness");
		Thread.sleep(1000);
		System.out.println("You're very niave my King, my best wishes to Ou");
		Thread.sleep(1000);
		System.out.print("\n**\n**[enter] TO CONTINUE \n**\n>");
		sc.nextLine();
		Thread.sleep(1000);*/
		betterPrint("--OZ has attacked your city!--");
		nextLine();
		betterPrint("-1000 Gold, -1000 Happiness, -1000 Population.");
		nextLine();
		betterPrint("Cake: I told you my king! Our people are ruined!");
		nextLine();
	}
	betterPrint("Princess Bubblegum: My King, what have you done?");
	betterPrint("Princess Bubblegum: Every decision you have made has led to our downfall.");
	betterPrint("Princess Bubblegum: Please my king, from now on, think of the people!");
	nextLine();
	betterPrint("Princess Bubblegum: My King! At last! I think our savor has come!);
	betterPrint("Princess Bubblegum: King Zues is here! His magic can work wonders! I'll let him in!!!");
	nextLine();
	betterPrint("King Zues: So, you need help! Of course!);
	betterPrint("King Zues: In order for you to get my help, I need all your riches, and objects.");
	betterPrint("King Zues: I will perform a spell that will multiply everything and make your city prosper");
	question = "So, do we have a deal?";
	
	if(askYesOrNo(question))
	{
		betterPrint("-All Gold. -All Objects. -All Population (Except you and Princess Bubblegum)");
		nextLine();
		betterPrint("King Zues: Ha! I lied and destroyed your kingdom!");
		betterPrint("Muhahahahha......Game Over");
	}
	else{
		betterPrint("-All Gold. -All Objects. -All Population (Except you and Princess Bubblegum)");
		nextLine();
		betterPrint("King Zues: Ha! Big Mistake! I will performed a spell and destroyed your kingdom!");
		betterPrint("Muhahahahha......Game Over");
	}
	
	return "Game Over";

	

    }

    /*public boolean askYesOrNo(String question, int wait) throws InterruptedException
    {
       Scanner sc = new Scanner(System.in);
       String input = "";
       System.out.println(question);
       Thread.sleep(wait);
       System.out.print("**\n**[y] TO SAY YES\n"+
                            "**[n] TO SAY NO\n**\n> ");
       while (input == "")
       {
           input = sc.next();//gets user input                                                                                                                                   
           if (!(input.equals("y")||input.equals("n"))){
               input = "";
               System.out.println("That isn't an option try again");
           }
       }
       return input.equals("y");    
   }*/


 public static void main(String[] args){
	Depression d = new Depression();
	try {
	    d.enter(new Teacher());
	    System.out.println("Depression Class");
	} catch (InterruptedException e){
	    System.out.println("Something Broke");
	}
    }
}
