package tri;

import java.util.*;

public class Tri {
	private static Scanner scan;
	public static int nb = 10, borneMax = 100, mode = 3;
	public static boolean affichage = true, auto = true;
	
	public static void creaTab(Element[] tab, boolean auto) {
		if (auto == true) {
			for (int i = 0; i < tab.length; i++) {
				tab[i] = new Element(((int) (Math.random()*borneMax)), ("#" + i));
				System.out.println(tab[i].toString());
			}
		} else {
			scan = new Scanner(System.in);
			for (int i = 0; i < tab.length; i++) {
				int cle = scan.nextInt();
				tab[i] = new Element(cle, ("#" + i));
			}
			for (int i = 0; i < tab.length; i++) {
				System.out.println(tab[i].toString());
			}
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


	
	public static void main(String[] args) {
		Element[] tab = new Element[nb];

		creaTab(tab, auto);

		switch(mode) {
			case 1:
			TriParInsert tri = new TriParInsert();
			System.out.println();
			tri.triParInsert(tab);
			for (int i = 0; i < tab.length; i++) {
				System.out.println(tab[i].toString());
			}
			System.out.println(tri);
			break;
		
			case 2:
			System.out.println();
			TriParFusion tri1 = new TriParFusion(tab);
			for (int i = 0; i < tab.length; i++) {
				System.out.println(tab[i].toString());
			}
			System.out.println(tri1);
			break;
		
			default:
			TriParDenombre tri2 = new TriParDenombre(borneMax);
			System.out.println();
			tri2.triParDenombrement(tab);
			for (int i = 0; i < tab.length; i++) {
				System.out.println(tab[i].toString());
			}
			System.out.println(tri2);
		}
	}
}
