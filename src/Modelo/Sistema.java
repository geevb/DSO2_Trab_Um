
package Modelo;
import java.time.LocalTime;

public class Sistema {
    
    protected float valorInicial;
    protected float valorAdicional;
    protected LocalTime periodoInicial;
    protected LocalTime periodoAdicional;
    protected int tolerancia;
    
    
     public float calcularValorTotal(String horaAtual, String minutoAtual, Carros carro) {
        float valorTotal = 0;
        LocalTime tempoAtual = LocalTime.of(Integer.parseInt(horaAtual), 
                Integer.parseInt(minutoAtual));
        LocalTime tempoUtilizado = carro.getHoraEntrada().minusHours(tempoAtual.getHour());
        tempoUtilizado = tempoUtilizado.minusMinutes(tempoAtual.getMinute());
        
        if(tempoUtilizado.getHour() == 0 && tempoUtilizado.getMinute() <=  tolerancia){
            System.out.println("DENTRO TOLERANCIA, VALOR: " + valorTotal);
            return valorTotal;
        } else if ( tempoUtilizado.getHour() <= periodoInicial.getHour()
                && tempoUtilizado.getMinute() <= periodoInicial.getMinute()) {
            valorTotal = valorInicial;
            System.out.println("DENTRO PERIODO INICIAL, Valor Total: " + valorTotal);
            return valorTotal;
        } else {
            //valorTotal = valorInicial + (valorAdicional*)
        }
       
        
        return valorTotal;
     }
    
    
    
    
    
    
    
    
    public void setValorInicial(float vlInicial) {
        this.valorInicial = vlInicial;
    }
    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public void setPeriodoInicial(int pPeriodoInicial) {
        this.periodoInicial.of(0, pPeriodoInicial);
    }
    
    public void setPeriodoAdicional(int pPeriodoAdicional) {
       this.periodoAdicional.of(0, pPeriodoAdicional);
    }
    
    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }    

   
}
