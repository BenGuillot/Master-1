
public class RobotEnMouvement extends Robot{
	public RobotEnMouvement(int x, int y, Direction d) {
		super(y, y, d);
	}
	
	public void avance() {
		if(direction==Direction.NORD) {
			position.vaAuNord();
			System.out.println("VA AU NORD");
		}
		else if(direction==Direction.SUD) {
			position.vaAuSud();
			System.out.println("VA AU SUD");
		}
		else if(direction==Direction.OUEST) {
			position.vaAOuest();
			System.out.println("VA A L'OUEST");
		}
		else{
			position.vaAEst();
			System.out.println("VA A L'EST");
		}
	}
}
