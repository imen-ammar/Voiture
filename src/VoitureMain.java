public class VoitureMain {

    public static void main(String[] args) {

        Voiture1 voiture1 = new Voiture1();
        voiture1.lireAttributs();
        voiture1.afficherLeTypeDeLaVoiture();
        System.out.println("----------------------------------------");

        Voiture2 voiture2 = new Voiture2();
        voiture2.afficherLeTypeDeLaVoiture();
        System.out.println("----------------------------------------");

        Voiture3 voiture3 = new Voiture3("Mercedes", "W204", 5, 5, 11);
        voiture3.afficherLeTypeDeLaVoiture();

    }
}
