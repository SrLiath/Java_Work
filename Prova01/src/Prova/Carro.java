package Prova;
public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, String marca, int numeroPortas) {
        super(modelo, marca);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}