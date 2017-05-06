
public class TesteConta1 {

	public static void main(String[] args) {
		
		// classe Cliente--------------------------------------------
			
		Cliente1 clienteUm = new Cliente1("Daivson", "025698715-25");
		Cliente1 clienteDois = new Cliente1("Carla", "456987156-89");
		
		// classe ContaCorrente1--------------------------------------------
		
		ContaCorrente1 Conta = new ContaCorrente1(500.00f, "123456", clienteUm  );
		
		
		System.out.println("Saldo R$ " + Conta.getSaldo());
		System.out.println("Conta :" + Conta.getCliente().getCpf());
		System.out.println("Nome :" + Conta.getCliente().getNome());
		
		// Ap�s o uso dos metodos da classe ContaCorrente1...
		
		
		Conta.Creditar(200.00f);
		if (Conta.Debitar(50.00f))
			System.out.println("O saldo do cliente ap�s o d�bito - R$ " + Conta.getSaldo());
		else
			System.out.println("Saldo insuficiente para d�bito!");
		
	
		// resultado:
		
		System.out.println("o novo credito � de R$ " + Conta.getSaldo());
		
		
		
		
		// classe Poupan�a1--------------------------------------------
		
		Poupan�a1 poupe = new Poupan�a1(200.00f, "256178", clienteDois);
		
		System.out.println("Saldo poupan�a R$ " + poupe.getSaldo());
		System.out.println("numero conta :" + poupe.getNumero());
		System.out.println("Nome do poupador :" + poupe.getCliente().getNome());
		
		
		// Ap�s o uso do metodo da classe Poupan�a1...
		
		poupe.RenderJuros1(10);
		
		// resultado:
		
		System.out.println("O novo saldo da poupan�a - R$ " + poupe.getSaldo());
		
		
	}

}
