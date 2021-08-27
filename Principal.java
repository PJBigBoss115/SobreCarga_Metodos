/*
 * Aqui realizaremos las pruebas del ejemplo
 */

package SobreCarga;

/**
 *
 * @author pedro
 */

public class Principal {
    public  static  void  main ( String [] args ) {
        
        Persona nuevoX0 = new Persona("Pedro", "Aguilar");
        
        nuevoX0.Saludar();
        
        Persona nuevoX1 = new Persona("0000 00000 0000");
        
        nuevoX1.Saludar("Viernes");
        
    }
    
}
