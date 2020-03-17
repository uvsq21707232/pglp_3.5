package Abdelhafid.pglp_3_5;



public class UneClasseMetier {
	private AfficherMetier af;

	public UneClasseMetier( final AfficherMetier af) {
		
		this.af = af;
	}
	
	public void uneMethodeMetier() {
		this.af.afficherTemp(": Début de uneMethodeMetier");
		
		// traitement Metiers
		
		this.af.afficherTemp(": Fin de uneMethodeMetier");
		
	}

public void uneMethodeMetierSlf4j() {
	
		this.af.afficherTempSlf4j(": Début de uneMethodeMetier");
		// traitement Metiers
		
		this.af.afficherTempSlf4j(": Fin de uneMethodeMetier");
		
	}
}
