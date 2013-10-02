//Giovana e Rebeca
package br.calebe.exemplos.ex01;

import org.junit.Assert;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class CarrinhoTest {

    private Carrinho carrinho;

    @Before
    public void criandoCarrinho() {
        carrinho = new Carrinho();
    }

    @Test(expected = CarrinhoVazioExpected.class)
    public void colocandoZeroProduto() throws CarrinhoVazioExpected {
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{null}, new Object[]{menor});
    }

    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add1(livro);
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{livro}, new Object[]{menor});
    }

    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add1(livro);
        Produto deitel = new Produto("Java: como programar", 150.00);
        carrinho.add1(deitel);
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{livro}, new Object[]{menor});
    }

    @Test
    public void identidadeDeProdutos() throws CarrinhoVazioExpected {
        Produto original = new Produto("Java em 24 horas", 50.00);
        carrinho.add1(original);
        Produto copia = new Produto("Java em 24 horas", 50.00);
        original = carrinho.menorProduto();
        assertArrayEquals(new Object[]{original}, new Object[]{copia});
    } 
   
    @Test (expected =IllegalArgumentException.class)
    public void colocarNull() throws CarrinhoVazioExpected {
        carrinho.add1(null);
    }
    
    @Test
    public void addLivro() throws CarrinhoVazioExpected{
        Livro livro = new Livro("Use a Cabeça Java", "Sierra,Kathy", "Alta Books", 129.90);
        carrinho.add2(livro);
        Livro menor;
        menor = carrinho.menorLivro();
        assertArrayEquals(new Object[]{livro}, new Object[]{menor});
    }
    
    @Test
    public void tirarUmProduto() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add1(livro);
        Produto menor;
        menor = carrinho.TamanhoList();
        carrinho.remove(livro);
        Produto depois;
        depois = carrinho.TamanhoList();
        Assert.assertEquals(menor,depois);
    }
    
    @Test
    public void calcularTotal () throws CarrinhoVazioExpected {
        Livro livro = new Livro("Use a Cabeça Java", "Sierra,Kathy", "Alta Books", 129.90);
        carrinho.add2(livro);
        Produto pasta = new Produto("Branca", 5.00);
        carrinho.add1(pasta);
        //carrinho.Total();
    }
    
    /*@Test
    public void listarProdutos () throws CarrinhoVazioExpected {
        Livro livro = new Livro("Use a Cabeça Java", "Sierra,Kathy", "Alta Books", 129.90);
        carrinho.add2(livro);
        Produto pasta = new Produto("Branca", 5.00);
        carrinho.add1(pasta);
        
    }*/
}
