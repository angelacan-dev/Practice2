//program to practice arraylists

import java.util.ArrayList;


public class ToDos {
	
	public static void main(String[] args) {
		
		//Sherlock's todos
		ArrayList<String> sherlocksToDos = new ArrayList<String>();
		
		sherlocksToDos.add("visit the crime scene"); //adding tasks to Sherlocks todos list
		sherlocksToDos.add("play violin");
		sherlocksToDos.add("interview suspects");
		sherlocksToDos.add("solve the case");
		sherlocksToDos.add("apprehend the criminal");
		
		//Poiriot's todos
		ArrayList<String> poirotsToDos = new ArrayList<String>();
		
		poirotsToDos.add("visit the crime scene"); //adding tasks to Poirots todos list
		poirotsToDos.add("interview suspects");
		poirotsToDos.add("let the little grey cells do their work");
		poirotsToDos.add("trim mustache");
		poirotsToDos.add("call all suspects together");
		poirotsToDos.add("reveal the truth of the crime");
		
		//modify sherlocksToDos so that the value at "play violin" becomes "listen to Dr. Watson for amusement"
		sherlocksToDos.set(1,  "listen to Dr. Watson for amusement");
		
		//modify poirotsToDos so that the value at "trim mustache" becomes "listen to Captain Hastings for amusement"
		poirotsToDos.set(3,  "listen to Captain Hastings for amusement");
		
		//print sherlocks and poirots toDoLists
		System.out.println("Sherlock's to-do list:");
		System.out.println(sherlocksToDos.toString() + "\n");
		System.out.println("Poirot's to-do list:");
		System.out.println(poirotsToDos.toString());
		
		
	}

}
