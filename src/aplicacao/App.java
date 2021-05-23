package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class App {

	public static void main(String[] args) {
		
		Conta acc1= new Conta(1001,"Alex",1000.0);
		acc1.saque(200.0);
		System.out.println(acc1.getSaldo());
		
		Conta acc2= new ContaPoupanca(1002,"Maria",1000.0,0.01);
	    
		acc2.saque(200.0);
		System.out.println(acc2.getSaldo());
		
		Conta acc3= new ContaEmpresarial(1003,"Bob",1000.0,500.0);
		acc3.saque(200.0);
		System.out.println(acc3.getSaldo());
		
	}

}
