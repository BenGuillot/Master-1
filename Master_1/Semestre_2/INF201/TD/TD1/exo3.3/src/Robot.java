
public class Robot {
	protected Position position;
	protected Direction direction;
	
	public Robot(int x, int y, Direction d) {
		this.position=new Position(x,y);
		this.direction=d;
	}
	
	public void tourne() {
		if(direction==Direction.NORD) direction=Direction.EST;
		else if(direction==Direction.EST) direction=Direction.SUD;
		else if(direction==Direction.SUD) direction=Direction.OUEST;
		else direction=Direction.NORD;
	}
}
