
package Modelo;

public class Sistema {
    
    protected float valorInicial;
    protected float valorAdicional;
    protected int periodoInicial;
    protected int periodoAdicional;
    protected int tolerancia;
    protected int tempoAtual;
    
     public float calcularValorTotal(Carros carro) {
        float valorTotal = 0;
        int tempoEntrada = carro.getHoraEntrada();
        int tempoUtilizado = tempoAtual - tempoEntrada;
        
        if(tempoUtilizado <= tolerancia){
            return valorTotal;
        } else if ( tempoUtilizado <= periodoInicial ) {
            valorTotal = valorInicial;
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
    public void setPeriodoInicial(int periodoInicial) {
        this.periodoInicial = periodoInicial;
    }
    public void setPeriodoAdicional(int periodoAdicional) {
        this.periodoAdicional = periodoAdicional;
    }
    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }    

   
}
