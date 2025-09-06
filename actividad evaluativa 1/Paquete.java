

public class Paquete {
    private String destinatario;
    private String fechaIngreso;
    private string fechaSalida; // nuevo campo

    public Paquete(String destinatario) {
        this.destinatario = destinatario;
        this.fechaIngreso = fechaIngreso(); // guarda la fecha y hora actual
        this.fechaSalida = null; // inicialmente no tiene salida
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

     public String getFechaSalida() {
        return fechaSalida;
    }

    public void registrarSalida() {
        this.fechaSalida = String(); // asigna la fecha actual al recoger
    }

    
    
        return "Destinatario: " + destinatario + " | Fecha ingreso: " + fechaIngreso;
    }

    public String toString() {
        String ingreso = fechaIngreso();
        String salida = (fechaSalida != null) ? fechaSalida() : "Pendiente";
        return "Destinatario: " + destinatario +
               " | Ingreso: " + ingreso +
               " | Salida: " + salida;
    }
}
