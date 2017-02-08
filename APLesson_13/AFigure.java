public class AFigure extends Toy{

	
	private String name;
	private int count;
	
	public AFigure(){
		
		super();
	}
	
	public AFigure(String n){
		
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
		
		return "Action Figure";
	}
	
	public toString(){
		
		return super.toString();
	}
	
	
}