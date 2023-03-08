package TaskJava1;

/*Para este primer ejercicio tendréis que realizar lo siguiente:

Crea un proyecto de Java desde 0
Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
--Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.*/
public class Main {
    public static void main(String[] args) {
        int edad = 20;
        long dni = 25556668;
        double sueldo = 250.30;
        boolean mayorEdad = true;
        mayorEdad = (edad >= 18); //estoy aclarando que es TRUE siempre que la variable edad sea mayor a 18
        String nombre = "Luisa";

        System.out.println("Mi edad es: " + edad);
        System.out.println("Mi dni es: " + dni);
        System.out.println("Mi sueldo mensual es: " + sueldo);

        if (mayorEdad){
            System.out.println("Es mayor de edad");

        } else {
            System.out.println("Es menor de edad");
        }


        System.out.println("Mi nombre es: " + nombre);
    }
}