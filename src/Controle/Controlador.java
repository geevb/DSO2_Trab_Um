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
        new TelaInicial(this).setVisible(true);
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {                
//            }
//        });
    }
    
    public void inserirCarroNoEstacionamento(String placa, String modelo, String cor, String observacao){
        if(verificarCamposCadastro(placa)) { 
            msg.placaEhObrigatorio(); 
        }
        else {
            estacionamento.inserirCarro(car.criarCarro(placa, modelo, cor, observacao));
            msg.msgCarroInserido();
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

    public void mostrarValorTotal(float valorTotal){
	msg.mostrarValorTotal(valorTotal);
    }
    
    public boolean efetuarConfiguracao(String PeriodoAd, String PeriodoIni,
            String Tolerancia, String VlAdi, String VlIni) { 
        
        if (verificarCamposConfiguracao(PeriodoAd, PeriodoIni, Tolerancia, 
                VlAdi, VlIni)){
            int periodoAdicional = Integer.parseInt(PeriodoAd);
            int periodoInicial = Integer.parseInt(PeriodoIni);
            int tolerancia = Integer.parseInt(Tolerancia);
            float valorAdicional = Float.parseFloat(VlAdi);
            float valorInicial = Float.parseFloat(VlIni);
            
            System.out.println("Vl Inicial: " + valorInicial);
            System.out.println("Vl Adicional: " + valorAdicional);
            System.out.println("Pr Inicial: " + periodoInicial);
            System.out.println("Pr Adicional: " + periodoAdicional);
            System.out.println("Tolerancia: " + tolerancia);
            
            sis.setPeriodoAdicional(periodoAdicional);
            sis.setPeriodoInicial(periodoInicial);
            sis.setTolerancia(tolerancia);
            sis.setValorAdicional(valorAdicional);
            sis.setValorInicial(valorInicial);
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

    public float calcularPreco(String horaAtual, String minutoAtual, Carros carro) {
        return sis.calcularValorTotal(horaAtual, minutoAtual, carro);
    }

    public void mensagemPlacaNaoEncontrada() {
        msg.placaNaoEncontrada();
    }
}
