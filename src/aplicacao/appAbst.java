package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class appAbst {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Conta>lista= new ArrayList<>();
		
		lista.add(new ContaPoupanca(1001,"Alex", 500.00,0.01));
		lista.add(new ContaEmpresarial(1002,"Maria",1000.0, 400.0));
		lista.add(new ContaPoupanca(1004,"Bob",300.0,0.01));
		lista.add(new ContaEmpresarial(1005,"Ana",500.0,500.0));
		//totalizar o saldo dessas contas
		double soma=0.0;
		for(Conta acc : lista) {
			soma = soma + acc.getSaldo();
		}
		System.out.printf("Total saldo: %.2f%n", soma);
		System.out.println("-------------------------");
		
		for(Conta acc : lista) {
			acc.deposito(10.0);
		}
		for(Conta acc : lista) {
			System.out.printf("Atualizado saldo da Conta %d: %.2f%n", acc.getNumero(),acc.getSaldo());		
		}
		
	}

}
