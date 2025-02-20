import Package_Bibliotheque.*;
import java.util.List;
import java.util.Scanner;

public class Main {
       /*Creation d'une instance de la bibliotheque */
    public static Bibliotheque biblio = new Bibliotheque();

    public static void main(String[] args) {

        System.out.println("Hello, Club GI ENSPY!");
        System.out.println("Bienvenue dans notre bibliotheque");
        System.out.println("""
                
                Voici les differentes fonctionnalités de notre bibliotheque:
                1.Mode statique
                2.Mode dynamique
                """);
        Scanner choix = new Scanner(System.in);
        System.out.print("Entrez votre choix: ");
        int choixMode = choix.nextInt();
    

        if (choixMode == 1){
            System.out.println("Vous avez choisi le mode statique");

                /*Creation d'une instance de la classe Administrateur */
            Administrateur admin = new Administrateur("ALD", biblio);

            /*Creation des utilisateurs */
            Utilisateur alice = new Utilisateur("ALICE");
            Utilisateur bob = new Utilisateur("BOB");
            Utilisateur oscar = new Utilisateur("OSCAR");

            /*Creation des livres */
            Livre livre1 = new Livre("Java pour les nuls", "Auteur X", 500);
            Livre livre2 = new Livre("Python avancé", "Auteur Y", 700);
            Livre livre3 = new Livre("C++ pour les nuls", "Auteur Z", 600);
            Livre livre4 = new Livre("Python pour les nuls", "Auteur Y", 700);
            
            /*Inscription des utilisateurs */
            System.out.println("===========Inscription des Utilisateurs==============");
            admin.ajouterUtilisateur(alice);
            admin.ajouterUtilisateur(bob);
            admin.ajouterUtilisateur(oscar);   
            
            /*Enregistrement des livres */
            System.out.println("===========Enregistrement des Livres==============");
            admin.ajouterLivre(livre1);
            admin.ajouterLivre(livre2);
            admin.ajouterLivre(livre3);
            admin.ajouterLivre(livre4);

            /*Liste des utilisateurs */ 
            System.out.println("===========Liste des Utilisateurs==============");
            admin.afficherUtilisateurs();

            /*suppression d'un utilisateur */
            System.out.println("===========Suppression d'un Utilisateur==============");
            admin.supprimerUtilisateur(alice);

            /*Nouvelle liste des utilisateurs */
            System.out.println("===========Nouvelle Liste des Utilisateurs==============");
            admin.afficherUtilisateurs();

            /*Bob emprunte un livre */
            System.out.println("===========Bob emprunte un livre==============");
            bob.emprunterLivre(livre1, biblio);
            admin.afficherLivresEmpruntesby(bob);

            /*Bob emprunte un autre livre */
            System.out.println("===========Bob emprunte un autre livre=============="); 
            bob.emprunterLivre(livre2, biblio);
            admin.afficherLivresEmpruntesby(bob);

            /*Bob rend le livre */
            System.out.println("===========Bob rend le livre==============");
            bob.rendreLivre();
            admin.afficherLivresEmpruntesby(bob);

            /*Bob emprunte un livre */
            System.out.println("===========Bob emprunte un livre==============");
            bob.emprunterLivre(livre3, biblio);
        
            /*Oscar emprunte un livre */
            System.out.println("===========Oscar emprunte un livre==============");
            oscar.emprunterLivre(livre4, biblio);

            /*liste des livres empruntés */
            System.out.println("===========Liste des Livres Empruntés==============");
            admin.afficherLivresEmpruntes();

            /*gain total des emprunts */
            System.out.println("===========Gains==============");
            admin.voirGains();
        }else if (choixMode == 2){
            Administrateur admin = new Administrateur(null, biblio);
            System.out.println("Vous avez choisi le mode dynamique\n");
            while(true){
                System.out.println("\n===========MENU==============");
                System.out.println("""
                    [1].Création de l'administrateur
                    [2].Creation d'utilisateurs
                    [3].Enregistrement des livres
                    [4].Emprunté un livre
                    [5].Rendre un livre
                    [6].Supprimer un utilisateur
                    [7].Liste utilisateurs
                    [8].Liste livres
                    [9].Liste livres emprunté 
                    [10].Livre emprunté par un utilisateur
                    [11].Voir gain emprunt
                    """);
                Scanner option = new Scanner(System.in);
                System.out.print("Entrez votre option: ");
                int optionMode = option.nextInt();
                Scanner scanner = new Scanner(System.in);
                switch(optionMode){
        
                    case 1:
                            System.out.println("===========Creation de l'administrateur==============");
                            System.out.print("Entrez le nom de l'admininistrateur: ");
                            String nomAdmin = scanner.nextLine();
                            admin = new Administrateur(nomAdmin, biblio);
                           
                    break;
                    case 2:
                            System.out.println("===========Creation d'utilisateur==============");
                            System.out.println("Combien d'utilisateur voulez-vous enregistrer ?");
                            int nbreUser = scanner.nextInt();
                            scanner.nextLine(); // Consuming the newline character left by nextInt()
                            for (int i = 0; i < nbreUser; i++) {
                                System.out.print("Entrez le nom de l'utilisateur: " + (i + 1) + ": ");
                                String nomUtilisateur = scanner.nextLine();
                                /* Creation de l'utilisateur */
                                Utilisateur utilisateur = new Utilisateur(nomUtilisateur);
                                /* Enregistrement de l'utilisateur par l'admin */
                                admin.ajouterUtilisateur(utilisateur);
                            }
                    break;
                    case 3:
                            System.out.println("===========Enregistrement des Livres==============");
                            System.out.println("Combien de livre voulez-vous enregistrer?");
                            int nbreLivre = scanner.nextInt();
                            scanner.nextLine(); // Consuming the newline character left by nextInt()
                            for (int i=0 ; i<nbreLivre; i++){
                                System.out.print("Entrez le titre du livre: " + (i + 1) + ": ");
                                String titreLivre = scanner.nextLine();
                               
                                System.out.print("Entrez l'auteur du livre: ");
                                String auteurLivre = scanner.nextLine();
                               
                                System.out.print("Entrez le prix d'emprunt du livre: ");
                                int prix = scanner.nextInt();
                                scanner.nextLine();
                                /*Creation du livre */
                                Livre livre = new Livre(titreLivre, auteurLivre, prix);
                                /*Enregistrement du livre par l'administrateur */
                                admin.ajouterLivre(livre);
                            }
                    break;
                    case 4:
                            System.out.println("Entrer votre nom d'utilisateur");
                            String nomUtilsateur = scanner.nextLine();
                            Utilisateur user = SearchUser(nomUtilsateur);
                            if (user == null){break;}

                            /*Presentation des livres disponibles */
                            admin.afficherLivres();
                            if (!biblio.getBook().isEmpty()) {
                                System.out.println("Numero du livre que vous voulez emprunter :");
                                int NumLivre = scanner.nextInt();
                                List<Livre> Livres = biblio.getBook();
                                Livre livreAEmprunter = Livres.get(NumLivre - 1);
                                user.emprunterLivre(livreAEmprunter, biblio);
                            } else {
                                System.out.println("Aucun livre disponible pour emprunt.");
                            }
                            
                    break;
                    case 5:
                        System.out.println("Entrer votre nom d'utilisateur");
                        String nomUser = scanner.nextLine();
                        Utilisateur utilisateur = SearchUser(nomUser);
                        if (utilisateur == null){break;}
                        utilisateur.rendreLivre();

                    break;
                    case 6:
                        System.out.println("Entrer le nom d'utilisateur à supprimer");
                        String nom = scanner.nextLine();
                        Utilisateur utilisateu = SearchUser(nom);
                        if (utilisateu == null){
                                System.out.println("Aucun utilisateur n'ayant se nom n'est enregistré");
                                break;
                        }
                        admin.supprimerUtilisateur(utilisateu);
                    break;
                    case 7:
                            admin.afficherUtilisateurs();
                    break;
                    case 8:
                        admin.afficherLivres();
                    break;
                    case 9:
                        admin.afficherLivresEmpruntes();
                    break;
                    case 10:
                        System.out.println("Entrer le nom d'utilisateur ");
                        String name = scanner.nextLine();
                        Utilisateur User = SearchUser(name);
                        if (User == null){
                                System.out.println("Aucun utilisateur n'ayant se nom n'est enregistré");
                                break;
                        }
                        admin.afficherLivresEmpruntesby(User);
                    break;
                    case 11:
                        admin.voirGains();
                    break;
                    default:
                    break;
                }
                /*Saisie des informations */
            
            }
        }
    }  
    
    public static Utilisateur SearchUser(String name){
        /*Methode permettant de retrouver un utilisateur a l'aide de son nom */
        for (Utilisateur user : biblio.getUser()){
            if (user.getNom() == name ){
                return user;
            }
        }
        return null;
    }
   
}