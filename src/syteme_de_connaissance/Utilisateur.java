package syteme_de_connaissance;

public class Utilisateur {

    private String login;
    private String password;

    private int tentatives = 0;
    private boolean bloque = false;

    public Utilisateur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void connecter(String login, String password)
            throws IdentifiantsInvalidesException, CompteBloqueException {

        // Vérifier si le compte est déjà bloqué
        if (bloque) {
            throw new CompteBloqueException(
                    "Compte bloqué. Aucune nouvelle tentative autorisée."
            );
        }

        // Vérifier les identifiants
        if (this.login.equals(login) && this.password.equals(password)) {

            System.out.println("Connexion réussie !");

            // Réinitialiser le compteur
            tentatives = 0;

        } else {

            // Mauvais identifiants
            tentatives++;

            if (tentatives >= 3) {

                // Bloquer le compte
                bloque = true;

                throw new CompteBloqueException(
                        "Compte bloqué après 3 tentatives incorrectes."
                );

            } else {

                throw new IdentifiantsInvalidesException(
                        "Identifiants incorrects. Tentative "
                                + tentatives + "/3"
                );
            }
        }
    }
}
