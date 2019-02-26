public class Grille {
 
    private int t;
    private int nb;
    private int[] tab;
    private int[] tabalea;
    private String text;
    public int tGrille = 6;
    public int maxNb = 49;
   
    public Grille() {
        t = tGrille;
        nb = maxNb;
        tab = new int[t];
        tabalea = new int[t];
    }
   
    public Grille(int n, int m) {
        t = n;
        nb = m;
        tab = new int[t];
        tabalea = new int[t];
    }
   
    public Grille(Grille g) {
        t = g.getTaille();
        nb = g.getNb();
        tab = new int[t];
        for (int i = 0; i < t; i++) {
        	tab[i] = g.tab[i];
        	tabalea[i] = g.tabalea[i];
        }
    }
   
    //accesseurs
   
    public int getTaille() {
        return t;
    }
   
    public int getNb() {
        return nb;
    }
   
    public int[] getTab() {
        return tab;
    }
   
    public int getTab(int n) {
        return tab[n];
    }
   
    public void setTab(int[] j) {
        for (int i = 0; i < getTaille(); i++) {
            tab[i] = j[i];
            tabalea[i] = j[i];
        }
    }
   
    public void setTab(int i,int j) {
        tab[i] = j;
        tabalea[i] = j;
    }
   
    // Autre
   
    public void Alea() {
    	boolean check = false; 
        for (int i = 0; i < getTaille(); i++) {
            int valTab = (int)(Math.random()*getNb())+1;
            for(int j = 0; j < i; j++) {
            	if (check == true) {
            		j = 0;
            		check = false;
            	}
            	if (valTab == tab[j]) {
            		check = true;
            		valTab = (int)(Math.random()*getNb())+1;
            	}
            }
            tab[i] = valTab;
            tabalea[i] = valTab;
        }
    }
   
    public int CompareGrille(Grille g) {
        if (getTaille() != g.getTaille() || getNb() != g.getNb() ) {
            return -1;
        }
        tri();
        int counter = 0;
        for (int i = 0; i < getTaille(); i++) {
        	for (int j = 0; j < getTaille(); j++) {
        		if (tab[i] == g.tab[j]) {
        			counter++;
            	}
            }
        }
        return counter;
    }
   
    public String toString() {
    	text = "" + tabalea[0];
        for(int i = 1; i < t; i++) {
            text = text + " " + tabalea[i];
        }
        return text;
    }
   
    public void tri() {
    	int iFin = getTaille()-1;
        while (iFin > 0) {
           int iMax = 0;
           int iCourant = 1;
           while (iCourant <= iFin) {
        	   if (tab[iCourant] > tab[iMax]) {
        		   iMax = iCourant;
        	   }
        	   iCourant++;
           }
           int valMax = tab[iMax];
           tab[iMax] = tab[iFin];
           tab[iFin] = valMax;
           iFin--;
        }
    }
}