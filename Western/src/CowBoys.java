
public class CowBoys extends Humain{
	private String look;
	private int popularite;
	
	
	/// Constructeur
	
	
	public CowBoys(String nom, String prenom, String boisson, int popularite) {
		super(nom, prenom, boisson);
		this.look = "vaillant";
		this.popularite = popularite;
	}
	
	public CowBoys(String nom, String prenom, String boisson) {
		super(nom, prenom, boisson);
		this.look = "vaillant";
		this.popularite = 0;
	}
	
	public CowBoys(String nom, String prenom, int popularite) {
		super(nom, prenom, "whisky");
		this.look = "vaillant";
		this.popularite = popularite;
	}
	
	public CowBoys(String nom, String prenom) {
		super(nom, prenom, "whisky");
		this.look = "vaillant";
		this.popularite = 0;
	}

	
	/// Getter
	
	
	public String getLook() {
		return look;
	}
	
	public int getPopularite() {
		return popularite;
	}


	/// Setter
	
	
	protected void setLook(String look) {
		this.look = look;
	}
	
	protected void setPopularite(int popularite) {
		this.popularite = popularite;
	}
	
	
	/// Methode
	
	public void presentation() {
		super.presentation();
		this.parler("Les gens disent de moi que je suis " + this.getLook() + ", et je suis tres populaire, j'ai sauver plus de " + this.getPopularite()*1000 + " personnes !");

	}
	
	public void capture(Brigands mec) {
		mec.parler("Damned, je suis fait ! " + this.getNomComplet() + ", tu m’as eu !");
		for (int i = 0; i < mec.getNbKidnapSincePrison(); i++) {
			if (mec.getTabDames(i).getCaptive() == true) {
				this.libere(mec.getTabDames()[i]);
				this.setPopularite(this.getPopularite() + 1);
			}
		}
		mec.capture();
	}
	
	public void libere(Dames lady) {
		this.parler("Vous êtes libre madame " + lady.getNom());
		lady.libere();
		this.setPopularite(this.getPopularite() + 1);
	}
	
	public void tire(Brigands mec) {
		super.commentaire("Le " + this.getLook() + " "+ this.getNom() + " tire sur " + mec.getNom() + ". PAN !");
		this.parler("Prend ça, crapule !");
	}
	
	
}

