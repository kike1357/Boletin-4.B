
package exemconsumo4b;

import javax.swing.JOptionPane;


public class ExemConsumo4b {

    
    public static void main(String[] args) {
        float consumoMedio,consumoEuros;
        float kM,lI;
        float pG,vM ;
        kM= Float.parseFloat(JOptionPane.showInputDialog("KM :"));
        lI=Float.parseFloat(JOptionPane.showInputDialog("litros : "));
        pG=Float.parseFloat(JOptionPane.showInputDialog("Precio Gasolina :"));
        vM=Float.parseFloat(JOptionPane.showInputDialog("Tiempo en horas tardado : "));
        Consumo consumo1 = new Consumo ();
        JOptionPane.showMessageDialog(null,"Consumo Medio = "+consumo1.consumoMedio(kM, lI));
        Consumo consumo2 = new Consumo ();
        JOptionPane.showMessageDialog(null,"Consumo Euros = "+consumo2.consumoEuros(pG,lI));
        Consumo consumo3 = new Consumo ();
        JOptionPane.showMessageDialog(null,"Velocidad Media = "+ consumo3.getvMed(vM, kM));
        
    }
    
}
