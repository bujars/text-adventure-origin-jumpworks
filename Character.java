import java.util.*;

public interface Character{
    public void makeQuestions();
    public void enter(Player p) throws InterruptedException;
    public void pickQuestion(Player p) throws InterruptedException;
    public void leave(Player p) throws InterruptedException;
}
