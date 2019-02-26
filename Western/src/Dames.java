
public class Dames extends Humain {
	private String couleurRobe;
	private boolean captive;
	
	
	/// Constructeur
	
	
	public Dames(String nom, String prenom, String boisson, String couleurRobe, boolean captive) {
		super(nom, prenom, boisson);
		this.couleurRobe = couleurRobe;
		this.captive = captive;
	}
	
	public Dames(String nom, String prenom, String boisson, String couleurRobe) {
		super(nom, prenom, boisson);
		this.couleurRobe = couleurRobe;
		this.captive = false;
	}
	public Dames(String nom, String prenom, String couleurRobe, boolean captive) {
		super(nom, prenom, "lait");
		this.couleurRobe = couleurRobe;
		this.captive = captive;
	}
	
	public Dames(String nom, String prenom, String couleurRobe) {
		super(nom, prenom, "lait");
		this.couleurRobe = couleurRobe;
		this.captive = false;
	}
	
	public Dames(String nom, String prenom) {
		super(nom, prenom, "lait");
		this.couleurRobe = "Rose";
		this.captive = false;
	}

	
	/// Getter
	
	
	public String getCouleurRobe() {
		return couleurRobe;
	}
	
	public boolean getCaptive() {
		return captive;
	}
	
	public String getNomComplet() {
		return "Miss " + super.getNomComplet();
	}
	
	
	/// Setter
	
	
	protected void setCouleurRobe(String couleurRobe){
		this.couleurRobe = couleurRobe;
	}
	
	protected void setCaptive(boolean captive) {
		this.captive = captive;
	}
	
	
	/// Methode
	
	public void presentation() {
		super.presentation();
		this.newRobe(this.getCouleurRobe());
	}
	
	protected void kidnapper() {
		this.setCaptive(true);
		super.parler("Aaaaaaa L'aideeeee !!");
	}
	
	protected void libere() {
		this.setCaptive(false);
		super.parler("Merci chere CowBoy !");
	}
	
	public void newRobe(String couleurRobe) {
		this.setCouleurRobe(couleurRobe);
		super.parler("Regardez ma nouvelle robe " + this.getCouleurRobe() + " !");
	}
}
