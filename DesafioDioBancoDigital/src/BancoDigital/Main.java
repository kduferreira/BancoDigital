package BancoDigital;

public class Main {

	public static void main(String[] args) {
		
		Banco bradesco = new Banco("Banco do Bradesco");
	
		Cliente cliente = new Cliente("dudu");
		Cliente cliente2 = new Cliente("Buk");
		Conta  cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		Conta cc2 = new ContaCorrente(cliente2);
		Conta poupanca2 = new ContaPoupanca(cliente2);
		
		
		bradesco.adicionarConta(cc);
		bradesco.adicionarConta(poupanca);
		bradesco.adicionarConta(cc2);
		bradesco.adicionarConta(poupanca2);
		
		
		cc.depositar(300);
		poupanca.depositar(100);
		cc.transferir(10, cc2);
		poupanca2.depositar(700);
		cc2.depositar(900);
		
		bradesco.listarContas();
		
		Banco itau = new Banco("Banco do Itau");
		Cliente cliente3 = new Cliente("Neymar");
		
		Conta cc3 = new ContaCorrente(cliente3);
		Conta poupanca3 = new ContaPoupanca(cliente3);
		itau.adicionarConta(cc3);
		itau.adicionarConta(poupanca3);
		
	}

}
