package bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {

    private ArrayList<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void emprunter(String titre)
            throws LivreIntrouvableException, LivreIndisponibleException {

        for (Livre livre : livres) {

            if (livre.getTitre().equalsIgnoreCase(titre)) {

                if (!livre.isDisponible()) {

                    throw new LivreIndisponibleException(
                            "Le livre \"" + titre + "\" est déjà emprunté."
                    );
                }

                livre.setDisponible(false);

                System.out.println(
                        "Le livre \"" + titre + "\" a été emprunté avec succès."
                );

                return;
            }
        }

        throw new LivreIntrouvableException(
                "Le livre \"" + titre + "\" n'existe pas dans la bibliothèque."
        );
    }

    public void retourner(String titre)
            throws LivreIntrouvableException {

        for (Livre livre : livres) {

            if (livre.getTitre().equalsIgnoreCase(titre)) {

                livre.setDisponible(true);

                System.out.println(
                        "Le livre \"" + titre + "\" a été retourné."
                );

                return;
            }
        }

        throw new LivreIntrouvableException(
                "Le livre \"" + titre + "\" n'existe pas dans la bibliothèque."
        );
    }

    public void afficherLivres() {

        for (Livre livre : livres) {

            System.out.println(
                    livre.getTitre() +
                            " → " +
                            (livre.isDisponible() ? "Disponible" : "Emprunté")
            );
        }
    }
}

