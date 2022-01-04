import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class RoupaTest {

    @Test
    void deveRetornarTecidoCamisa() {
        Roupa roupa = new Camisa();
        assertEquals(roupa.getTecido(), "Algodão");
    }
    @Test
    void deveRetornarTamanhoCamisa() {
        Roupa roupa = new Camisa();
        assertEquals(roupa.getTamanho(), "G");
    }
    @Test
    void deveRetornarTecidoCamisaMoletom() {
        Roupa roupa = new Moletom(new Camisa());
        assertEquals(roupa.getTecido(), "Algodão,Alpaca");
    }
    @Test
    void deveRetornarTamanhoCamisaMoletom() {
        Roupa roupa = new Moletom(new Camisa());
        assertEquals(roupa.getTamanho(), "G,M");
    }
    @Test
    void deveRetornarTecidoCamisaTerno() {
        Roupa roupa = new Terno(new Camisa());
        assertEquals(roupa.getTecido(), "Algodão,Malha Dupla e Couro");
    }
    @Test
    void deveRetornarTamanhoCamisaTerno() {
        Roupa roupa = new Terno(new Camisa());
        assertEquals(roupa.getTamanho(), "G,XM");
    }
    @Test
    void deveRetornarTecidoCamisaTernoSobretudo() {
        Roupa roupa = new Terno(new Sobretudo(new Camisa()));
        assertEquals(roupa.getTecido(), "Algodão,Algodão Falso,Malha Dupla e Couro");
    }
    @Test
    void deveRetornarTamanhoCamisaTernoSobretudo() {
        Roupa roupa = new Terno(new Sobretudo(new Camisa()));
        assertEquals(roupa.getTamanho(), "G,XG,XM");
    }



}