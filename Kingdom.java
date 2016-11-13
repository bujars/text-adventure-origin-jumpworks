import java.util.Scanner;

public class Kingdom extends AdvancedLocation
{
    public String getName()
    {
	return "Location:";
    }

    public String enter(Player p) throws InterruptedException
    {
    	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	
	betterPrint("You have leveled up to Kingdom");
	nextLine();
	betterPrint();
	nextLine();
	betterPrint();
	nextLine();
	betterPrint();
	nextLine();
	betterPrint();
	nextLine();
	betterPrint();
	nextLine();
	System.out.println();
	Thread.sleep(1000);
	System.out.println("You're Kingdom has reached the top");
	Thread.sleep(1000);
	System.out.println();
	Thread.sleep(1000);
	System.out.println();
	Thread.sleep(1000);
	System.out.println();
	Thread.sleep(1000);
	Thread.sleep(1000);
	System.out.println();
	Thread.sleep(1000);
	System.out.println();
	
	if(decideYesOrNo(p).equals("y"))
	{
		System.out.println();
		Thread.sleep(1000);
		System.out.println();
		System.out.print();
		sc.nextLine();
		Thread.sleep(1000);
	}
	else
	{
		System.out.println();
		Thread.sleep(1000);
		System.out.println();
		Thread.sleep(1000);
		System.out.print();
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
