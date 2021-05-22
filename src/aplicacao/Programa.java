package aplicacao;

import entidades.Conta;
import entidades.ContaNegocio;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta acc= new Conta(1001,"Alex",0.0);
		ContaNegocio bacc= new ContaNegocio(1002, "Maria",0.0,500.0);
		//UPCASTING
		Conta acc1 = bacc;
		Conta acc2= new ContaNegocio(1003, "Bob",0.0,200.0);
        Conta acc3= new ContaPoupanca(1004,"Anna",0.0,0.01);
        //DOWNCASTING
        ContaNegocio acc4 = (ContaNegocio) acc2;
        acc4.emprestimo(100.0);
       // ContaNegocio acc5 = (ContaNegocio)acc3;
        if(acc3 instanceof ContaNegocio) {
        	ContaNegocio acc5 = (ContaNegocio)acc3;
        	acc5.emprestimo(200.0);
        	System.out.println("Emprestimo");
        }
        if(acc3 instanceof ContaPoupanca) {
        	ContaPoupanca acc5= (ContaPoupanca)acc3;
        	acc5.atualizarSaldo();
        	System.out.println("atualizado");
        }
	}

}
