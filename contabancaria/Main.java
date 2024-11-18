package contabancaria;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaPoupanca();

        conta1.setTaxa(1200);
        conta2.setTaxa(3500);
        conta1.exibirInformacoes();
        System.out.println();
        conta2.exibirInformacoes();
    }
}
