
public class Position {
	
	public int x;
	public int y;
	
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void vaAuNord() {
		this.x++;
	}
	
	public void vaAuSud() {
		this.x--;
	}
	
	public void vaAEst() {
		this.y++;
	}
	
	public void vaAOuest() {
		this.y--;
	}

}
