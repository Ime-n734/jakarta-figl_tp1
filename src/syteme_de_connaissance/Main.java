package syteme_de_connaissance;

public class Main {
    public static void main(String[] args) {

        // Création d'un utilisateur
        Utilisateur utilisateur =
                new Utilisateur("admin", "abc");

        // Première tentative
        try {

            utilisateur.connecter("admin", "123");

        } catch (IdentifiantsInvalidesException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (CompteBloqueException e) {

            System.out.println("Erreur : " + e.getMessage());
        }


        // Deuxième tentative
        try {

            utilisateur.connecter("admin", "456");

        } catch (IdentifiantsInvalidesException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (CompteBloqueException e) {

            System.out.println("Erreur : " + e.getMessage());
        }


        // Troisième tentative
        try {

            utilisateur.connecter("admin", "789");

        } catch (IdentifiantsInvalidesException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (CompteBloqueException e) {

            System.out.println("Erreur : " + e.getMessage());
        }


        // Quatrième tentative
        try {

            utilisateur.connecter("admin", "abc");

        } catch (IdentifiantsInvalidesException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (CompteBloqueException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
