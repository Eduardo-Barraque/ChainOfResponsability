package chainofresponsability;

public class ClienteDificil implements TipoCliente {
    private static ClienteDificil clienteDificil = new ClienteDificil();

    private ClienteDificil() {};

    public static ClienteDificil getClienteDificil() {
        return clienteDificil ;
    }
}
