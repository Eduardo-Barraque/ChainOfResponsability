package chainofresponsability;

public class Cliente {

    private TipoCliente tipoCliente;

    public Cliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
