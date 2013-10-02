//Giovana e Rebeca
package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;
    private List<Livro> livros;
    private double total;

    public Carrinho() {
        produtos = new ArrayList<>();
        livros = new ArrayList<>();
    }

    public void add1(Produto produto) {
        produtos.add(produto);
    }
    
    public void add2(Livro livro) {
        livros.add(livro);
    }

    public Produto menorProduto() throws CarrinhoVazioExpected {
        if (produtos.isEmpty()) {
            throw new CarrinhoVazioExpected();
        }
        Produto menor = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() < menor.getPreco()) {
                menor = produto;
            }
        }
        return menor;
    }
    
    public Livro menorLivro() throws CarrinhoVazioExpected {
        if (livros.isEmpty()) {
            throw new CarrinhoVazioExpected();
        }
        Livro menor = livros.get(0);
        for (Livro livro : livros) {
            if (livro.getPreco() < menor.getPreco()) {
                menor = livro;
            }
        }
        return menor;
    }
    
    public void remove(Produto produto) throws CarrinhoVazioExpected{
        if (produtos.isEmpty()) {
            throw new CarrinhoVazioExpected();
        }
        else
           produtos.remove(produto);
    }
    
    public double TamanhoList(){
        return produtos.size();
    }
    
    public double Total(Produto produto) throws CarrinhoVazioExpected{
        total = produto.getPreco();
        return total;
    }
}
