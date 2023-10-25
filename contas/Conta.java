package contas;

public class Conta {
	//atributos 
	private String cliente;
	public String getCliente() { //método com retorno e o uso do encapsulamento! get e set
		return cliente;
	}
	public void setCliente(String cliente) { //método sem retorno da passagem da variavel cliente como parametro 
		this.cliente = cliente;
	}
	private double saldo;
	public double getSaldo() { //método com retorno 
		return saldo;
	}
	public void setSaldo(double saldo) { //método sem retorno da passagem da variavel cliente como parametro 
		this.saldo  = saldo;
	}
	//construtor
	public Conta() { //mesmo nome da classe
		System.out.println("Agência: 0261");
	}
	//métodos
	protected void exibirSaldo() {
		System.out.println("Saldo: R$" + saldo);
	}
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$" + valor);
		
	}
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$" + valor);		
	}
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);
		
	}
	
	//método com retorno não usa void
	
	double soma(double cc1, double cc2)  { //com retorno e parametro
		double total = cc1 + cc2;
		return total;
		
		
		
	}
}
