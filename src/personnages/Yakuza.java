package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonfavorite, int argent, String clan) {
		super(nom, boissonfavorite, argent);
		this.clan = clan;
		this.reputation=0;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler(" Mon clan est celui de "+clan);
	}
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		gagnerArgent(victime.getArgent());
		parler("J’ai piqué les "+ victime.getArgent()+" sous de "+ victime.getArgent()+", ce qui me fait "+getArgent()+"sous dans ma poche. Hi ! Hi !");
	}
	public int perdre() {
		reputation-=1;
		parler("J’ai perdu mon duel et mes "+getArgent()+" sous, snif... J'ai déshonoré le clan de "+clan);
		return getArgent();
	}
	
	public void gagner (int gain) {
		reputation+=1;
		gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre "+ getNom() +" du clan de "+clan +"?");
	}
}
