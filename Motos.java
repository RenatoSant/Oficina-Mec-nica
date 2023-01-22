package Veiculos;

public class Motos extends Veiculo {

    public Motos(String marca, String cor, String placa, String defeito, String modelo, String proprietario,
        String mecanicoResponsavel, String servicos, String prazo, String entradaVeiculo,
        String saidaVeiculo, int cilindrada, double valor) {
        super(marca, cor, placa, defeito, modelo, proprietario,mecanicoResponsavel, servicos, prazo, entradaVeiculo, 
        saidaVeiculo, valor);
        setCilindrada(cilindrada);
    }

    private int cilindrada;

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }
    @Override
    public void executar() {
        
        super.executar();
        System.out.println("Essa moto tem " + getCilindrada() + " Cilindradas");
    }
}
