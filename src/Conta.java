import lombok.Getter;

import java.util.Date;

@Getter
public abstract class Conta implements ContaImpl {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIA = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    protected Date data = new Date();

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIA++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacaoComuns() {
        System.out.println(String.format("Data da transacao: " + data));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Extrato: " + data));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
        System.out.println("----------------------------------------");
    }
}
