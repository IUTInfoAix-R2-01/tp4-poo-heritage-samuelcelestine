package Animal;

public class Dog extends Mammal {
	private String name;
	
	public Dog(String name) {
		super(name);
		this.name = name;
	}
	public void greets() {
		System.out.println("woof tjr fort");
	}
}