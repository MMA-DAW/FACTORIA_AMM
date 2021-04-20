package Factoria_AMM;


import java.io.FileNotFoundException;
import java.io.FileWriter;

/**
 * Clase Persona para el examen 02 de PROGRAMACIÓN
 * @author Ana Muñiz
 * @version 1.0
 */
public abstract class Persona {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    
    /**
     * Constructor de la clase Persona
     * @param nombre cadena con el nombre de la persona
     * @param apellidos cadena con los apellidos de la persona
     * @param dni cadena con el dni de la persona
     * @param edad cadena con la edad de la persona
     */
    public Persona(String nombre, String apellidos, String dni, int edad){
        
        this.nombre = nombre;
        
        this.apellidos = apellidos;
        
        this.dni = dni;
        
        this.edad = edad;
    }
    
    /** GETTERS AND SETTERS */
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellidos(){
     
         return this.apellidos;
    }
    
    public String getDni(){
         return this.dni;
    }
    
    public int getEdad(){
        
         return this.edad;
    }
    
    public void setNombre(String nombre){
       this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos){
     
        this.apellidos = apellidos;
    }
    
    public void setDni(String dni){
         this.dni = dni;
    }
    
    public void setEdad(int edad){
        
         this.edad = edad;
    }
    
    /**
     * Método toString de la clase Persona
     * @return cadena con las características del objeto
     */
    public String toString(){
        
        return "Nombre: " + nombre + "\nApellido: " + apellidos + "\nDNI: " + dni + "\nEdad: " + edad;
    }
    
/**
* método estático que permite guardar la información que recibe por parámetro en un archivo de
texto
*
* @param ruta Cadena de caracteres que indica la ruta y el nombre del archivo donde se quieren
guardar los datos.
* @param datos cadena de caracteres que contiene la información que se quiere guardar.
* @param sobreEscribir booleano que en función de su valor indica si se sobreescribe el contenido
del archivo (verdadero) o se añade al final del mismo (falso).
* @return verdadero si se ha guardado correctamente el archivo y falso si se ha dado algún error
y no se ha podido guardar
*/
public static boolean escribirFichero(String ruta, String datos, boolean sobreEscribir) {
    boolean res;

    FileWriter fichero;

    try {

       fichero = new FileWriter(ruta, !sobreEscribir);
       fichero.write(datos);
       fichero.close();
       res = true;

    } catch (FileNotFoundException ex) {

       System.out.println("Fichero no encontrado");

       res = false;

    } catch (Exception e) {

       System.out.println("Mensaje: " + e.getMessage());

       res = false;

    }

    return res;
    
 }//Fin del método escribirFichero(String ruta, String datos, boolean sobreEscribir)

}
