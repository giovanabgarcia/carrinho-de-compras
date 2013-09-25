//Giovana e Rebeca
package br.calebe.exemplos.ex01;

import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {

    private Produto produto;

    @Test
    public void criarProduto() {
        Produto pasta = new Produto("Branca", 5.00);
    }

    @Test
    public void igualProduto() {
        Produto caderno = new Produto("Tilibra", 13.00);
        Produto caderno2 = new Produto("Tilibra", 13.00);
        caderno.equals(caderno2);
    }
    
}