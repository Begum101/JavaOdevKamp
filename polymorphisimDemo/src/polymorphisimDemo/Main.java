package polymorphisimDemo;

public class Main {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.Log("Log mesajý");
		DatabaseLogger loggerD = new DatabaseLogger();
		loggerD.Log("loglandý");
	}

}
