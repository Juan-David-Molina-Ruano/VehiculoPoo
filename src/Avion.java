public class Avion extends Vehiculo
{
    public Avion()
    {
        
    }
    public Avion(String nombre, String color, Double precio)
    {
        super(nombre,color,precio);
    }

    @Override
    public void mostrarInfo() 
    {
       System.out.println("_ _ _ Datos Del Avion _ _ _");
       System.out.println("NOMBRE: "+getNombre()+" COLOR: "+getColor()+" PRECIO: "+getPrecio());
    }

    @Override
    public void mostrarVehiculo()
    {
        System.out.println("METODO SOBRE ESCRITO EN Avion");
    }
}
