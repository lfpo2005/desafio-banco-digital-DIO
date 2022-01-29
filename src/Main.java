public class Main {

    public static void main(String[] args) {

        Cliente fernando = new Cliente("Fernando");
        Cliente carla = new Cliente("Carla");


        Conta corrente = new ContaCorrente(fernando);
        corrente.depositar(100);

        Conta poupanca = new ContaPopanca(carla);
        corrente.transferir(10, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
