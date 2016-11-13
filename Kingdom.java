import java.util.Scanner;

public class Kingdom extends 
{
    public String getName()
    {
	return "Location:";
    }

    public String enter(Player p) throws InterruptedException
    {
    	Scanner sc = new Scanner(System.in);
	System.out.println("You have leveled up to Kingdom");
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
