public class Casillero {
    private int numero;
    private Paquete paquete; // composición: un casillero puede tener un paquete o estar vacío

    public Casillero(int numero) {
        this.numero = numero;
        this.paquete = null;
    }

    public boolean estaDisponible() {
        return paquete == null;
    }

    public void asignarPaquete(Paquete p) {
        if (estaDisponible()) {
            this.paquete = p;
        } else {
            System.out.println("⚠ Casillero " + numero + " ya está ocupado.");
        }
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void liberar() {
        this.paquete = null;
    }

    
    public String toString() {
        return "Casillero " + numero + " -> " + (estaDisponible() ? "Disponible" : "Ocupado");
    }
}
