import java.util.Scanner;

public class FrecuenciasCardiacas {
    String nombre;
    String apellido;
    Fecha fechaNacimiento;

    //constructor
    public FrecuenciasCardiacas(String nombre, String apellido, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters ///////////////////////////
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //apellido
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //fechaNacimiento
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    ////Metodos
    /// calcularEdad
    public int calcularEdad() {
        // Obtener la fecha actual
        java.util.Calendar fechaActual = java.util.Calendar.getInstance();
        int añoActual = fechaActual.get(java.util.Calendar.YEAR);
        int mesActual = fechaActual.get(java.util.Calendar.MONTH) + 1; // Los meses comienzan desde 0
        int diaActual = fechaActual.get(java.util.Calendar.DAY_OF_MONTH);

        // Calcular la edad
        int edad = añoActual - fechaNacimiento.getAño();

        // Ajustar la edad si el cumpleaños aún no ha ocurrido este año
        if (mesActual < fechaNacimiento.getMes() || (mesActual == fechaNacimiento.getMes() && diaActual < fechaNacimiento.getDia())) {
            edad--;
        }

        return edad;
    }

    //Frecuencia cardiaca maxima
    public int calcularFrecuenciaCardiacaMaxima() {
        int edad = calcularEdad();
        return 220 - edad;
    }

    //Frecuencia cardiaca esperada
    public String calcularFrecuenciaEsperada() {
        int frecuenciaMaxima = calcularFrecuenciaCardiacaMaxima();
        double frecuenciaMinima = frecuenciaMaxima * 0.5;
        double frecuenciaMaximaEsperada = frecuenciaMaxima * 0.85;

        return "Su frecuencia cardiaca esperada se encuentra entre " + (int)frecuenciaMinima + " y " + (int)frecuenciaMaximaEsperada + " latidos por minuto. No consideramos otros factores externos que apliquen (salud, actividad fisica, etc).";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su primer nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su día de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese su año de nacimiento: ");
        int año = entrada.nextInt();

        Fecha fechaNacimiento = new Fecha(dia, mes, año);
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, fechaNacimiento);

        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Fecha de nacimiento: "
                + persona.getFechaNacimiento().getDia() + "/"
                + persona.getFechaNacimiento().getMes() + "/"
                + persona.getFechaNacimiento().getAño());

        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia cardiaca máxima: "
                + persona.calcularFrecuenciaCardiacaMaxima() + " latidos por minuto");
        System.out.println(persona.calcularFrecuenciaEsperada());

        entrada.close();
    }
}
