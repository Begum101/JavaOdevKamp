package polymorphisimDemo;

public class Main {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.Log("Log mesaj�");
		DatabaseLogger loggerD = new DatabaseLogger();
		loggerD.Log("logland�");
	}

}
