import java.util.*;
public class Finn extends HelperClass implements Character{
    private ArrayList<Question> questions;
    
    public Finn (){
questions = new ArrayList<Question>();
makeQuestions();
    }
    public void makeQuestions(){
String question = "I think it’s the ice king’s shenanigans so Jake and I please go bet his bum bum?";
String trueLeave = "";
String falseLeave = "**The water turned back to normal** ";
int trueDelta = 1000;
int falseDelta = 100;
Effects et = Effects.HEALTH;
Effects ef = Effects.POPULATION;
questions.add(new Question(question, trueLeave, falseLeave, trueDelta, falseDelta, et, ef));
//Another Question
question = "I think it’s the ice king’s shenanigans so Jake and I please go bet his bum bum?";
falseLeave = "--Oh’s citizens all go crazy and destroy everything in it’s path --";
trueLeave = "Awww\n **-5 Health**";
trueDelta = -10;
falseDelta = -50;
et = Effects.HEALTH;
ef = Effects.POPULATION;
questions.add(new Question(question, trueLeave, falseLeave, trueDelta, falseDelta, et, ef));
    }
    public void pickQuestion(Player p) throws InterruptedException{
int random = (int)(Math.random()*questions.size());
questions.get(random).askQuestion(p);
leave(p);
    }
    
    public void enter(Player p) throws InterruptedException{
betterPrint("--Only time can tell what is set in stone--");
nextLine();
betterPrint("Princess Bubblegum: Hello your Highness.");
betterPrint("Princess Bubblegum: The sun is sure shining bright today.");
nextLine();
betterPrint("-Door Knocks-");
betterPrint("Princess Bubblegum: Your Highness, Finn has come to see you.");
betterPrint("Princess Bubblegum: I will let him in at once!");
nextLine();
betterPrint("Finn: Your Majesty the citizens are going all willy nilly");
betterPrint("Finn: So I got to thinking maybe it has to do with the water turning into little icicles ");
    }
    public void leave(Player p) throws InterruptedException{
betterPrint("Thanks, alright bye!");
nextLine();
    }
    public static void main(String[] args){
Player p = new King();
Character c = new TestCharacter();
try{
    System.out.println(p.toString());
    c.pickQuestion(p);
    System.out.println(p.toString());
} catch(InterruptedException e){
    System.out.println("Something broke");
}
    }
}
