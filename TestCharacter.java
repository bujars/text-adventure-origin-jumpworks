import java.util.*;

public class TestCharacter extends HelperClass implements Character{
    private ArrayList<Question> questions;
    
    public TestCharacter(){
	questions = new ArrayList<Question>();
	makeQuestions();
    }

    public void makeQuestions(){
	String question = "My aides and I made a new vaccine\nWould you like to administrate it to the public?";
	String trueLeave = "Great I will use these funds to help us all";
	String falseLeave = "Our population will go down from this \n **-100 population**";
	int trueDelta = -1000;
	int falseDelta = -100;
	Effects et = Effects.MONEY;
	Effects ef = Effects.POPULATION;
	questions.add(new Question(question, trueLeave, falseLeave, trueDelta, falseDelta, et, ef));
	question = "I have made a potion that makes increases the health of people\n but I have not tested it yet\n do you want to use it?";
	falseLeave = "Great I will test it on a few people \n **+10 Health **";
	trueLeave = "Awww\n **-5 Happiness**";
	trueDelta = 10;
	falseDelta = -5;
	et = Effects.HEALTH;
	ef = Effects.HAPPINESS;
	questions.add(new Question(question, trueLeave, falseLeave, trueDelta, falseDelta, et, ef));
    }

    public void pickQuestion(Player p) throws InterruptedException{
	int random = (int)(Math.random()*questions.size());
	questions.get(random).askQuestion(p);
	leave(p);
    }
    
    public void enter(Player p) throws InterruptedException{
	betterPrint("Hello my king I am the medical docotor here");
	pickQuestion(p);
    }

    public void leave(Player p) throws InterruptedException{
	betterPrint("Alright bye!");
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
