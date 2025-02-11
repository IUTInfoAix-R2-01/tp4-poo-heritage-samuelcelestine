package Person;

public class Persons {

	private String name;
	private String adress;
	
	public Persons(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", adress=" + adress + "]";
	}

}
