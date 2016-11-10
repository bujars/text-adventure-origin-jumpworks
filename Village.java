import java.util.Scanner;

public class Village extends AdvancedLocation{
    public String getName(){
	return "Tutorial";
    }

    public String enter(Player p) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	question = "Hey can I have a money to make a game?"; 
	if(askYesOrNo(question)){
	    betterPrint("Yay thanks!");
	    betterPrint("\n**\n**Gained 50 happiness\n**\n>");
	} else {
	    betterPrint("Damn!");
	    betterPrint("\n**\n**Gained 50 happiness\n**\n>");
	}
	
	return "Village";
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
