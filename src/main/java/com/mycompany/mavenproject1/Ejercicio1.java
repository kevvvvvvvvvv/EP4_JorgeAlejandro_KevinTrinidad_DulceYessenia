package com.mycompany.mavenproject1;

import lombok.Setter;


@Setter
public class Ejercicio1 {
    
    private String cinta;
    
    public boolean estadoN(int posicion){
        if(cinta.length() == posicion) return true;
        if(cinta.charAt(posicion) == '1') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '2') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '3') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '4') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '5') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '6') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '7') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '8') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '9') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '0') return estadoNZ(posicion+1);
        return false;
    } 
    
    
    private boolean estadoNZ(int posicion){
        if(cinta.length() == posicion) return true;
        if(cinta.charAt(posicion) == '1') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '2') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '3') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '4') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '5') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '6') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '7') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '8') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '9') return estadoNZ(posicion+1);
        if(cinta.charAt(posicion) == '0') return estadoNZ(posicion+1);
        return false;
    }
    
}
