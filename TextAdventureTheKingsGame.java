public class TextAdventureTheKingsGame{
    public static void main(String[] args) throws InterruptedException{
	Game g = new TheKingsGame();
	Engine e = new AdvancedEngine(g);
	e.start();
	while(!e.isGameDone()){
	    e.goToNextState();
	}
    }
}
