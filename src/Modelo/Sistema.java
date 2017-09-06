
package Modelo;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MINUTES;


public class Sistema {
    
    protected float valorInicial;
    protected float valorAdicional;
    protected int periodoInicial;
    protected int periodoAdicional;
    protected int tolerancia;
    
    
     public float calcularValorTotal(String horaAtual, String minutoAtual, Carros carro) {
        float valorTotal = 0;
        String horaSaida = horaAtual + ":" + minutoAtual;
        LocalTime timeHoraSaida = LocalTime.parse(horaSaida);
        // Convertendo o resultado da  conta para um número positivo
        int minutosPassados = (int) (Math.abs(timeHoraSaida.until(carro.getHoraEntrada(), MINUTES)));
        
        System.out.println("Minutos passados: " + minutosPassados);
//        System.out.println("Vl Inicial: " + getValorInicial());
//        System.out.println("Vl Adicional: " + getValorAdicional());
//        System.out.println("Pr Inicial: " + getPeriodoInicial());
//        System.out.println("Pr Adicional: " + getPeriodoAdicional());
//        System.out.println("Tolerancia: " + getTolerancia());
        
        if(minutosPassados <= tolerancia){ return valorTotal; }
        else if (minutosPassados <= periodoInicial){
            valorTotal = getValorInicial();
            return valorTotal;
        }
        else {
            // Fazer o cálculo(e arredondar para cima) para ver passou ao menos 1 minuto do tempo para considerar no cálculo
            int horasAlemPeriodo = (int) Math.ceil((double)minutosPassados / 60);
            System.out.println("horasAlemPeriodo: " + horasAlemPeriodo);
            horasAlemPeriodo = 1 + (horasAlemPeriodo  - getPeriodoInicial()/60)/(getPeriodoAdicional()/60);
             
            System.out.println("Valor Total será de: " + getValorInicial() + " + (" + horasAlemPeriodo+ "*" + getValorAdicional()+ ")");
            valorTotal = getValorInicial() + (horasAlemPeriodo*getValorAdicional());
	    return valorTotal;
        }
     }
    
     
    public void setValorInicial(float vlInicial) {
        this.valorInicial = vlInicial;
    }
    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public void setPeriodoInicial(int pPeriodoInicial) {
        this.periodoInicial = pPeriodoInicial;
    }
    
    public void setPeriodoAdicional(int pPeriodoAdicional) {
       this.periodoAdicional = pPeriodoAdicional;
    }
    
    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }    

    public float getValorInicial() {
        return valorInicial;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public int getPeriodoInicial() {
        return periodoInicial;
    }

    public int getPeriodoAdicional() {
        return periodoAdicional;
    }

    public int getTolerancia() {
        return tolerancia;
    }

   
}
