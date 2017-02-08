import java.util.ArrayList;

public ToyStore{

	ToyStore List = new ToyStore;
	ArrayList<String> ts = new ArrayList<String>();
	
	public ToyStore{
		
		ts = "";
	}
	
	public ToyStore(String t){
		
		ts = t;
	}
	
	public loadToys(String ts){
		
		ArrayList<String> toys = ts.split(",");
		
		for(i = 0; i < toys.length(); i++){
			
			String name = toys[i];
			String type = toys[i + 1];
			
			Toy 
		}
		
		
	}
	
}