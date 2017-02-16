import java.util.ArrayList;

public class ToyStore
{
	
	//ToyStore List = new ToyStore();
	ArrayList<String> toyList = new ArrayList<String>();
	
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
		
		ArrayList<String> toys = new ArrayList<String>(ts.split(", "));
		
		for(int i = 0; i < toys.size(); i++)
		{
			
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			Toy temp = new Toy();
			
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
				
				temp.getCount() = temp.getCount() + 1;
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
		Toy test = new Toy();
		
		String name;
		
		int max = Integer.MIN_VALUE;
		
		for(String x : toyList)
		{
			if(max < test.getCount() || max == test.getCount())
			{
				
				return Toy.getName();
			}
			if(name == test.getName())
			{
				
				return Toy.getName();
			}
			
		}
	}
	
	public String getMostFrequentType()
	{
		
		int cars = 0;
		int figures = 0;
		
		for(String y : toyList)
		{
			
			if(Toy.getType() == "Car")
			{
				
				cars += 1;
			}
			
			if(Toy.getType() == "AF")
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
		
		return toyList;
	}
}	
	
