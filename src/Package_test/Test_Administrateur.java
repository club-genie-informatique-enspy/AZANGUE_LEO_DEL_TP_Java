package Package_test;
import Package_Bibliotheque.*;

public class Test_Administrateur {
    public void run(){
          //Definition de la bibliotheque
          Bibliotheque biblio = new Bibliotheque();

          //Instance de la classe Administrateur
          Administrateur admin = new Administrateur("ALD", biblio);
  
          //ajout d'utilisateur
  
          Utilisateur alice = new Utilisateur("ALICE");
          admin.ajouterUtilisateur(alice);
  
          Utilisateur bob = new Utilisateur("BOB");
          admin.ajouterUtilisateur(bob);
  
          //Liste des utilisateurs
          System.out.println("===========Liste des Utilisateurs==============");
          admin.afficherUtilisateurs();
  
          //Suppression d'un utilisateur
          admin.supprimerUtilisateur(alice);
  
          //Nouvelle liste d'utilisateurs
          System.out.println("===========Nouvelle Liste des Utilisateurs==============");
  
          admin.afficherUtilisateurs();
  
          //Ajouter un livre
          admin.ajouterLivre(new Livre("apprendre JAVA", "Gerard Swinnen", 2500));
  
          admin.ajouterLivre(new Livre("apprendre Python 3", "Gerard Swinnen", 2000));
  
          //Afficher les livres empruntés par Bob
          admin.afficherLivresEmpruntesby(bob);


          /*Liste des livres empruntés */
        System.out.println("===========Liste des Livres Empruntés==============");
        admin.afficherLivresEmpruntes();

    }

    public static void main(String[] args) {
        Test_Administrateur test = new Test_Administrateur();
        test.run();
      
    }
}
