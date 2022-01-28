package br.com.dio.banco.dominio;

public class ContaCorrenteEspecial extends Conta{
    public ContaCorrenteEspecial(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void depositar (double valor){
        saldo += valor + emprestimo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---------Extrato Conta Corrente Especial--------");
        super.imprimirExtrato();
    }

}
