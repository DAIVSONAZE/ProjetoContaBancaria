
public class ContaCorrente1 {
	
	private float saldo;
	private String numero;
	private Cliente1 cliente;
	
	public ContaCorrente1(float saldo, String numero, Cliente1 cliente){
		
		this.setSaldo(saldo);
		this.setNumero(numero);
		this.setCliente(cliente);
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente1 getCliente() {
		return cliente;
	}

	public void setCliente(Cliente1 cliente) {
		this.cliente = cliente;
	}
	
	public void Creditar( float saldo){
		this.setSaldo(this.getSaldo() + saldo);
		
	}
	
	
	public boolean Debitar( float saldo){
		
		if(this.getSaldo() >= saldo){
			
			this.setSaldo(this.getSaldo() - saldo);
			return true;
		}
		
		return false;
	}
	

}
