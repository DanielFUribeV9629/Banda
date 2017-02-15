package Control;

import Modelo.Banda;
import Vista.Ventana;
import java.util.Random;

public class GestorBanda {

    private Ventana miVentana;
    private Banda banda;
    public int numeros,n,instru;
    public Random in = new Random();
    public String []integrant,integrantes,instrumentos,instrument;

    public GestorBanda() {
        banda = new Banda();
       
//        CrearIntegrantes();
//        AsignarInstrumentos();
//        Afinar();
//        Tocar();
        miVentana = new Ventana(this);
    }

    public int CrearIntegrantes() 
    {
        integrantes = banda.getIntegrantes();       
        numeros = 3 + in.nextInt(7);
        integrant= new String[numeros];
        System.out.println("los integrantes disponibles son: " + numeros+"\n");
        for (int i = 0; i < numeros; i++) {          
            String nombre;
            n = in.nextInt(28)+1;
            nombre = (integrantes[n]);
            integrant[i]=nombre;  
            System.out.println("integrante "+ (i+1)+ "  " +integrant[i]);            
        }       
         System.out.println("          ");
        return numeros;
    }
    
    public void AsignarInstrumentos() 
    {        
        instrumentos = banda.getInstrumentos();
        instrument= new String[numeros];
        for (int i = 0; i < numeros; i++) {
            instru=in.nextInt(12)+1;
            instrument[i]=instrumentos[instru];
            System.out.println("Al musico "+(i+1)+" de nombre "+integrant[i]+ " le corresponde el intrumento: "+instrumentos[instru]);           
        }
        System.out.println("          ");

    }
    
    public void Afinar()
    {
        int inst=in.nextInt(numeros);
        System.out.println("          vamos a afinar ");
        System.out.println("El musico de nombre "+integrant[inst]+ " esta afinando su "+instrument[inst]);
        System.out.println("          ");
    }
    
    public void Tocar()
    {
        System.out.println("       Que empiese la musica!!!!!! ");
        for (int i = 0; i < numeros; i++) {            
            System.out.println("El musico de nombre "+integrant[i]+ " esta tocando "+instrument[i]);
        }
    }
}
