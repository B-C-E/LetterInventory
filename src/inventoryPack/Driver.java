package inventoryPack;

//Sean Yanik
//CS 145
//This driver shows the functionality of the project.
public class Driver {

	//Main (Just printing and calling methods)
	public static void main(String args[]) {	
	System.out.println("Hey! This is the driver for the LetterInventory project.");
	System.out.println("I'll show you some of the basic functionality of the project here, "
			+ "but feel free to mess around with the code yourself.");
	
	System.out.println("I'll create a new LetterInventory from the following sentence:");
	System.out.println("\"I'll create a new LetterInventory from the following sentence:\"");
	LetterInventory myInv = new LetterInventory("I'll create a new"
			+ " LetterInventory from the following sentence:");
	System.out.println("Here it is:");
	System.out.println(myInv.toString());
	System.out.println("I'll now set the values of \'e\', \'l\', \'t\', \'o\' and \'n\' to 1");
	myInv.set('e', 1);
	myInv.set('l', 1);
	myInv.set('t', 1);
	myInv.set('o', 1);
	myInv.set('n', 1);
	System.out.println("Now it's:");
	System.out.println(myInv.toString());
	System.out.println("I'll check if it's empty:");
	System.out.println(myInv.isEmpty());
	System.out.println("I'll check the size:");
	System.out.println(myInv.size());
	System.out.println("And, just to confirm, using String.length(),\n"+myInv.toString() + "\nhas a length of: "
								+ myInv.toString().length());
	System.out.println("I'll add the sentence \"Parrots and Zebrafish\"");
	myInv = myInv.add(new LetterInventory("Parrots and Zebrafish"));
	System.out.println("The inventory is now:");
	System.out.println(myInv.toString());
	System.out.println("And I'll subtract that same sentence:");
	myInv = myInv.subtract(new LetterInventory("Parrots and Zebrafish"));
	System.out.println("And we're back to:");
	System.out.println(myInv.toString());
	System.out.println("I'll now subtract \"abcdefghijklmnopqrstuvwxy & z\" from the Letter Inventory");
	myInv = myInv.subtract(new LetterInventory("abcdefghijklmnopqrstuvwxy & z"));
	System.out.println(myInv.toString());
	System.out.println("And again!");
	myInv = myInv.subtract(new LetterInventory("abcdefghijklmnopqrstuvwxy & z"));
	System.out.println(myInv.toString());
	System.out.println("And again!");
	myInv = myInv.subtract(new LetterInventory("abcdefghijklmnopqrstuvwxy & z"));
	System.out.println(myInv.toString());
	System.out.println("And again!");
	myInv = myInv.subtract(new LetterInventory("abcdefghijklmnopqrstuvwxy & z"));
	System.out.println("The result is: \"" + myInv.toString() + "\"");
	System.out.println("Now, is it empty?");
	System.out.println(myInv.isEmpty());
	System.out.println("And that's about all of the functionality. Thanks for viewing!\n~ Sean");
	}//end of main
	
}//end of Driver
