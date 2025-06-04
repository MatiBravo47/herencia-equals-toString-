package productoidra.model;

public class Producto {

    protected String nombre; //nombre del producto
    protected float precio;
    protected long codigoBarra;
    protected String categoria;

    /*
    public Producto() {
        this.nombre = "";
        this.categoria = "";
        this.precio = 0.0f;
        this.codigoBarra = 001L;
    }
     */
    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String newName) {
        this.nombre = newName;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public long getCodigoBarra() {
        return this.codigoBarra;
    }

    public void setCodigoBarra(long codigo) {
        this.codigoBarra = codigo;
    }

    public void mostrarProducto() { //NO ES BUENA IDEA QUE EXISTA ESTE MÉTODO EN LA VIDA REAL!
        System.out.println("Mostrando producto ...");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Codigo de Barra: " + this.codigoBarra);
        System.out.println("Categoria: " + this.categoria);
    }

    @Override
    public String toString() {
        String salida = "Producto {";
        salida += "nombre: " + this.nombre + ", ";
        salida += "precio: " + this.precio + ", ";
        salida += "categoria: " + this.categoria + ", ";
        salida += "codigo_de_barra: " + this.codigoBarra + " }";

        return salida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Producto otroProducto = (Producto) o;
        if (otroProducto.precio != this.precio) {
            return false;
        }
        if (otroProducto.codigoBarra != this.codigoBarra) {
            return false;
        }
        if ( otroProducto.nombre.equals(this.nombre) != true) {
            return false;
        }
        /*
        if ( !otroProducto.categoria.equals(this.categoria)) {
            return false;
        }
        return true;
        */
        return otroProducto.categoria.equals(this.categoria);
    }
}
