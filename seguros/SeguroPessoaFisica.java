package seguros;

import contas.Conta; //automaticamente importou

public class SeguroPessoaFisica extends Conta{

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();  //alteração de Conta = new Conta por agora ser uma herança
		cc3.setCliente("Robson Vaamonde");
		cc3.setSaldo (9000);
		System.out.println("Cliente: "+ cc3.getCliente());
		cc3.exibirSaldo();

	}

}
