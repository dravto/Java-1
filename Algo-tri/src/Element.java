package tri;


public class Element {
	private int entier;
	private String text;
		
	public Element(int i, String string){
		entier = i;
		text = string;
	}
	
	public Element(){
		entier = 0;
		text = " ";
 	}
	
	public Element(Element e){
		this.setElement(e);
 	}
		
	public int getEntier() {
		return entier;
	}
	
	public String getText() {
		return text;
	}
	
	public void setElement(Element e) {
		this.setEntier(e.getEntier());
		this.setText(e.getText());
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
