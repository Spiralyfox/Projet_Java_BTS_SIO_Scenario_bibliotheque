import java.util.ArrayList;

public class Livre {

    String titre;
    int nbpages;
    Auteur auteur;
    ArrayList<Genre> genre;

        public Livre(String titre, int nbpages, Auteur auteur, ArrayList<Genre> genre) {

            this.titre = titre;
            this.nbpages = nbpages;
            this.auteur = auteur;
            this.genre = genre;

        }

            public void afficherLivre() {

                System.out.println("Titre : " + titre);
                System.out.println("Nombre de pages : " + nbpages);
                System.out.println("Auteur : " + auteur);

                for (int i = 0 ; i < genre.size() ; i++ ) {
                    System.out.println("Genre : " + genre.get(i).nom + " - Desc : " + genre.get(i).description);

                }
            }

}
