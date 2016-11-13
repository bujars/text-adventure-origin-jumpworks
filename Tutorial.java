import java.util.Scanner;

public class Tutorial extends AdvancedLocation{
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
