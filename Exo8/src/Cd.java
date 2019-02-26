
public class Cd extends Ouvrage {
	private String auteur;
	private String titre;
	
	
	
	public Cd(String auteur, String titre) {
		super();
		setAuteur(auteur);
		setTitre(titre);
	}
	
	public Cd(String auteur, String titre, int j, int m, int a) {
		super(j, m, a);
		setAuteur(auteur);
		setTitre(titre);
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
	
	
	
	
	public String toString() {
		return "Le Cd " + super.toString() + "\nL'auteur de l'ouvrage est " + this.getAuteur() + ". Le titre de l'ouvrage est " + this.getTitre() + "."; 
	}
}

