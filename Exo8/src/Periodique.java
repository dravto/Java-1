
public class Periodique extends Ouvrage {
	private String auteur;
	private String titre;
	private String editeur;
	
	
	
	public Periodique(String auteur, String titre, String editeur) {
		super();
		setAuteur(auteur);
		setTitre(titre);
		setEditeur(editeur);
	}
	
	public Periodique(String auteur, String titre, String editeur, int j, int m, int a) {
		super(j, m, a);
		setAuteur(auteur);
		setTitre(titre);
		setEditeur(editeur);
	}
	
	
	
	public String getAuteur() {
		return auteur;
	}
	
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getEditeur() {
		return editeur;
	}
	
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	
	
	
	public String toString() {
		return "Le periodique " + super.toString() + "\nL'auteur de l'ouvrage est " + this.getAuteur() + ". Le titre de l'ouvrage est " + this.getTitre() + ". L'editeur est " + this.getEditeur() + "."; 
	}
}


