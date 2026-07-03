# LlanquihueTourApp - Semana 6: Jerarquía de Servicios Turísticos

## 🎯 Descripción del Objetivo
El objetivo de esta semana fue implementar una estructura de programación orientada a objetos basada en la herencia. Se diseñó y organizó una jerarquía de clases para representar los diferentes tipos de servicios turísticos que ofrece la aplicación, optimizando el código mediante la reutilización de atributos comunes y la sobreescritura de métodos para mostrar información completa y limpia por consola.

## 🧱 Clases Creadas y Estructura de Paquetes
El proyecto se organizó en tres paquetes principales según sus responsabilidades:

*   **`model/` (Jerarquía de Clases)**
    *   `ServicioTuristico`: Superclase base que agrupa los atributos comunes de todos los servicios (`nombre` y `duracionHoras`).
    *   `RutaGastronomica`: Subclase con el atributo específico `numeroDeParadas`.
    *   `PaseoLacustre`: Subclase con el atributo específico `tipoEmbarcacion`.
    *   `ExcursionCultural`: Subclase con el atributo específico `lugarHistorico`.
*   **`data/` (Lógica de Pruebas)**
    *   `GestorServicios`: Clase encargada de instanciar objetos de prueba para cada subclase y desplegar sus datos utilizando el método `toString()`.
*   **`ui/` (Interfaz de Usuario)**
    *   `Main`: Punto de entrada del programa que inicializa el gestor y ejecuta la demostración.

## 🚀 Instrucciones para Ejecutar el Proyecto
Para compilar y ejecutar el programa desde tu Entorno de Desarrollo (IDE), sigue estos pasos:

1.  Abre el proyecto `LlanquihueTourAppSemana6` en tu IDE (IntelliJ IDEA, Eclipse o NetBeans).
2.  Navega a través del árbol de carpetas hasta la ruta: `src/main/java/ui/`.
3.  Abre el archivo **`Main.java`**.
4.  Haz clic derecho en cualquier parte del código de ese archivo y selecciona la opción **Run 'Main.main()'** (o presiona el botón verde de reproducción ▶️ en la barra superior).
5.  Verifica los resultados en la pestaña **Run / Consola** ubicada en la parte inferior de la pantalla, donde se listarán de forma detallada los servicios turísticos creados.
