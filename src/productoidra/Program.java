package productoidra;

import productoidra.model.Producto;
import java.util.Scanner;
import productoidra.model.ProductoConVencimiento;

public class Program {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        Producto p1 = new Producto("Coca Cola chica"); //Instanciamos el Producto
        p1.setNombre("Coca Cola 1.5L"); //Asignamos un valor al nombre
        p1.setPrecio(2999.99f);
        p1.setCodigoBarra(1240917234987132984L);
        p1.setCategoria("Coca Cola");
        System.out.println(p1);
        //p1.mostrarProducto();
        
        ProductoConVencimiento p2 = new ProductoConVencimiento("Huevos", 4000.0f);
        p2.setCodigoBarra(123L);
        p2.setCategoria("Granja");
        p2.setFechaVencimiento(20250520);
        System.out.println(p2);
        //p2.mostrarProducto();
        
        /*
        System.out.println("Ingrese el nombre del producto:");
        p1.setNombre(scn.nextLine());
        String nombre = scn.nextLine();
        //... operación/validación/etc
        p1.setNombre(nombre);
        Producto prod = new Producto(nombre);
        /*
        System.out.println("Ingrese el precio:");
        p1.precio = scn.nextFloat();
        scn.nextLine();
        System.out.println("Ingrese el código de barras");
        p1.codigoBarra = scn.nextLong();
        System.out.println("Ingrese la marca");
        scn.nextLine();
        //scn = new Scanner(System.in);
        p1.marca = scn.nextLine();
        
        System.out.println("Datos del producto");
        System.out.println("Nombre:" + p1.getNombre());
        System.out.println("Precio: $" + p1.precio);
        System.out.println("Código de barras: " + p1.codigoBarra);
        System.out.println("Marca: " + p1.marca);
        */
        //Producto[] productos = new Producto[10];
        //productos[0] = p1;
        
    }
    
}
