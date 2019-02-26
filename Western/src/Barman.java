public class Barman extends Humain{
	private String nomDuBar;

	
	/// Constructeur
	
	
	public Barman(String nom, String prenom, String nomDuBar) {
		super(nom, prenom, "le Vin");
		this.nomDuBar = nomDuBar;
	}
	
	public Barman(String nom, String prenom) {
		super(nom, prenom, "le Vin");
		this.nomDuBar = nom;
	}	
	
	public Barman(String nom, String prenom, String boisson, String nomDuBar) {
		super(nom, prenom, boisson);
		this.nomDuBar = nomDuBar;
	}

	
	/// Getter
	
	
	public String getNomDuBar() {
		return "Chez " + nomDuBar;
	}

	
	/// Setter
	
	
	public void setNomDuBar(String nom) {
		this.nomDuBar = nom;
	}

	
	/// Methode
	
	
	public void parler(String texte) {
		super.parler(texte + " Coco.");
	}
	
	
	public void presentation() {
		super.presentation();
		this.parler("Mon Bar est " + this.getNomDuBar());
	}
	
	public void servir(Humain perso) {
		super.commentaire(this.getNom() + " sert " + perso.getBoisson() + " a " + perso.getNomComplet());
		perso.boire();
	}
	

}
