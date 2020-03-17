package Abdelhafid.pglp_3_5;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfficherMetier implements AffichageMetierInterface {
	
	final Logger log;

	public AfficherMetier(Logger log) {
		
		this.log = LoggerFactory.getLogger(AfficherMetier.class);
	}
	
	/*affichage du log*/
	
	public void afficherTemp() {
		
		System.out.println (LocalDateTime.now());
		
	}
	/*affichage du log avec Slf4j*/
    public void afficherTempSlf4j(String desc) {
    	log.info(LocalDateTime.now()+ desc);
		
	}
}
