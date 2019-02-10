
public class ConsoleLogger implements Logger{
	public ConsoleLogger() {
		
	}
	
	public void log(String string) {
		System.out.println(string);
	}
}
