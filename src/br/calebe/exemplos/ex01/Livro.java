//Giovana e Rebeca
package br.calebe.exemplos.ex01;

public class Livro extends Produto{

    private String autor;
    private String editora;

    public Livro(String nome, String autor, String editora, double preco){
        super(nome, preco);
        this.autor = autor;
        this.editora = editora;
    }
    
    @Override
    public boolean equals(Object obj) {
        return equals((Livro) obj);
    }

}
