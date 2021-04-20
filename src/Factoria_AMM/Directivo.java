package Factoria_AMM;

/**
 * CClase Directivo para el examen 02 de PROGRAMACIÓN
 * @author Ana Muñiz
 * @version 1.0
 */
public final class Directivo extends Empleado {
    
    private Enumeration.Categoria categoria;
    
    private Empleado [] subordinados = new Empleado[5];
    
    /**
     * Constructor de la clase Directivo
     * @param _nombre nombre del objeto Directivo
     * @param _apellidos apellidos del objeto Directivo
     * @param _dni dni del objeto Directivo
     * @param _edad edad del objeto Directivo
     * @param _sueldoBruto sueldo Bruto del objeto Directivo
     * @param _categoria categoría del objeto Directivo
     * @param _subordinados subordinados del objeto Directivo
     */
    public Directivo(String _nombre, String _apellidos, String _dni, int _edad, float _sueldoBruto, Enumeration.Categoria _categoria, Empleado [] _subordinados){
        
        super(_nombre, _apellidos, _dni, _edad);
        categoria = _categoria;
        
        for(int i=0; i<_subordinados.length; i++){
            
            subordinados[i] = _subordinados[i];
        }
        
    }
    
    /**
     * Método para calcular el salario neto
     * @return salario neto
     */
    protected double calcularSalarioNeto(){
        
        float complemento = 0;
        
        if(this.categoria.equals(Enumeration.Categoria.DIRECTOR))complemento = 950;
        else if(this.categoria.equals(Enumeration.Categoria.JEFE_RRHH))complemento = 550;
        else if(this.categoria.equals(Enumeration.Categoria.GERENTE))complemento = 375;
        
        double salarioNeto = (complemento + this.sueldoBruto) * (81/100);
        
        return salarioNeto;
    }
    
     /**
     * Método toString de la clase Directivo
     * @return cadena con las características del objeto
     */
    public String toString(){
        return super.toString() + "\nCategoría: " + categoria + "\nSubordinados: " + listarSubordinados() + "\n";
    }
    
    /**
     * Método para listar los subordinados de un objeto Director
     * @return listado
     */
    public String listarSubordinados(){
        String lista = "";
        for(int i=0; i<this.subordinados.length; i++){
            if(!this.subordinados[i].equals(null)) lista += this.subordinados[i];
        }
        return lista;
    }

    /**
     * Método que permite añadir subordiandos a un objeto Director
     * @param _subordinado subordinado a añadir
     * @return true | false
     */
    public boolean altaSubordinado(Empleado _subordinado){
        boolean alta = false;
        
        for(int i=0; i<this.subordinados.length; i++){
            if(this.subordinados[i].equals(null)){
                
                this.subordinados[i] = _subordinado;
                alta = true;
                i = this.subordinados.length;
            }
        }
        
        return alta;
    }
    
    /**
     * Método que permite quitar subordiandos a un objeto Director
     * @param _subordinado subordinado a añadir
     * @return true | false
     */
    public boolean bajaSubordinado(Empleado _subordinado){
        boolean baja = false;
        
        for(int i=0; i<this.subordinados.length; i++){
            
            if(this.subordinados[i].equals(_subordinado)){
                
                this.subordinados[i] = null;
                
                baja = true;
                
                i = this.subordinados.length;
            }
        }
        
        return baja;
    }
    
}
