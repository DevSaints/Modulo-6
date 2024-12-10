// Nombre: Alisson Ibarguen
// Número de ID: 8-1020-2253
// Facultad: FACULTAD DE INGENIERÍA, ARQUITECTURA Y DISEÑO
// Carrera: Lic. INGENIERÍA EN SISTEMAS COMPUTACIONALES
// Curso: Programación de Computadoras II

/*
Enunciado: Tomando como base la Actividad #5, el programa ahora debe permitir al usuario
 realizar múltiples operaciones y almacenar los resultados en un arreglo.
 Además, debe manejar posibles errores de entrada del usuario.*/

// importamos la clase Scanner del paquete java.util
import java.util.Scanner;

// Clase principal Main
public class Main {
    // Metodo principal main
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int tipoOperacion = 0;
        while (tipoOperacion != 1 && tipoOperacion != 2) {
            try {
                System.out.println("Ingrese el tipo de operaciones que quiere realizar \n(1) Operaciones Matemáticas multiples\n (2) Cacular Area o Perimetro de Figuras geométricas:");
                tipoOperacion = scanner.nextInt();
            }
            catch (Exception e) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.nextLine();
            }
        }
        if (tipoOperacion == 1) {
         new OperacionesMultiples().ejecutar();
        }
        else if (tipoOperacion == 2) {
            new FigurasGeometricas();
        }

        scanner.close();
    }
}