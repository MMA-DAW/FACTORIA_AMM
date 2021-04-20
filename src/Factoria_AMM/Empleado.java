package Factoria_AMM;

import java.io.FileNotFoundException;
import java.io.FileWriter;

/**
 * Clase Empelado para el examen 02 de PROGRAMACIÓN
 *-
 * @author Ana Muñiz
 * @version 1.0
 */
public class Empleado extends Persona {

    protected double sueldoBruto;

    public Empleado(Empleado _empleado) {
        super(_empleado.getNombre(), _empleado.getApellidos(), _empleado.getDni(), _empleado.getEdad());

    }

    /**
     * Constructor de la clase Empleado
     *
     * @param nombre cadena con el nombre del empleado
     * @param apellidos cadena con los apellidos del empleado
     * @param dni cadena con el dni del empleado
     * @param edad cadena con la edad del empleado
     * @param sueldoBruto real con el sueldo bruto del empleado
     */
    public Empleado(String nombre, String apellidos, String dni, int edad) {
        super(nombre, apellidos, dni, edad);
        this.sueldoBruto = 1387.34;

    }

    /**
     * Método para calcular el salario neto
     *
     * @return salario neto
     */
    protected double calcularSalarioNeto() {
        double salarioNeto = this.sueldoBruto * (81 / 100);

        return salarioNeto;
    }

    /**
     * Método toString de la clase Empleado
     *
     * @return cadena con las características del objeto
     */
    public String toString() {
        return super.toString() + "\nSueldo bruto: " + sueldoBruto + "€";
    }

    /**
     * método estático que permite guardar la información que recibe por
     * parámetro en un archivo de texto
     *
     * @param ruta Cadena de caracteres que indica la ruta y el nombre del
     * archivo donde se quieren guardar los datos.
     * @param datos cadena de caracteres que contiene la información que se
     * quiere guardar.
     * @param sobreEscribir booleano que en función de su valor indica si se
     * sobreescribe el contenido del archivo (verdadero) o se añade al final del
     * mismo (falso).
     * @return verdadero si se ha guardado correctamente el archivo y falso si
     * se ha dado algún error y no se ha podido guardar
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
