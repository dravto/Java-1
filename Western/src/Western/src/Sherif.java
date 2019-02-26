
public class Sherif extends CowBoys {
	private int nbBrigands;
	

	public Sherif(String nom, String prenom, String boisson, int popularite) {
		super(nom, prenom, boisson, popularite);
		super.setLook("honnêtes");
		this.nbBrigands = 0;
	}
	
	public Sherif(String nom, String prenom, String boisson) {
		super(nom, prenom, boisson);
		super.setLook("honnêtes");
		this.nbBrigands = 0;
	}
	
	public Sherif(String nom, String prenom, int popularite) {
		super(nom, prenom, popularite);
		super.setLook("honnêtes");
		this.nbBrigands = 0;
	}
	
	public Sherif(String nom, String prenom) {
		super(nom, prenom);
		super.setLook("honnêtes");
		this.nbBrigands = 0;
	}
	
	public Sherif(String nom, String prenom, String boisson, int popularite, int nbBrigands) {
		super(nom, prenom, boisson, popularite);
		super.setLook("honnêtes");
		this.nbBrigands = nbBrigands;
	}
	
	
	public Sherif(String nom, String prenom, int popularite, int nbBrigands) {
		super(nom, prenom, popularite);
		super.setLook("honnêtes");
		this.nbBrigands = nbBrigands;
	}
	
	public int getNbBrigands() {
		return this.nbBrigands;
	}
	
	public String getNomComplet() {
		return "Sherif " + super.getNom();
	}
	
	public void setNbBrigands(int nb) {
		this.nbBrigands = nb;
	}

	
	/// Methode
	
	
	public void presentation() {
		super.presentation();
		super.parler("J'ai coffrer plus de " + this.getNbBrigands() + " Brigand !");
	}
	
	public void coffrer(HorsLaLoi mec) {
		super.parler("Au nom de la loi, je vous arrête !");
		super.capture(mec);
		this.setNbBrigands(getNbBrigands() + 1);
	}
	
	public void rechercher(Brigands mec) {
		super.commentaire("Le sherif placarde des affiche dans toute la ville");
		super.parler("OYEZ OYEZ BRAVE GENS ! ! " + mec.getMiseAPrixStr() + " a qui arrêtera " + mec.getNomComplet() + " mort ou vif ! !");
	}

	
	
	
	
	

}
