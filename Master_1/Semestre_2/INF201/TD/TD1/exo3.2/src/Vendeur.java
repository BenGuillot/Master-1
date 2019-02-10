
public class Vendeur extends Employe{
	
	private int commission;
	
	public Vendeur(String nom, String adresse, int anciennete, int commission) {
		super(nom, adresse, anciennete);
		this.commission=commission;
	}
	
	public double calculeSalaire() {
		return 1500+20*anciennete+commission;
	}
}
