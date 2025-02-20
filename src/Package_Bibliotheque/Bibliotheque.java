package Package_Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;
    private List<Utilisateur> utilisateurs;
    private double gainTotal;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
        this.utilisateurs = new ArrayList<>();
        this.gainTotal = 0;
    }

    /*Methode Getter and Setter */
    public List<Utilisateur> getUser(){ 
        return this.utilisateurs;
    }

    public List<Livre> getBook(){
        return this.livres;
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void inscrireUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public void supprimerUtilisateur(Utilisateur utilisateur){
        utilisateurs.remove(utilisateur);
    }

    public void ajouterGain(double montant) {
        gainTotal += montant;
    }

    public double getGainTotal() {
        return gainTotal;
    }
}

