/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import GUI.TelaInicial;
import GUI.TelaPrincipal;
import GUI.TelaConfiguracoes;
import Modelo.Sistema;
import Modelo.Carros;
import Modelo.Estacionamento;



public class Controlador {
    Sistema sis;
    Estacionamento estacionamento;
    Carros car;
    
    
    public Controlador(){
    this.car = new Carros();
    this.estacionamento = new Estacionamento();
    this.sis = new Sistema();
    }
    
    public void iniciar() {
        chamarTelaInicial();
    }
    
    public void chamarTelaInicial() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    
    public void enviarCarro(String placa, String modelo, String cor, String observacao){
        //Carros carro = car.criarCarro(placa, modelo, cor, observacao);
        estacionamento.inserirCarro(car.criarCarro(placa, modelo, cor, observacao));
    }
    
    public void removerCarro(Carros carro){
        estacionamento.removerCarro(carro);
    }
    
}
