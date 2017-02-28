public class TicketDriver
{
	
	public static void main(String[]args)
	{
		
		Ticket test1 = new Walkup();
		Ticket test2 = new Advance(5);
		Ticket test3 = new Advance(15);
		Ticket test4 = new StudentAdvance();

		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
	
	}
	
}