package productoidra.model;

public class Producto {

    protected String nombre; 
    protected float precio;
    protected long codigoBarra;
    protected String categoria;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //Constructor completo
    public Producto(String nombre, float precio, long codigoBarra, String categoria) {
    this.nombre = nombre;
    this.precio = precio;
    this.codigoBarra = codigoBarra;
    this.categoria = categoria;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String newName) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
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
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public long getCodigoBarra() {
        return this.codigoBarra;
    }

    public void setCodigoBarra(long codigo) {
        this.codigoBarra = codigo;
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
        return otroProducto.categoria.equals(this.categoria);
    }
}
