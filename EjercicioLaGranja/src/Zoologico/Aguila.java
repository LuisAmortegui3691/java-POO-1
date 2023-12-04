package Zoologico;

public class Aguila extends AnimalCarnivoros{
    private float velocidadVuelo;

    public Aguila(int codigo, String nombre, float peso, int edad, float velocidadVuelo) {
        super(codigo, nombre, peso, edad);
        this.velocidadVuelo = velocidadVuelo;
    }

    public float getVelocidadVuelo() {
        return velocidadVuelo;
    }

    public void setVelocidadVuelo(float velocidadVuelo) {
        this.velocidadVuelo = velocidadVuelo;
    }
    
    @Override
    public String mostrarDatos() {
        return "Aguila{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", peso=" + getPeso() + 
                ", edad=" + getEdad()+ ", velocidadVuelo=" + velocidadVuelo +'}';
    }
}
