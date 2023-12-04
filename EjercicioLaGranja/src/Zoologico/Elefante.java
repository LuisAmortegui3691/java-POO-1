package Zoologico;

/* Clase hija de AnimalHerbivoro por ello se exttiende de la clase AnimalHerbivoro */

public class Elefante extends AnimalHebivoro{
    
    private float precio;

    public Elefante(int codigo, String nombre, float peso, float altura, float precio) {
        super(codigo, nombre, peso, altura);
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /* Se imprime ya que la clase es real y se deja @Override por que se sobreesccribe */
    @Override
    public String mostrarDatos() {
        return "Elefante{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() + 
                ", altura=" + getAltura() + ", precio=" + precio +'}';
    }
    
}
