import java.time.LocalDate;

public abstract class  Vehiculo {

     // Atributos privados
     private String nombre;
     private String color;
     private LocalDate añoFabricacion;
     private Double precio;
 
     public Vehiculo() {
     }
 
     // Constructor con parámetros
     public Vehiculo(String nombre, String color, LocalDate añoFabricacion, Double precio) {
         this.nombre = nombre;
         this.color = color;
         this.añoFabricacion = añoFabricacion;
         this.precio = precio;
     }
 
     public String getNombre() {
         return nombre;
     }
 
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
 
     public String getColor() {
         return color;
     }
 
     public void setColor(String color) {
         this.color = color;
     }
 
     public LocalDate getAñoFabricacion() {
         return añoFabricacion;
     }
 
     public void setAñoFabricacion(LocalDate añoFabricacion) {
         this.añoFabricacion = añoFabricacion;
     }
 
     public Double getPrecio() {
         return precio;
     }
 
     public void setPrecio(Double precio) {
         this.precio = precio;
     }
 
     // Método abstracto
     public abstract void mostrarInfo();
 
     // Método para mostrar información del vehículo
     public void mostrarVehiculo() // Overridden
     {
         System.out.println("Datos Cortos");
         System.out.print("NOMBRE: " + nombre + " PRECIO: $" + precio);
     }
    
}