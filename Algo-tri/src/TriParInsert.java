package tri;


public class TriParInsert {
	int countComp;
	int countAdd;
	
		
	public TriParInsert() {
		countComp = 0;
		countAdd = 0;
	}
	
	public int getCountComp() {
		return countComp;
	}
	
	public int getCountAdd() {
		return countAdd;
	}
	
	public String toString() {
		return "\nCompteur d'affectation = " + this.getCountAdd() + "\nCompteur de Comparaison de cle = " + this.getCountComp();
	}
	
	public void triParInsert(Element[] tab) {
		int j;
		Element tmp;
		for (int i = 1; i < tab.length; ++i) {
			tmp = tab[i];
			countAdd++;
			j = i;
			while (j > 0 && tab[j-1].getEntier() > tmp.getEntier()) {
				countComp++;
				tab[j] = tab[j-1];
				countAdd++;
				j--;
			}
			tab[j] = tmp;
			countAdd++;
		}
	}
}
