import java.util.Scanner;

/**
 * VOITURE AVEC CONSTRUCTEUR PAR DEFAUT DE JAVA (IMPLICITE)
 */
public class Voiture1 {

    private String nomDeLaMarque;
    private String nomDuModele;
    private int nombreDePortes;
    private int nombreDesPlaces;
    private int nombreDeCv;


    public String getNomDeLaMarque() {
        return nomDeLaMarque;
    }

    public String getNomDuModele() {
        return nomDuModele;
    }

    public int getNombreDePortes() {
        return nombreDePortes;
    }

    public int getNombreDesPlaces() {
        return nombreDesPlaces;
    }

    public int getNombreDeCv() {
        return nombreDeCv;
    }


    public void afficherLeTypeDeLaVoiture() {
        if (nombreDeCv <= 5)
            System.out.printf("%s %s est economique \n", nomDeLaMarque, nomDuModele);
        else
            System.out.printf("%s %s est non economique \n", nomDeLaMarque, nomDuModele);

    }

    public void lireleNomDeLaMarqueDepuisLeClavier() {
        System.out.println("Saisir le nom de la marque");
        nomDeLaMarque = new Scanner(System.in).nextLine();
    }

    public void lireleNomDuModeleDepuisLeClavier() {
        System.out.println("Saisir le nom du modele");
        nomDuModele = new Scanner(System.in).nextLine();
    }

    public void lireleNombreDesPortesDepuisLeClavier() {
        System.out.println("Saisir le nombre des portes");
        nombreDePortes = new Scanner(System.in).nextInt();
    }

    public void lireleNombreDesPlacesDepuisLeClavier() {
        System.out.println("Saisir le nombre des places");
        nombreDesPlaces = new Scanner(System.in).nextInt();
    }

    public void lireleNombreDeCvDepuisLeClavier() {
        System.out.println("Saisir le nombre de Cv");
        nombreDeCv = new Scanner(System.in).nextInt();
    }

    public void lireAttributs(){
        lireleNomDeLaMarqueDepuisLeClavier();
        lireleNomDuModeleDepuisLeClavier();
        lireleNombreDesPlacesDepuisLeClavier();
        lireleNombreDesPortesDepuisLeClavier();
        lireleNombreDeCvDepuisLeClavier();
    }
}