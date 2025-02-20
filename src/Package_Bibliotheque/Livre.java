package Package_Bibliotheque;

import java.time.LocalDate;

public class Livre {
    /*Représente un livre pouvant être emprunté */

    private String titre;
    private String auteur;
    private double prixEmprunt;
    private boolean estEmprunte;

    /*Constructeur */

    public Livre(String titre, String auteur, double prixEmprunt) {
        this.titre = titre;
        this.auteur = auteur;
        this.prixEmprunt = prixEmprunt;
        this.estEmprunte = false;
    }

    /*Methodes Getter and Setter */
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getTitre() {
        return titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }   
    public String getAuteur() {
        return auteur;
    }

    public boolean estDisponible() {
        /*Permet de savoir si un livre est disponible ou déjà emprunté */
        return !estEmprunte;
    }

    public void emprunter() {
        /*Signale que le livre a été emprunté */
        this.estEmprunte = true;
    }

    public void rendre() {
        /*Signale que le livre a été rendu en signalant le livre comme disponible */
        this.estEmprunte = false;
    }

    public double getPrixEmprunt() {
        /*Obtenir le prix de location du livre */
        return prixEmprunt;
    }
    public void setPrixEmprunt(double prixEmprunt) {
        this.prixEmprunt = prixEmprunt;
    }

    @Override
    public String toString() {
        return this.titre + " de " + this.auteur + (this.estEmprunte ? " (Emprunté)" : " (Disponible)");
    }
}
