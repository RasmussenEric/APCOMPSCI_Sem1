public class ToyStoreRunner
{
	
	public static void main(String[]args)
	{
		ToyStore test = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
	
		System.out.println(test);
	
		System.out.println(test.getMostFrequentToy());
		System.out.println(test.getMostFrequentType());
		
		
		
		
	}
	
	
	
}