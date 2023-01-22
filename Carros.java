package Veiculos;

public class Carros extends Veiculo {
    
    public Carros(String marca, String cor, String placa, String defeito, String modelo, String proprietario,
            String mecanicoResponsavel,String servicos, String prazo, String entradaVeiculo,
            String saidaVeiculo, int cavalosDePotencia, double valor) {
        super(marca, cor, placa, defeito, modelo, proprietario, mecanicoResponsavel,servicos, prazo,
        entradaVeiculo, saidaVeiculo, valor);
        setCavalosDePotencia(cavalosDePotencia);
        
    }
    private int cavalosDePotencia;

    public void setCavalosDePotencia(int cavalosDePotencia2) {
        this.cavalosDePotencia = cavalosDePotencia2;
    }
    public int getCavalosDePotencia() {
        return cavalosDePotencia;
    }
    @Override
    public void executar() {
        
        super.executar();
        System.out.println("O motor desse carro é de " + getCavalosDePotencia() + " Cavalos.");
    }
}
