import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Cliente> contas;
	
	
	public Banco(String nome) {
	    this.nome = nome;
	    this.contas = new ArrayList<>();
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getContas() {
		return contas;
	}

	public void setContas(List<Cliente> contas) {
		this.contas = contas;
	}
	
    public void adicionarCliente(Cliente cliente) {
        this.contas.add(cliente);
    }
	  
    public void imprimirClientes() {
	        System.out.println("Clientes do Banco " + this.nome + ":");
	        for (Cliente cliente : this.contas) {
	            System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
	        }
	  	}

}
