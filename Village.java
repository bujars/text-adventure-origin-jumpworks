import java.util.Scanner;

public class Village implements Location{
    public String getName(){
	return "Tutorial";
    }

    public String enter(Player p) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	String question = "";
	return "Village";
    }

    /*
     * Asks the user a yes or no question and returns true if the user says yes and vice versa
     */
    public boolean askYesOrNo(String question) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	String input = "";
	betterPrint(question);
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
