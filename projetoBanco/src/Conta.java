

//classe abstrata garante que apenas os filhos desta classe consigam usa-las  
public abstract class Conta implements InterfaceConta {	
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1; //constante que gera valor sequencial
	
	protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
  
    public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++; //autoimplementação 
		this.cliente = cliente;
	}
    
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;	// saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;	// saldo += valor;
	}
		
	

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
    
   
   
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    

}
