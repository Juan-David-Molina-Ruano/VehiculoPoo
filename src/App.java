import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner Leer = new Scanner(System.in);

        int Opcion=0;

        Vehiculo Mi_Vehiculo = new Automovil();

        System.out.println("   ¿Que Vehiculo Desea Ver?:");
        System.out.println("1.Automovil   2.Avion   3.Barco");
        System.out.print("Opcion: ");
        Opcion = Leer.nextInt();

        if(Opcion==1)
        {
            Mi_Vehiculo = new Automovil("TOYOTA", "ROJO",200.00);

            Mi_Vehiculo.mostrarInfo();
            Mi_Vehiculo.mostrarVehiculo();
        }
        else if(Opcion==2)
        {
            Mi_Vehiculo = new Avion("FERRARI", "NEGRO",400.00);

            Mi_Vehiculo.mostrarInfo();
            Mi_Vehiculo.mostrarVehiculo();
        }

        else if(Opcion==3)
        {
            Mi_Vehiculo = new Barco("Titanic", "Blanco",500.00);

            Mi_Vehiculo.mostrarInfo();
            Mi_Vehiculo.mostrarVehiculo();
        }
        else
        {
            System.out.println("Opcion No Valida");
        }
        
    }
}
