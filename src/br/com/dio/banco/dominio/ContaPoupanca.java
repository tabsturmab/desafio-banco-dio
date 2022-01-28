package br.com.dio.banco.dominio;

public class ContaPoupanca extends Conta {

    @Override
    public void atualiza (double taxa){
        saldo += saldo * taxa * 3;
    }
    @Override
    public void tipoConta (){
        System.out.println("Tipo de Conta");
    }
}
