package polymorphism;

public class FileLooger extends BaseLogger{
	public void log (String logMessage) {
		System.out.println("Log to file.. : "+ logMessage);
	}
}
