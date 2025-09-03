

public class Paquete {
    private String destinatario;
    private String fechaIngreso;

    public Paquete(String destinatario) {
        this.destinatario = destinatario;
        this.fechaIngreso = fechaIngreso(); // guarda la fecha y hora actual
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    
    public String toString() {
        return "Destinatario: " + destinatario + " | Fecha ingreso: " + fechaIngreso;
    }
}
