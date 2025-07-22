package productoidra;

import productoidra.model.Producto;
import java.util.Scanner;
import productoidra.model.ProductoConVencimiento;
import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        Producto p1 = new Producto("Coca Cola chica"); //Instanciamos el Producto
        p1.setNombre("Coca Cola 1.5L"); //Asignamos un valor al nombre
        p1.setPrecio(2999.99f);
        p1.setCodigoBarra(1240917234987132984L);
        p1.setCategoria("Coca Cola");
        System.out.println(p1);
        
        ProductoConVencimiento p2 = new ProductoConVencimiento("Huevos", 4000.0f);
        p2.setCodigoBarra(123L);
        p2.setCategoria("Granja");
        p2.setFechaVencimiento(LocalDate.of(2025, 5, 20));
        System.out.println(p2);
    }
    
}
