package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import StatePedido.Pedido;


public class PedidoTest {
    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void testEstadoInicial() {
        assertEquals("Preparando", pedido.getEstado());
    }

    @Test
    public void testTransicaoPreparandoParaTransito() {
        boolean resultado = pedido.transito();
        assertTrue(resultado);
        assertEquals("Em Transito", pedido.getEstado());
    }

    @Test
    public void testTransicaoPreparandoParaEntregue() {
        boolean resultado = pedido.entregue();
        assertTrue(resultado);
        assertEquals("Entregue", pedido.getEstado());
    }

    @Test
    public void testTransicaoTransitoParaEntregue() {
        pedido.transito();
        boolean resultado = pedido.entregue();
        assertTrue(resultado);
        assertEquals("Entregue", pedido.getEstado());
    }

    @Test
    public void testTransicaoPreparandoParaPreparandoInvalida() {
        boolean resultado = pedido.preparando();
        assertFalse(resultado);
        assertEquals("Preparando", pedido.getEstado());
    }

    @Test
    public void testTransicaoTransitoParaPreparandoInvalida() {
        pedido.transito();
        boolean resultado = pedido.preparando();
        assertFalse(resultado);
        assertEquals("Em Transito", pedido.getEstado());
    }

    @Test
    public void testTransicaoEntregueParaTransitoInvalida() {
        pedido.entregue(); // Preparando → Entregue direto
        boolean resultado = pedido.transito();
        assertFalse(resultado);
        assertEquals("Entregue", pedido.getEstado());
    }

    @Test
    public void testTransicaoEntregueParaPreparandoInvalida() {
        pedido.entregue();
        boolean resultado = pedido.preparando();
        assertFalse(resultado);
        assertEquals("Entregue", pedido.getEstado());
    }
}
