public class LanchoneteDecoratorTest {

    void deveRetornarLancheSalgado(){
    Lanchonete lanchonete = new Coxinha(new Lanche("coxinha"));
    assertEquals("coxinha", lanchonete.getSalgado());
    }

    void deveRetornarLancheSabor(){
        Lanchonete lanchonete = new Coxinha(new Lanche("coxinha / catupiry"));
        assertEquals("coxinha / catupiry", lanchonete.getSalgado());
    }
}