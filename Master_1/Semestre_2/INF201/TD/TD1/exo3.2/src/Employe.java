
public class Employe {
	protected final String nom;
	protected final String adresse;
	protected final int anciennete;

	public Employe(String nom, String adresse, int anciennete) {
		this.nom=nom;
		this.adresse=adresse;
		this.anciennete=anciennete;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getAdresse() {
		return this.adresse;
	}
	
	public int getAnciennete() {
		return this.anciennete;
	}
	
	public double calculeSalaire() {
		return 1500+20*anciennete;
	}
}
