public class Question extends HelperClass{
    private String QUESTION;
    private int TRUEDELTA;
    private int FALSEDELTA;
    private Effects TRUEEFFECT;
    private Effects FALSEEFFECT;
    
    public Question(String q, int t, int f, Effects te, Effects fe){
	QUESTION = q;
	TRUEDELTA = t;
	FALSEDELTA = f;
	TRUEEFFECT = te;
	FALSEEFFECT = fe;
    }

    public void askQuestion(Player p) throws InterruptedException{
	if (askYesOrNo(QUESTION)){
	    effectTrue(p);
	}else{
	    effectFalse(p);
	}
    }

    public void effectTrue(Player p){
	if (TRUEEFFECT == Effects.POPULATION){
	    p.getInventory().getItem("Population").combine(new Population(TRUEDELTA));
	} else if (TRUEEFFECT == Effects.HEALTH){
	    p.changeHealth(TRUEDELTA);
	} else if (TRUEEFFECT == Effects.MONEY){
	    p.getInventory().getItem("Money").combine(new Money(TRUEDELTA));
	}
    }

    public void effectFalse(Player p){
        if (FALSEEFFECT == Effects.POPULATION){
	    p.getInventory().getItem("Population").combine(new Population(FALSEDELTA));
	} else if (FALSEEFFECT == Effects.HEALTH){
	    p.changeHealth(FALSEDELTA);
	} else if (FALSEEFFECT == Effects.MONEY){
	    p.getInventory().getItem("Money").combine(new Money(FALSEDELTA));
	}
    }

    public static void main(String[] args){
	Player p = new King();
	Question  q = new Question("Question", 10, 5, Effects.POPULATION, Effects.MONEY);
	try{
	    System.out.println(p.toString());
	    q.askQuestion(p);
	    System.out.println(p.toString());
	} catch(InterruptedException e){
	    System.out.println("Something broke");
	}
    }
}
