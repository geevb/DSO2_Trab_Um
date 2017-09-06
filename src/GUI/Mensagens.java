
package GUI;
import javax.swing.JOptionPane;

/**
 *
 * @author getuliovb
 */
public class Mensagens {
    
    public Mensagens(){};
    
    public void mostrarCampoObrigatorio(String campo){
        JOptionPane.showMessageDialog(null,"Campo " + "'" + campo + 
                "'" + " é obrigatório!");
    }

    public void placaNaoEncontrada() {
        JOptionPane.showMessageDialog(null, "Placa não encontrada!");
    }
    
    public void mostrarValorTotal(float valorTotal) {
        JOptionPane.showMessageDialog(null, "Valor a ser pago: " + valorTotal);
    }

    public void msgCarroInserido(){
	JOptionPane.showMessageDialog(null, "Carro inserido com sucesso!");
    }

    public void msgCarroRemovido(){
	JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
    }

    public void placaEhObrigatorio() {
        JOptionPane.showMessageDialog(null, "Favor informar a placa!");
    }
    
}
