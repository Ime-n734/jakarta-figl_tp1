package Systeme_bancaire_avance;

public class Main

{

    public static void main(String[] args) {

        Compte compte = new Compte("C001", 1000);

        try {

            compte.deposer(500);

            compte.retirer(200);

            compte.retirer(5000);

        } catch (MontantInvalidException e) {

            System.out.println(
                    "Erreur : " + e.getMessage()
            );

        } catch (SoldeInsuffisantException e) {

            System.out.println(
                    "Erreur : " + e.getMessage()
            );

        }
        finally {

            System.out.println(
                    "Opération terminée."
            );

            System.out.println(
                    "Solde final : " + compte.getSolde()
            );
        }
    }
}
