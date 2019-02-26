
public class SuiteGeometrique extends SuiteRecurrente{
	
	private double constante;

	
	public SuiteGeometrique(double constante, double premierTerme) {
		super(premierTerme);
		setConstante(constante);
	}
	
	
	
	public double getConstante() {
		return this.constante;
	}
	
	protected void setConstante(double n) {
		this.constante = n;
	}
	
	public double suivant(double terme) {
		return terme*getConstante();
	}
	
	
	
	public static void main(String[] args) {
		SuiteGeometrique suite = new SuiteGeometrique(25,1);
		System.out.println(suite.toString(25));
	}
}
