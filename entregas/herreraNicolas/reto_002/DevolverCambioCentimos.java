// Agrupando la clase actual al paquete que estaremos trabajando, solo en dado caso que sea neceasrio
package entregas.herreraNicolas.reto_002;

// Importando la funcion de java Scanner
import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variable a cobrar al usuario
        double CostoTotal;

        // Variable con la que paga el usuario
        double PagoTotal; 

        // Variable del cambio que se le devuelve al usuario
        double Cambio;

        // Preguntandole al usuario cual es el coste total a cobrar
        System.out.println("Introduce el costo total a cobrar:");
        CostoTotal = scanner.nextDouble();

        // Preguntandole al usuario cual cual es el pago total a pagar
        System.out.println("Introduce el total con el paga el usuario:");
        PagoTotal = scanner.nextDouble();

        // Creando la logica para la condicion de que el Pago Total tiene que ser mayor al Costo Total

        boolean PagoSuficiente = PagoTotal >= CostoTotal;

        String mensaje = PagoSuficiente 
            ? "Pago correcto!, calculando su cambio..."
            : "OJO! NO TE ALCANZA PARA PAGAR?, el pago tiene que ser mayor que el costo total.";
        System.out.println(mensaje);

        // Creando la logica para dar el cambio al usuario con el cambio disponbile que contiene la maquina
        Cambio = PagoTotal - CostoTotal;

        // Guardamos la variable del cambio con los decimales
        double CambioConDecimal = Cambio;

        
    }
}
