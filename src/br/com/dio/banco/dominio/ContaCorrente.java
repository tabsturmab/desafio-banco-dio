package br.com.dio.banco.dominio;

public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 100;

    public ContaCorrente(){
        super.agencia = 1;
        super.numeroConta = SEQUENCIAL++;
    }

    @Override
    public void atualiza(double taxa){
        saldo += saldo * 2;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void tipoConta() {

    }

    @Override
    public void depositar (double valor){
        saldo += valor - 0.10;
    }

    @Override
    public void sacar(double valor) {

    }

}
