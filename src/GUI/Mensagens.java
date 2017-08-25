
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
    
    
}
