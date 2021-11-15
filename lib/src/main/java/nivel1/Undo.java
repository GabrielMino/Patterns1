package nivel1;
import java.util.*;

public class Undo {
	
	
	private static List<String> history=new ArrayList<>();

	
	private static Undo instance;
	private Undo() {};
	
	public static Undo getInstance(){
		
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
		
	}
	public void addCommand(String command) {
		history.add(command);
	}

	public void undoCommand() {
		history.remove(history.size()-1);
	}
	
	
	public String toString() {
		
		String result ="";
		for(Object a : history) {
			result += a +" ";
		}
		return result;
		
		
	}
	
	
	
}


