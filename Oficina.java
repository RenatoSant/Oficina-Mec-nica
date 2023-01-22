package Master;

public class Oficina {
    protected String servicos, prazo, entradaVeiculo, saidaVeiculo;
    protected double valor;

    public Oficina(String servicos, String prazo, String entradaVeiculo, String saidaVeiculo, double valor){
        setServicos(servicos);
        setPrazo(prazo);
        setEntradaVeiculo(entradaVeiculo);
        setSaidaVeiculo(saidaVeiculo);
        setValor(valor);
    }
    
    public void setEntradaVeiculo(String entradaVeiculo) {
        this.entradaVeiculo = entradaVeiculo;
    }
    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }
    public void setSaidaVeiculo(String saidaVeiculo) {
        this.saidaVeiculo = saidaVeiculo;
    }
    public void setServicos(String servicos) {
        this.servicos = servicos;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEntradaVeiculo() {
        return entradaVeiculo;
    }
    public String getPrazo() {
        return prazo;
    }
    public String getSaidaVeiculo() {
        return saidaVeiculo;
    }
    public String getServicos() {
        return servicos;
    }
    public double getValor() {
        return valor;
    }

}
