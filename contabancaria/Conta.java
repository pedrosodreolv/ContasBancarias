package contabancaria;

public abstract class Conta{
    private double taxa;

    
    public double getTaxa() {
        return taxa;
    }


    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }


    public abstract double calcularTaxa();

    public abstract void exibirInformacoes();
}