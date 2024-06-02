


//declaração de classe interface
public interface InterfaceConta {
	
//Interface: classe abstrata com todos os métodos abstratados. 
// Uma classe que obriga todo mundo que quer extender 
// Toda interface tem que ter método public 
// Defini o contrato de uso	
	
    public void sacar(double valor);


    public void depositar(double valor);


    public void transferir(double valor, Conta contaDestino);
    
    
    public void imprimirExtrato();

}
