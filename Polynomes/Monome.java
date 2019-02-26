import java.util.*;

public class Monome{
  private double coeff;
  private int exposant;

  public Monome() {
    setCoeff(lireCoeff());
    setExposant(lireExpo());
  }

  public Monome(double c, int e) {
    setCoeff(c);
    setExposant(e);
  }

  public Monome(Monome m) {
    setCoeff(m.getCoeff());
    setExposant(m.getExposant());
  }

  public double getCoeff(){
    return coeff;
  }

  public int getExposant(){
    return exposant;
  }

  public void setCoeff(double c){
    coeff = c;
  }

  public void setExposant(int e){
    exposant = e;
  }

  public double lireCoeff(){
    try {
      Scanner scan = new Scanner(System.in);
      System.out.println("Entrer un coeff : ");
      return scan.nextDouble();
    } catch (Exception e){
      System.out.println("une erreur est survenue, merci de recommencer ...");
      return lireCoeff();
    }
  }

  public int lireExpo(){
    try {
      Scanner scan = new Scanner(System.in);
      System.out.println("Entrer l'exposant : ");
      return scan.nextInt();
    } catch (Exception e){
      System.out.println("une erreur est survenue, merci de recommencer ...");
      return lireExpo();
    }
  }

  public double valeur(double x){
    return getCoeff()*Math.pow(x,getExposant());
  }

  public Monome derive(){
    Monome m;
    if (getExposant() >= 1){
      return m = new Monome(getCoeff()*getExposant(),getExposant()-1);
    } else {
      return m = new Monome(0,0);
    }
  }

  public Monome multMonome(Monome m){
      Monome n;
      return n = new Monome(getCoeff()*m.getCoeff(),getExposant()+m.getExposant());
  }

  public Monome addMonome(Monome m) throws MonomeException{
    Monome n;
    if(m.getExposant() == getExposant()){
      return n = new Monome(getCoeff()+m.getCoeff(),getExposant());
    } else {
      throw new MonomeException("Erreur Exposant Diff");
    }
  }

  public String toString(){
    return getCoeff() + "x^" + getExposant();
  }

  public static void main(String[] args) {
    Monome m;
    if (args.length == 2) {
       m = new Monome(Double.parseDouble(args[0]),Integer.parseInt(args[1]));
    } else {
       m = new Monome();
    }
    System.out.println("m : "+m);
    System.out.println("m : (coeff : "+m.getCoeff()+", expo : "+m.getExposant()+")");
    m.setCoeff(2.123);
    m.setExposant(3);
    System.out.println("m : "+m);
    Monome mprime = m.derive();
    System.out.println("m' : "+mprime);
    double val = m.valeur(0);
    System.out.println("m(0) = "+val);
    try {
      Monome mm = m.addMonome(mprime);
    }
    catch (MonomeException me) {
       me.printStackTrace();
    }
  }
}
