package polymorphism;

public class ConsoleLogger extends BaseLogger{
	public void log (String logMessage) {
		System.out.println("Log to console.. : "+ logMessage);
	}
}
