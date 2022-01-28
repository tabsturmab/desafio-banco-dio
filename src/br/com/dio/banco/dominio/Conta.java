package br.com.dio.banco.dominio;

public abstract class Conta {
    protected Double saldo = 0.0d;
    private String tipoConta;
    private double taxa;

    public Conta() {
    }

    public Conta(/*Double saldo,*/ String tipoConta, double taxa) {
        //this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.taxa = taxa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void depositar (double saldo){
        this.saldo += saldo;
    }
    public  void sacar (double valor) {
        this.saldo -= saldo;
    }
    public void atualiza (double taxa) {
        saldo += saldo * taxa;
    }

    public void tipoConta(){
        System.out.println("Tipo de Conta");
    }


}
