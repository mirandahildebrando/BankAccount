package brandoBank;

public class Account {
	
	private String ag;
	private String cc;
	private String name;
	private double balance;
	
	static int MAX_LENGHT = 12;
	
	public Account(String ag, String cc, String name) {
		
		this.ag = ag;
		this.cc = cc;
		setName(name);
	}
	
	public void setName(String name) {
		if (name.length() > MAX_LENGHT) {
			this.name = name.substring(0, MAX_LENGHT);
		} else {
			this.name = name;
		}
		System.out.println(this.name);
	}
	
	public boolean withDraw(double value) {
		if(balance < value) {
			return false;
		} else {
		balance -= value;
		System.out.println("valor a retirar: " + value + " , total na conta agora é " + balance);
		return true;
		}
		
	}

}
