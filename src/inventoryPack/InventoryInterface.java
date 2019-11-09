package inventoryPack;

//B-C-E
//CS 145
//This is a simple interface I used to make sure I fit the assignment specifications.
//Not much to see here, just copied from the assignment page
public interface InventoryInterface {

	
public int get(char letter);

	public void set(char letter, int value);
	
	public int size();
	public boolean isEmpty();
	
	@Override
	public String toString();
	
	public LetterInventory add(LetterInventory other);
	public LetterInventory subtract (LetterInventory other);
	
}//end of InventoryInterface
