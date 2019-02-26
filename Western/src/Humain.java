
public class Humain {
	private String nom;
	private String prenom;
	private String boisson;
	
	
	/// Constructeur
	
	
	public Humain(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.boisson = "eau";
	}
	
	public Humain(String nom, String prenom, String boisson) {
		this.nom = nom;
		this.prenom = prenom;
		this.boisson = boisson;
	}

	
	/// Getter
	
	
	protected String getNom() {
		return this.nom;
	}
	
	protected String getPrenom() {
		return this.prenom;
	}
	
	protected String getBoisson() {
		return this.boisson;
	}
	
	protected String getNomComplet() {
		return this.nom + " " + this.prenom;
	}
	
	
	/// Setter
	
	
	protected void setNom(String nom) {
		this.nom = nom;
	}
	
	protected void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	protected void setBoisson(String boisson) {
		this.boisson = boisson;
	}
	
	
	/// Methode
	
	
	public void parler(String texte){
		System.out.println("(" + this.getNomComplet() + ") - " + texte);
	}
	
	public void commentaire(String texte) {
		System.out.println(" -- " + texte + " -- ");
	}
	
	public void presentation() {
		this.parler("Bonjour, je me nome " + this.getNomComplet() + ", et ma boisson favorite est de " + this.getBoisson());
	}
	
	public void boire() {
		this.parler("Ah ! un bon verre de " + this.getBoisson() + " ! GLOUPS !");
	}
	

}
