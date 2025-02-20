package Package_test;

import Package_Bibliotheque.Bibliotheque;
import Package_Bibliotheque.Livre;

public class Test_Livre {
    public void run(Bibliotheque biblio){
        /*Creation d'un livre */

        Livre livre1 = new Livre("Java pour les nuls", "Auteur X", 500);
        Livre livre2 = new Livre("Python avancé", "Auteur Y", 700);

        /*Verification de la disponibilité des livres  */
        System.out.println("Le livre \""+livre1.getTitre() +"\" de " + livre1.getAuteur() +" est Disponible : " +livre1.estDisponible());

        /*Obtenir le prix d'un livre */
        System.out.println("Le prix d'emprunte du livre "+livre1.getTitre() + "est de "+ livre1.getPrixEmprunt()+"FCFA\n");

        /*Modification du prix d'emprunt u mivre 1 */
        livre1.setPrixEmprunt(1000);

        System.out.println("Le prix d'emprunte du livre "+livre1.getTitre() + "est maintenant de "+ livre1.getPrixEmprunt()+"FCFA\n");

    }
    public static void main(String[] args) {
        Test_Livre test = new  Test_Livre();
        test.run(new Bibliotheque());
    }
}
