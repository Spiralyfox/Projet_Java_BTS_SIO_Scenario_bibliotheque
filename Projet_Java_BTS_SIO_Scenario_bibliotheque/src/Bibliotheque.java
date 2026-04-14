import java.util.ArrayList;

public class Bibliotheque {

    ArrayList<Livre> inventaire;

    public Bibliotheque(ArrayList<Livre> inventaire){

        this.inventaire = inventaire;

    }

    public void ajouterLivre(Livre livre) {

        inventaire.add(livre);

    }

    public void afficherBibliotheque(){

        for (int i = 0 ; i < inventaire.size() ; i++ ) {

            System.out.println("- Titre : " + inventaire.get(i).titre + " - NbPages : " + inventaire.get(i).nbpages + " - Auteur : " + inventaire.get(i).auteur.nom + " " + inventaire.get(i).auteur.prenom + " - Né en : " + inventaire.get(i).auteur.naissance);

        }

    }

}
