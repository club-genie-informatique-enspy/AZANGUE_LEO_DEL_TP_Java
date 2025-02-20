import Package_Bibliotheque.*;

public class TestBibliotheque {
    
    public void run() {
        Bibliotheque biblio = new Bibliotheque();
        Administrateur admin = new Administrateur("Admin",biblio);

        Utilisateur alice = new Utilisateur("Alice");
        Utilisateur bob = new Utilisateur("Bob");

        admin.ajouterUtilisateur(alice);
        admin.ajouterUtilisateur(bob);

        Livre livre1 = new Livre("Java pour les nuls", "Auteur X", 500);
        Livre livre2 = new Livre("Python avancé", "Auteur Y", 700);

        biblio.ajouterLivre(livre1);
        biblio.ajouterLivre(livre2);

        alice.emprunterLivre(livre1, biblio);
        bob.emprunterLivre(livre2, biblio);

        alice.rendreLivre(biblio);
        alice.emprunterLivre(livre2, biblio);

        admin.voirGains();
    }
}
