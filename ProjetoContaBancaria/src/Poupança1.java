
public class Poupan�a1 extends ContaCorrente1 {
	
	public Poupan�a1(float saldo, String numero, Cliente1 cliente){
		
		super(saldo, numero, cliente);
	}
	
	public void RenderJuros1(float taxa){
		
		this.setSaldo(this.getSaldo() + (this.getSaldo() * (taxa/100)));
		
	}

	
}
