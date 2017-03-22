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
		String[] ar = ts.split(",");
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ar));
		//System.out.println("Check1");
		//System.out.println(toys.size());

		for(int i = 0; i < (toys.size() - 1) ; i += 2)
		{
			
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			//System.out.println(type);
			
			Toy num = getThatToy(name);
			
			if(getThatToy(name) == null)
			{
				
				if(type.equals("Car"))
				{
					
					toys.add("Car");
					System.out.println("Car");
					
				}
				
				if(type.equals("AF"))
				{
					toys.add("AF");
					System.out.println("AF");
					
				}
				//System.out.println("Check loop");
			}
			else
			{
				int c = num.getCount();
			
				c += 1;	
				
				num.setCount(c);
			}
			
			//System.out.println("Done Loading");
		}	
	}
	
	public Toy getThatToy(String nm)
	{
		
		String test = nm;
		
		//System.out.println(test);
		
		//System.out.println(toyList.size());
		
		for(Toy t : toyList)
		{
			
			String Checker = t.getName();
			System.out.println(Checker);
			System.out.println(test);
			
			if(Checker == test)
			{
				System.out.println("Check t");
				return t;
			}
			
			
		}
		
		//System.out.println("Check null");
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
		
		//System.out.println("Check3");
		
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
			
			if(checker.equals("AF"))
			{
				
				figures += 1;
			}
			
		}
		
		//System.out.println(cars);
		//System.out.println(figures);
		
		if(cars > figures)
		{
			//System.out.println("Check4");
			
			return "Most Frequent Type of Toy: Cars";
		}
		if(figures > cars)
		{
			//System.out.println("Check4");
			
			return "Most Frequent Type of Toy: Action Figures";
		}
		
		//System.out.println("Check4");
		
		return "Equal amounts of action figures and cars";
		
	}
	public String toString()
	{
		
		return "" + toyList + "";
	}
}	