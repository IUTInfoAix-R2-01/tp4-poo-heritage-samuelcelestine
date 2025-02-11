package Animal;

public class Mammal extends Animals {
	private String name;
	
	public Mammal(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mammal [name=" + name + "]";
	}



}
