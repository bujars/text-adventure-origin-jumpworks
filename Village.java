import java.util.Scanner;

public class Village implements Location{
    public String getName(){
	return "Village";
    }

    public String enter(Player p) throws InterruptedException{
	return "City";
    }

    public static void main(String[] args){
	
    }
}
