import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	public ToyStore()
	{

	}
	public ToyStore(String list)
	{
		
		loadToys(list);
	}
	
	public void loadToys(String ts)
	{
		String[] ar = ts.split(", ");
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ar));
		System.out.println("Check1");
		System.out.println(toys.size());
		
		
		for(int i = 0; i < toys.size(); i =+ 1)
		{
			
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			
			Toy num = getThatToy(name);
			
			if(getThatToy(name) == null)
			{
				
				if(type.equals("Car"))
				{
					
					toys.add("Car");
				
				}
				
				if(type.equals("AF"))
				{
					
					toys.add("AF");
				}
				System.out.println("Check loop");
			}
			else
			{
				int c = num.getCount();
			
				c += 1;	
			}
			
			
		}	
	}
	
	public Toy getThatToy(String nm)
	{
		
		for(Toy t : toyList)
		{
			if(t.getName() == nm)
			{
				System.out.println("Check2");
				return t;
			}
			
			
		}
		System.out.println("Check2");
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		
		int max = Integer.MIN_VALUE;
		
		for(Toy x : toyList)
		{
			
			if(max < x.getCount())
			{
				
				max = x.getCount();
				name = x.getName();
				
			}
		
		}
		
		System.out.println("Check3");
		
		return name;
		
	}
	
	public String getMostFrequentType()
	{
		
		int cars = 0;
		int figures = 0;
		
		for(Toy y : toyList)
		{
			
			if(y.getType() == "Car")
			{
				
				cars += 1;
			}
			
			if(y.getType() == "AF")
			{
				
				figures += 1;
			}
			
		}
		
		if(cars > figures)
		{
			System.out.println("Check4");
			
			return "Cars";
		}
		if(figures > cars)
		{
			System.out.println("Check4");
			
			return "Action Figures";
		}
		
		System.out.println("Check4");
		
		return "Equal amounts of action figures and cars";
		
	}
	public String toString()
	{
		
		return "" + toyList;
	}
}	