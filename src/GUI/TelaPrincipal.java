/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controle.Controlador;
import Modelo.Carros;

public class TelaPrincipal extends javax.swing.JFrame {
    
    Controlador controle = new Controlador();

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegEntrada = new javax.swing.JButton();
        jButtonRegSaida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldModelo = new javax.swing.JTextField();
        TextFieldCor = new javax.swing.JTextField();
        TextFieldObservacao = new javax.swing.JTextField();
        TextFieldPlaca = new javax.swing.JTextField();
        jTextFieldBuscar = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("AAA-AAA");
            jTextFieldBuscar = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel5 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelInfoPlaca = new javax.swing.JLabel();
        jLabelInfoMod = new javax.swing.JLabel();
        jLabelInfoCor = new javax.swing.JLabel();
        jLabelInfoObs = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelHoraEntrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setSize(new java.awt.Dimension(750, 520));

        jButtonRegEntrada.setText("Confirmar");
        jButtonRegEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegEntradaActionPerformed(evt);
            }
        });

        jButtonRegSaida.setText("Registrar Saída");
        jButtonRegSaida.setEnabled(false);
        jButtonRegSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegSaidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel1.setText("Placa:");
        jLabel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel1PropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 15)); // NOI18N
        jLabel2.setText("Modelo:");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 15)); // NOI18N
        jLabel3.setText("Cor:");

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 15)); // NOI18N
        jLabel4.setText("Observação:");

        TextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldModeloActionPerformed(evt);
            }
        });

        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("AAA-AAA");
            TextFieldPlaca = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        TextFieldPlaca.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        TextFieldPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPlacaActionPerformed(evt);
            }
        });

        jTextFieldBuscar.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(254, 254, 254));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel5.setText("Pesquisar Placa");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel6.setText("Registrar novo Veículo");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        jLabel7.setText("Resultado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelHoraEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInfoCor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInfoMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInfoObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInfoPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInfoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInfoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInfoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInfoObs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButtonRegEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(jButtonRegSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(TextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(TextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(62, 62, 62)
                                .addComponent(TextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(3, 3, 3)
                                .addComponent(TextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegEntradaActionPerformed
        controle.verificarCamposCadastro(TextFieldPlaca.getText());
        controle.inserirCarroNoEstacionamento(TextFieldPlaca.getText(), TextFieldModelo.getText(),
                TextFieldCor.getText(), TextFieldObservacao.getText());

        //Limpar Campos de texto
        TextFieldModelo.setText("");
        TextFieldCor.setText("");
        TextFieldObservacao.setText("");
        TextFieldPlaca.setText("");
    }//GEN-LAST:event_jButtonRegEntradaActionPerformed

    private void jButtonRegSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegSaidaActionPerformed
        controle.removerCarroDoEstacionamento(controle.retornarCarroDaPesquisa());
        jButtonRegSaida.setEnabled(false);
        jLabelInfoCor.setText("");
        jLabelInfoMod.setText("");
        jLabelInfoObs.setText("");
        jLabelInfoPlaca.setText("");
        jLabelHoraEntrada.setText("");        
    }//GEN-LAST:event_jButtonRegSaidaActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        //Habilitar o botão de remover carro somente se a pesquisa retornar true
        if (controle.efetuarPesquisaPelaPlaca(jTextFieldBuscar.getText()) != null){
            jButtonRegSaida.setEnabled(true);
            preencherResultadoPesquisa(controle.retornarCarroPesquisa()); 
            jTextFieldBuscar.setText("");                       
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed
<<<<<<< HEAD

    private void jLabel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1PropertyChange

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void preencherResultadoPesquisa(Carros carro){
        jLabelInfoCor.setText("Cor: " + carro.getCor());
        jLabelInfoMod.setText("Modelo: " + carro.getModelo());
        jLabelInfoObs.setText("Obs: " + carro.getObservacao());
        jLabelInfoPlaca.setText("Placa: " + carro.getPlaca());
        jLabelHoraEntrada.setText("Hora Entrada: " + carro.getHoraEntrada());
    }

=======
    
    
>>>>>>> 0053741d2d3c61ae054e86f3a3640e84c9684489
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldCor;
    private javax.swing.JTextField TextFieldModelo;
    private javax.swing.JTextField TextFieldObservacao;
    private javax.swing.JTextField TextFieldPlaca;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonRegEntrada;
    private javax.swing.JButton jButtonRegSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelHoraEntrada;
    private javax.swing.JLabel jLabelInfoCor;
    private javax.swing.JLabel jLabelInfoMod;
    private javax.swing.JLabel jLabelInfoObs;
    private javax.swing.JLabel jLabelInfoPlaca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}

