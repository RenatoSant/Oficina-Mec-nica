package Veiculos;

import Master.Oficina;

public abstract class Veiculo extends Oficina {
    protected String marca, cor, placa, defeito, modelo, proprietario, mecanicoResponsavel;
    
   
    public Veiculo(String marca, String cor, String placa, String defeito,
     String modelo, String proprietario, String mecanicoResponsavel,String servicos, String prazo,
      String entradaVeiculo, String saidaVeiculo, double valor){
        super(servicos, prazo, entradaVeiculo, saidaVeiculo, valor);
        setMarca(marca);
        setCor(cor);
        setDefeito(defeito);
        setProprietario(proprietario);
        setModelo(modelo);
        setMecanicoResponsavel(mecanicoResponsavel);
        setPlaca(placa);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setDefeito(String defeito){
        this.defeito = defeito;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }
    public void setMecanicoResponsavel(String mecanico){
        this.mecanicoResponsavel = mecanico;
    }

    public String getMarca() {
        return marca;
    }
    public String getCor() {
        return cor;
    }
    public String getPlaca() {
        return placa;
    }
    public String getDefeito() {
        return defeito;
    }
    public String getProprietario() {
        return proprietario;
    }
    public String getMecanicoResponsavel() {
        return mecanicoResponsavel;
    }
    public String getModelo() {
        return modelo;
    }
    public void executar(){
        System.out.println("O veiculo " + getModelo() + " de marca " + getMarca() + "com placa " + getPlaca());
        System.out.println("Pertecente ao Sr " + getProprietario() + " Foi recebido no dia " + getEntradaVeiculo());
        System.out.println("com o seguinte problema " + getDefeito() + " e ficou sobre a responsabilidade de " + getMecanicoResponsavel() + ".");
        System.out.println("Feito o diagnóstico do problema foi dado o prazo de " + getPrazo() + " e foi feito o serviço de " + getServicos() + ".");
        System.out.println("O veiculo foi entregue na data de " + getSaidaVeiculo() + " Sendo o valot total do serviço R$" + getValor());
    }
}
