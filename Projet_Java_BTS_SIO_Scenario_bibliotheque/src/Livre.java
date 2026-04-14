public class Livre {

    String titre;
    int nbpages;
    Auteur auteur;

        public Livre(String titre, int nbpages, Auteur auteur) {

            this.titre = titre;
            this.nbpages = nbpages;
            this.auteur = auteur;
        }

            public void afficherLivre() {

                System.out.println("Titre : " + titre);
                System.out.println("Nombre de pages : " + nbpages);
                System.out.println("Auteur : " + auteur);

            }

}
