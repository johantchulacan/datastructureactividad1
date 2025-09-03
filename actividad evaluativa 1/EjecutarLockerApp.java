import java.util.Scanner;

public class EjecutarLockerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Suponemos 30 casilleros como en la foto
        Casillero[] casilleros = new Casillero[30];
        for (int i = 0; i < casilleros.length; i++) {
            casilleros[i] = new Casillero(i + 1);
        }

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Registrar paquete en casillero");
            System.out.println("2. Consultar casilleros disponibles");
            System.out.println("3. Información de paquete en casillero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            if (opcion == 1) {
                System.out.print("Ingrese número de casillero (1-30): ");
                int num = sc.nextInt();
                sc.nextLine(); 
                if (num < 1 || num > 30) {
                    System.out.println("⚠ Casillero inválido.");
                } else if (casilleros[num - 1].estaDisponible()) {
                    System.out.print("Ingrese nombre del destinatario: ");
                    String dest = sc.nextLine();
                    Paquete p = new Paquete(dest);
                    casilleros[num - 1].asignarPaquete(p);
                    System.out.println("✅ Paquete registrado en casillero " + num);
                } else {
                    System.out.println("⚠ Casillero ocupado.");
                }

            } else if (opcion == 2) {
                System.out.println("\nCasilleros disponibles:");
                for (Casillero c : casilleros) {
                    System.out.println(c);
                }

            } else if (opcion == 3) {
                System.out.print("Ingrese número de casillero: ");
                int num2 = sc.nextInt();
                if (num2 < 1 || num2 > 30) {
                    System.out.println("⚠ Casillero inválido.");
                } else {
                    Paquete paquete = casilleros[num2 - 1].getPaquete();
                    if (paquete == null) {
                        System.out.println("⚠ Casillero vacío.");
                    } else {
                        System.out.println("📦 Info paquete: " + paquete);
                    }
                }

            } else if (opcion == 4) {
                System.out.println("👋 Cerrando aplicación...");

            } else {
                System.out.println("⚠ Opción no válida.");
            }
        }

        sc.close();
    }
}
