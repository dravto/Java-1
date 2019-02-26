
public abstract class Ouvrage {
	private static int nbLivre = 0; 
	private int cote;
	private int dateJ;
	private int dateM;
	private int dateA;
	
	protected Ouvrage() {
		nbLivre++;
		setCote(nbLivre);
		setDate(-1, -1, -1);
	}
	
	protected Ouvrage(int j, int m, int a) {
		nbLivre++;
		setCote(nbLivre);
		setDate(j, m, a);
	}
	
	
	
	
	protected String getDate() {
		if (dateJ == -1 || dateM == -1 || dateA == -1) 
			return "n'est pas enprunter.";
		return "est enprunter depuis le " + dateJ + "/" + dateM + "/" + dateA + ".";
	}
	
	protected int getCote() {
		return cote;
	}
	
	protected int getDateJ() {
		return dateJ;
	}
	
	protected int getDateM() {
		return dateM;
	}
	
	protected int getDateA() {
		return dateA;
	}
	
	
	
	
	protected void setCote(int c) {
		cote = c;
	}
	
	protected void setDate(int j, int m, int a) {
		dateJ = j; 
		dateM = m;
		dateA = a;
	}
	
	
	
	
	public String toString() {
		return getDate() + " Sont numero de cote est : " + getCote() + ".";
	}
}
