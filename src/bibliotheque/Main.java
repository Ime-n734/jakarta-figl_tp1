package bibliotheque;

public class Main {

    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();


        bibliotheque.ajouterLivre(new Livre("Java"));
        bibliotheque.ajouterLivre(new Livre("Python"));
        bibliotheque.ajouterLivre(new Livre("UML"));

        System.out.println("=== Liste initiale ===");
        bibliotheque.afficherLivres();

        System.out.println("\n=== Emprunt de Java ===");

        try {

            bibliotheque.emprunter("Java");

        } catch (LivreIntrouvableException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (LivreIndisponibleException e) {

            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n=== Deuxième emprunt de Java ===");

        try {

            bibliotheque.emprunter("Java");

        } catch (LivreIntrouvableException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (LivreIndisponibleException e) {

            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n=== Emprunt d'un livre inexistant ===");

        try {

            bibliotheque.emprunter("C++");

        } catch (LivreIntrouvableException e) {

            System.out.println("Erreur : " + e.getMessage());

        } catch (LivreIndisponibleException e) {

            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n=== Retour de Java ===");

        try {

            bibliotheque.retourner("Java");

        } catch (LivreIntrouvableException e) {

            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n=== Liste finale ===");
        bibliotheque.afficherLivres();
    }
}
