/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    ArrayList<Carros> listaCarros;
    Controlador controle;
    Carros carroPesquisado;

    public Estacionamento() {
        this.listaCarros = new ArrayList<>();
    }
       
    public void inserirCarro(Carros carro) {
        listaCarros.add(carro);
        mostrarDetalhesDoCarro(carro);
    }
    
    public void mostrarDetalhesDoCarro(Carros carro) {
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Observacao: " + carro.getObservacao());
      
    }
 
    public void removerCarro(Carros carro) {
        if(listaCarros.isEmpty()) { System.out.println("Não há carros!"); }
        else if(listaCarros.contains(carro)){ 
            listaCarros.remove(carro); //controle.calcularPreco(carro);
        }        
        else { System.out.println("Carro não está presente!"); }
        System.out.println("Quantidade de Carros: " + listaCarros.size());
    }

    public Carros pesquisarPorPlaca(String placa) {
        for(int i = 0; i < listaCarros.size(); i++) {
            System.out.println("Comparei: " + listaCarros.get(i).getPlaca() + " e " + placa);
            if(listaCarros.get(i).getPlaca().equals(placa)) {
                System.out.println("ACHEI!");                
                return listaCarros.get(i);                
            }
        }
        System.out.println("Placa não encontrada!");
        return null;
    }
    
    public Carros getCarroPesquisa(){
        return carroPesquisado;
    }
    
    public void setCarroPesquisa(Carros carro){
        carroPesquisado = carro;
    }
    
}   
