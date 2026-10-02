package padroescomportamentais.state;

public class ContaEstadoRecusada extends ContaEstado {

    private ContaEstadoRecusada() {};
    private static ContaEstadoRecusada instance = new ContaEstadoRecusada();
    public static ContaEstadoRecusada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recusada";
    }
}