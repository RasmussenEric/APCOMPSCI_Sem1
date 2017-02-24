
public abstract class Console extends GameSystems
{
	
	public Console(String p)
	{
		
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		
		return "Platform: " + super.getPlatform() + "\nSerial #: " + super.getserialNo() + "\nController: " + getController() + "\n";
	}
	
	
	
	
}