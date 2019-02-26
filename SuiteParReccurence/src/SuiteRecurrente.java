
public abstract class SuiteRecurrente {
	private double premierTerme;
	
	public SuiteRecurrente(double premierTerme) {
		setPremierTerme(premierTerme);
	}
	
	
	public double getPremierTerme() {
		return this.premierTerme;
	}
	
	protected void setPremierTerme(double n) {
		this.premierTerme = n;
	}
	
	
	public abstract double suivant(double terme);
	
	public double terme(int n) {
		double tmp = getPremierTerme();
		for (int i = 0; i < n; i++) {
			tmp = suivant(tmp);
		}
		return tmp;
	}

	public double somme(int n) {
		double tmp = 0;
		for (int i = 0; i < n; i++) {
			tmp += terme(i);
		}
		return tmp;
	}
	
	public String toString(int n) {
		return "Au rang n = " + n + 
				", \nOn obtient le terme : " + terme(n) + 
				",\nEt La somme des termes jusqu'a ce rang est : " + somme(n);
	}
}
