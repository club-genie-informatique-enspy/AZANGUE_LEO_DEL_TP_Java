# AZANGUE_LEO_DEL_TP_Java
# 📚 Application de Gestion de Bibliothèque en Java

## 📌 Description
Ce projet est une application Java permettant la gestion d'une bibliothèque avec un système d'emprunt de livres. Il intègre les principes de **programmation orientée objet** et applique des concepts tels que **l'héritage, les interfaces, les classes abstraites, l'encapsulation et la surcharge**.

## 🚀 Fonctionnalités
- 📌 **Gestion des utilisateurs** : Inscription, suppression et affichage des utilisateurs.
- 📖 **Gestion des livres** : Ajout, suppression et affichage des livres disponibles.
- 🔄 **Système d'emprunt** :
  - Un utilisateur ne peut emprunter un livre que s'il n'a pas déjà un emprunt en cours.
  - Chaque emprunt est soumis à un délai de **20 jours**.
  - L'utilisateur doit payer un montant défini par le livre.
- 📊 **Suivi administratif** :
  - L'administrateur peut voir les livres empruntés par un utilisateur spécifique.
  - Il peut consulter le montant total des emprunts et le gain total de la bibliothèque.

## 🏛️ Architecture du Projet
Le projet est structuré autour de plusieurs classes principales :
- **Livre** : Représente un livre avec un titre, un auteur et un prix d'emprunt.
- **Utilisateur** : Gère l'emprunt et le retour des livres.
- **Administrateur** : Gère l'inscription des utilisateurs et la gestion des livres.
- **Bibliothèque** : Centralise les livres et les utilisateurs.
- **Main.java** : Point d'entrée du programme avec un **mode statique** (tests prédéfinis) et un **mode dynamique** (interaction en temps réel).

## 📂 Structure du Projet
📦 AZANGUE_LEO_DEL_TP_Java 

- ┣ 📂 src 
  ┃ ┣ 📂 Package_Bibliotheque 
  ┃ ┃ ┣ 📜 Livre.java 
  ┃ ┃ ┣ 📜 Utilisateur.java
  ┃ ┃ ┣ 📜 Administrateur.java 
  ┃ ┃ ┣ 📜 Bibliotheque.java 
  ┃ ┣ 📂 Package_test
  ┃ ┃ ┣ 📜 Test_Livre.java 
  ┃ ┃ ┣ 📜 Test_Utilisateur.java
  ┃ ┃ ┣ 📜 Test_Administrateur.java 
  ┃ ┣ 📜 Main.java 
  ┃ ┣ 📜 TestBibliotheque.java
  ┣ 📜 README.md 
  ┣ 📜 rapport_gestion_bibliotheque.pdf
  ┣ 📜 TP_JAVA_103849.pdf


## 🎮 Modes d'Exécution
### **1️⃣ Mode Statique**
- Un scénario prédéfini exécute automatiquement :
  - L'inscription d'utilisateurs.
  - L'ajout de livres.
  - L'emprunt et le retour de livres.
  - L'affichage des informations administratives.

### **2️⃣ Mode Dynamique**
- L'utilisateur interagit avec le programme via un menu et peut :
  - Ajouter des utilisateurs et des livres.
  - Emprunter et retourner des livres.
  - Supprimer un utilisateur.
  - Consulter les emprunts et les gains.

## 🛠️ Installation et Exécution
### **Prérequis**
- **Java 11+** installé sur votre machine.

### **Compilation et exécution**
Dans un terminal, exécutez les commandes suivantes :

```bash
# Compilation
javac -d bin src/Package_Bibliotheque/*.java src/Main.java

# Exécution
java -cp bin Main

📧 Contact

    📩 Email : azangueleonel9@gmail.com
    📱 WhatsApp : +237 657 450 314

✨ Projet réalisé dans le cadre du TP Java à l'ENSPY - Club Génie Informatique ✨ 

