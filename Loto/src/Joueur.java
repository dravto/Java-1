public class Joueur {
   
    private int id;
    private int grilleType;
    private int t;
    private int nb;
    private String nomJoueur;
    private Grille g;
   
    public Joueur(int a, int b, int c, int d, String e) {
        id = a;
        grilleType = b;
        t = c;
        nb = d;
        nomJoueur = e;
        if (grilleType == 1) {
            g = new Grille(t, nb);
        } else if (grilleType == 0 ) {
            g = new Grille();
        }
        if (id == 0){
        	g.Alea();
        	g.tri();
        } else {
        	
        }
    }
   
    public void setNumGrille(int i, int j) {
        g.setTab(i, j);
    }
    
    public Grille grille() {
    	return g;
    }
    
    public String toString() {
    	return nomJoueur + " : " + g.toString();
    }
    
    public String getName() {
    	return nomJoueur;
    }
    
    public int getVal(int i) {
    	return g.getTab(i);
    }
}
 