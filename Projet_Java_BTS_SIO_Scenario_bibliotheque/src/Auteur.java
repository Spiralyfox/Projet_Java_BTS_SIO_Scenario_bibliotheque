public class Auteur {

    String nom;
    String prenom;
    int naissance;

        public Auteur (String nom, String prenom, int naissance) {

            this.nom = nom;
            this.prenom = prenom;
            this.naissance = naissance;
        }


        public void afficherAuteur() {

            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("Date de naissance : " + naissance);

        }

        public void updateAnnee(int newnaissance) {

            this.naissance = newnaissance;

    }
}
