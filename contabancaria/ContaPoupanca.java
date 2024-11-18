package contabancaria;

public class ContaPoupanca extends Conta{
    
    public double calcularTaxa(){
        return getTaxa() * 0.50;
    }

    public void exibirInformacoes(){
        System.out.println("Taxa é: " +calcularTaxa());
    }
}
