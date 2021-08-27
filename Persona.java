/*
 * Clase persona donde realizaremos los constructores y mmetodos
 * para poner en practica la sobrecarga..
 */

package SobreCarga;

/**
 *
 * @author pedro
 */

public class Persona {
    
    private String nombre;
    private String apellido;
    private String dpi;
    
    /**
     * Creamos nuestro primer constructor el cual solo pedira 2 parametros.
     * @param nombre
     * @param apellido
     */
    
    public Persona(String nombre, String apellido) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        
    }
    
    /**
     * Ahora sobrecargamos nuestro constructor el cual ya solo
     * nos requerida un parametro
     * @param dpi 
     */
    
    public Persona(String dpi) {
        
        this.dpi = dpi;
        
    }
    
    /**
     * Creamos nuestro metodo saludar esta vez sin parametros.
     */
    
    public void Saludar(){
        
        System.out.println("Buenos dias, Me llamo " + nombre + " " + apellido);
        
    }
    
    /**
     * Y procedemos a sobrecargar nuestro metodo pero esta vez con un parametro
     * @param dia 
     */
    
    public void Saludar(String dia){
        
        System.out.println("Buenos dias, Feliz " + dia);
        
    }
    
}
