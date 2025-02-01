package brandoBank;

public class App {

	public static void main(String[] args) {
		
		//criar uma conta (agencia, conta, nome)
		// limitar o nome = 12 caracteres
		
		System.out.println("Hello world");
		
		Account account = new Account("0001", "1234", "Seu barriga");
		
		boolean succed = account.withDraw(200.0);
		if(!succed) {
			System.out.println("Você não tem saldo suficiente para sacar");
		}

		// sacar valores
		// não pode sacar mais do que tem
		// depositar 
		// informar para o usuário as operações (saque, deposito)

	}
}
