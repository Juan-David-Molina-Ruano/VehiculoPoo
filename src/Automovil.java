public class Automovil extends Vehiculo
{

    public Automovil(String nombre, String color, Double precio)
    {
        super(nombre,color,precio);
    }

    @Override
    public void mostrarInfo() 
    {
       System.out.println("_ _ _ Datos Del Automovil _ _ _");
       System.out.println("NOMBRE: "+getNombre()+" COLOR: "+getColor()+" PRECIO: "+getPrecio());
    }

    @Override
    public void mostrarVehiculo()
    {
        System.out.println("METODO SOBRE ESCRITO EN Automovil");
    }
}
