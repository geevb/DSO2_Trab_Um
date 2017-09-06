
package Modelo;

import java.time.LocalTime;

public class Carros {
    
    protected String placa = "";
    protected String modelo = "";
    protected String cor = "";
    protected String observacao = "";
    protected LocalTime horaEntrada; 

    
    //Construtor COM tempo atual de entrada coletada do relógio do sistema.
    public Carros(String placa, String modelo, String cor, String observacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.observacao = observacao;
	//Pega a hora atual do sistema
        this.horaEntrada = LocalTime.now();
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

    public String getHoraEntradaFormatada(){
        return horaEntrada.getHour() + ":" + horaEntrada.getMinute();
    }
    
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

}
