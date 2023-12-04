package Zoologico;

/* Clase hija de AnimalHerbivoro por ello se exttiende de la clase AnimalHerbivoro */

public class Jirafa extends AnimalHebivoro{
    private String color;

    public Jirafa(int codigo, String nombre, float peso, float altura, String color) {
        super(codigo, nombre, peso, altura);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    /* Se imprime ya que la clase es real y se deja @Override por que se sobreesccribe */
    @Override
    public String mostrarDatos() {
        return "Jirafa{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() + 
                ", altura=" + getAltura() + ", color=" + color +'}';
    }
    
}
