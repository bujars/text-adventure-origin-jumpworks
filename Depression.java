import java.util.Scanner;
public class Depression implements Location

{
  public String getName()
    {
	return "Location:";
    }

    public String enter(Player p) throws InterruptedException
    {

    	Scanner sc = new Scanner(System.in);

	System.out.println("Your Kingdom has failed. You are in a state of Depression.");

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

	

	if(decideYesOrNo(p).equals("y"))

	{

		System.out.println("You have provided 100 gold \n+10 Happiness -100 Money");

		Thread.sleep(1000);

		System.out.println("Thank you my King, Ou is forever in your debt.");

		System.out.print("\n**\n**[enter] TO CONTINUE \n**\n>");

		sc.nextLine();

		Thread.sleep(1000);

	}

	else

	{

		System.out.println("You Lost 100 Happiness");

		Thread.sleep(1000);

		System.out.println("You're very niave my King, my best wishes to Ou");

		Thread.sleep(1000);

		System.out.print("\n**\n**[enter] TO CONTINUE \n**\n>");

		sc.nextLine();

		Thread.sleep(1000);

	}

	return "";

	

    }

    public boolean askYesOrNo(String question, int wait) throws InterruptedException

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
	    
   }
}
