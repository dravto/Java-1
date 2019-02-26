
public class Tri {
	public static int nb = 10;
	public static int count = 0;
	
	public static void creaTab(Element[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Element(((int) (Math.random()*nb)), ("#" + i));
			/*
			tab[i].setEntier((int) (Math.random()*nb));
			tab[i].setText("#" + i);
			*/
			System.out.println(tab[i].toString());
		}
		
	}
	
	public static void triTabInsert(Element[] tab) {
		int j;
		Element tmp;
		for (int i = 1; i < tab.length; ++i) {
			tmp = tab[i];
			j = i;
			while (j > 0 && tab[j-1].getEntier() > tmp.getEntier()) {
				tab[j] = tab[j-1];
				count++;
				j--;
			}
			tab[j] = tmp;
		}
	}
	
	public static Element[] fusion(Element[] tab1, Element[] tab2) {
		int i = 0,j = 0, max = (tab1.length + tab2.length);
		Element[] tab = new Element[max];
		while (i + j < max) {
			if (i == tab1.length) {
				tab[i+j] = tab2[j];
				j++;
			} else if (j == tab2.length) {
				tab[i+j] = tab1[i];
				i++;
			} else if (tab1[i].getEntier() < tab2[j].getEntier()) {
				tab[i+j] = tab1[i];	
				i++;
			} else if (tab1[i].getEntier() >= tab2[j].getEntier()) {
				tab[i+j] = tab2[j];
				j++;
			} else {
				System.err.println("Fusion error !\n i = " + i + "\n j = " + j + "\n max = " + max);
				break;
			}
		}
		for (int l = 0; l < tab.length; l++) {
			System.err.print(" | " + tab[i].getEntier());
		}
		System.err.print(" |\n");
		return tab;
	}
	
	public static Element[] triTabFusion(Element[] tab) {
		if (tab.length > 1) {
			int taille = tab.length/2; 
			System.err.println(taille);
			Element[] tab1 = new Element[taille]; 
			for(int j = 0; j < taille; j++) {
				tab1[j] = tab[j];
				
			}
			triTabFusion(tab1);
			
			Element[] tab2 = new Element[tab.length - taille]; 
			for(int j = 0; j < tab2.length; j++) {
				tab2[j] = tab[j + taille];
			}
			triTabFusion(tab2);
			
			tab = fusion(tab1, tab2);
		}
		return tab;
	}

	public static void main(String[] args) {
		Element[] tab = new Element[nb];
		creaTab(tab);
		
		triTabFusion(tab);
		
		System.out.println();
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].toString());
		}
		System.out.println();
		System.out.println(count);
	}

}
