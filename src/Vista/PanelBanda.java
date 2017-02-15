package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelBanda extends Panel{
    private JButton crear,asignar,afinar,tocar;
    private Ventana ventana;
    
    public PanelBanda(Ventana ven){
        this.ventana = ven;
        
        crear = new JButton("Buscar Integrantes");
        crear.setActionCommand("Buscar");
        crear.addActionListener(this.ventana.eventos);
        add(crear);
        
        asignar = new JButton("Asignar instrumentos");
        asignar.setActionCommand("Asignar");
        asignar.addActionListener(this.ventana.eventos);
        asignar.setEnabled(false);
        add(asignar);
        
        afinar = new JButton("Afinar instrumentos");
        afinar.setActionCommand("Afinar");
        afinar.addActionListener(this.ventana.eventos);
        afinar.setEnabled(false);
        add(afinar);
        
        tocar = new JButton("Iniciar Musica");
        tocar.setActionCommand("Tocar");
        tocar.addActionListener(this.ventana.eventos);
        tocar.setEnabled(false);
        add(tocar);
    }
    
    public void HabilitarAsignar()
    {
        asignar.setEnabled(true);
        crear.setEnabled(false);
    }

    public void HabilitarAfinar() 
    {
        afinar.setEnabled(true);
        asignar.setEnabled(false);
    }
    
    public void HabilitarTocar()
    {
        afinar.setEnabled(false);
        tocar.setEnabled(true);
    }
    
    public void DesHabilitar()
    {
        crear.setEnabled(true);
        tocar.setEnabled(false);
    }
}
