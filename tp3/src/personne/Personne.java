package personne;

import java.util.Calendar;

public class Personne {
   
    private String nom;
    private String prenom;
    private String sexe;
    private int anneeNaissance;
    private String etatCivil;
    private boolean conjoint;

   
    public Personne(String nom, String prenom, String sexe, int anneeNaissance, String etatCivil, boolean conjoint) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.anneeNaissance = anneeNaissance;
        this.etatCivil = etatCivil;
        this.conjoint = conjoint;
    }

 
    public void retourneInfos() {
        String titre = "";
        if (sexe.equals("mâle")) {
            titre = "M.";
        } else if (sexe.equals("femelle") && etatCivil.equals("marié")) {
            titre = "Mme.";
        } else if (sexe.equals("femelle") && etatCivil.equals("célibataire")) {
            titre = "Mlle.";
        } else {
            titre = "";
        }
        System.out.println(titre + " " + nom.toUpperCase() + " " + prenom + " est né(e) en " 
                + anneeNaissance + ", il/elle est " + etatCivil + "."); 
    }
    public int age(Personne p) {
        int anneeActuelle = Calendar.getInstance().get(Calendar.YEAR);
        return anneeActuelle - p.anneeNaissance;
    }
    public static void main(String[] args) {
       
        Personne homme = new Personne("Abidi", "Ali", "mâle",1975, "célibataire", false);
        Personne femme = new Personne("Allani", "Wassila", "femelle",1980, "célibataire", false);
        homme.retourneInfos();
        System.out.println("Âge : " + homme.age(homme) + " ans\n");

        femme.retourneInfos(); 
        System.out.println("Âge : " + femme.age(femme) + " ans");
    }
}