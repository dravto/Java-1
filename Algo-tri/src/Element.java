
public class Element {
	private int entier;
	private String text;
		
	public Element(int i, String string){
		entier = i;
		text = string;
	}
		
	public int getEntier() {
		return entier;
	}
	
	public String getText() {
		return text;
	}
	
	public void setEntier(int i) {
		entier = i;
	}
	
	public void setText(String string) {
		text = string;
	}
	
	public String toString() {
		return "Cle : " + getEntier() + "; Contenu : " + getText();
	}
}
