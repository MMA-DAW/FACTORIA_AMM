/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

import java.util.Scanner;

/**
 *
 * @author Ana Muñiz
 * @version 1.0
 */
public class Lectura {
    
    /**
     * Método que permite obtener un entero desde el teclado
     * @param msg mensaje
     * @return  entero
     */
    public static int leerInteger(String msg){
        int entero = 0;
        boolean flag = false;
        
        Scanner s= new Scanner(System.in);
        
        do{
            try{
                System.out.print(msg);

                entero = Integer.valueOf(s.nextLine());
                
                flag = true;
                
            }catch (Exception e){
                System.out.println("No ha introducido un número entero.");
            }
        
        }while(!flag);
        
        return entero;
    }
    
    /**
     * Método que permite obtener un entero desde el teclado
     * @param msg mensaje
     * @return  entero
     */
    public static int leerInteger(String msg, int min, int max){
        int entero = 0;
        boolean flag = false;
        
        Scanner s= new Scanner(System.in);
        
        do{
            try{
                System.out.print(msg);

                entero = Integer.valueOf(s.nextLine());
                
                if(entero>=min && entero<=max) flag = true;
                else System.out.println("Introduzca un numero entre " + min + " y " + max);
                
            }catch (Exception e){

            }
        
        }while(!flag);
        
        return entero;
    }
    
    
    /**
     * Método que permite obtener una cadena de texto desde el teclado
     * @param msg mensaje
     * @return cadena
     */
    public static String leerString(String msg){
        
        String cadena = "";
        
        Scanner s= new Scanner(System.in);

        System.out.print(msg);

        cadena = s.nextLine();
                
        return cadena;
        
    }
    
    /**
     * Método que permite obtener una cadena de texto desde el teclado
     * @param msg mensaje 
     * @param longitud longitud de la cadena
     * @return cadena
     */
    public static String leerString(String msg, int longitud){
        
        String cadena = "";
        
        boolean flag = false;
        
        do{
            Scanner s= new Scanner(System.in);

            System.out.print(msg);

            cadena = s.nextLine();
        
            if(cadena.length()==longitud) flag = true;
            
        }while(!flag);
        
        return cadena;
        
    }

}
