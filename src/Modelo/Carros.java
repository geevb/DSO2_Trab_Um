
package Modelo;

public class Carros {
    
    protected String placa = "";
    protected String modelo = "";
    protected String cor = "";
    protected String observacao = "";
    protected int horaEntrada = 0;

    
    //Construtor
    public Carros(String placa, String modelo, String cor, String observacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.observacao = observacao;
    }

    public Carros(){}
    
    public Carros criarCarro(String pPlaca, String pModelo, String pCor, String pObservacao) {
        return new Carros(pPlaca, pModelo, pCor, pObservacao);
    }
    
    
    
    
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public String getObservacao() {
        return observacao;
    }    

    int getTempoEntrada() {
        return horaEntrada;
    }
}
