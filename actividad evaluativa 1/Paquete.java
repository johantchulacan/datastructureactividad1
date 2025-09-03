import java.time.LocalDateTime;

public class Paquete {
    private String destinatario;
    private LocalDateTime fechaIngreso;

    public Paquete(String destinatario) {
        this.destinatario = destinatario;
        this.fechaIngreso = LocalDateTime.now(); // guarda la fecha y hora actual
    }

    public String getDestinatario() {
        return destinatario;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    
    public String toString() {
        return "Destinatario: " + destinatario + " | Fecha ingreso: " + fechaIngreso;
    }
}
