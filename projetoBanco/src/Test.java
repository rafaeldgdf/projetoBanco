public class Test {
	
	public static void main(String[] args) {
		Banco banco = new Banco("Santander");
		Cliente cliente1 = new Cliente("Rafael", "000.000.000-00");
		banco.adicionarCliente(cliente1);
		Cliente cliente2 = new Cliente("João Silva", "123.456.789-00");
		banco.adicionarCliente(cliente2);
	    Cliente cliente3 = new Cliente("Maria Oliveira", "987.654.321-00");
	    banco.adicionarCliente(cliente3);
	    Cliente cliente4 = new Cliente("Carlos Santos", "111.222.333-44");
	    banco.adicionarCliente(cliente4);
		Cliente cliente5 = new Cliente("Pedro Gabriel", "199.888.333-44");
	  
		
		Conta cc = new ContaCorrente(cliente1);
		cc.depositar(100);

		Conta poupanca = new ContaPoupanca(cliente1);
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		banco.imprimirClientes();

	}

}

//CLASSE = Uma classe é como um molde ou um plano que descreve o que um determinado tipo de objeto será. 
//Ela define atributos (propriedades) e métodos (comportamentos) que os objetos criados a partir dessa classe terão.


// METODO = Um método é uma função definida dentro de uma classe que descreve um comportamento que os objetos da classe podem executar.
// Métodos geralmente operam nos atributos da classe e podem receber parâmetros e retornar valores.