public class Carte32 {
  private static final String[] numbers = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
  private static final String[] formes = new String[]{"Trefle", "Carreau", "Coeur", "Pique"};

  public Carte32(int n, int f){
    number = numbers[n];
    forme = formes[f];
  }
  public Carte32(String n, String f){
    number = n;
    forme = f;
  }
  public Carte32(){
    number = n;
    forme = f;
  }

  public int getNumber(){
    return number;
  }

  public String getNumberString(){
    return numbers[number];
  }

  public String getFormeString(){
    return formes[forme];
  }

  public int getForme(){
    return forme;
  }

  public String getCouleur(){
    if (getForme() == 0 || getForme() == 3){
      return "Noire";
    } else {
      return "Rouge";
    }
  }

  public void setForme(int f){
    forme = f;
  }

  public void setNumber(int n){
    number = n;
  }

  public int compareTo(Carte carte){
    if (getNumber() < carte.getNumber()){
      return carte.getNumber();
    } else if (getNumber() > carte.getNumber()){
      return getNumber();
    } else {
      return -1;
    }
  }

  public String toString(){
    return "Carte :" + "\nNumero de la carte : " + getNumberString() + "\nForme de la carte : " + getFormeString() + "\nCouleur : " + getCouleur() + "\n";
  }
}
