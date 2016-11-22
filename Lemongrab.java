import java.util.*;

public class Lemongrab extends HelperClass implements Character{


    private ArrayList<Question> questions;
    public Lemongrab(){
	questions = new ArrayList<Question>();
	makeQuestions();
    }
    public void makeQuestions(){
	String question = "Lemongrab: MMMMMM....Can you destroy all peppers in OU Now? They are making me weaker!";
	String trueLeave = "** -1300 Money **\n-- All peppers are banned from OU --**\nLemongrab: Mmmhmmm better.";
	String falseLeave = "-- OU remains the same --\n** +1000 Money **\n-- Lemongrab goes on a rampage --\nLemongrab: THIS IS UNACCEPTABBBBBBBBBLE!!!!!";
	int trueDelta = -1300;
	int falseDelta = 1000;
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
       betterPrint("Princess Bubblegum: Hello your Highness.");
       betterPrint("Princess Bubblegum: The weather outside today is amazing. The sun is high and bright.");
       nextLine();
       betterPrint("-- Door Knocks --");
       nextLine();
       betterPrint("Princess Bubblegum: Your Highness, someone has come to see you.");
       betterPrint("Princess Bubblegum: I will let him in at once!");
       nextLine();
       pickQuestion(p);
   }

   public void leave(Player p) throws InterruptedException{
       betterPrint("Lemongrab: Okay! I’m outty!");
       nextLine();
   }

   public static void main(String[] args){
       Player p = new King();
       Character c = new Lemongrab();
       try{
	   System.out.println(p.toString());
	   c.enter(p);
	   System.out.println(p.toString());
       } catch(InterruptedException e){
	   System.out.println("Something broke");
       }
   }
}
