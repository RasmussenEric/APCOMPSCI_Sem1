/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] ranks1 = {"A", "B", "C"};

		String[] suits1 = {"Giraffes", "Lions"};
		
		int[] values1 = {2, 1, 6};
		
		Deck test1 = new Deck(ranks1, suits1, values1);
	
		System.out.println(test1);
		
		
	}
}
