import java.util.Scanner;

public  class HelperClass{
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
		Thread.sleep(15);
		return askYesOrNo(question);
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
	    if ((i < s.length() - 1) && (c.equals("\\"))
		&& s.substring(i + 1, i + 2) == "n"){
	        System.out.println();
		i++;
	    } else {
		Thread.sleep(15);
		System.out.print(s.substring(i, i + 1));
	    }
	}
	System.out.println("");
    }

    public int rand(int start, int amount){
	return (int) (Math.random() * amount) + start;
    }

    public static void main(String[] args){
	HelperClass helper = new HelperClass();
	try{
	    for (int i = 0; i < 1000; i++){
		System.out.println(helper.rand(1, 50));
	    }
	    helper.nextLine();
	    if(helper.askYesOrNo("Are you happy?")){
		helper.betterPrint("Great");
	    } else {
		helper.betterPrint("But why?");
	    }
	    helper.nextLine();
	    helper.betterPrint("Today is such a great day!");
	} catch (InterruptedException e){
	    System.out.println("Something broke");
	}
    }
}
