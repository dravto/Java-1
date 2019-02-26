
public class Humain {
	private String nom;
	private String prenom;
	private String boisson;
	
	private Humain(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.boisson = "eau";
	}
	
	private Humain(String nom, String prenom, String boisson) {
		this.nom = nom;
		this.prenom = prenom;
		this.boisson = boisson;
	}
	
	/*
	nom
	
	boisson favorite par defaut eau
	
	peut parler avec parle(texte) qui affiche (nom du perso) - texte
	
	peut boire  (il dira "Ah ! un bon verre de (sa boisson favorite) ! GLOUPS !").
	
	peut se presenter (il dit bonjour, son nom, et indique sa boisson favorite)
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
