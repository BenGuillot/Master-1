import java.util.Observable

//Classe représentant un GPS (appareil permettant de connaître sa position).
public class Humain extends Observable{
        
        private int x;
        private int y;
        
        // Constructeur.
        public Humain(){
			x=0;
            y=0;
        }
        
        public void notifierObservateurs(){
            setChanged();// Méthode de l'API.
			notifyObservers();// Egalement une méthode de l'API.
        }

        public void setMesures(int nx, int ny){
			this.x=nx;
            this.y=ny;
            notifierObservateurs();
        }
        
        public int getX(){
			return this.x;
		}
		
		public int getY(){
			return this.y;
		}

}


////////////////////////////////////////////////////////

//Affiche un résumé en console des informations (position) du GPS.
public class GPS implements Observer{
        // Méthode appelée automatiquement lors d'un changement d'état du GPS.
        public void update(Observable o, Object obj){
			if(o instanceof Humain){       
				Humain h = (Humain) o;
                System.out.println("Position : "+ h.getX() + " " + h.getY());
            }       
        }
}

////////////////////////////////////////////////////////////

//Classe principale du projet observeurApi.
public class Main{
	
        // Méthode principale.
        public static void main(String[] args){
                // Création de l'objet Humain observable.
                Humain humain = new Humain();
                // Création d'un observeur
                GPS gps = new GPS();
                // On ajoute GPS comme observeur de Humain.
                humain.addObserver(gps);
                // On simule l'arrivée de nouvelles valeurs.
                humain.seDeplace(1,2); // GPS va afficher "Position 1 2"
                // Nouvelle simulation d'arrivée de nouvelles valeurs.
                humain.seDeplace(3,2); // GPS va afficher "Position 3 2"
        }
}
