
public class Biblio {

	public static void main(String[] args) {
		Ouvrage livre1 = new Livre("Wolf", "comment b***** la police", "FailyV");
		Ouvrage livre2 = new Livre("Garry Green", "La weed MAN", "FailyV");
		Ouvrage CD1 = new Cd("Varvara", "je sais pas chanté");
		Ouvrage CD2 = new Cd("Inconnue", "Comment devenir un Motard, Cd1");
		System.out.println(livre1.toString());
		System.out.println(livre2.toString());
		System.out.println(CD1.toString());
		System.out.println(CD2.toString());
	}

}
