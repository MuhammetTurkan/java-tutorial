package polymorphism;

public class Main {

	public static void main(String[] args) {
		FileLooger  fileLogger =new FileLooger();
		fileLogger.log("log mesajý..");
		System.out.println("");
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.log("log mesajý..");
		System.out.println("");
		
		CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
		customerManager.add();
	}

}
