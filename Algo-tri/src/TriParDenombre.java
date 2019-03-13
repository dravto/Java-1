package tri;


public class TriParDenombre {
	
	int countComp;
	int countAdd;
	int borneSup;
	
	public int getCountComp() {
		return countComp;
	}
	
	public int getCountAdd() {
		return countAdd;
	}
	
	public String toString() {
		return "\nCompteur d'affectation = " + this.getCountAdd() + "\nCompteur de Comparaison de cle = " + this.getCountComp();
	}
	
	public TriParDenombre(int borneSup) {
		countComp = 0;
		countAdd = 0;
		this.borneSup = borneSup;
	}
	
	public void triParDenombrement(Element[] tab) {
		int[] tabComptage = new int[borneSup+1];
		int tailleTab = tab.length;
		int x = 0, k = 0;
		
		Element[] tabSave = new Element[tab.length];
		for (Element t : tab) {
			tabSave[k] = new Element(t);
			k++;
		}
		
		for (int i = 0; i < borneSup; i++) {
			tabComptage[i] = 0;
		}
		
		for (int i = 0; i < tailleTab; i++) {
			tabComptage[tab[i].getEntier()]++;
			countAdd++;
		}
		
		for (int i = 0; i < borneSup; i++) {
			k = 0;
			for (int j = 0; j < tabComptage[i]; j++) {
				while (k < tabSave.length && tabSave[k].getEntier() != i)
					k++;
				tab[x].setText(tabSave[k].getText());
				tab[x++].setEntier(i);
				k++;
				countAdd++;
			}
		}
	}
}
