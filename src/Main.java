import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Pide número para tipo de operación
        System.out.println("\nBienvenido a la calculadora, especifica el tipo de operación que quieres realizar:\n\n1. Suma\n2. Resta\n3. Multiplicacion\n4. División");
        Scanner s = new Scanner(System.in);
        int operacion = s.nextInt();

        //Pide primer número para calcular
        System.out.println("Indica el primer numero para calcular");
        float numero1 = s.nextFloat();

        // Pide segundo número para calcular
        System.out.println("Ahora indica el segundo numero para calcular");
        float numero2 = s.nextFloat();

        // Inicializa variables del resultado y el tipo de operación para el final
        float resultado = 0;
        String valor = "";

        // Realiza la operación y asignación del tipo de operación para el final
        if (operacion == 1) {
            resultado = numero1 + numero2;
            valor = "+";
        } else if (operacion == 2) {
            resultado = numero1 - numero2;
            valor = "-";
        } else if (operacion == 3) {
            resultado = numero1 * numero2;
            valor = "x";
        } else if (operacion == 4) {
            if (numero2 == 0) {
                System.out.println("No se puede dividir entre cero.");
                System.exit(1);
            } else {
                resultado = numero1 / numero2;
                valor = "/";
            }
        }
        // Imprime el resultado
        System.out.println("El resultado de " + numero1 + " " + valor + " " + numero2 + " es " + resultado);
    }
}