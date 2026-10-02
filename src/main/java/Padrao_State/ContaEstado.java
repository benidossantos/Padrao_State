package padroescomportamentais.state;

public abstract class ContaEstado {

    public abstract String getEstado();

    public boolean aprovar(ContaBancaria conta) {
        return false;
    }

    public boolean recusar(ContaBancaria conta) {
        return false;
    }

    public boolean ativar(ContaBancaria conta) {
        return false;
    }

    public boolean bloquear(ContaBancaria conta) {
        return false;
    }

    public boolean inativar(ContaBancaria conta) {
        return false;
    }

    public boolean encerrar(ContaBancaria conta) {
        return false;
    }
}
