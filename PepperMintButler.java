import java.util.Scanner;

public class PepperMintButler extends HelperClass implements Location{
    public String getName(){
	return "PepperMintButler";
    }
    
    public String enter(Player p) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	int rand = rand(10);
	if (rand == 0){
	    if (askYesorNo("Can if you let me eat some people I will give you money")){
		betterPrint("You'll forget about them in no time");
		betterPrint("Money : +200");
		betterPrint("Population : -10");
	    } else {
		betterPrint("Well alright then");
	    }
	}
	return "next";
    }
    
    public static void main(String[] args){
	Location t = new PepperMintButler();
	try{
	    t.enter(new King());
	}
	catch(InterruptedException e){
	    System.out.println("Something broke");
	}
	System.out.println("Tutorial main method");
    }
} 
