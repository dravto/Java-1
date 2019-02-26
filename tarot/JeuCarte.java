class JeuCarte{
  private int deck = 52;
  private Carte[] packet =  new Carte[deck];

  public JeuCarte(){

  }

  public void setDeck(int t){
    deck = t;
  }

  public int getDeck(){
    return deck;
  }

  public int tireNumberRand(){
    return (int)(Math.random()*((deck/4)-1)+1);
  }

  public int tireFormeRand(){
    return (int)Math.random()*3;
  }

  public void setPacket(){
    int n = 0;
    for (int i = 0; i<=3; i++) {
      for (int j = 1; j<= (deck/4) ; j++) {
        packet[n] = new Carte(j,i);
        n++;
      }
    }
  }

  public void randomizer(){

  }

  public void print(){
    for (int i = 0; i < getDeck(); i++) {
      System.out.println(packet[i].toString());
    }
  }


  public static void main(String[] args) {
    JeuCarte pack = new JeuCarte();
    pack.setPacket();
    pack.print();
    pack.randomizer();
  }
}
