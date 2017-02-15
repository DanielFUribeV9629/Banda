
package Vista;

import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Eventos implements ActionListener
{
    Ventana ventana;
    
    public Eventos(Ventana ven) 
    {    	
        this.ventana=ven;           
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String evento=ae.getActionCommand();
         if(evento.equals("Buscar")){
            JOptionPane.showMessageDialog(null, "Se han buscado los integrantes.");  
            this.ventana.BuscarIntegrantes();            
        }else if (evento.equals("Asignar")){
            JOptionPane.showMessageDialog(null, "Se han asignado instrumentos a cada integrante."); 
            this.ventana.AsignarInstrumentos();            
        }else if(evento.equals("Afinar")){
            JOptionPane.showMessageDialog(null, "Uno de los musicos esta afinando su instrumento");   
            this.ventana.Afinar(); 
        }else if(evento.equals("Tocar")){
            JOptionPane.showMessageDialog(null, "La banda esta tocando");
            this.ventana.Tocar();
        }              
    }
    
}
