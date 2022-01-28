package br.com.dio.banco.dominio;

public class ContaPoupanca extends Conta {

    @Override
    public void depositar(double saldo) {

    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void atualiza (double taxa){
        saldo += saldo * taxa * 3;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void tipoConta (){
        System.out.println("Tipo de Conta");
    }
}
