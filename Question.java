public class Question extends HelperClass{
    private String QUESTION;
    private String TRUELEAVE;
    private String FALSELEAVE;
    private int TRUEDELTA;
    private int FALSEDELTA;
    private Effects TRUEEFFECT;
    private Effects FALSEEFFECT;

    public Question(String q,String tl, String fl, int t, int f, Effects te, Effects fe){
	QUESTION = q;
	TRUELEAVE = tl;
	FALSELEAVE = fl;
	TRUEDELTA = t;
	FALSEDELTA = f;
	TRUEEFFECT = te;
	FALSEEFFECT = fe;
    }

    public boolean askQuestion(Player p) throws InterruptedException{
	if (askYesOrNo(QUESTION)){
	    effectTrue(p);
	    return true;
	}else{
	    effectFalse(p);
	    return false;
	}
    }

    public void effectTrue(Player p) throws InterruptedException{
	if (TRUEEFFECT == Effects.POPULATION){
	    p.getInventory().getItem("Population").combine(new Population(TRUEDELTA));
	} else if (TRUEEFFECT == Effects.HEALTH){
	    p.changeHealth(TRUEDELTA);
	} else if (TRUEEFFECT == Effects.MONEY){
	    p.getInventory().getItem("Money").combine(new Money(TRUEDELTA));
	}
	betterPrint(TRUELEAVE);
    }

    public void effectFalse(Player p) throws InterruptedException{
        if (FALSEEFFECT == Effects.POPULATION){
	    p.getInventory().getItem("Population").combine(new Population(FALSEDELTA));
	} else if (FALSEEFFECT == Effects.HEALTH){
	    p.changeHealth(FALSEDELTA);
	} else if (FALSEEFFECT == Effects.MONEY){
	    p.getInventory().getItem("Money").combine(new Money(FALSEDELTA));
	}
	betterPrint(FALSELEAVE);
    }

    public static void main(String[] args){
	Player p = new King();
	Question  q = new Question("Question","yea!","no!", 10, 5, Effects.POPULATION, Effects.MONEY);
	try{
	    System.out.println(p.toString());
	    q.askQuestion(p);
	    System.out.println(p.toString());
	} catch(InterruptedException e){
	    System.out.println("Something broke");
	}
    }
}
