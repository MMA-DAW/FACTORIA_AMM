package Factoria_AMM;

import java.io.FileNotFoundException;
import java.io.FileWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Cliente para el examen 02 de PROGRAMACIÓN
 * @author Ana Muñiz
 * @version 1.0
 */
public class Cliente extends Persona{
    
    private String nombreEmpresa;
    private String telefono;
    
    public Cliente(String nombre, String apellidos, String dni, int edad, String nombreEmpresa, String telefono){
        super(nombre, apellidos, dni, edad);
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
    }
    
    public String getNombreEmpresa(){
        
        return this.nombreEmpresa;
    }
    
    public String getTelefono(){
        
        return this.telefono;
    }
    
    public void setNombreEmpresa(String nombreEmpresa){
        
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public void setTelefono(String telefono ){
        this.telefono = telefono;
    }
    
    /**
     * Método toString de la clase Cliente
     * @return cadena con las características del objeto
     */
    public String toString(){
        
        return super.toString() + "\nNombre de la empresa: " + nombreEmpresa + "\nTeléfono: " + telefono + "\n";
        
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
