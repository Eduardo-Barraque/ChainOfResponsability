package chainofresponsability;

import java.util.ArrayList;

public abstract class Suporte {
    protected ArrayList listaClientes = new ArrayList();
    private Suporte suporteSuperior;

    public Suporte getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getDescricaoSuporte();

    public String resolverProblema(Cliente cliente) {
        if (listaClientes.contains(cliente.getTipoCliente())) {
            return getDescricaoSuporte();
        }
        else {
            if (suporteSuperior != null) {
                return suporteSuperior.resolverProblema(cliente);
            }
            else
            {
                return "Será direcionado para a equipe de desenvolvimento";
            }
        }
    }
}
