package br.com.dio.banco.dominio;

public class Cliente {

    private String nome;
    private Integer idade;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, Integer idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }


}
