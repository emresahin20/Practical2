package polimorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		//BaseLogger [] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(),new EmailLogger()};

	//	for(BaseLogger logger : loggers) {
	//		logger.Log("Log Mesajı :");
		//}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
