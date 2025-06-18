# 📘 herencia-equals-toString-

Este proyecto en Java, desarrollado en NetBeans, tiene como objetivo demostrar los principios fundamentales de la Programación Orientada a Objetos (POO), enfocándose en:

- **Herencia**
- **Encapsulamiento**
- **Sobrescritura de métodos (`toString()` y `equals()`)**

## 🧠 Conceptos Clave

### 1. Herencia

La herencia permite que una clase (subclase) adquiera propiedades y comportamientos de otra clase (superclase), promoviendo la reutilización de código y la creación de jerarquías lógicas.

```java
public class Producto {
    // Atributos y métodos comunes
}

public class ProductoImportado extends Producto {
    // Atributos y métodos adicionales
}
```
2. Encapsulamiento
El encapsulamiento restringe el acceso directo a los atributos de una clase, protegiendo la integridad de los datos. Se logra mediante modificadores de acceso (private, protected, public) y el uso de métodos getters y setters.

```java
Copiar código
private String nombre;

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
```
3. Sobrescritura de Métodos
toString()
El método toString() proporciona una representación en forma de cadena de un objeto. Sobrescribir este método facilita la visualización del estado del objeto.

```java
Copiar código
@Override
public String toString() {
    return "Producto: " + nombre + ", Precio: " + precio;
}
```
equals()
El método equals() compara el contenido de dos objetos para determinar si son equivalentes. Es importante sobrescribir este método para definir criterios de igualdad específicos.

```java
Copiar código
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Producto producto = (Producto) obj;
    return Objects.equals(nombre, producto.nombre) && precio == producto.precio;
}
```
🗂️ Estructura del Proyecto
perl
Copiar código
```
herencia-equals-toString-/
├── nbproject/               # Archivos de configuración de NetBeans
├── src/
│   └── productoidra/
│       ├── Producto.java           # Clase base
│       ├── ProductoImportado.java  # Subclase que extiende Producto
│       └── Program.java            # Clase principal con el método main
├── build.xml                # Script de construcción de NetBeans
├── manifest.mf              # Archivo de manifiesto
└── README.md                # Documentación del proyecto
```
🚀 Ejecución del Proyecto
Clonar el repositorio:

bash
Copiar código
git clone https://github.com/MatiBravo47/herencia-equals-toString-.git
Abrir en NetBeans:

Iniciar NetBeans.

Seleccionar Archivo > Abrir Proyecto.

Navegar hasta la carpeta clonada y abrir el proyecto.

Compilar y ejecutar:

Hacer clic derecho en el proyecto y seleccionar Compilar.

Luego, seleccionar Ejecutar.

🔍 Requisitos Previos
Java Development Kit (JDK): Se recomienda la versión 17 o superior.

NetBeans IDE: Versión compatible con el JDK instalado.

📚 Recursos Adicionales
Java Inheritance - W3Schools

toString(), equals() - Medium

Aprender a Programar: Sobrescritura en Java
