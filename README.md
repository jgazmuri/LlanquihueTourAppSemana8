LlanquihueTourApp - Semana 7: Encapsulamiento y Polimorfismo en Servicios Turísticos

🎯 Descripción del Objetivo

El objetivo de esta semana fue reforzar la jerarquía de clases construida en la semana anterior incorporando dos pilares adicionales de la Programación Orientada a Objetos: encapsulamiento y polimorfismo. Los atributos de cada clase se protegieron mediante modificadores de acceso (private/protected) junto con sus respectivos métodos get y set, y se profundizó en la sobreescritura de métodos (@Override) para que cada subclase muestre su información específica reutilizando el comportamiento común definido en la superclase mediante super.

🧱 Clases Creadas y Estructura de Paquetes

El proyecto se organiza en tres paquetes principales según sus responsabilidades:

model/ (Jerarquía de Clases)


ServicioTuristico: Superclase base que agrupa los atributos comunes (nombre, duracionHoras), con sus respectivos getters y setters, y el método mostrarInformacion() que imprime los datos generales del servicio.
RutaGastronomica: Subclase con el atributo específico numeroDeParadas (encapsulado con getter/setter). Sobrescribe mostrarInformacion() para mostrar el detalle de la ruta gastronómica, reutilizando el método de la superclase con super.mostrarInformacion().
PaseoLacustre: Subclase con el atributo específico tipoEmbarcacion (encapsulado con getter/setter). Sobrescribe mostrarInformacion() para mostrar el tipo de embarcación del paseo.
ExcursionCultural: Subclase con el atributo específico lugarHistorico (encapsulado con getter/setter). Sobrescribe mostrarInformacion() para mostrar el lugar histórico a visitar.


data/ (Lógica de Pruebas)


GestorServicios: Clase encargada de instanciar objetos de prueba para cada subclase y desplegar su información a través del método mostrarInformacion().


ui/ (Interfaz de Usuario)


Main: Punto de entrada del programa que inicializa el GestorServicios y ejecuta la demostración de todos los servicios turísticos.


🔑 Conceptos Aplicados


Encapsulamiento: Todos los atributos específicos de cada subclase son private, accesibles únicamente mediante sus métodos get/set correspondientes.
Herencia: Las tres subclases extienden de ServicioTuristico, heredando nombre y duracionHoras.
Polimorfismo: Cada subclase sobrescribe mostrarInformacion() con @Override, complementando la información base de la superclase mediante super.mostrarInformacion() antes de imprimir sus propios atributos.


🚀 Instrucciones para Ejecutar el Proyecto

Para compilar y ejecutar el programa desde tu Entorno de Desarrollo (IDE), sigue estos pasos:


Abre el proyecto LlanquihueTourAppSemana7 en tu IDE (IntelliJ IDEA, Eclipse o NetBeans).
Navega a través del árbol de carpetas hasta la ruta: src/main/java/ui/.
Abre el archivo Main.java.
Haz clic derecho en cualquier parte del código de ese archivo y selecciona la opción Run 'Main.main()' (o presiona el botón verde de reproducción ▶️ en la barra superior).
Verifica los resultados en la pestaña Run / Consola ubicada en la parte inferior de la pantalla, donde se listará de forma detallada la información de cada servicio turístico creado.
