package padroescomportamentais.state;

public class ContaEstadoInativa extends ContaEstado {

    private ContaEstadoInativa() {};
    private static ContaEstadoInativa instance = new ContaEstadoInativa();
    public static ContaEstadoInativa getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Inativa";
    }

    public boolean ativar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        return true;
    }

    public boolean bloquear(ContaBancaria conta) {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        return true;
    }

    public boolean encerrar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}
