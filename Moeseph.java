import java.util.*;

public class Moeseph extends HelperClass implements Character{
    private ArrayList<Question> questions;
    private boolean askForMoney;
    public Moeseph(){
	questions = new ArrayList<Question>();
	askForMoney = true;
	makeQuestions();
    }

    public void makeQuestions(){
	String question = "Moeseph:Hello my name is Moseph and I always wanted to make a game\n would you spare me some money to make one?";
	int trueDelta = -100;
	int falseDelta = -10;
	String trueLeave = "Oh thank you so much kind King! I will put this money to good use\n **-100 Happiness";
	String falseLeave = "Oh that makes me sad\n **-10 Happiness**";
	Effects et = Effects.MONEY;
	Effects ef = Effects.HAPPINESS;
        questions.add(new Question(question, trueLeave, falseLeave, trueDelta, falseDelta, et, ef));
    }

    public void pickQuestion(Player p) throws InterruptedException{
	if ((askForMoney) && (questions.get(0).askQuestion(p))){
	    //questions.get(0).askQuestion(p);
	    askForMoney = false;
	    String question = "Hello my king I have made a game do you like it?";
	    String trueLeave = "Oh thank you so much kind King!\n **+10 Happiness";
	    String falseLeave = "Oh that makes me sad\n **-20 Happiness**";
	    int trueDelta = 10;
	    int falseDelta = -20;
	    Effects et = Effects.HAPPINESS;
	    Effects ef = Effects.HAPPINESS;
	    questions.add(new Question(question, trueLeave, falseLeave, trueDelta, falseDelta, et, ef));
	    question = "My game is selling well! I would like to offer you some money for helping me start!";
	    trueLeave = "Thank you again kind King!\n **+20 Money";
	    falseLeave = "King you are so kind!\n **10 Happiness**";
	    trueDelta = 20;
	    falseDelta = 10;
	    et = Effects.MONEY;
	    ef = Effects.HAPPINESS;
	    questions.add(new Question(question, trueLeave, falseLeave, trueDelta, falseDelta, et, ef));
	    return;
	}
	int random = (int)(Math.random()*questions.size());
	questions.get(random).askQuestion(p);
	leave(p);
    }
    
    public void enter(Player p) throws InterruptedException{
	betterPrint("A old man enters the court. He seems to be weak and frail. He starts to speak.");
	pickQuestion(p);
    }

    public void leave(Player p) throws InterruptedException{
	betterPrint("Alright bye!");
	nextLine();
    }

    public static void main(String[] args){
	Player p = new King();
	Character c = new Moeseph();
	try{
	    System.out.println(p.toString());
	    c.pickQuestion(p);
	    System.out.println(p.toString());
	} catch(InterruptedException e){
	    System.out.println("Something broke");
	}
    }
}
