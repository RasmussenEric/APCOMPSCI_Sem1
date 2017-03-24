import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String list)
	{
		loadToys(list);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		//System.out.println(toys);
		for(int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			Toy num = getThatToy(name);
			
			if(num == null)
			{
				
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
				
			}
			else
			{
				num.setCount(num.getCount()+1);
			}
			//System.out.println(toyList);
		}	
	}
	
	public Toy getThatToy(String nm)
	{
		//System.out.println(toyList);
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}		
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		
		int max = Integer.MIN_VALUE;
		
		for(Toy x : toyList)
		{
			
			int checker = x.getCount();
			
			if(max < checker)
			{
				
				max = x.getCount();
				name = x.getName();
				
			}
		
		}
		
		return name;
		
	}
	
	public String getMostFrequentType()
	{
		
		int cars = 0;
		int figures = 0;
		
		for(Toy y : toyList)
		{
			
			String checker = y.getType();
			
			if(checker.equals("Car"))
			{
				
				cars += 1;
			}
			
			if(checker.equals("Action Figure"))
			{
				
				figures += 1;
			}
			
		}

		if(cars > figures)
		{
			
			return "Most Frequent Type of Toy: Cars";
		}
		if(figures > cars)
		{
			
			return "Most Frequent Type of Toy: Action Figures";
		}
		
		return "Equal amounts of Action Figures and Cars";
		
	}
	public String toString()
	{
		
		return "" + toyList + "";
	}
}	