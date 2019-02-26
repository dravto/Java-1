public class ListeChainee {

  private Cellule tete;
  private Cellule queue;
  private Cellule courant;

  public ListeChainee(){
    this.tete = null;
    this.queue = null;
    this.courant = null;
  }

  public ListeChainee(Cellule _tete){
    this.tete = _tete;
    this.queue = _tete;
    this.courant = _tete;
  }

  public boolean estVide(){
    if (tete == null && queue == null){
      return true;
    }
    return false;
  }

  public Cellule getTete(){
    return tete;
  }

  public Cellule getQueue(){
    return queue;
  }

  public Cellule getCourant(){
    return courant;
  }

  public Object getContenuCourant(){
    return courant.getContenu();
  }

  public void ajouteTete(Object o){
    Cellule nouvelle = new Cellule(o);
    nouvelle.setSuivant(getTete());
    tete = nouvelle;
  }

  public void ajouteQueue(Object o){
    Cellule nouvelle = new Cellule(o);
    queue.setSuivant(nouvelle);
    queue = nouvelle;
  }

  public void insertCourant(Object o) {
    if (getTete() == getQueue()){
      tete = queue = courant = null;
    }
    else {
      Cellule nouvelle = new Cellule(o);
      Cellule runner = tete;
      while (runner.getSuivant() != getCourant()) {
        runner = runner.getSuivant();
      }
      runner.setSuivant(nouvelle);
      nouvelle.setSuivant(getCourant());
    }
  }

  public void suivant() {
    if (possedeSuivant()) {
      courant = courant.getSuivant();
    }
  }

  public Object enTete(){
    return tete.getContenu();
  }

  public Object enQueue(){
    return queue.getContenu();
  }

  public boolean possedeSuivant(){
    if (courant.getSuivant() == null){
      return false;
    } else {
      return true;
    }
  }

  public void razCourant(){
    courant = tete;
  }

  public void retireTete(){
    if (getTete() == getQueue()){
      tete = queue = courant = null;
    }
    else {
      Cellule oldTete = tete;
      tete = tete.getSuivant();
      oldTete = null;
    }
  }

  public void retireQueue(){
    if (getTete() == getQueue()){
      tete = queue = courant = null;
    }
    else {
      Cellule runner = tete;
      while (runner.getSuivant() != getQueue()) {
        runner = runner.getSuivant();
      }
      queue = null;
      queue = runner;
      queue.setSuivant(null);
    }
  }

  public void retireCourant(){
    if (getTete() == getQueue()){
      tete = queue = courant = null;
    }
    else {
      Cellule runner = tete;
      while (runner.getSuivant() != getCourant()) {
        runner = runner.getSuivant();
      }
      runner.setSuivant(courant.getSuivant());
      razCourant();
    }
  }

  public String toString(){
    if (getTete() == getQueue()){
      return "null";
    }
    else {
      Cellule runner = tete;
      String text = "|| ";
      do {
        text = runner.toString() + " | ";
        runner = runner.getSuivant();
      }
      while (runner.getSuivant() != null);
      text = runner.toString() + " ||";
      return text;
    }
  }
}
