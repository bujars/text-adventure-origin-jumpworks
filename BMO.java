import java.util.*;

public class BMO extends HelperClass implements Character{

    private ArrayList<Question> questions;
    public BMO(){
	questions = new ArrayList<Question>();
	makeQuestions();
    }

    public void makeQuestions(){
	String question = "BMO: I have been on a search for the missing ghost but I need a ghost detector \nBMO: The ghost keeps scaring and stealing peoples souls.\nBMO: Can you please buy me one?";
	String trueLeave = "** -875 Money, 1500 Health. **\n-- BMO busts the ghost down --\nBMO: Thanks King!";
	String falseLeave = "-- Sunlight hits your eyes --** -10 Money, -1000 Health, -20 Population. **\n-- BMO starts flashing his light everywhere --\nBMO: I bow to no King!";
	int trueDelta = -875;
	int falseDelta = -10;
	Effects et = Effects.MONEY;
	Effects ef = Effects.MONEY;
	questions.add(new Question(question, trueLeave, falseLeave, trueDelta, falseDelta, et, ef));
  }
   public void pickQuestion(Player p) throws InterruptedException{
       int random = (int)(Math.random()*questions.size());
       questions.get(random).askQuestion(p);
       leave(p);
   }
    public void enter(Player p) throws InterruptedException{
	betterPrint("-- Next Week --");
	nextLine();
	betterPrint("** +13 Health, and +5 Population! **");
	nextLine();
	betterPrint("Princess Bubblegum: Your Highness!");
	betterPrint("Princess Bubblegum: I hope for the best today.");
	nextLine();
	betterPrint("Princess Bubblegum: Your Highness, someone has come to see you.");
	betterPrint("Princess Bubblegum: I will let them in at once!");
	nextLine();
	pickQuestion(p);
    }
  public void leave(Player p) throws InterruptedException{
      betterPrint("BMO: PEACE ;)");
      nextLine();
  }

  public static void main(String[] args){
      Player p = new King();
      Character c = new BMO();
      try{
	  System.out.println(p.toString());
	  c.enter(p);
	  System.out.println(p.toString());
      } catch(InterruptedException e){
	  System.out.println("Something broke");
      }
  }
}
