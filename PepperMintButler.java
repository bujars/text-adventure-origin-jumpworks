import java.util.Scanner;

public class PepperMintButler extends HelperClass implements Location{
    public String getName(){
	return "PepperMintButler";
    }
    
    public String enter(Player p) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
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
