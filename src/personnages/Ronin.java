package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(String nom, String boissonfavorite, int argent) {
		super(nom, boissonfavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int donnation = (int) (getArgent() * 0.10); 
		parler(beneficiaire.getNom() + " prend ces " + donnation + " sous");
		beneficiaire.recevoir(donnation);
		perdreArgent(donnation);
	}
}
