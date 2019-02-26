
public class Fibonachi extends SuiteRecurrente{
	
	private double constante;
	private double preced;
	
	public Fibonachi(double constante, double premierTerme, double deuxiemeTerme) {
		super(premierTerme);
		setConstante(constante);
		setPreced(deuxiemeTerme);
	}
	
	
	public double getConstante() {
		return this.constante;
	}
	
	public double getPreced() {
		return this.preced;
	}
	
	protected void setConstante(double n) {
		this.constante = n;
	}
	
	protected void setPreced(double n) {
		this.preced = n;
	}
	
	
	public double suivant(double terme) {
		double tmp = getPreced()+terme;
		setPreced(terme);
		return tmp;
	}
	
	
	
	public static void main(String[] args) {
		Fibonachi suite = new Fibonachi(25,1,1);
		System.out.println(suite.toString(25-1));
	}
}
