import java.util.Scanner;

public class Village extends AdvancedLocation{
    public String getName(){
	return "Village";
    }

    public String enter(Player p) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	//question = "Hey can I have a money to make a game?"; 
	/*question = "Hey can I have a money to make a game?"; 
	if(askYesOrNo(question)){
	    betterPrint("Yay thanks!");
	    betterPrint("\n**\n**Gained 50 happiness\n**\n>");
	} else {
	    betterPrint("Damn!");
	    betterPrint("\n**\n**Gained 50 happiness\n**\n>");
	}
	}*/
	betterPrint("--OKAY, you will start of with a small village to rule.--");
	//betterPrint("--Your assistant will be Princess Bubblegum.--");
	nextLine();
	betterPrint("Starting off with 100 Gold, 100 Health, 100 Happiness");
	nextLine();
	betterPrint("Princess Bubblegum: Hi, your Highness! With your help, we can grow our tiny village to the greatest kingdom, and become Kingdom OU.");
	nextLine();
	betterPrint("Princess Bubblegum: My King, please always think for the greater good of the people!");
	nextLine();
	betterPrint("-Door Knocks-");
	nextLine();
	betterPrint("Princess Bubblegum: Okay, my king. A villager has come to see us. Let's see what they have to say.");
	betterPrint("Princess Bubblegum: I will let them in at once!");
	nextLine();
	betterPrint("Villager: Hello My King!");
	betterPrint("Villager: I know that you will make us prosper and become the greatest kingdom, and I want to help.");
	betterPrint("Villager: I want to open up a tea shop and start selling, but sadly I don't have enough money.");
	question = "Villager: Can you lend me 10 gold pieces?";
	
	if(askYesOrNo(question))
        {
	    betterPrint("** -10 Gold. +20 Happiness **");
	    nextLine();
	    betterPrint("Villager: Oh my king! We will soon flourish! Thank You!");
	    nextLine();
	}
	else{
	    betterPrint("** -30 Happiness ** ");
	    nextLine();
	    betterPrint("Villager: My king! You are already proving yourself not worthy. I am ashamed.");
	    nextLine();
	}

	betterPrint("** Population Boom. Treasure Found. **");
	betterPrint("** +100 Health, +500 Gold, +1000 Population");
	nextLine();
	return "City";
    }
    
    public static void main(String[] args){
	Village v = new Village();
	try{
	    v.enter(new Teacher());
	}
	catch(InterruptedException e){
	    System.out.println("Something broke");
	}
	System.out.println("Tutorial main method");
    }
}
}