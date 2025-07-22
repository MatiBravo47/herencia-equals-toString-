package productoidra.model;
import java.time.LocalDate;

public class ProductoConVencimiento extends Producto {

    protected LocalDate fechaVencimiento;

    public ProductoConVencimiento(String nombre) {
        super(nombre);
    }

    public ProductoConVencimiento(String nombre, float precio) {
        super(nombre, precio);
        this.codigoBarra = 0L;
    }

    public LocalDate getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fecha) {
        this.fechaVencimiento = fecha;
    }

    @Override
    public String toString() {
        return "ProductoConVencimiento {" +
                "nombre: " + this.nombre + ", " +
                "precio; " + this.precio + ", " +
                "categoria: " + this.categoria + ", " +
                "codigo_de_barra:" + this.codigoBarra + ", " +
                "fechaVencimiento: "  + this.fechaVencimiento + "}";
    }
}
