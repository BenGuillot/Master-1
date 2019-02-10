
public class Multiapp implements Multi{
	@Override
	public void scan() {
		System.out.println("Scanner");
	}
	
	@Override
	public void copy() {
		System.out.println("Copy");
	}
	
	@Override
	public void fax() {
		System.out.println("Fax");
	}
}
