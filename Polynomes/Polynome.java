public class Polynome{
  private ListeChainee lM;

  public Polynome(){
    lM = new ListeChainee();
  }
 /*


modif tout les getCourant par getContenuCourant


 */
  public void addMonome(Monome m){
    lM.razCourant();
    if(lM.estVide()){
      lM.ajouteTete(m);
    } else {
      if(((Monome)(lM.enQueue())).getExposant() >= m.getExposant()){
        lM.ajouteQueue(m);
      } else {
        while(((Monome)(lM.getContenuCourant())).getExposant() <= m.getExposant()){
          lM.suivant();
        }
        if (((Monome)(lM.getContenuCourant())).getExposant() == m.getExposant()){
          ((Monome)(lM.getContenuCourant())).addMonome(m);
        } else {
          lM.insertCourant(m);
        }
      }
    }
  }

  public ListeChainee getLM(){
    return lM;
  }

  public double valeur(double x){
    lM.razCourant();
    int y = 0;
    while(((Monome)(lM.getContenuCourant())).getExposant() <= ((Monome)(lM.enQueue())).getExposant()){
      y += ((Monome)(lM.getContenuCourant())).valeur(x);
      lM.suivant();
    }
    return y;
  }

  public Polynome derive(){
    lM.razCourant();
    do {
      ((Monome)(lM.getContenuCourant())).derive();
      if (((Monome)(lM.getContenueCourant())) == Monome(0,0)){
        lM.retireCourant();
      }
      lM.suivant();
    } while (lM.getContenuCourant() <= lM.enQueue());
    return Polynome();
  }

  public Polynome addPolynome(Polynome p){
    Polynome poly;
    lM.razCourant();
    if (lM.estVide()){

    }
    return p;
  }

  public Polynome multPolynome(Polynome p){
    Polynome poly;
    lM.razCourant();
    if (lM.estVide() || p.lM.estVide()){

    } else {

    }
    return p;
  }

  public int getNbMonomes(){
    lM.razCourant();
    int i;
    while(lM.possedeSuivant()){
      i++;
      lM.suivant();
    }
    i++;
    return i;
  }

  public void nettoie(){
    lM.razCourant();
    while(lM.possedeSuivant()){
      if (lM.getContenuCourant().getCoeff() == 0){
        lM.retireCourant();
      }
      lM.suivant();
    }
    if (lM.getContenuCourant().getCoeff() == 0){
      lM.retireCourant();
    }
  }

  public String toString(){
    lM.razCourant();
    while(lM.possedeSuivant()){
      System.out.print(lM.getContenuCourant().toString() + " + ");
      lM.suivant();
    }
    System.out.print(lM.getContenuCourant().toString());
  }




}
