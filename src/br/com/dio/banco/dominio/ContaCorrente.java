package br.com.dio.banco.dominio;

public class ContaCorrente extends Conta{

    @Override
    public void atualiza(double taxa){
        saldo += saldo * 2;
    }
    @Override
    public void depositar (double valor){
        saldo += valor - 0.10;
    }

}
