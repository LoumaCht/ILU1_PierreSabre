package histoire;
import personnages.*;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		Commercant mariano = new Commercant("Mariano", "the", 20);
		Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30,"Warsong");
		Ronin ronin = new Ronin("Roro"," shochu",60);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono",50);
		mariano.direBonjour();
		mariano.seFaireExtorquer();
		mariano.recevoir(15);
		mariano.boire();
		yakuza.direBonjour();
		yakuza.extorquer(mariano);
		mariano.seFaireExtorquer();
		ronin.direBonjour();
		ronin.donner(mariano);
		}

}
