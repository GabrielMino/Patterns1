package nivel1;
import java.util.*;

public class Main {
	
	/*
	 
	Singleton
	
	Create a class that replicates the operation of the 'Undo' command. This class will be used by the Main class,
	which will allow console options to be entered.
	The 'Undo' class must save memory of the last commands entered, allowing you to add or remove commands,
	as well as list the last commands entered (similar to the 'history' command in Linux).
	The ‘Undo’ class must necessarily implement a Singleton pattern.
	 
	
	*/


	public static void main(String[] args) {
		
		//Define u object
		Undo u = Undo.getInstance();
		u.addCommand("The");
		u.addCommand("Singletón");
		u.addCommand("patern.");
		//Print the result
		System.out.println("This lesson is about:\n" + u.toString());
		
		//Define another object v
		Undo v = Undo.getInstance();
		//Since the sentence has spelling errors
		//Eliminate the last entry
		v.undoCommand();
		//Rectify the last entry
		v.addCommand("pattern.");
		//Print the result
		System.out.println("The following sentence has been corrected: \n" + v.toString());
		
		
		//Print the result
		System.out.println("We can check that the sentence has also been corrected for the  u object: \n" + v.toString());
		
	}

}
