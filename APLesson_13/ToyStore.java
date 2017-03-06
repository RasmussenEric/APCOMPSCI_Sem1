import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		
		loadToys();
	}
	
	public ToyStore(String list)
	{
		
		loadToys(list);
	}
	
	public void loadToys(String ts)
	{
		String[] ar = ts.split(", ");
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ar));
		
		for(int i = 0; i < toys.size(); i++)
		{
			
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			Toy num = new ToyStore(getThatToy(name));
			
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
				
			}
			else
			{
				
				num.getCount() = num.getCount() + 1;
			}
		}	
	}
	
	public Object getThatToy(String nm)
	{
		
		for(Toy t : toyList)
		{
			
			if(t.getName() == nm)
			{
				
				return t;
			}
			else
			{
			
				return null;
			}
		}
	}
	
	public String getMostFrequentToy()
	{
		//Toy x = new Toy();
		
		String name;
		
		int max = Integer.MIN_VALUE;
		
		for(Toy x : toyList)
		{
			if(max < x.getCount() || max == x.getCount())
			{
				
				return x.getName();
			}
			if(name == x.getName())
			{
				
				return x.getName();
			}
			
		}
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
			
			return "Cars";
		}
		if(figures > cars)
		{
			
			return "Action Figures";
		}
		else
		{
		
			return "Equal amounts of action figures and cars";
		}
	}
	public String toString()
	{
		
		return "" + toyList;
	}
}	
	
