package personnages;

public class Humain {
	private String  nom;
	private String boissonfavorite;
	private int argent;
	protected Humain[] memoire;
	protected int nbConnaissance;
	
	
	public Humain(String nom ,String boissonfavorite , int argent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
		this.nbConnaissance=0;
		memoire = new Humain[30];
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}

	protected  void parler(String texte) {
		System.out.println("(" + nom + ")" + texte);
	}
	
	protected void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+nom+" et j’aime boire du "+ boissonfavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonfavorite+"! GLOUPS !");
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance <=29) {
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		} else {
			for (int i=0;i<nbConnaissance-1;i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[nbConnaissance-1]=humain;
		}
	}
	private void repondre(Humain humain) {
		this.direBonjour();
		memoriser(humain);
	}
	
	
	public void listerConnaissance(){
		String msg = " Je connais beaucoup de monde dont :";
		for(int i=0; i<nbConnaissance;i++) {
			msg+=  memoire[i].getNom()+"|";
		}
		System.out.println(msg);
	}
	public void faireConnaissanceAvec(Humain humain2) {
		this.direBonjour();
		humain2.repondre(this);
		this.memoriser(humain2);
	}

	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+ prix+ "sous");
			perdreArgent(prix);
		}else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux pas m'offrir un "+bien+" à "+ prix+ "sous");
		}
	}
}
