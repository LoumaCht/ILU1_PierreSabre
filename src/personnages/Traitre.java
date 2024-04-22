package personnages;

import java.util.Random; 
public class Traitre extends Samourai {
	private int niveauTraitise;

	public Traitre(String seigneur, String nom, String boissonfavorite, int argent) {
		super(seigneur, nom, boissonfavorite, argent);
		this.niveauTraitise=0;
		
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+ niveauTraitise+" Chut !");
	}
	
	public void  ranconner(Commercant commercant) {
		if(niveauTraitise<3) {
			int argentCommercant =commercant.getArgent();
			int argentRanconner=(argentCommercant*2)/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			parler("- Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi "+argentRanconner +" sous ou gare à toi !");
			commercant.parler("Tout de suite grand "+getNom()+" ");
			niveauTraitise++;
		}else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void  faireLeGentil() {
		if (nbConnaissance<1){
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		}else {
			int don = getArgent()/20;
		    Random random = new Random();
		    int indiceAleatoire = random.nextInt(nbConnaissance);
		    Humain humain = memoire[indiceAleatoire];
			String nomAmi= humain.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+nomAmi);
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+don+" sous.");
			humain.gagnerArgent(don);
			perdreArgent(don);
			String nom=getNom();
			humain.parler("Merci "+nom+" Vous êtes quelqu'un de bien.");
			if (niveauTraitise>1) {
				niveauTraitise--;
			}
		}
	}
}
