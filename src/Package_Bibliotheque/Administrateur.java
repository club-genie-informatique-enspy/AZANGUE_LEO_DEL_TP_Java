package Package_Bibliotheque;

public class Administrateur extends Utilisateur {
      /*Gère l'inscription des utilisateurs et l'attribution des libres */

      /*La classe Administrateur herite de celle Utilisateur */

    private Bibliotheque biblio; //Bibliotheque qu'il administre

    public Administrateur(String nom,Bibliotheque biblio) {
        super(nom);
        this.biblio = biblio;
    }

    /*Gestion des utilisateurs par l'administrateur */
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        this.biblio.inscrireUtilisateur(utilisateur);
        System.out.println('"' + utilisateur.getNom() + '"' + " a été inscrit avec succès");
    }

    public void supprimerUtilisateur(Utilisateur utilisateur) {
        this.biblio.supprimerUtilisateur(utilisateur);
        System.out.println('"' + utilisateur.getNom() + '"' + " a été supprimé avec succès");
    }

    public void afficherUtilisateurs(){
        System.out.println("===========Liste des Utilisateurs==============");
        int count = 0;
        for (Utilisateur user : this.biblio.getUser()){
            System.out.println("- "+user.getNom());
            count ++;
        }
        if (count == 0){
            System.out.println("    Aucun UTILISATEUR n'a été enregistré");
        }
    }

   /*Gestion des livres */
    public void ajouterLivre(Livre livre){
        this.biblio.ajouterLivre(livre);
        System.out.println("Le livre "+livre.getTitre() +" a été ajouté avec succès");
    }

    public void afficherLivres(){
        /*Methode permettant d'afficher la liste des livres */
        System.out.println("===========Liste des Livres Empruntés==============");
        int count = 0;
        
       for (Livre livre : this.biblio.getBook()){
                System.out.println(count+1 +": "+livre);
                count ++;
           }
       if (count == 0){
           System.out.println("Aucun livre n'a été enregistré");
       }
    }

    public void afficherLivresEmpruntesby(Utilisateur user){
        /*Methode permettant d'afficher le livre emprunté par user */
        System.out.println("===========Liste des Livres Empruntés par "+user.getNom()+"==============");
        if (user.getLivreEmprunte() == null){
            System.out.println(user.getNom() +" n'a aucun livre emprunté ");
            return;
        }

        System.out.println(user.getNom() + " a emprunté le livre "+user.getLivreEmprunte().getTitre() +"de "+user.getLivreEmprunte().getAuteur() );
    }

    public void afficherLivresEmpruntes(){
        System.out.println("===========Liste des Livres Empruntés==============");
        int count = 0;
        /*Methode permettant d'afficher les livres empruntés */
       for (Utilisateur user : this.biblio.getUser()){
            
           if (user.getLivreEmprunte() != null){
                System.out.println("- "+user.getLivreEmprunte());
                count ++;
           }
       }
       if (count == 0){
           System.out.println("Aucun livre n'a été emprunté");
       }
    }


    public void voirGains() {
        /*Permet de voir le gain total des empruntes */
        System.out.println("Gain total de la bibliothèque : " + this.biblio.getGainTotal() + " FCFA");
    }
}
