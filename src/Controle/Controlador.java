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
    protected Sistema sis;
    protected Estacionamento estacionamento;
    protected Carros car;
    protected Mensagens msg;
    
    //public Controlador(){};
    
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
    
    public void inserirCarroNoEstacionamento(String placa, String modelo, String cor, String observacao){
        if(verificarCamposCadastro(placa)) { 
            msg.placaEhObrigatorio(); 
        }
        else {
            estacionamento.inserirCarro(car.criarCarro(placa, modelo, cor, observacao));
        }
    }
    
    public void removerCarroDoEstacionamento(Carros carro){
        estacionamento.removerCarro(carro);
        //float valorTotal = sis.calcularValorTotal(carro);
        //msg.mostrarValorTotal(valorTotal);
    }

    public Carros efetuarPesquisaPelaPlaca(String placa) {
        if (placa.equals("   -   ")) {
            msg.placaEhObrigatorio(); 
            return null;
        }
        else if (estacionamento.pesquisarPorPlaca(placa) == null) {            
            msg.placaNaoEncontrada();
            return null;
        } else {
            return retornarCarroPesquisa();
        }
    }
    
    public Carros retornarCarroPesquisa(){
        return estacionamento.getCarroPesquisa();
    }
    
    public boolean efetuarConfiguracao(String PeriodoAd, String PeriodoIni,
            String Tolerancia, String VlAdi, String VlIni) { 
        
        if (verificarCamposConfiguracao(PeriodoAd, PeriodoIni, Tolerancia, 
                VlAdi, VlIni)){            
            sis.setPeriodoAdicional(Integer.parseInt(PeriodoAd));
            sis.setPeriodoInicial(Integer.parseInt(PeriodoIni));
            sis.setTolerancia(Integer.parseInt(Tolerancia));
            sis.setValorAdicional(Float.parseFloat(VlAdi));
            sis.setValorInicial(Float.parseFloat(VlIni));
            return true;            
        } else {
            return false;
        }       
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
    
    public boolean verificarCamposCadastro(String placa) {
        if (placa.equals("   -   ")){ return true; } else { return false; }
    }
    
    public boolean verificarCamposPesquisa(String campo1){ return true; }

    public Carros retornarCarroDaPesquisa() {
        return estacionamento.getCarroPesquisa();
    }

    public void calcularPreco(Carros carro) {
        sis.calcularValorTotal(carro);
    }

    public void mensagemPlacaNaoEncontrada() {
        msg.placaNaoEncontrada();
    }
}
