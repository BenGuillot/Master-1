import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		RobotEnMouvement r1=new RobotEnMouvement(3,2,Direction.NORD);
		RobotEnMouvement r2=new RobotEnMouvement(1,1,Direction.SUD);
		RobotEnMouvement r3=new RobotEnMouvement(4,5,Direction.OUEST);
		
		List <RobotEnMouvement> liste=new ArrayList <RobotEnMouvement>();
		liste.add(r1);
		liste.add(r2);
		liste.add(r3);
		for(int i=0;i<liste.size();i++) {
			liste.get(i).avance();
		}
	}

}
