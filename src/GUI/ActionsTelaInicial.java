/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import GUI.TelaInicial;
import GUI.TelaConfiguracoes;

/**
 *
 * @author getuliovb
 */
public class ActionsTelaInicial {
    
    private void jButtonAvancarActionPerformed(java.awt.event.ActionEvent evt) {                                               
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                new TelaConfiguracoes().setVisible(true);
                //setVisible(false);
            }
        });
    } 
    
}
