
public class Histoire {

	public static void main(String[] args) {
		Brigands a = new Brigands("Jean", "Jaque", "la biere");
		Barman p = new Barman("LeDur", "Igor");
		Dames c = new Dames("Rose","Diccla");
		Dames d = new Dames("Alice","Diccla","Bleu");
		Dames e = new Dames("Nea","Ridle","Rouge",true);
		Dames f = new Dames("Lilith","Wardligrim","Tequila","Violet");
		CowBoys b = new CowBoys("Mahmoud", "Rene", "la Vodka froide");
		Sherif s = new Sherif("Gille", "Quilouche");
		
		
		p.presentation();
		a.presentation();
		p.servir(a);

		p.servir(b);
		
		f.newRobe("Verte");
		b.presentation();
		p.servir(c);
		
		d.presentation();
		p.servir(d);
		
		e.presentation();
		p.servir(e);
		
		s.presentation();
		s.rechercher(a);
		
		f.presentation();
		p.servir(f);
		
		b.libere(e);
		c.presentation();
		
		a.kidnappe(f);
		s.coffrer(a);
		
		a.kidnappe(e);
		b.tire(a);
		
		a.kidnappe(d);
		b.libere(d);
		
		b.capture(a);
	}
}
