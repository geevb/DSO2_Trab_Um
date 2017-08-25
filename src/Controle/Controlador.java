/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import GUI.TelaInicial;
import GUI.TelaPrincipal;
import GUI.TelaConfiguracoes;
import GUI.Mensagens;
import Modelo.Sistema;
import Modelo.Carros;
import Modelo.Estacionamento;



public class Controlador {
    Sistema sis;
    Estacionamento estacionamento;
    Carros car;
    Mensagens msg;
    
    
    
    public Controlador(){
    this.car = new Carros();
    this.estacionamento = new Estacionamento();
    this.sis = new Sistema();
    this.msg = new Mensagens();
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

    public void efetuarPesquisa(String placa) {
        estacionamento.pesquisarPorPlaca(placa);
    }
    
    public void efetuarConfiguracao(String PeriodoAd, String PeriodoIni,
            String Tolerancia, String VlAdi, String VlIni) {
        
        sis.setPeriodoAdicional(Integer.parseInt(PeriodoAd));
        sis.setPeriodoInicial(Integer.parseInt(PeriodoIni));
        sis.setTolerancia(Integer.parseInt(Tolerancia));
        sis.setValorAdicional(Float.parseFloat(VlAdi));
        sis.setValorInicial(Float.parseFloat(VlIni));
    }
    
    public boolean verificarCamposConfiguracao(String PerAd, String PerIni, 
        String Tolerancia, String ValAd, String ValIni ) {
        
        if(PerAd.equals("")){ msg.mostrarCampoObrigatorio("Periodo Adicional"); return false; }
        if(PerIni.equals("")){ msg.mostrarCampoObrigatorio("Período Inicial"); return false; }
        if(Tolerancia.equals("")){ msg.mostrarCampoObrigatorio("Tolerância"); return false; }
        if(ValAd.equals("")){ msg.mostrarCampoObrigatorio("Valor Adicional"); return false; }
        if(ValIni.equals("")){ msg.mostrarCampoObrigatorio("Valor Inicial"); return false; }
        return true;       
    }
    
    public boolean verificarCamposCadastro(String campo1, String campo2, String campo3,
            String campo4, String campo5 ) {
    
        return true;
    }
    
    public boolean verificarCamposPesquisa(String campo1){ return true; }
}
