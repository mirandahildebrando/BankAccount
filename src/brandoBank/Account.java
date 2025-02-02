package brandoBank;

public class Account {
	
	static int MAX_LENGHT = 12;
	
	private String ag;
	private String cc;
	private String name;
	private double balance;
	
	
	
	private Log logger;
	
	public Account(String ag, String cc, String name) {
		
		this.ag = ag;
		this.cc = cc;
		setName(name);
		logger = new Log();
	}
	
	public void setName(String name) {
		if (name.length() > MAX_LENGHT) {
			this.name = name.substring(0, MAX_LENGHT);
		} else {
			this.name = name;
		}
		System.out.println(this.name);
	}
	
	public void deposit (double value) {
		balance += value;
		logger.out("DEPOSITO - R$ " + value + " Sua conta agora é de R$ " + balance);
	}
	
	public boolean withDraw(double value) {
		if(balance < value) {
			logger.out("SAQUE - R$ " + value + " Seu saldo atual é de R$ " + balance);
			return false;
		} else {
		balance -= value;
		logger.out("SAQUE - R$ " + value + " Sua conta agora é de R$ " + balance);
		return true;
		}
		
	}

}
