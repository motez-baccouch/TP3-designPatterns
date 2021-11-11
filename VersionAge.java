package ex3;

import java.util.List;

public class VersionAge implements Version{

	@Override
	public void affiche(List<VueProduit> produits) {
		for(VueProduit prod : produits) {
			prod.affiche();
			System.out.println("");
		}
	}

}
