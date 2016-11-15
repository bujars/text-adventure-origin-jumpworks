import java.util.Scanner;


public class PoorLevel extends City
{
    public String getName()
    {
	return "PoorLevel";
    } 
    public String enter(Player p) throws InterruptedException
    {
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	
	betterPrint("OH NO!");
        nextLine();
	betterPrint("Your Kingdon has fallen! Every decision you made was wrong and has led to our downfall.");
	nextLine();
	betterPrint("Lost 100 Health, 100 Money, 200 Population.");
	nextLine();
	betterPrint("Princess Bubblegum: My King! What have you done!");
	nextLine();
	betterPrint("Princess Bubblegum: We believed that everything you were doing was going to make our city prosper, but instead, it has made us poor!");
	betterPrint("Princess Bubblegum: People are crying, dying, and pleading for help!");
	betterPrint("Princess Bubblegum: I have sent out a message to all kingdoms for help! Hopefully one will help us!");
	nextLine();
	betterPrint("Princess Bubblegum: My King, My King, someone is here to visit, I'll let them in at once!");
	nextLine();
	betterPrint("Middleclass Man: My King, I have come to plead for help.");
	betterPrint("Middleclass Man: A dragon is burning us to the ground! Soon we will all be dead!");
	question = ("Middleclass Man: Can You please lend me some object to defeat it? I know you are full of magical objects!");

	if(decideYesOrNo(question)){
	    betterPrint("You have provided a magic wand.");
	    nextLine();
	    betterPrint("Middleclass Man: Oh my king! Soon we shall have the dragon defeated!");
	    betterPrint("Middleclass Man: The Kingdom will be saved!");
	    nextLine();
	    betterPrint("+100 Happiness");
	    nextLine();
	}
	else{
	    betterPrint("Your Kingdom has lost 100 Happiness. Population Decrease 100.");
	    nextLine();
	    betterPrint("MiddleClass Man: You coward! I hope you burn in hell! You have ruined our kingdom!");
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
	
	if(decideYesOrNo(question)){
	    betterPrint("-100 Happiness. -10 Population.");
	    nextLine();
	    betterPrint("Bujar: Oh No! The spell went wrong! I accidently burned down all of your crops.");
	    betterPrint("Bujar: Well, that's all I got. Hope your find a better savor.");
	    nextLine();
	}
	else{
	    betterPrint("**A hurricane took our part of the city.**");
	    betterPrint("-500 Happiness. -200 Population");
	    nextLine();
	    betterPrint("Bujar: Your people have died and will continue to die from no help!");
	    nextLine();
	}
	return "Game Over";
    }

    public static void main(String[] args){
	PoorLevel p = new PoorLevel();
	try {
	    p.enter(new Teacher());
	    System.out.println("PoorLevel Class");
	} catch (InterruptedException e){
	    System.out.println("Something Broke");
	}
    }
}