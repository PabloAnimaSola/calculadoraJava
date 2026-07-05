import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Pide número para tipo de operación
        System.out.println("\nBienvenido a la calculadora, especifica el tipo de operación que quieres realizar:\n\n1. Suma\n2. Resta\n3. Multiplicacion\n4. División");
        Scanner s = new Scanner(System.in);
        int operacion = s.nextInt();

        //Pide Primer número para calcular
        System.out.println("Indica el primer numero para calcular");
        int numero1 = s.nextInt();

        // Pide segundo número para calcular
        System.out.print("Ahora indica el segundo numero para calcular");
        int numero2 = s.nextInt();

        int resultado = 0;

        if(operacion == 1){
            resultado = numero1 + numero2;
        } else if (operacion == 2){
            resultado = numero1 - numero2;
        } else if (operacion == 3) {
            resultado = numero1 * numero2;
        } else if (operacion == 4){
            if (numero2 == 0){
                System.out.println("No se puede dividir entre cero.");
            }
            else {
                resultado = numero1 / numero2;
            }
        }
        System.out.println("El resultado de" + numero1 + " " + operacion + " " + numero2 + " es: \n" + resultado);
    }
}