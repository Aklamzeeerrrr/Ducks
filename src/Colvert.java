public class Colvert extends Canard{

    public Colvert(){
        comportementVol = new VolerAvecDesAiles();
        comportementCancan = new Cancan();
    }

    public void afficher() {
        System.out.println("Je suis un vrai colvert");
    }
}
