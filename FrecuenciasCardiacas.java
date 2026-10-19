
import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    String nombre;
    String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    //constructor
    public FrecuenciasCardiacas(String nombre, String apellido, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
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

    //diaNacimiento
    public int getDiaNacimiento() {
        return diaNacimiento;
    }
    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    //mesNacimiento
    public int getMesNacimiento() {
        return mesNacimiento;
    }
    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    //anioNacimiento
    public int getAnioNacimiento() {
        return anioNacimiento;
    }
    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }


    ////Metodos
    /// calcularEdad

        public int calcularEdad() {
        LocalDate fechaNac = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaHoy = LocalDate.now();
        return Period.between(fechaNac, fechaHoy).getYears();
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

