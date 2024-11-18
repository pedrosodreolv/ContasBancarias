package contabancaria;

public class ContaCorrente extends Conta{
    
    public double calcularTaxa(){
        return getTaxa() * 0.15;
    }

    public void exibirInformacoes(){
        System.out.println("Taxa é: " +calcularTaxa());
    }
}
