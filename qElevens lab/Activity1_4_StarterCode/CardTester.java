/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		
		Card King = new Card("King", "Clubs", 13);
		Card Two = new Card("Two", "Diamonds", 2);
		Card Five = new Card("Five", "Diamonds", 5);
		Card test = new Card("Two", "Diamonds", 2);
		
		System.out.println(King);
		System.out.println(Two);
		System.out.println(Five);
		
		if(Two.matches(test) == true)
		{
			System.out.println("Match");
		}
		else
		{
			System.out.println("Different");
		}
		
	}
}
