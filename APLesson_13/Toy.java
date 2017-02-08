public class Toy{

	
	private String name;
	private int count;
	
	public Toy(){
		this.name = "";
		this.count = 1;
		
	}
	
	public Toy(String n){
		this.name = n;
		this.count = 1;
	}
	
	public getName(){
		return name;
	}
	
	public getCount(){
		return count;
	}
	
	public setName(){
		name = n;
	}
	
	public setCount(){
		count = c;
	}
	
	public abstract getType(){
		
	}
	
	public toString(){
		
		return "" + name + "" + count;
	}
}