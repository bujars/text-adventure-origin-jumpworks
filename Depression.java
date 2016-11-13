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
	
	/*System.out.println("Your Kingdom has failed. You are in a state of Depression.");
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
	
	betterPrint("**Your Kingdom has failed. You Kingdon is in a state of Depression!**");
	nextLine();
	betterPrint("**Lost 1000 Health, 1000 Money, and 1000 Population!");
	nextLine();
	betterPrint("Princess Bubblegum: My King! What did you do to us!");
	betterPrint("Princess Bubblegum: No one believes in your power anymore! You have destroyed much of us!");
	nextLine();
	betterPrint("Princess Bubblegum: Your Highness, Cake has you to see you.");
	betterPrint("Princess Bubblegum: I will let Cake in at once!");
	nextLine();
	betterPrint("Cake: My King to be the great kingdom of OU, we need security."); 
	question = "Cake: Please protect the citzens of OU by giving me 100 gold to bulid a wall.";
	
	if(decideYesOrNo(question))
	{
		/*System.out.println("You have provided 100 gold \n+10 Happiness -100 Money");
		Thread.sleep(1000);
		System.out.println("Thank you my King, Ou is forever in your debt.");
		System.out.print("\n**\n**[enter] TO CONTINUE \n**\n>");
		sc.nextLine();
		Thread.sleep(1000);*/
		betterPrint("-100 Gold, +1000 Happiness.");
		nextLine("**The Great Wall of OU was Built!");
		betterPrint("Cake: Oh My King! Thank You for Everything! Our City will hopefully be saved.");
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
		betterPrint("**OZ has attacked your city!**");
		nextLine();
		betterPrint("-1000 Gold, -1000 Happiness, -1000 Population.");
		nextLine();
		betterPrint("Cake: I told you my king! Our people are ruined!");
		nextLine();
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
