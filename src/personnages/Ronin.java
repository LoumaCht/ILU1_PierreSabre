package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(String nom, String boissonfavorite, int argent, int honneur) {
		super(nom, boissonfavorite, argent);
		this.honneur=honneur=1;
	}
	
	public void donner(Commercant beneficiaire) {
		int donnation = (int) (getArgent() * 0.10); 
		parler(beneficiaire.getNom() + " prend ces " + donnation + " sous");
		beneficiaire.recevoir(donnation);
		perdreArgent(donnation);
	}	
	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		if (force >= adversaire.getReputation()) {
			honneur+=1;
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit "+adversaire.getNom());
			gagnerArgent(adversaire.perdre());
		}else {
			honneur-=1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(getArgent());
			adversaire.parler("Je l'ai dépouillé de ses " +getArgent()+" sous");
			perdreArgent(getArgent());
			
		}
	}
	
}
