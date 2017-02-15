package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class Banda {
    
    String[] instrumentos = {"Guitarra", "Piano", "Flauta", "Tambores", "Bajo", "Bateria", "Trompeta",
        "Saxofon", "Teclado", "Sintetizador", "Microfono", "Maracas", "Guacharaca"};
    
    String []integrantes={"Daniel","Juan","Pedro","Miguel","Lucas","Pablo","Luis","Jose","Andres","Carlos","Ernesto",
        "Gustavo","Jaime","Nelson","Oscar","maria","andrea","luisa","susana","perla","diana","ana","sofia","jimena",
        "gina","paula","camila","esperanza","rosa"};

    

    public String[] getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(String[] instrumentos) {
        this.instrumentos = instrumentos;
    }
    
    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    public Banda() {

    }


  }
