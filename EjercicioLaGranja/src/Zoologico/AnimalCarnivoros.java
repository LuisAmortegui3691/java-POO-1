package Zoologico;

/* Clase hija de animal por ello se exttiende de la clase animal
   como  es una abstraccion de lo real se esttablece como clase
   abstracta */

public abstract class AnimalCarnivoros extends Animal{
    private int edad;

    public AnimalCarnivoros(int codigo, String nombre, float peso, int edad) {
        super(codigo, nombre, peso);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    public abstract String mostrarDatos();
    
}
