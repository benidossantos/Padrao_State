package padroescomportamentais.state;

public class ContaEstadoAtiva extends ContaEstado {

    private ContaEstadoAtiva() {};
    private static ContaEstadoAtiva instance = new ContaEstadoAtiva();
    public static ContaEstadoAtiva getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativa";
    }

    public boolean bloquear(ContaBancaria conta) {
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        return true;
    }

    public boolean inativar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoInativa.getInstance());
        return true;
    }

    public boolean encerrar(ContaBancaria conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}
