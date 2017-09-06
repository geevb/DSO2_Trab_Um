package Modelo;
import Modelo.Carros;
import Modelo.Sistema;
import Controle.Controlador;
import java.util.ArrayList;

/**
 *
 * @author getuliovb
 */
public class Estacionamento {
    
    protected ArrayList<Carros> listaCarros;
    protected Controlador controle;
    protected Carros carroPesquisado;

    public Estacionamento() {
        this.listaCarros = new ArrayList<>();
    }
       
    public void inserirCarro(Carros carro) {
        listaCarros.add(carro);
        mostrarDetalhesDoCarro(carro);
	controle.msgCarroInserido();
    }
    
    public void mostrarDetalhesDoCarro(Carros carro) {
        System.out.println("Placa: " + carro.getPlaca() + " Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor() + " Observacao: " + carro.getObservacao());
    }
 
    public void removerCarro(Carros carro) {
        if(listaCarros.isEmpty()) { System.out.println("Não há carros!"); }
        else if(listaCarros.contains(carro)){
            System.out.println("CR - Placa: " + carro.getPlaca());
            System.out.println("CR - Modelo: " + carro.getModelo());
            System.out.println("CR - Cor: " + carro.getCor());
            System.out.println("CR - Observacao: " + carro.getObservacao());
            listaCarros.remove(carro);
        }
        else { System.out.println("Carro não está presente!"); }
        System.out.println("Quantidade de Carros: " + listaCarros.size());
    }

    public Carros pesquisarPorPlaca(String placa) {
        for(int i = 0; i < listaCarros.size(); i++) {
            System.out.println("Comparei: " + listaCarros.get(i).getPlaca() + " e " + placa);
            if(listaCarros.get(i).getPlaca().equals(placa)) {
                System.out.println("ACHEI!");
                setCarroPesquisa(listaCarros.get(i));
                return listaCarros.get(i);
            }
        }
        return null;
    }
    
    public Carros getCarroPesquisa(){
        return carroPesquisado;
    }
    
    public void setCarroPesquisa(Carros carro){
        carroPesquisado = carro;
    }
    
}   
