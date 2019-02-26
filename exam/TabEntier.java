//Aziz M'HIRSI

import java.util.*;

public class TabEntier{
  private int taille;
  private int[] elements;
  private String text;
  private static Scanner scan;


  public TabEntier(int n){
    taille = n;
    elements = new int[taille];
  }

  public void lireTabEntier(){
    int val;
    for (int i = 0; i < getTaille(); i++){
      System.out.println("Entrer la valeur qui est a la place " + (i+1) + " :\n");
      val = scan.nextInt();
      setElementI(i, val);
    }
  }

  public int getTaille(){
    return taille;
  }

  public int getElementI(int i) {
    return elements[i];
  }

  public void setElementI(int i, int val){
    elements[i] = val;
  }

  public String toString(){
    /* La methode toString doit porter se nom car il existe deja une methode
    toString de Java qui ne retourne pas se quel l'on veux, donc on surpasse
    cela en créent la notre qui vient prendre la place de la methode toString
    de Java*/
    text = "|| " + getElementI(0);
    for (int i = 1; i < getTaille(); i++) {
      text = text + " || " + getElementI(i) ;
    }
    return text + " ||";
  }

  public void repartir(){
    int plus = 1;
    int moins = 0;
    int tmp = 0;
    for (int i = 0; i < getTaille()-plus; i++) {
        if (getElementI(i) < 0){
          tmp = getElementI(i);
          setElementI(i,getElementI(moins));
          setElementI(moins, tmp);
          moins++;
        } else if (getElementI(i) > 0){
          tmp = getElementI(i);
          setElementI(i,getElementI(getTaille() - plus));
          setElementI(getTaille() - plus, tmp);
          plus++;
          i--;
        }
    }
  }

  public static void main(String[] args) {
    System.out.println("Quelle est la taille du tableau : ");
    scan = new Scanner(System.in);
    int n = scan.nextInt();
    TabEntier tab = new TabEntier(n);
    tab.lireTabEntier();
    tab.repartir();
    System.out.println(tab.toString());
  }
}
