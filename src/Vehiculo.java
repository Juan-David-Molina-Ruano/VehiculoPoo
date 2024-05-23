import java.time.LocalDate;

public abstract class  Vehiculo {

    //Atribustos
    String Nombre;
    String Color ;
    LocalDate Año_Fabricacion;
    Double Precio ;
    public Vehiculo() {
    }
    public Vehiculo(String nombre, String color, LocalDate año_Fabricacion, Double precio) {
        Nombre = nombre;
        Color = color;
        Año_Fabricacion = año_Fabricacion;
        Precio = precio;
    }
    
    //metodo
    public abstract void Mostrar_Info();

    public void Mostrar_Vehiculo() //Overied
    { 
        System.out.println(" Datos Cortos");
        System.out.print("NOMBRE: "+Nombre+" PRECIO: $"+Precio);
    }

    
}
