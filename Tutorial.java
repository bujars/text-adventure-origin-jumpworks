import java.util.Scanner;

public class Tutorial implements Location{
    public String getName(){
	return "Tutorial";
    }

    public String enter(Player p) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	//sc.nextLine() for press enter to continue
	//System.out.println("Princess Bubblegum: Hello new King!");
	betterPrint("Princess Bubblegum: Hello new King!");
	//Thread.sleep(500);
	nextLine();
	//System.out.println("Princess Bubblegum: Im your personal advisor Princess Bubblegum");
	//Thread.sleep(1000);
	betterPrint("Princess Bubblegum: Im your personal advisor Princess Bubblegum");
	nextLine();
	question = "Princess Bubblegum: Are you ready to make a Kingdom?";
	if (askYesOrNo(question)){
	    betterPrint("Princess Bubblegum: Great!");
	} else {
	    betterPrint("Princess Bubblegum: That doesn't sound promissing");
	}
	//Thread.sleep(1000);
	nextLine();
	betterPrint("Princess Bubblegum: Alright to rule your kingdom all you have to do is answer question. Just say yes and no.");
	//Thread.sleep(1500);
	nextLine();
	question = "Princess Bubblegum: You got that?";
	if(askYesOrNo(question)){
	    betterPrint("Princess Bubblegum: Awesome we will start now!");
	} else {
	    betterPrint("Princess Bubblegum: Well you're going to have to anyways.");
	}
	return "Village";
    }

    /**
     * Asks the player a question
     *
     * @param question the question that will be asked
     * @param wait the amount of time to wait between the question and the input options
     * @return true if player says yes, false if player says no
     * @throws InterruptedException if the game is paused and gets interrupted
     */
    public boolean askYesOrNo(String question) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	betterPrint(question);
	//System.out.print("**\n**[y] TO SAY YES\n"+
	//		 "**[n] TO SAY NO\n**\n> ");
	betterPrint("**\n**[y] TO SAY YES\n"+
			 "**[n] TO SAY NO\n**\n> ");
	while (input == ""){
	    input = sc.next();//gets user input
	    if (!(input.equals("y")||input.equals("n"))){
		input = "";
		System.out.println("That isn't an option try again");
	    }
        }
	return input.equals("y");
    }

    public void nextLine() throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	betterPrint("**\n**[ENTER] TO CONTINUE\n**\n>");
	sc.nextLine();
    }

    public void betterPrint(String s) throws InterruptedException{
	String c = "";//c for char
	for (int i = 0; i < s.length();i++){
	    c = s.substring(i, i + 1);
	    if ((i < s.length() - 1) && (c.equals("\\")) && s.substring(i + 1, i + 2) == "n"){
	        System.out.println();
		i++;
	    } else {
		Thread.sleep(25);
		System.out.print(s.substring(i, i + 1));
	    }
	}
	System.out.println("");
    }
    
    public static void main(String[] args){
	Tutorial t = new Tutorial();
	try{
	    t.enter(new Teacher());
	}
	catch(InterruptedException e){
	    System.out.println("Something broke");
	}
	System.out.println("Tutorial main method");
    }
}
