package padroescomportamentais.state;

public class ContaEstadoEncerrada extends ContaEstado {

    private ContaEstadoEncerrada() {};
    private static ContaEstadoEncerrada instance = new ContaEstadoEncerrada();
    public static ContaEstadoEncerrada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Encerrada";
    }
}