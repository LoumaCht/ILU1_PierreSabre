package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;

	public Yakuza(String nom, String boissonfavorite, int argent, String clan ) {
		super(nom, boissonfavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		gagnerArgent(victime.getArgent());
		parler("J’ai piqué les "+ victime.getArgent()+" sous de "+ victime.getArgent()+", ce qui me fait "+getArgent()+"sous dans ma poche. Hi ! Hi !");
	}
}
