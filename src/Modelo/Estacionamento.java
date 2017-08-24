/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Carros;
import Modelo.Sistema;
import java.util.ArrayList;

/**
 *
 * @author getuliovb
 */
public class Estacionamento {
    
    protected int quantidadeCarros = 0;
    
    ArrayList<Carros> listaCarros;

    public Estacionamento() {
        this.listaCarros = new ArrayList<>();
    }
       
    public void inserirCarro(Carros carro) {
        listaCarros.add(carro);
        System.out.println(listaCarros.size());
        System.out.println(listaCarros.get(quantidadeCarros).getPlaca());
        quantidadeCarros ++;
    }
 
    public void removerCarro(Carros carro) {
        if(quantidadeCarros == 0) { System.out.println("Não há carros!"); }
        else if(listaCarros.contains(carro)){ listaCarros.remove(carro); }
        else { System.out.println("Carro não está presente!"); }    
    }
}   
