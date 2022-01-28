package br.com.dio.banco.dominio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Cliente cl1 = new Cliente();
        cl1.setNomeCliente("Andre Silva");

        Conta cc = new ContaCorrente(cl1);
        Conta poupanca = new ContaPoupanca(cl1);
        Conta cce = new ContaCorrenteEspecial(cl1);

        cc.depositar(150.00);
        cc.transferir(50.00, poupanca);

        cce.depositar(500.00);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cce.imprimirExtrato();
    }
}
