import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Pide número para tipo de operación
        System.out.println("\nBienvenido a la calculadora, especifica el tipo de operación que quieres realizar:\n\n1. Suma\n2. Resta\n3. Multiplicacion\n4. División");
        Scanner s = new Scanner(System.in);
        String operacion = s.nextLine();

        // Validaciones para saber si está vacío el valor, si es un número el string, y si entra dentro de los tipos permitidos de operación (1-4)
        switch (operacion.isEmpty()) {
            case true:
                System.out.println("No se ha especificado ningún tipo de operación.");
                System.exit(1);
            case false:
                int enteroOperacion = Integer.parseInt(operacion);
                try {
                    enteroOperacion = Integer.parseInt(operacion);
                } catch (NumberFormatException noEsNumero) {
                    System.out.println("El valor especificado no es un número.");
                    System.exit(1);
                }
                if (enteroOperacion < 1 || enteroOperacion > 4) {
                    System.out.println("El valor especificado no se reconoce como tipo de operación.");
                    System.exit(1);
                }
                break;
        }
        // Solicita los números a operar
        System.out.println("Indica el primer número para calcular.");
        float num1 = s.nextFloat();

        System.out.println("Ahora indica el segundo.");
        float num2 = s.nextFloat();
        float resultado = 0;

        switch (Integer.parseInt(operacion)) {
            case 1:
                operacion = "+";
                resultado = num1 + num2;
                break;
            case 2:
                operacion = "-";
                resultado = num1 - num2;
                break;
            case 3:
                operacion = "*";
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre cero.");
                    System.exit(1);
                } else {
                    operacion = "/";
                    resultado = num1 / num2;
                    break;
                }
        }
        System.out.println("El resultado de " + num1 + " " + operacion + " " + num2 + " = " + resultado);
    }
}