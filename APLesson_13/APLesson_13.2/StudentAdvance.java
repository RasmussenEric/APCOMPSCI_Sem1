public class StudentAdvance extends Advance
{
	
	public int getPrice()
	{
		
		return (super.getPrice()/2);
	}
	
	public String toString()
	{
		
		return "Serial #: " + super.getSerialNo() + "\nPrice: " + getPrice() + " dollars \n*STUDENT ID REQUIRED*"; 
	}
}