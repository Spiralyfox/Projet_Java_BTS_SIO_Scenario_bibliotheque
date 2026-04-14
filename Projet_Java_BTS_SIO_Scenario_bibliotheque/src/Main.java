import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Livre> inventaire= new ArrayList<Livre>();

        Genre g1 = new Genre("Fable", "Waw");
        Genre g2 = new Genre("Fiction", "Insane");
        Genre g3 = new Genre("Roman_policier", "PinPon");

        Auteur a1 = new Auteur("Saint-Exupéry", "Antoine", 1902);
        Auteur a2 = new Auteur("Camus", "Albert", 1913);

        ArrayList<Genre> Genre1 = new ArrayList<Genre>();
        Genre1.add(g1);
        ArrayList<Genre> Genre2 = new ArrayList<Genre>();
        Genre2.add(g2);
        ArrayList<Genre> Genre3 = new ArrayList<Genre>();
        Genre3.add(g3);

        Livre l1 = new Livre("Le Petit Prince", 96, a1, Genre1);
        Livre l2 = new Livre("Vol de nuit", 248, a1, Genre2);
        Livre l3 = new Livre("L’Étranger", 184, a2, Genre3);

        Bibliotheque b1 = new Bibliotheque(inventaire);

        a1.afficherAuteur();
        a2.afficherAuteur();

        b1.ajouterLivre(l1);
        b1.ajouterLivre(l2);
        b1.ajouterLivre(l3);

        b1.afficherBibliotheque();

        System.out.println("=== Test de changement de date de naissance :");

        a1.afficherAuteur();
        a1.updateAnnee(2037);
        a1.afficherAuteur();

        System.out.println("=== Test Affichage Livre avec Genre :");

        l1.afficherLivre();
        l2.afficherLivre();
        l3.afficherLivre();

    }
}