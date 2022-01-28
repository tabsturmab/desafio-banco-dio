package br.com.dio.banco.dominio;

public interface IConta {

    void depositar (double saldo);
    void sacar (double valor);
    void atualiza (double taxa);
    void transferir(double valor, Conta contaDestino);
    void tipoConta();
}
