package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaBancaria();
    }

    @Test
    public void deveIniciarContaEmAnalise() {
        assertEquals(ContaEstadoEmAnalise.getInstance(), conta.getEstado());
        assertEquals("Em análise", conta.getNomeEstado());
    }

    // Conta em análise

    @Test
    public void deveAprovarContaEmAnalise() {
        conta.setEstado(ContaEstadoEmAnalise.getInstance());
        assertTrue(conta.aprovar());
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }

    @Test
    public void deveRecusarContaEmAnalise() {
        conta.setEstado(ContaEstadoEmAnalise.getInstance());
        assertTrue(conta.recusar());
        assertEquals(ContaEstadoRecusada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveAtivarContaEmAnalise() {
        conta.setEstado(ContaEstadoEmAnalise.getInstance());
        assertFalse(conta.ativar());
        assertEquals(ContaEstadoEmAnalise.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveBloquearContaEmAnalise() {
        conta.setEstado(ContaEstadoEmAnalise.getInstance());
        assertFalse(conta.bloquear());
        assertEquals(ContaEstadoEmAnalise.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveInativarContaEmAnalise() {
        conta.setEstado(ContaEstadoEmAnalise.getInstance());
        assertFalse(conta.inativar());
        assertEquals(ContaEstadoEmAnalise.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveEncerrarContaEmAnalise() {
        conta.setEstado(ContaEstadoEmAnalise.getInstance());
        assertFalse(conta.encerrar());
        assertEquals(ContaEstadoEmAnalise.getInstance(), conta.getEstado());
    }

    // Conta ativa

    @Test
    public void naoDeveAprovarContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertFalse(conta.aprovar());
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveRecusarContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertFalse(conta.recusar());
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveAtivarContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertFalse(conta.ativar());
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }

    @Test
    public void deveBloquearContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.bloquear());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    public void deveInativarContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.inativar());
        assertEquals(ContaEstadoInativa.getInstance(), conta.getEstado());
    }

    @Test
    public void deveEncerrarContaAtiva() {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    // Conta bloqueada

    @Test
    public void naoDeveAprovarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertFalse(conta.aprovar());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveRecusarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertFalse(conta.recusar());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    public void deveAtivarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertTrue(conta.ativar());
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveBloquearContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertFalse(conta.bloquear());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveInativarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertFalse(conta.inativar());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    public void deveEncerrarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertTrue(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    // Conta inativa

    @Test
    public void naoDeveAprovarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstance());
        assertFalse(conta.aprovar());
        assertEquals(ContaEstadoInativa.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveRecusarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstance());
        assertFalse(conta.recusar());
        assertEquals(ContaEstadoInativa.getInstance(), conta.getEstado());
    }

    @Test
    public void deveAtivarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstance());
        assertTrue(conta.ativar());
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }

    @Test
    public void deveBloquearContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstance());
        assertTrue(conta.bloquear());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveInativarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstance());
        assertFalse(conta.inativar());
        assertEquals(ContaEstadoInativa.getInstance(), conta.getEstado());
    }

    @Test
    public void deveEncerrarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstance());
        assertTrue(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    // Conta encerrada

    @Test
    public void naoDeveAprovarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.aprovar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveRecusarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.recusar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveAtivarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.ativar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveBloquearContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.bloquear());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveInativarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.inativar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveEncerrarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    // Conta recusada

    @Test
    public void naoDeveAprovarContaRecusada() {
        conta.setEstado(ContaEstadoRecusada.getInstance());
        assertFalse(conta.aprovar());
        assertEquals(ContaEstadoRecusada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveRecusarContaRecusada() {
        conta.setEstado(ContaEstadoRecusada.getInstance());
        assertFalse(conta.recusar());
        assertEquals(ContaEstadoRecusada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveAtivarContaRecusada() {
        conta.setEstado(ContaEstadoRecusada.getInstance());
        assertFalse(conta.ativar());
        assertEquals(ContaEstadoRecusada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveBloquearContaRecusada() {
        conta.setEstado(ContaEstadoRecusada.getInstance());
        assertFalse(conta.bloquear());
        assertEquals(ContaEstadoRecusada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveInativarContaRecusada() {
        conta.setEstado(ContaEstadoRecusada.getInstance());
        assertFalse(conta.inativar());
        assertEquals(ContaEstadoRecusada.getInstance(), conta.getEstado());
    }

    @Test
    public void naoDeveEncerrarContaRecusada() {
        conta.setEstado(ContaEstadoRecusada.getInstance());
        assertFalse(conta.encerrar());
        assertEquals(ContaEstadoRecusada.getInstance(), conta.getEstado());
    }
}
