package chap04.factory;

public abstract class Product {

	protected String owner;
	
	public abstract void use();
	
	public String getOwner(){
		return this.owner;
	}
}