/*
	Factory method permet la création d’objets sans préciser explicitement la classe à utiliser. Les
	objets sont créés en utilisant une méthode de fabrication redéfinie dans des sous-classes.
*/

public class Client {

	public static void main(String[] args) {

		ComplexeIndustriel usinePomme = new UsinePomme();
		ComplexeIndustriel usinePoire = new UsinePoire();	
		
		Fruit fruit1 = null;
		System.out.println("Utilisation de la premiere fabrique");
		fruit1 = usinePomme.getFruit(); 
		fruit1.afficheFruit(); // "Je suis une Pomme"

		Fruit fruit2 = null;
		System.out.println("Utilisation de la seconde fabrique");
		fruit2 = usinePoire.getFruit(); 
		fruit2.afficheFruit(); // "Je suis une Poire"
	}	
}

////////////////////////////////////////////

public abstract class ComplexeIndustriel {

	public Fruit getFruit() {
		return createFruit();
	}

	protected abstract Fruit createFruit();
}

////////////////////////////////////////////

public class UsinePomme extends ComplexeIndustriel {

	protected Fruit createFruit() {
		return new Pomme();
	}
}

///////////////////////////////////////////

public class ProduitFactory2 extends ComplexeIndustriel {
	protected Fruit createFruit() {
		return new Poire();
	}
}

///////////////////////////////////////////

public abstract class Fruit {
	public abstract void afficheFruit();
}

//////////////////////////////////////////

public class Pomme extends Fruit {
	
	public void afficheFruit() {
		System.out.println("Je suis une Pomme");
	}
}

//////////////////////////////////////////

public class Poire extends Fruit {
	public void afficheFruit() {
		System.out.println("Je suis une Poire");
	}
}