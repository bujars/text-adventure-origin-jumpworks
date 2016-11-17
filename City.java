import java.util.Scanner;

public class City implements Location
{

    private String toContinue = "\n**\n**[enter] TO CONTINUE\n**\n> ";
    
    public String getName()
    {
	return "City";
    }

    public String enter(Player p) throws InterruptedException
    {
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	
	//System.out.println("You Have Leveled Up to a City");
	//Thread.sleep(1000);
	    
	betterPrint("You Have Leveled Up to a City!");
	nextLine();
	
	//System.out.println("Your city has prospered!!!");
	//Thread.sleep(1000);

	betterPrint("Your city has prospered!!!");

	//System.out.println("Gained 100 Health, 100 Money, 100 Population Growth!");
	//Thread.sleep(1000);
	
	betterPrint("Gained 100 Health, 100 Money, 100 Population Growth!");
	nextLine();



	//System.out.print(toContinue);
	//Thread.sleep(1000);
	//sc.nextLine();
	
	//System.out.println("Back To Work Now.");
	//Thread.sleep(1000);
	//Thread.sleep(1000);
	
	betterPrint("Princess Bubblegum: Back To Work Now, Your Magesty!");
	nextLine();

	/*System.out.println("My king! Princess Stern is here!\n");
	Thread.sleep(1000);
	System.out.println("\nPrincess Stern: My King, I've come from my kingdom of Oz!\n");
	Thread.sleep(1000);
	System.out.println("Princess Stern: Our city is failing, birds are attacking, and witches are killing.\n");
	Thread.sleep(1000);
	System.out.println("Can you please lend me 10 gold to buy magic?");
	*/

	betterPrint("Princess Bubblegum: My King! Princess Stern is here!");
	nextLine();
	betterPrint("Princess Stern: My King, I've come from my kingdom of Oz!");
	betterPrint("Princess Stern: Our city is falling. Birds are attacking, and witches are killing.");
	question = ("Princess Stern: Can you please lend me 10 gold to buy magic?");

	/*if(decideYesOrNo(p).equals("y"))
	    {
		System.out.println("You have provided 10 gold!\n+10 Happiness. -10 Money.");
		Thread.sleep(1000);
		System.out.println("\nOh Thank You My King. My Kingdom will forever owe you.");
		System.out.print(toContinue);
		sc.nextLine();
		Thread.sleep(1000);
	    }
	else
	    {
		System.out.println("Your City has lost 50 Happiness");
		Thread.sleep(1000);
		System.out.println("You coward! I hope you burn in hell!");
		Thread.sleep(1000);
		System.out.print(toContinue);
		sc.nextLine();
		Thread.sleep(1000);
	    }
	*/

	
	if(decideYesOrNo(question)){
	    betterPrint("You have provided 10 gold!\n+10 Happiness. -10 Money.");
	    nextLine();
	    betterPrint("Princess Stern: Oh Thank You My fellow King. My Kingdom will forever owe you.");
	    nextLine();
	}
	else{
	    betterPrint("Your City has lost 50 Happiness.");
	    nextLine();
	    betterPrint("Princess Stern: You coward! I hope you burn in hell, along with your city!");
	    nextLine();
	}

	/*System.out.println("Okay. That was a good decision I believe.\n");
	Thread.sleep(1000);
	System.out.println("Now my king, our riches have grown,\nwe need to spend our money to get our people to work.");
	Thread.sleep(1000);
	System.out.println(toContinue);
	sc.nextLine();
	Thread.sleep(1000);
	System.out.println("\n My King, My King, we have an urgent visitor.\n\nI will let them in at once!");
	Thread.sleep(2000);
	System.out.println("Peasant: My King! I am so sorry to come out of no where!\nMy mother is sick! She needs help.\n");
	Thread.sleep(3000);
	System.out.println("I am very poor as you can tell.\nCan you please lend me 50 gold pieces?\n Also,can you get our people to pray for her." );
	*/
	
	betterPrint("Princess Bubblegum: Okay. That was a good decision I believe.\n");
	nextLine();
	betterPrint("Princess Bubblegum: Now my king, our riches have grown.\nPrincess Bubblegum: We need to spend our money to get our people to work.");
	nextLine();
	betterPrint("Princess Bubblegum: My King, My King, we have an urgent visitor.\nPrincess Bubblegum: I will let them in at once!");
	nextLine();
	betterPrint("Peasant: My King! I am so sorry to come out of no where.\nPeasant: My mother is sick! She needs help.");
	question = "Peasant: I am very poor as you can tell.\nPeasant: Can you please lend me 50 gold pieces?\nPeasant: Also, can you get our people to pray for her?";
	
	/*if(decideYesOrNo(p).equals("y"))
	    {
		Thread.sleep(1000);
		System.out.println("Peasant: Thank You so much my king.\nI don't know what I would do without my mother!\nI hope some day I can repay you.\nThank You!");
		Thread.sleep(1000);
		System.out.print(toContinue);
		sc.nextLine();
	    }
	else{
	    System.out.println("Peasant: My Mother will die!\nOne day, us peasants will rule this city.\nYou will regret turning us down!");
	    System.out.println(toContinue);
	    sc.nextLine();
	    }*/
	if(decideYesOrNo(question))
	    {
		betterPrint("+50 Happiness. -50 Money.");
		betterPrint("Peasant: Thank You so much my king!\nPeasant: I don't know what I would do without my mother!\nPeasant: I hope some day I can repay you.\nPeasant: Thank You!");
		nextLine();
	    }
	else
	    {
		betterPrint("Peasant: My mother will die!\nPeasant: One day, us peasants will rule this city.\nPeasant: You will regret turning down our requests!");
		betterPrint("\n-70 Happiness\n");
		nextLine();
	    }


	return "PoorLevel";
    }

    public boolean  decideYesOrNo(String question) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	betterPrint(question);
	betterPrint("**\n**[y] TO SAY YES\n**[n] TO SAY NO\n**\n> ");
	while(input.equals("")){
	    input = sc.next();
	    if (!(input.equals("y") || input.equals("n"))){
		input = "";
		System.out.println("That isn't an option try again");
	    }
         }	   
         return input.equals("y");
    }

    public void nextLine() throws InterruptedException {
	Scanner sc = new Scanner(System.in);
	betterPrint("**\n**[ENTER] TO CONTINUE\n**\n> ");
	sc.nextLine();
    }

    public void betterPrint(String s) throws InterruptedException {
	String c = "";
	for(int i = 0; i < s.length(); i++){
	    c = s.substring(i, i + 1);
	    if((i < s.length() - 1) && (c.equals("\\")) && s.substring(i+1, i+2).equals("n")){
		System.out.println();
		i++;
	    }
	    else{
		Thread.sleep(25);
		System.out.print(s.substring(i, i+1));
	    }
	}
	System.out.println("");
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
