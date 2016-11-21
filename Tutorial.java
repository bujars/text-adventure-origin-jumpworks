import java.util.Scanner;

public class Tutorial extends HelperClass implements Location{
    public String getName(){
	return "Tutorial";
    }
    
    public String enter(Player p) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	betterPrint("Princess Bubblegum: Hello new King!");
	nextLine();
	betterPrint("Princess Bubblegum: I am your personal advisor, Princess Bubblegum.");
	nextLine();
	question = "Princess Bubblegum: Are you ready to build up a Kingdom?";
	if (askYesOrNo(question)){
	    betterPrint("Princess Bubblegum: Great!");
	} else {
	    betterPrint("Princess Bubblegum: That doesn't sound promissing.");
	}
	nextLine();
	betterPrint("Princess Bubblegum: Alright to rule your kingdom all you have to do is answer questions. Just say yes and no.");
	nextLine();
	question = "Princess Bubblegum: You got that?";
	if(askYesOrNo(question)){
	    betterPrint("Princess Bubblegum: Awesome we will start now!");
	} else {
	    betterPrint("Princess Bubblegum: Well you're going to have to anyways.");
	}
	return "Village";
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
