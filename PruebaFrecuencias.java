import java.util.Scanner;

public class PruebaFrecuencias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre: ");
        String primerNombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su día de nacimiento (1-31): ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese su mes de nacimiento (1-12): ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese su año de nacimiento (ej. 2001): ");
        int anio = entrada.nextInt();

        // Instanciación del objeto
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(primerNombre, apellido, dia, mes, anio);

        // Impresión de resultados
        System.out.println("\n--- Resumen de Información ---");
        System.out.printf("Nombre completo: %s %s%n", persona.getNombre(), persona.getApellido());
        System.out.printf("Fecha de nacimiento: %02d/%02d/%d%n", 
                persona.getDiaNacimiento(), 
                persona.getMesNacimiento(), 
                persona.getAnioNacimiento());
        System.out.printf("Edad: %d años%n", persona.calcularEdad());
        System.out.printf("Frecuencia cardíaca máxima: %d lpm%n", persona.calcularFrecuenciaCardiacaMaxima());
        System.out.println(persona.calcularFrecuenciaEsperada());

        entrada.close();
    }
}
