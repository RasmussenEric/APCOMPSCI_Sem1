public class Sing1
{
	public static void main(String[]args)
	{
		String word1 = "Na";
		String word2 = "Na";
		String word3 = "Hey";
		String word4 = "Goodbye!";
		
		double repeat1 = 4;
		double repeat2 = 4;
		double repeat3 = 3;
		double repeat4 = 1;
		
		sing(word1, repeat1);
		sing(word2, repeat2);
		sing(word3, repeat3);
		sing(word4, repeat4);
		
	}
	public static void sing(String word, double repeat)
	{
		double x = 1;
		for(x=1; x<=repeat; x++)
		{
			System.out.println(word);
			
		}
		
		
	}
}