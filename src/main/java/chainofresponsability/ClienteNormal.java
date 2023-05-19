package chainofresponsability;

public class ClienteNormal implements TipoCliente {
    private static ClienteNormal clienteNormal = new ClienteNormal();

    private ClienteNormal() {};

    public static ClienteNormal getClienteNormal() {
        return clienteNormal;
    }
}
