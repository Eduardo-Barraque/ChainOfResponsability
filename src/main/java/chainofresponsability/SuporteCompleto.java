package chainofresponsability;

public class SuporteCompleto extends Suporte {
    public SuporteCompleto(Suporte superior) {
        listaClientes.add(ClienteNormal.getClienteNormal());
        setSuporteSuperior(superior);
    }

    public String getDescricaoSuporte() {
        return "SuporteCompleto";
    }
}
