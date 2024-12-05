package com.mycompany.mavenproject1;

/**
 *
 * @author kevin
 */
public class Main {

    public static void main(String[] args) {
        //Ejercicio 1 
        String[] ejercicio1 = {
            "1",
            "12",
            "123",
            "1234",
            "12345",
            "123456",
            "1234567",
            "123456789",
            "1234567890"
        };
        
        //Ejercicio 2
        String[] ejercicio2 = {
            "a",
            "aabb",
            "abab",
            "abababab",
            "babababa",
            "bbaabbaabb",
            "babaaaaa",
            "baaaaaaaaa"
        };
        
        //Ejercicio 3
        String[] ejercicio3 = { 
            "123456",
            "#123456",
            "ABCDEF",
            "#ABCDEF",
            "ABC",
            "#ABC",
            "#123",
            "#6a7b6f"
        };
                
        Ejercicio1 e1 = new Ejercicio1();
        for(String e:ejercicio1){
            e1 = new Ejercicio1();
            e1.setCinta(e);
            System.out.println("La cadena "+e+" es válida? "+e1.estadoN(0));
        }
        System.out.println("\n");
        
        Ejercicio2 e2 = new Ejercicio2();
        for(String e:ejercicio2){
            e2 = new Ejercicio2();
            e2.setCinta(e);
            System.out.println("La cadena "+e+" es válida? "+e2.estadoS(0));
        }
        System.out.println("\n");
        
        Ejercicio3 e3 = new Ejercicio3();
        for(String e:ejercicio3){
            e3 = new Ejercicio3();
            e3.setCinta(e);
            System.out.println("La cadena "+e+" es válida? "+e3.estadoS(0));
        }
    }
}
