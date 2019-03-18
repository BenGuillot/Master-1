/*
   Composite permet de créer des structures hiérarchiques pour des relations
   tout-partie. 
 */

interface Element {
	public void print();
}

////////////////////////////////////

class Fichier implements Element {
	@Override
	public void print(){
		System.out.Println("je suis un fichier");
	}
}

////////////////////////////////////

class Dossier implements Element {
	
	private List<Element> contenu = new ArrayList <Element>();
	
	@Override
	public void print(){
		System.out.Println("je suis un dossier");
		for (Element e : contenu){
			e.print();
		}
	}
	
	public void add(Element e){
		contenu.add(e);
	}
}
