
public class PC extends GameSystems
{
	
	public PC(String p)
	{
		
		super(p);
	}
	
	public String systemInput()
	{
		
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getserialNo() + "\nSystem Input: " + systemInput() + "\n";
	}
	
}