
package Modelo;
import java.time.Duration;
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
        long minutosPassados = Math.abs(timeHoraSaida.until(carro.getHoraEntrada(), MINUTES));
        System.out.println(minutosPassados);

        if(minutosPassados <= tolerancia){ return valorTotal; }
        else if (minutosPassados <= periodoInicial){ 
            valorTotal = valorInicial;
            return valorTotal;
        }
        else {
            if (minutosPassados%60 > periodoAdicional%60)
            valorTotal = periodoAdicional*valorAdicional;
        
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
        this.periodoInicial = pPeriodoInicial;
    }
    
    public void setPeriodoAdicional(int pPeriodoAdicional) {
       this.periodoAdicional = pPeriodoAdicional;
    }
    
    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }    

   
}
