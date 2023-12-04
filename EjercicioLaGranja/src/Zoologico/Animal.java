package Zoologico;


/* La clase es abstracta ya que animal no es real */

public abstract class Animal { 
    
    /* Declaracion de variables privadas ya que son 
       variables de las cuales no se podran acceder ni etablecer directamente si no que se 
       utiliza la encapsuacion para poder hacer la operacion de establecer y obtener*/
    private int codigo; 
    private String nombre;
    private float peso;

    public Animal(int codigo, String nombre, float peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    /* Se establece un metodo abstracto ya que no es real la clase Animal */
    public abstract String mostrarDatos();
        
}
