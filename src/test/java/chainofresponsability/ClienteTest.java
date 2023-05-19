package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
    SuporteBasico supSimples;
    SuporteCompleto supNormal;

    @BeforeEach
    void setUp(){
        supNormal = new SuporteCompleto(null);
        supSimples = new SuporteBasico(supNormal);
    }
    @Test
    void deveRetornarSuporteSimplesResolvido() {
        assertEquals("SuporteBasico", supSimples.resolverProblema(new Cliente(ClienteSimples.getClienteSimples())));
    }
    @Test
    void deveRetornarSemResolucaoImediata() {
        assertEquals("Será direcionado para a equipe de desenvolvimento", supSimples.resolverProblema(new Cliente(ClienteDificil.getClienteDificil())));
    }

}
