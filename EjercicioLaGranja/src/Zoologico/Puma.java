package Zoologico;

/* Clase hija de AnimalCarnivoro por ello se exttiende de la clase AnimalCarnivoro */

public class Puma extends AnimalCarnivoros{
    private float velocidad;

    public Puma(int codigo, String nombre, float peso, int edad, float velocidad) {
        super(codigo, nombre, peso, edad);
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    /* Se imprime ya que la clase es real y se deja @Override por que se sobreesccribe */
    @Override
    public String mostrarDatos() {
        return "Puma{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() + 
                ", edad=" + getEdad()+ ", velocidad=" + velocidad +'}';
    }
}
