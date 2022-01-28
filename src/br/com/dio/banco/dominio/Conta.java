package br.com.dio.banco.dominio;

public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 0001;

    protected Integer agencia;
    protected Integer numeroConta;
    protected Double saldo = 0.0d;
    protected double taxa;
    protected String tipoConta;

    public Conta() {
    }
    public Conta(Integer agencia, Integer numeroConta, Double saldo, double taxa, String tipoConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.taxa = taxa;
        this.tipoConta = tipoConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
