package polymorphism;

public class DatabaseLogger extends BaseLogger{
	public void log (String logMessage) {
		System.out.println("Log to data.. : "+ logMessage);
	}
}
