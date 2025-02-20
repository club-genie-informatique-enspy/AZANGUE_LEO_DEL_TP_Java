package Package_Bibliotheque;
import java.time.LocalDate;

public class Utilisateur {
    private String nom;
    private Livre livreEmprunte;
    private double totalDepense;
    private LocalDate dateEmprunt;

    /*Constructeur */
    public Utilisateur(String nom) {
        this.nom = nom;
        this.livreEmprunte = null;
        this.totalDepense = 0;
    }

    /*Methode Getter and Setter */
    public String getNom(){ return this.nom;}
    public Livre getLivreEmprunte(){return this.livreEmprunte;}
    public LocalDate getDateEmprunte(){return this.dateEmprunt;}

    public void emprunterLivre(Livre livre, Bibliotheque biblio) {
        if (livreEmprunte != null) {
            /*On vérifie au prealable s'il n'a pas un livre en sa possession */

            System.out.println(this.nom + " doit rendre le livre "+ this.livreEmprunte.getTitre() +" avant d'en emprunter un autre.\n");
            return;
        }
        if (livre.estDisponible()) {
            /*On verifie que le livre est dispo */
            livre.emprunter(); //SIGNAL QUE LE LIVRE A ÉTÉ EMPRUNTÉ
            this.livreEmprunte = livre;//enregistre le livre emprunté
            this.totalDepense += livre.getPrixEmprunt(); //actualise la depense total
            this.dateEmprunt = LocalDate.now(); // Enregistre le jour de l'emprunt
            biblio.ajouterGain(livre.getPrixEmprunt()); //Actualise le gain de la biblio
           
            System.out.println(this.nom + " a emprunté le livre : " + livre.getTitre() +" ce "+this.dateEmprunt+"\n");
        } else {
            System.out.println("Le livre \""+livre.getTitre() +"\" est déjà  emprunté.\n");
        }
    }

    public void rendreLivre() {
        if (livreEmprunte == null) {
            System.out.println(this.nom + " n'a aucun livre à rendre.\n");
            return;
        }
        livreEmprunte.rendre();//signale que le livre a été rendu
        System.out.println(this.nom + " a rendu : " + livreEmprunte+"\n");
        this.livreEmprunte = null;
    }

    @Override
    public String toString() {
        return "Utilisateur: " + this.nom + ", Dépense totale: " + this.totalDepense + " FCFA\n";
    }

}

