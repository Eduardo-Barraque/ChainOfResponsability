package chainofresponsability;

public class ClienteSimples implements TipoCliente {
    private static ClienteSimples clienteSimples = new ClienteSimples();

    private ClienteSimples() {};

    public static ClienteSimples getClienteSimples() {
        return clienteSimples;
    }
}
