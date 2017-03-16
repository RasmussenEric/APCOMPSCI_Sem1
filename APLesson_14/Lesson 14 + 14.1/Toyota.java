public class Toyota extends Car
{

	public Toyota(String sp)
	{
		
		String[] getsplit = sp.split(", ");
		
		location[0] = Double.parseDouble(getsplit[0]);
		location[1] = Double.parseDouble(getsplit[1]);
	}
}