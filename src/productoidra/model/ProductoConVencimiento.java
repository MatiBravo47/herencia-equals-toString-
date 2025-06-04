package productoidra.model;

public class ProductoConVencimiento extends Producto {

    protected int fechaVencimiento;

    public ProductoConVencimiento(String nombre) {
        super(nombre);
    }

    public ProductoConVencimiento(String nombre, float precio) {
        super(nombre, precio);
        this.codigoBarra = 0L;
    }

    public int getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(int fecha) {
        //variable fechaVencimiento??
        this.fechaVencimiento = fecha;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto(); //se ejecuta siempre primero
        System.out.println("Fecha de vencimiento: " + this.fechaVencimiento);
    }
    
    @Override
    public String toString() {
        String salida = "ProductoConVencimiento {";
        return salida;
    }
}
