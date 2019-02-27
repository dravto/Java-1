
public class Tri {
	public static int nb = 10, borneMax = 100;
	public static int count1 = 0,count2 = 0,count3 = 0;
	
	public static void creaTab(Element[] tab) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Element(((int) (Math.random()*borneMax)), ("#" + i));
			/*
			tab[i].setEntier((int) (Math.random()*nb));
			tab[i].setText("#" + i);
			*/
			System.out.println(tab[i].toString());
		}
	}
	
	
	
	public static Element[] copyTab(Element[] tab, Element[] tab2) {
		int i = 0;
		for (Element t : tab) {
			tab2[i] = t;
			i++;
		}
		return tab2;
	}
	
	
	
	public static void triParInsert(Element[] tab, int count) {
		int j;
		Element tmp;
		for (int i = 1; i < tab.length; ++i) {
			tmp = tab[i];
			count++;
			j = i;
			count++;
			while (j > 0 && tab[j-1].getEntier() > tmp.getEntier()) {
				tab[j] = tab[j-1];
				count++;
				j--;
				count++;
			}
			tab[j] = tmp;
			count++;
		}
	}
	
	
	
	
	public static void triParDenombrement(Element[] tab, int borneSup, int count) {
		int[] tabComptage = new int[borneSup+1];
		count++;
		int tailleTab = tab.length -1;
		count++;
		int x = 0;
		count++;
		
		for (int i = 0; i < borneSup; i++) {
			tabComptage[i] = 0;
			count++;
		}
		
		for (int i = 0; i < tailleTab; i++) {
			tabComptage[tab[i].getEntier()]++;
			count++;
		}
		
		for (int i = 0; i < borneSup; i++) {
			for (int j = 0; j < tabComptage[i]; j++) {
				tab[x++].setEntier(i);
				count++;
			}
		}
	}
	
	
	
	
	public static Element[] fusion(Element[] tab1, Element[] tab2, int count) {
		int i = 0 ,j = 0, max = (tab1.length + tab2.length);
		count += 3;
		Element[] tab = new Element[max];
		while (i + j < max) {
			if (i == tab1.length) {
				tab[i+j] = tab2[j];
				count++;
				j++;
				count++;
			} else if (j == tab2.length) {
				tab[i+j] = tab1[i];
				count++;
				i++;
				count++;
			} else if (tab1[i].getEntier() < tab2[j].getEntier()) {
				tab[i+j] = tab1[i];	
				count++;
				i++;
				count++;
			} else if (tab1[i].getEntier() >= tab2[j].getEntier()) {
				tab[i+j] = tab2[j];
				count++;
				j++;
				count++;
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
	
	
	
	public static Element[] triParFusion(Element[] tab, int count) {
		if (tab.length > 1) {
			int taille = tab.length/2; 
			count++;
			System.err.println(taille);
			Element[] tab1 = new Element[taille]; 
			for(int j = 0; j < taille; j++) {
				tab1[j] = tab[j];
				count++;
			}
			triParFusion(tab1, count);
			
			Element[] tab2 = new Element[tab.length - taille]; 
			for(int j = 0; j < tab2.length; j++) {
				tab2[j] = tab[j + taille];
				count++;
			}
			triParFusion(tab2, count);
			
			tab = fusion(tab1, tab2, count);
			count++;
		}
		return tab;
	}

	
	
	public static void main(String[] args) {
		Element[] tab = new Element[nb];
		Element[] tab1 = new Element[nb];
		Element[] tab2 = new Element[nb];
		Element[] tab3 = new Element[nb];
		
		creaTab(tab);
		tab1 = copyTab(tab, tab1);
		tab2 = copyTab(tab, tab2);
		tab3 = copyTab(tab, tab3);
		
		triParInsert(tab1, count1);
		triParFusion(tab2, count2);
		triParDenombrement(tab3, nb, count3);
		
		
		System.out.println();
		
		for (int i = 0; i < tab1.length; i++) {
			System.out.println(tab1[i].toString());
		}
		System.out.println(count1);
		System.out.println();
		
		for (int i = 0; i < tab2.length; i++) {
			System.out.println(tab2[i].toString());
		}
		System.out.println(count2);
		System.out.println();
		
		for (int i = 0; i < tab3.length; i++) {
			System.out.println(tab3[i].toString());
		}
		System.out.println(count3);
	}
}
