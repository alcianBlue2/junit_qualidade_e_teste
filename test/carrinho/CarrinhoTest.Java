package carrinho;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import jdk.internal.jline.internal.TestAccessible;

@DisplayName("Classe para teste do Carrinho")
public class CarrinhoTest(){

    Carrinho carrinho;

    @BeforeEach
    public void inicializa() {
        carrinho = new Carrinho();

        Produto p1 = new Produto("Qualidade e Teste em Software", 34.99);
        Produto p2 = new Produto("Testes de Software - Produzindo sistemas melhores e mais confiáveis", 81.20);

        carrinho.addItem(p1);
        carrinho.addItem(p2);
    }

    @Test
    public void testValorTotal(){
        assertEquals(116.19, carrinho.getValorTotal());
    }

    @Test
    public void testQtdeItems(){
        assertEquals(2, carrinho.getQtdeItems());
    }

    @Test 
    public void testRemoveItem(){
        carrinho.removeItem(p1);
        assertEquals(1, carrinho.getQtdeItems());
    }

    @Test
    public void testEsvazia(){
        carrinho.esvazia();
        assertEquals(0, carrinho.getQtdeItems());
    }


}