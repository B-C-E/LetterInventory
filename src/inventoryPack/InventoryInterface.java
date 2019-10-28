package inventoryPack;

public interface InventoryInterface {

	
public int get(char letter);

	public void set(char letter, int value);
	
	public int size();
	public boolean isEmpty();
	
	@Override
	public String toString();
	
	public LetterInventory add(LetterInventory other);
	public LetterInventory subtract (LetterInventory other);
	
}
