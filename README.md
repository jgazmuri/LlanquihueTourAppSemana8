# LlanquihueTourApp - Semana 8: Interfaces, Polimorfismo y Estructuras Dinámicas

## 🎯 Descripción del Objetivo
El objetivo de esta semana fue ampliar el sistema incorporando un contrato de comportamiento común mediante una interfaz, validación de tipos en tiempo de ejecución con `instanceof`, y una interfaz gráfica básica (GUI) que permite ingresar y visualizar los servicios turísticos gestionados por la agencia Llanquihue Tour.

## 🧱 Clases Creadas y Estructura de Paquetes

El proyecto se organiza en tres paquetes principales según sus responsabilidades:

### model/ (Jerarquía de Clases e Interfaz)
- **Registrable**: Interfaz que define el contrato común `mostrarResumen()`, implementada por todas las entidades gestionables del sistema.
- **ServicioTuristico**: Superclase base que implementa `Registrable`, agrupando los atributos comunes (`nombre`, `duracionHoras`) con sus respectivos getters/setters, y el método `mostrarResumen()`.
- **RutaGastronomica**: Subclase con el atributo específico `numeroDeParadas`. Sobrescribe `mostrarResumen()` y `toString()`.
- **PaseoLacustre**: Subclase con el atributo específico `tipoEmbarcacion`. Sobrescribe `mostrarResumen()` y `toString()`.
- **ExcursionCultural**: Subclase con el atributo específico `lugarHistorico`. Sobrescribe `mostrarResumen()` y `toString()`.

### data/ (Lógica de Colección)
- **GestorServicios**: Declara una colección genérica `ArrayList<Registrable>`, agrega objetos de las distintas subclases, y las recorre con `for-each`, diferenciando su tipo específico mediante `instanceof` para aplicar lógica personalizada.

### ui/ (Interfaz Gráfica)
- **Main**: Ventana principal (`JFrame`) con un `JTabbedPane` de 4 pestañas — una por cada tipo de servicio (Servicios Turísticos, Ruta Gastronómica, Paseo Lacustre, Excursión Cultural). Cada pestaña permite:
  - Ingresar los datos del servicio mediante campos de texto (`JTextField`).
  - Agregar el objeto creado a una lista visual (`JList`).
  - Ver el resumen del elemento seleccionado en un `JOptionPane`, utilizando el método `toString()` sobrescrito por cada clase (demostrando polimorfismo directamente en la interfaz).

## 🔑 Conceptos Aplicados
- **Interfaz (Registrable)**: Contrato común que unifica el comportamiento de todas las entidades gestionables, independiente de su jerarquía de herencia.
- **Herencia**: Las tres subclases extienden de `ServicioTuristico`, heredando `nombre` y `duracionHoras`.
- **Polimorfismo**: Cada subclase sobrescribe `mostrarResumen()` y `toString()` con `@Override`, mostrando su propia información específica.
- **Colecciones genéricas + instanceof**: `GestorServicios` almacena objetos de distintas clases en una única colección tipada por la interfaz (`ArrayList<Registrable>`), diferenciándolos en tiempo de ejecución.
- **GUI con Swing**: Interfaz gráfica simple con `JFrame`, `JTabbedPane`, `JTextField`, `JList` y `JOptionPane`, que permite ingresar y visualizar los datos sin requerir persistencia.

## 🚀 Instrucciones para Ejecutar el Proyecto
Para compilar y ejecutar el programa desde tu Entorno de Desarrollo (IDE), sigue estos pasos:

1. Abre el proyecto `LlanquihueTourAppSemana8` en tu IDE (IntelliJ IDEA, Eclipse o NetBeans).
2. Navega a través del árbol de carpetas hasta la ruta: `src/main/java/ui/`.
3. Ejecuta la clase `Main.java`.
4. Se abrirá una ventana con 4 pestañas — en cada una puedes ingresar los datos del servicio correspondiente, presionar "Agregar" para guardarlo en la lista visual, seleccionarlo, y presionar "Ver Resumen" para ver su información detallada.
