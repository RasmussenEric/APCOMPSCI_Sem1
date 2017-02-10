import java.util.ArrayList;

public class ToyStore
{
	
	//ToyStore List = new ToyStore();
	ArrayList<String> toyList = new ArrayList<String>();
	
	public ToyStore()
	{
	
		//loadToys();
	}
	
	public ToyStore(String list)
	{
		
		loadToys(list);
	}
	
	public void loadToys(String ts)
	{
		
		ArrayList<String> toys = ts.split(", ");
		
		for(int i = 0; i < toys.length(); i++)
		{
			
			String name = toys[i];
			String type = toys[i + 1];
			
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
				
				count += 1;
			}
		}	
	}
	
	public String getThatToy(String nm)
	{
		
		for(String t : toyList)
		{
			
			if(t.name == nm)
			{
				
				return toy;
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
			if(max < test.getcount() || max == test.getcount() || name = test.getname())
			{
				
				return Toy.name;
			}
			
		}
	}
	
	public String getMostFrequentType()
	{
		
		int cars = 0;
		int figures = 0;
		
		for(String y : toyList)
		{
			
			if(Toy.type == "Car")
			{
				
				cars += 1;
			}
			
			if(Toy.type == "AF")
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
	
