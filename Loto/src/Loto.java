import java.util.*;
 
public class Loto {
   
    private static int nbJoueur;
    private static int option;
    private static int grilleType;
    private static int t;
    private static int nb;
    private static int regle;
    private static int numGrille;
    private static Joueur[] joueur;
    private static String nomJoueur;
    private static String idJoueur;
    private static Scanner scan;
   
 
    
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        
        //test();
       
        nbJoueur();
        option();
        rules();
        joueur = new Joueur[t];
        joueur[0] = new Joueur(0, grilleType, t, nb, "Tirage Gagnant");
        nameJoueur();
        numJoueur();
        resultat();
 
    }
   
    
    public static void nbJoueur() {
        //Nb de joueurs
       
        System.out.println("Bonjour, Bienvenue a ce Loto \nCombien etes vous de joueur ?");
        nbJoueur = scan.nextInt();
    }
   
    
    public static void option() {
        //Option
       
        System.out.println("Donc vous etes " + nbJoueur + " Joueur !\nVoulez vous changer les regles ? (1.Oui ou 2.Non) (Avancee seleument)");
        option = scan.nextInt();
               
        if (option == 1) {
            System.out.println("Quelle est la taille maximal de votre table ?");
            t = scan.nextInt();
            System.out.println("Les tables serons donc de " + t + " colonnes.\nQuelle est la valeur maximal de chaque colonnes ?");
            nb = scan.nextInt();
            System.out.println("Les valeurs maximal serons donc de " + nb + " pour chaque colonnes.");
            grilleType = 1;
        } else if (option == 2){
            System.out.println("Les colonnes sont aux nombres de 6 et chaque colonne a 49 valeurs au choix");
            grilleType = 0;
            t = 6;
            nb = 49;
        } else {
            option();
        }
    }
   
    
    public static void rules() {
        //Regles
       
        System.out.println("Connaissez vous les regles ? (1.Oui ou 2.Non )");
        regle = scan.nextInt();
        if (regle == 2) {
            System.out.println("Les regles sont simple !\nChaque joueur devra rentre une liste de nombres tous differents, entre 1 et 49, \n6 fois pour remplire la grille de Loto. si vous sorter les numeros gagnants, \nvous gagnier (merci captain obvious !), sinon retenter votre chance !");
        } else if (regle == 1) {
        } else {
            rules();
        }
    }
   
    
    public static void nameJoueur() {
        //Nom du Joueur
       
        for(int i = 1; i <= nbJoueur; i++) {
            System.out.println("\n\nJoueur " + i + ", Comment je doit t'appeler ?");
            nomJoueur = scan.next();
            idJoueur = "" + ((int)(Math.random()*8546514)) + i;
            System.out.println("Donc tu t'appelle " + nomJoueur + "\nTon id Joueur est : " + idJoueur);
            joueur[i] = new Joueur(1, grilleType, t, nb, nomJoueur);
        }
       
    }
   
    
    public static void numJoueur() {
        for(int i = 1; i <= nbJoueur; i++) {
            System.out.println("\033[H\033[2J");
            System.out.println(joueur[i].getName() + ", c'est a toi de remplire ta grille !\nN'oublie pas, entre 1 et " + nb +"." );
            entrerNumJoueur(i);
            System.out.println(joueur[i].toString());
            System.out.println("Etes vous sur de cette grille ? (1.Oui ou 2.Non )");
            int valid = scan.nextInt();
            if(valid == 2) {
            	for(int j = 0; j < t; j++) {
            		joueur[i].setNumGrille(j,0);
            	}
            	entrerNumJoueur(i);
            }
        }
    }
    
    
    public static void entrerNumJoueur(int i) {
        for (int j = 1; j < t+1; j++) {
            System.out.println("Entre le " + j + "er numeros de ta grille : ");
            numGrille = scan.nextInt();
            for (int f = 0; f < t; f++) {
            	if (numGrille == joueur[i].getVal(f)) {
            		System.out.println("Le numero " + numGrille + " est deja utilise, Entrer un autre numero :");
            		numGrille = scan.nextInt();
            		f=-1;
            	} else if (numGrille < 1 || numGrille > nb) {
            		System.out.println("Le numero " + numGrille + " n'est pas entre 1 et " + nb + " , Entrer un autre numero :");
            		numGrille = scan.nextInt();
            		f=-1;
            	}
            }
            joueur[i].setNumGrille(j-1, numGrille);
        }
    }
   
    
    public static void resultat() {
        int timeToWait = 20; //second
        try {
            for (int i=0; i<timeToWait ; i++) {
                Thread.sleep(500);
                System.out.println("\033[H\033[2J");
                System.out.println("Les resultats sont .....\n\n\nTirage Gagnant : ");
                for (int j = 0; j < t; j++) {
                    int anim = 1 + (int)(Math.random()*(nb-1));
                    System.out.print(anim + " ");
                }
            }
            System.out.println("\033[H\033[2J");
            System.out.println("Les resultats sont .....\n\n\n");
            System.out.println(joueur[0].toString());
            compare();
            
            //test a supprimer
            test();
        } catch (InterruptedException ie)
        {
            Thread.currentThread().interrupt();        
        }
    }
    
    
    public static void compare() {
    	int var = 0;
    	boolean bool = false;
    	for (int i = 0; i < nbJoueur; i++) {
    		var = joueur[i+1].grille().CompareGrille(joueur[0].grille());
    		if (var > 0) {
    			System.out.println("\nLe Joueur " + joueur[i+1].toString() + " a " + var +" nombres gagnant!\nFelicitation !");
    			bool = true;
    		}
    	}
    	if (bool == false) {
        	System.out.println("\nDommage, il n'y a pas de Gagnant cette fois ci !");
    	}
    }
    
    
    public static void test() {
    	System.out.println("\n\n\n");
    	for(int i = 1; i <= nbJoueur; i++) {
    		System.out.println(joueur[i].toString());
    	}
    }
}
 
