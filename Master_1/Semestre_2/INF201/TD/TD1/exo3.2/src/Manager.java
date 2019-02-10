import java.util.List;
import java.util.ArrayList;

public class Manager extends Employe{
	
	private List<Employe> listeEmployes;
	
	public Manager(String nom, String adresse, int anciennete, int commission) {
		super(nom, adresse, anciennete);
		this.listeEmployes=new ArrayList<Employe>();
	}
	
	public double calculeSalaire() {
		return 1500+20*anciennete+this.listeEmployes.size()*100;
	}
	
}
