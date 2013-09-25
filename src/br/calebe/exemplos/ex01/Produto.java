//Giovana e Rebeca
package br.calebe.exemplos.ex01;

public class Produto {

    private String nome;
    private double preco;
    private String autor;
    private String editora;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto(String nome, String autor, String editora, double preco){
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object obj) {
        return equals((Produto) obj);
    }

    public boolean equals(Produto obj) {
        return nome.equals(obj.nome);
    }
}
