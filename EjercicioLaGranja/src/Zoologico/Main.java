package Zoologico;

/* La clase principal creo los objetos instanciando los objetos solo con los objetos reales*/

public class Main {
    public static void main(String[] args) {
        
        /* Polimorfismo, se transforma la informacion poli=muchas morfimo=formas, que toma muchas formas*/
        /* El arreglo se construye en base a la gerarquia del proyecto para este caso seria 
           la clase Animal */
        
        Animal misAnimales[] = new Animal[5];
        
        misAnimales[0] = new Jirafa(101, "jirafona", 200, 3.5f, "amarillo");
        misAnimales[1] = new Jirafa(102, "jirafita", 100, 2.5f, "cafe");
        misAnimales[2] = new Elefante(201, "dumbo", 800, 2.5f, 10000f);
        misAnimales[3] = new Puma(301, "puma", 100, 8, 120f);
        misAnimales[4] = new Aguila(401, "aguila", 4, 7, 70f);
        
        for(Animal i: misAnimales) {
            System.out.println(i.mostrarDatos());
            System.out.println("");
        }
        
        /* Los objetos son los unicos que pueden instanciar clases, atributos y metodo */

    }
}
