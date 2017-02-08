public class Car extends Toy{

	
	private String name;
	private int count;
	
	public Car(){
		
		super();
	}
	
	public Car(String n){
		
		super();
	}
	
	public getName(){
	
		return name;
	}
	
	public getCount(){
		
		return count;
	}
	
	public setName(String n){
		
		name = n;
	}
	
	public setCount(int c){
		
		count = c;
	}
	
	public getType(){
		
		return "Car";
	}
	
	public toString(){
		
		return super.toString();
	}