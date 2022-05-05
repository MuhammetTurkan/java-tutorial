package polymorphism;

public class EmailLogger extends BaseLogger{
	public void log (String logMessage) {
		System.out.println("Log to email.. : "+ logMessage);
	}
}
