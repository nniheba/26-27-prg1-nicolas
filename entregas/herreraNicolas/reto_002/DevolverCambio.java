// Agrupando la clase actual al paquete que estaremos trabajando, solo en dado caso que sea neceasrio
package entregas.herreraNicolas.reto_002;

// Importando la funcion de java Scanner
import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable a cobrar al usuario
        int CostoTotal;

        // Variable con la que paga el usuario
        int PagoTotal; 

        // Variable del cambio que se le devuelve al usuario
        int Cambio;

        // Preguntandole al usuario cual es el coste total a cobrar
        System.out.println("Introduce el costo total a cobrar:");
        int CostoTotalScanner = scanner.nextInt();
        CostoTotal = CostoTotalScanner;

        // Preguntandole al usuario cual cual es el pago total a pagar
        System.out.println("Introduce el total con el paga el usuario:");
        int PagoTotalScanner = scanner.nextInt();
        

        
    }
}
