public class Human
{
	
	private String hair, eyes, skin;
	
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Human(String H, String E, String S)
	{
		hair = H;
		eyes = E;
		skin = S;
	}
	
	public void setHES(String H, String E, String S)
	{
		hair = H;
		eyes = E;
		skin = S;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
	
	
	
	
}