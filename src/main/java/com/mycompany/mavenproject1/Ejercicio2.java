package com.mycompany.mavenproject1;

import lombok.Setter;

@Setter
public class Ejercicio2 {
    
    private String cinta;
    
    public boolean estadoS(int posicion){
        if(cinta.length() == posicion) return false;
        if(cinta.charAt(posicion) == 'a') return estadoD(posicion+1);
        if(cinta.charAt(posicion) == 'b') return estadoA(posicion+1);
        
        return false;
    }
    
    private boolean estadoA(int posicion){
        if(cinta.length() == posicion) return true;
        if(cinta.charAt(posicion) == 'a') return estadoSZ(posicion+1);
        if(cinta.charAt(posicion) == 'b') return estadoD(posicion+1);
        
        return false;
    }
    
    private boolean estadoD(int posicion){
        if(cinta.length() == posicion) return false;
        if(cinta.charAt(posicion) == 'a') return estadoD(posicion+1);
        if(cinta.charAt(posicion) == 'b') return estadoD(posicion+1);
        
        return false;
    }
    
    private boolean estadoSZ(int posicion){
        if(cinta.length() == posicion) return true;
        if(cinta.charAt(posicion) == 'a') return estadoD(posicion+1);
        if(cinta.charAt(posicion) == 'b') return estadoA(posicion+1);
        
        return false;
    }
}
