
public abstract class Canard  {
    //Mettre dans des interfaces ce qui varie chez le canard
 ComportementCancan comportementCancan;
 ComportementVol comportementVol;

 public Canard(){}

 public void effectuerCancan(){
     comportementCancan.cancaner();
 }

 public abstract void afficher();
 public void nager(){
     System.out.println("Tous les canards flottent");
 }

 public void effectuerVol(){
     comportementVol.voler();
 }

 public void setComportementVol(ComportementVol cv){
     comportementVol = cv;
 }

 public void setComportementCancan(ComportementCancan cc){
     comportementCancan = cc;
 }
}
