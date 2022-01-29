public abstract class Conta implements ContaImpl {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIA = 1;

    protected int agencia;
    protected int conta;
    protected double saldo = 0;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIA++;
    }


    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }
}
