import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Livre> inventaire= new ArrayList<Livre>();

        Auteur a1 = new Auteur("Saint-Exupéry", "Antoine", 1902);
        Auteur a2 = new Auteur("Camus", "Albert", 1913);

        Livre l1 = new Livre("Le Petit Prince", 96, a1);
        Livre l2 = new Livre("Vol de nuit", 248, a1);
        Livre l3 = new Livre("L’Étranger", 184, a2);

        Bibliotheque b1 = new Bibliotheque(inventaire);

        a1.afficherAuteur();
        a2.afficherAuteur();

        b1.ajouterLivre(l1);
        b1.ajouterLivre(l2);
        b1.ajouterLivre(l3);

        b1.afficherBibliotheque();

    }
}