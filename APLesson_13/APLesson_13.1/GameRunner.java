public class GameRunner
{
	
	public static void main(String[]args)
	{
		
		Console test1 = new XBox("XBox");
		Console test2 = new PlayStation("PlayStation");
		GameSystems test3 = new PC("PC");
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		
		//test1.toString();
		//test2.toString();
		//test3.toString();
		
		
	}
	
}