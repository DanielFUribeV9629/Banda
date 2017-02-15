package Vista;

import Control.GestorBanda;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    protected PanelBanda principal;
    protected GestorBanda gestor;
    protected Eventos eventos;
    
    public Ventana (GestorBanda g){
        initEvents();
        this.gestor=g;
        principal = new PanelBanda (this);
        add (principal);
        setTitle("Mi Banda");
        setBounds(450,200,270,220);
        setVisible (true);
    }
    


    public void BuscarIntegrantes() 
    {
        this.gestor.CrearIntegrantes();
        this.principal.HabilitarAsignar();
    }

    public void AsignarInstrumentos() 
    {
        this.gestor.AsignarInstrumentos();
        this.principal.HabilitarAfinar();
    }

    public void Afinar()
    {
        this.gestor.Afinar();
        this.principal.HabilitarTocar();
    }

    public void Tocar() 
    {
        this.gestor.Tocar();
        this.principal.DesHabilitar();
    }
    
    void initEvents()
    {
    	
    	this.eventos= new Eventos(this);
    	this.addWindowListener(new WindowAdapter(){  //window adapter indica conjunto de botones de la ventana Cerrar,Minimizar,etc.
    		public void windowClosing()
    		{
    			System.exit(0);
    		}
    	});
    }
}
