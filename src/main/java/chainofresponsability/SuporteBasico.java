package chainofresponsability;

public class SuporteBasico extends Suporte{
    public SuporteBasico(Suporte superior) {
        listaClientes.add(ClienteSimples.getClienteSimples());
        setSuporteSuperior(superior);
    }

    public String getDescricaoSuporte() {
        return "SuporteBasico";
    }
}
