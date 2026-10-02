package padroescomportamentais.state;

public class ContaEstadoEmAnalise extends ContaEstado {

    private ContaEstadoEmAnalise() {};
    private static ContaEstadoEmAnalise instance = new ContaEstadoEmAnalise();
    public static ContaEstadoEmAnalise getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em análise";
    }

    public boolean aprovar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        return true;
    }

    public boolean recusar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoRecusada.getInstance());
        return true;
    }
}