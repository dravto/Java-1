
public class Brigands extends Humain{
	private String look;
	private int nbDames;
	private int miseAPrix;
	private boolean enPrison;
	private Dames[] tabDames;
	private int nbKidnapSincePrison;
	
	
	/// Constructeur
	
	
	public Brigands(String nom, String prenom, String boisson, int nbDames, int miseAPrix, boolean enPrison) {
		super(nom, prenom, boisson);
		this.look = "mechant";
		this.nbDames = nbDames;
		this.miseAPrix = miseAPrix;
		this.enPrison = enPrison;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom, String boisson, int nbDames, boolean enPrison) {
		super(nom, prenom, boisson);
		this.look = "mechant";
		this.nbDames = nbDames;
		this.miseAPrix = 100;
		this.enPrison = enPrison;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom, int nbDames, int miseAPrix, boolean enPrison) {
		super(nom, prenom, "tord-boyaux");
		this.look = "mechant";
		this.nbDames = nbDames;
		this.miseAPrix = miseAPrix;
		this.enPrison = enPrison;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom, int nbDames, boolean enPrison) {
		super(nom, prenom, "tord-boyaux");
		this.look = "mechant";
		this.nbDames = nbDames;
		this.miseAPrix = 100;
		this.enPrison = enPrison;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom, String boisson, int nbDames, int miseAPrix) {
		super(nom, prenom, boisson);
		this.look = "mechant";
		this.nbDames = nbDames;
		this.miseAPrix = miseAPrix;
		this.enPrison = false;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom, String boisson, int nbDames) {
		super(nom, prenom, boisson);
		this.look = "mechant";
		this.nbDames = nbDames;
		this.miseAPrix = 100;
		this.enPrison = false;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom, int nbDames, int miseAPrix) {
		super(nom, prenom, "tord-boyaux");
		this.look = "mechant";
		this.nbDames = nbDames;
		this.miseAPrix = miseAPrix;
		this.enPrison = false;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom, int nbDames) {
		super(nom, prenom, "tord-boyaux");
		this.look = "mechant";
		this.nbDames = nbDames;
		this.miseAPrix = 100;
		this.enPrison = false;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom, String boisson) {
		super(nom, prenom, boisson);
		this.look = "mechant";
		this.nbDames = 0;
		this.miseAPrix = 100;
		this.enPrison = false;
		this.nbKidnapSincePrison = 0;
	}
	
	public Brigands(String nom, String prenom) {
		super(nom, prenom, "tord-boyaux");
		this.look = "mechant";
		this.nbDames = 0;
		this.miseAPrix = 100;
		this.enPrison = false;
		this.nbKidnapSincePrison = 0;
	}

	
	/// Getter
	
	
	public String getLook() {
		return look;
	}
	
	public int getNbDames() {
		return nbDames;
	}
	
	public int getMiseAPrix() {
		return miseAPrix;
	}
	
	public String getMiseAPrixStr() {
		return this.getMiseAPrix() + "$";
	}
	
	public boolean getEnPrison() {
		return enPrison;
	}
	
	public int getNbKidnapSincePrison() {
		return nbKidnapSincePrison;
	}
	
	public Dames[] getTabDames() {
		return tabDames;
	}
	public Dames getTabDames(int i) {
		return tabDames[i];
	}
	
	public String getNomComplet() {
		return super.getNomComplet() + " le " + this.getLook();
	}
	
	/// Setter
	
	
	protected void setLook(String look) {
		this.look = look;
	}
	
	protected void setNbDames(int nbDames) {
		this.nbDames = nbDames;
	}
	
	protected void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}
	
	protected void setEnPrison(boolean enPrison) {
		this.enPrison = enPrison;
		this.nbKidnapSincePrison = 0;
	}
	
	protected void setNbKidnapSincePrison(int nb) {
		this.nbKidnapSincePrison = nb;
	}
	
	protected void setTabDames(Dames lady) {
		this.setNbKidnapSincePrison(this.getNbKidnapSincePrison() +1);
		Dames[] tabDamesTMP = new Dames[this.getNbKidnapSincePrison()];
		for (int i = 0; i < this.getNbKidnapSincePrison() -1; i++) {
			tabDamesTMP[i] = this.tabDames[i];
		}
		tabDamesTMP[this.getNbKidnapSincePrison() -1] = lady;
		this.tabDames = tabDamesTMP;
		lady.kidnapper();
		this.setNbDames(this.getNbDames()+1);
		
		this.setMiseAPrix(this.getMiseAPrix() + 100);
	}
	
	
	/// Methode
	
	public void presentation() {
		super.presentation();
		parler("Je suis un " + this.getLook() + ", j'ai enlever " + this.getNbDames() + ". La recompence offerte pour ma Tete est de " + this.getMiseAPrixStr());
	}
	
	public void kidnappe(Dames lady) {
		this.parler("Ah ah ! Lady " + lady.getNom() + ", tu es mienne désormais !");
		this.setTabDames(lady);
	}
	
	protected void capture() {
		this.setEnPrison(true);
		super.commentaire(this.getNomComplet() + " c'est enfuit de prison");
		this.setEnPrison(false);
	}
}
