package cycles;
import java.util.Random;

public class Velo {

	private double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;

	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	
	public Velo() {

	}

	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}

	public void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}

	public double getBraquet() {
		return braquet;
	}

	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	public Random getGenAlea() {
		return genAlea;
	}

	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}

	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}

	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}

	public static void main (String[]args) {
		//Velo velo = new Velo(1.2,2.2,"Random");
		//velo.setBraquet(2.2);
		//velo.setDiamRoue(32.0);
		//int Random = velo.setGenAlea(10);
		//System.out.println("La puissance du vélo est de " + velo.getBraquet() + "et" + velo.getDiamRoue() + "et" + velo.getGenAlea());
		Velo velo = new Velo();
		System.out.println(velo);
	}
}
