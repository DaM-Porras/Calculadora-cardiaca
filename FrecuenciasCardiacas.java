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
}
