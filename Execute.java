import Master.*;
import Veiculos.*;
public class Execute {
    public static void main(String[] args) throws Exception {
        Carros carro1 = new Carros("Volkswagen","Prata", "2A896I2",
        "Ar condicionado quebrado", "Voyage", "Francisco das Chagas",
        "Leandro Almeida", "Concerto Ar condicionado", "3 dias",
        "10/01/2023","13/01/2023", 104, 1800.56);

        Carros carro2 = new Carros("Toyota", "preto", "2D345I9",
        "falha na bomba de gasolina","Corolla","Anderson Torres" ,
        "Antonio Correia","Troca da bomba", "2 dias",
        "19/01/2023", "22/01/2023", 150, 925.59);

        Motos moto1 = new Motos("honda", "Vermelho", "HTV2536", "nenhum", "Bros",
         "Antonio Augusto", "Joao Silva", "revisao", "1 dia",
         "15/01/2023", "16/01/2023", 150, 120);
        //erros  getPrazo. getSaidaVeiculo. getMecanicoResponsavel. getServicos.

        carro1.executar();
        System.out.println("-------------------------------------------");
        carro2.executar();
        System.out.println("--------------------------------------------");
        moto1.executar();
    }
}
