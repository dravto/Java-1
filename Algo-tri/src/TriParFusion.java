package tri;


public class TriParFusion {
	int countComp;
	int countAdd;
	
	public int getCountComp() {
		return countComp;
	}
	
	public int getCountAdd() {
		return countAdd;
	}
	
	public String toString() {
		return "\nCompteur d'affectation = " + this.getCountAdd() + "\nCompteur de Comparaison de cle = " + this.getCountComp();
	}
	
	public TriParFusion(Element tab[]) {
		countComp = 0;
		countAdd = 0;
		int longueur = tab.length;
		if (longueur > 0) {
		    triFusion(tab, 0, longueur-1);
		}
	}

	private void triFusion(Element tab[],int deb,int fin) {
		if (deb != fin) {
			int milieu = (fin+deb)/2;
			triFusion(tab, deb, milieu);
			triFusion(tab, milieu+1, fin);
			fusion(tab, deb, milieu, fin);
		}
	}

	private void fusion(Element tab[] ,int deb1 ,int fin1 ,int fin2){
		int deb2 = fin1+1;

		Element tab1[] = new Element[fin1-deb1+1];
		for(int i = deb1; i <= fin1; i++) {
			tab1[i-deb1] = tab[i];
			countAdd++;
		}

		int cpt1 = deb1;
		int cpt2 = deb2;

		for(int i = deb1; i <= fin2; i++) {
			if (cpt1 == deb2) {
				break;
		    }
		    else if (cpt2 == (fin2+1)) {
		    	tab[i] = tab1[cpt1-deb1];
		    	countAdd++;
		        cpt1++;
		    }
		    else if (tab1[cpt1-deb1].getEntier() < tab[cpt2].getEntier()) {
		    	countComp++;
		        tab[i] = tab1[cpt1-deb1];
		        countAdd++;
		        cpt1++;
		    }
		    else {
		    	countComp++;
		    	tab[i] = tab[cpt2];
		    	countAdd++;
		        cpt2++;
		    }
		}
	}
	
	
	
	
	/*
	public static Element[] fusion(Element[] tab1, Element[] tab2, int count) {
		int i = 0 ,j = 0, max = (tab1.length + tab2.length);
		count += 3;
		Element[] tab = new Element[max];
		while (i + j < max) {
			if (i == tab1.length) {
				count++;
				tab[i+j] = tab2[j];
				//System.err.println(tab[i+j]);
				count++;
				j++;
				count++;
			} else if (j == tab2.length) {
				count++;
				tab[i+j] = tab1[i];
				//System.err.println(tab[i+j]);
				count++;
				i++;
				count++;
			} else if (tab1[i].getEntier() < tab2[j].getEntier()) {
				tab[i+j] = tab1[i];	
				//System.err.println(tab[i+j]);
				count++;
				i++;
				count++;
			} else {
				tab[i+j] = tab2[j];
				//System.err.println(tab[i+j]);
				count++;
				j++;
				count++;
			} 
		}
		return tab;
	}
	
	
	
	public static Element[] triParFusion(Element[] tab, int count) {
		
		if (tab.length > 1) {
			int taille = tab.length/2; 
			Element[] tab1 = new Element[taille]; 
			Element[] tab2 = new Element[tab.length - taille]; 
			
			count++;
			System.err.println(taille);
			
			for(int j = 0; j < taille; j++) {
				tab1[j] = tab[j];
				count++;
			}
			triParFusion(tab1, count);
			
			
			for(int j = 0; j < tab2.length; j++) {
				tab2[j] = tab[j + taille];
				count++;
			}
			triParFusion(tab2, count);
			count++;
			
			return fusion(tab1, tab2, count);
		}
		return tab;
	}

	*/
}
