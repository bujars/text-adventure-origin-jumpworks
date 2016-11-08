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
	System.out.println("Princess Bubblegum: Hello new King!");
	Thread.sleep(500);
	System.out.println("Princess Bubblegum: Im your personal advisor Princess Bubblegum");
	Thread.sleep(1000);
	question = "Princess Bubblegum: Are you ready to make a Kingdom?";
	if (askYesOrNo(question, 1000)){
	    System.out.println("Princess Bubblegum: Great!");
	} else {
	    System.out.println("Princess Bubblegum: That doesn't sound promissing");
	}
	Thread.sleep(1000);
	System.out.println("Princess Bubblegum: Alright to rule your kingdom all you have to do is answer question. Just say yes and no.");
	Thread.sleep(1500);
	question = "Princess Bubblegum: You got that?";
	if(askYesOrNo(question, 500)){
	    System.out.println("Princess Bubblegum: Awesome we will start now!");
	} else {
	    System.out.println("Princess Bubblegum: Well you're going to have to anyways.");
	}
	return "Village";
    }

    /*
     * Asks the user a yes or no question and returns true if the user says yes and vice versa
     */
    public boolean askYesOrNo(String question, int wait) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	System.out.println(question);
	Thread.sleep(wait);
	System.out.print("**\n**[y] TO SAY YES\n"+
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
