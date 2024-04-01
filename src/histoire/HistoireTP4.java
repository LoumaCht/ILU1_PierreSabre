package histoire;
import personnages.*;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		Commercant commercant = new Commercant("Mariano", "the", 20);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono",50);
		commercant.direBonjour();
		commercant.seFaireExtorquer();
		commercant.recevoir(15);
		}

}
