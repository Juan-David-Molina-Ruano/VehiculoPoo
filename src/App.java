import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner Leer = new Scanner(System.in);

        int Opcion=0;

        Vehiculo Mi_Automovil_1 = new Automovil();

        System.out.println("   ¿Que Vehiculo Desea Ver?:");
        System.out.println("1.Automovil   2.Barco   3.Avion");
        System.out.print("Opcion: ");
        Opcion = Leer.nextInt();

        if(Opcion==1)
        {
            Vehiculo Mi_Automovil = new Automovil("TOYOTA", "ROJO",200.00);

            Mi_Automovil.mostrarInfo();
            Mi_Automovil.mostrarVehiculo();
        }
    }
}
