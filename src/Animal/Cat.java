package Animal;

public class Cat extends Mammal {
	private String name;
	
	public Cat(String name) {
		super(name);
		this.name = name;
	}
	
	public void greets() {
		System.out.println("meow tjr cute");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
}