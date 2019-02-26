import java.util.Scanner;

public class Tab {
	public static Scanner scan;
	
	public static double entrer() {
		double n = 0;
		try {
			System.out.println("Entrer le coefficient du monome :");
			n = scan.nextDouble();
		} catch (Exception e1) {
			System.out.println("Veuillez entrer un nombre a Virgule !");
			scan.nextLine();
			n = entrer();
			return n;
		} 
		return n;
	}
	
	public static boolean verif(char a) {
		if (a == 'o' || a == 'O' ) {
			return true;
		} else if (a == 'n' || a == 'N' ) {
			return false;
		} else {
			System.out.println("Veuillez entrer 'Oui' ou 'Non' !");
			boolean vald = verif(scan.nextLine().charAt(0));
			return vald;
		}
	}
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int cpt = 0;
		double tab[] = new double[cpt];
		do {
			cpt++;
			double tab2[] = new double[cpt];
			for (int i = 0; i < cpt-1; i++) {
				tab2[i] = tab[i];
			}
			tab = tab2;
			tab[cpt-1] = entrer();
			scan.nextLine();
			System.out.println("Voulez vous continuer ? Oui ou Non");
		} while (verif(scan.nextLine().charAt(0)));
		for (int i = 0; i < cpt; i++) {
			System.out.println(tab[i] +" x^" + i);
		}
	}
}
