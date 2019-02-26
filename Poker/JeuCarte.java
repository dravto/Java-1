class JeuCarte{
  private int taille;
  private Carte[] paquet =  new Carte[taille];

  public JeuCarte(){
    setTaille(52);
  }

  public JeuCarte(int t){
    setTaille(t);
  }

  //Get

  public int getTaille(){
    return taille;
  }

  public Carte getCarte(int n){
    return paquet[n];
  }

  public Carte[] getPaquet(){
    return paquet;
  }

  //Set

  public void setTaille(int t){
    taille = t;
  }

  public void setPaquet(){
    int n = 0;
    for (int i = 0; i<4; i++) {
        paquet[n] = new Carte(j,i);
        n++;
      }
    }
  }

  public void setCarte(int n, Carte c){
      paquet[n] = c;
  }

  //Other

  public void addCarte(Carte c){

  }

  public Carte distribueCarte(){
    return Carte;
  }

  public void remiseCarte(Carte c){

  }

  public void melangePaquet(){
    for (int i = 0; i<((int)Math.random()*500); i++) {
      int j = (int)Math.random()*taille;
      int k = (int)Math.random()*taille;
      Carte c;
      c = paquet[j];
      paquet[j] = paquet[k];
      paquet[k] = c;
    }
  }

  public void riffleShuffle(){
    Carte[] paquet2 =  new Carte[taille];
    for (int i = 0; i < (getTaille()/2); i++) {
      paquet2[2i] = paquet[i];
      paquet2[2i + 1] = paquet[i + getTaille()];
    }
    int k = 0;
    while(a<getTaille()){
      paquet[k++] = paquet2[k++];
    }
    paquet2 = null;
  }

  public void coupePaquet(){
    Carte[] paquet2 =  new Carte[taille];
    int alea = ((int)Math.random()*taille);
    for (int j = 0; j<getTaille(); j++) {
      paquet2[j] = paquet[j];
    }
    int a = 0;
    for (int i = alea; i < getTaille(); i++){
      paquet[a++] = paquet2[i];
    }
    int k = 0;
    while(a<getTaille()){
      paquet[a++] = paquet2[k++];
    }
    paquet2 = null;
  }

  public int tireNumberRand(){
    return (int)(Math.random()*((taille/4)-1)+1);
  }

  public int tireFormeRand(){
    return (int)Math.random()*3;
  }

  public void print(){
    for (int i = 0; i < getTaille(); i++) {
      System.out.println(paquet[i].toString());
    }
  }


  public static void main(String[] args) {
    JeuCarte pack = new JeuCarte();
    pack.setPaquet();
    pack.print();
    pack.melangePaquet();
    pack.print();
  }
}
