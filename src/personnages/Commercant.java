package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonfavorite, int argent) {
		super(nom, "the", argent);

	}
	
	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return getArgent();
	}

	public void recevoir(int aideagent) {
		gagnerArgent(aideagent);;
		parler(aideagent + " sous! ! Je te remercie généreux donateur!");
		boire();
	}
}
