package Prova;
import java.util.ArrayList;

public class DataBase {
    private ArrayList<Veiculo> veiculos;

    public DataBase() {
        veiculos = new ArrayList<Veiculo>();
    }
    public void setVeiculos(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
}