package padroescomportamentais.state;

public class ContaBancaria {

    private String titular;
    private ContaEstado estado;

    public ContaBancaria() {
        this.estado = ContaEstadoEmAnalise.getInstance();
    }

    public void setEstado(ContaEstado estado) {
        this.estado = estado;
    }

    public boolean aprovar() {
        return estado.aprovar(this);
    }

    public boolean recusar() {
        return estado.recusar(this);
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean bloquear() {
        return estado.bloquear(this);
    }

    public boolean inativar() {
        return estado.inativar(this);
    }

    public boolean encerrar() {
        return estado.encerrar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public ContaEstado getEstado() {
        return estado;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
