
public class GameSystems
{

	private String platform;
	private int serialNo;
	
	public GameSystems()
	{
		
		platform = "";
		serialNo = 0;
	}
	
	public GameSystems(String p)
	{
		
		platform = p;
		serialNo = (int)(Math.random() * 1000000) + 1;
	}
	
	public String getPlatform()
	{
		
		return platform;
	}
	
	public int getserialNo()
	{
		
		return serialNo;
	}
	
	


}