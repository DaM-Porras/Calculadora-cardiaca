public class Fecha {
    private int dia;
    private int mes;
    private int año;

    //constructor
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Getters y Setters
    //dia
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    //mes
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    //año
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}