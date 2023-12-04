package Zoologico;

/* Clase hija de animal por ello se exttiende de la clase animal
   como  es una abstraccion de lo real se esttablece como clase
   abstracta */

public abstract class AnimalHebivoro extends Animal{ 
    private float altura;

    public AnimalHebivoro(int codigo, String nombre, float peso, float altura) {
        super(codigo, nombre, peso);
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /* Se deja el @Override por que esta sobreescribiendo el metodo abstracto de la clase Animal*/
    @Override
    public abstract String mostrarDatos();
}
