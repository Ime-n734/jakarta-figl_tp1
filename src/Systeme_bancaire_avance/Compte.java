package Systeme_bancaire_avance;

public class Compte {
    private String numero;
    private double solde;
    public Compte(String numero, double soldeInitial) {
        this.numero = numero;
        this.solde = soldeInitial;
    }
    public void deposer(double montant) throws MontantInvalidException {
        if(montant<0){
            throw new MontantInvalidException("veuillez entrer un montant superieur a 0 ");
        }
        this.solde = solde+montant;
        System.out.println(
                "Dépôt de " + montant + " effectué."
        );

    }
    public void retirer(double montant)
            throws SoldeInsuffisantException , MontantInvalidException {
        if(montant<=0){
            throw new MontantInvalidException
                    ("veuillez entrer un montant superieur a 0 ");}
        if (montant > solde) {
            throw new SoldeInsuffisantException(
                    "Solde insuffisant pour effectuer le retrait."
            );
        }

        solde -= montant;
        System.out.println(
                "retrait de " + montant + " effectué."
        );
    }

    public double getSolde() {
        return solde;
    }
}
