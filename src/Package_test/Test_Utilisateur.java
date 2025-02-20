package Package_test;

import Package_Bibliotheque.*;

public class Test_Utilisateur {
    public void run(Bibliotheque biblio){
        /*Cretion d'utilisateur */
        Utilisateur alice = new Utilisateur("Alice");
        Utilisateur bob = new Utilisateur("Bob");

        Livre livre1 = new Livre("Java pour les nuls", "Auteur X", 500);
        Livre livre2 = new Livre("Python avancé", "Auteur Y", 700);

        /*Alice emprunte le livre 1 */
        alice.emprunterLivre(livre1, biblio);
        /*Alice essaye d'emprunter un autre livre sans avoir rendu le precedent */
        alice.emprunterLivre(livre2, biblio);
        
        bob.emprunterLivre(livre2, biblio);

        alice.rendreLivre();
        /*alice  essaye d'emprunter le même livre que bob */
        alice.emprunterLivre(livre2, biblio);
    }

    public static void main(String [] args){
        Test_Utilisateur test = new Test_Utilisateur();
        test.run(new Bibliotheque());
    }
}
