import java.time.LocalDateTime;

import java.util.logging.*;

public class Metier {
	
	private int val;

	
	public Metier(int val) {
		this.val=val;
	}
	
	public void methode(Logger logger) {
		//logger = Logger.getLogger("logger");
		logger.log(LocalDateTime.now()+ ": Début de methode");
		
		this.val++;
		logger.log(LocalDateTime.now() + ": Fin de methode");
	}

}
