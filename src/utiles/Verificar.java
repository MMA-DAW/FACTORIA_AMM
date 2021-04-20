/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ana Muñiz
 * @version 1.0
 */
public class Verificar {
 
/**
 * Método para validar el DNI
 * @param dni  dni que se desea validar
 * @return true|False Si el DNI introduccido es correcto o no.
 */
public static boolean comprobarDni(String dni){
    boolean verif = false;
        
    Pattern regex = Pattern.compile("[0-9]{8}[a-zA-Z]{1}");
        
    Matcher f = regex.matcher(dni);
        
    if(f.find()){
            
        verif = true;
            
    }
        
    return verif;
    
    }

/**
 * Método para validar el elefono
 * @param tlf teléfono que se desea validar
 * @return true|False Si el formato del teléfono introduccido es correcto o no.
 */
public static boolean comprobarTelefono(String tlf){
    boolean verif = false;
        
    Pattern regex = Pattern.compile("[6|7|8|9][0-9]{8}");
        
    Matcher f = regex.matcher(tlf);
        
    if(f.find()){
            
        verif = true;
            
    }
        
    return verif;
}

}
