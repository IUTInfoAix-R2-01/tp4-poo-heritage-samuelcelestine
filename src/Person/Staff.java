package Person;

public class Staff extends Persons {
	
	private String school;
	private double pay;
	
	public Staff(String name, String adress, String school, double pay) {
		super(name,adress);
		this.school = school;
		this.pay = pay;
		
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + ", getAdress()=" + getAdress() + ", getName()=" + getName()
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
