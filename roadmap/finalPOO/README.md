🏦 Core Bancario v2.0 (Refactorización Arquitectónica)

Proyecto desarrollado en Java como parte de mi ruta de aprendizaje en Programación Orientada a Objetos (POO) avanzada y diseño de arquitectura de software.

📋 Descripción del Programa

Este módulo simula el motor interno de gestión de cuentas de una entidad bancaria. Su objetivo es abandonar el código espagueti y aplicar los pilares fundamentales de la POO para garantizar un sistema seguro, escalable y hermético. El programa es capaz de procesar mantenimientos en lote mezclando diferentes tipos de cuentas, auditar transacciones al vuelo y generar reportes fiscales dinámicos, todo ello protegiendo el capital mediante un encapsulamiento estricto.

🛠️ Componentes del Código

    * CuentaBancaria.java: La plantilla maestra (clase abstracta). Define el ADN de todas las cuentas del banco, protegiendo los datos sensibles (IBAN, titular, saldo) sin exponer setters y obligando a las clases hijas a definir su propio mantenimiento.

    * CuentaCorriente.java y CuentaAhorro.java: Especializaciones concretas. Implementan sus propias reglas de negocio. La cuenta de ahorro destaca por contener una clase interna privada (CalculadoraIntereses) que gestiona los cálculos financieros en la sombra.

    * Auditable.java: Interfaz que actúa como contrato legal. Obliga a las clases que la firman (como la Cuenta Corriente) a implementar la generación de reportes para la Agencia Tributaria.

    * ValidadorRiesgo.java: Interfaz ligera diseñada para ser instanciada al vuelo como trabajador temporal cuando el banco requiere aprobaciones de seguridad inmediatas.

    * MainBanco.java: El controlador y orquestador del sistema. Construye el portfolio polimórfico, inyecta la lógica de evaluación de riesgos mediante una clase anónima y ejecuta el procesamiento en lote (batch) de todas las entidades.

🚀 Conceptos Aprendidos / Practicados

    * Abstracción y Herencia: Uso de clases abstractas, extends y la función super() para reutilizar código sin permitir la instanciación de entidades genéricas.

    * Polimorfismo Avanzado: Iteración de arrays genéricos y uso de instanceof combinado con Downcasting seguro hacia interfaces para ejecutar comportamientos específicos.

    * Diseño por Contratos: Implementación de interfaces (implements) para dotar de habilidades transversales a clases específicas sin forzar la jerarquía de herencia.

    * Encapsulamiento Extremo (Clases Internas): Creación de clases anidadas private con acceso VIP a los atributos protegidos de la clase contenedora, eliminando la necesidad de getters/setters inseguros.

    * Eficiencia de Memoria (Clases Anónimas): Definición e instanciación de objetos de un solo uso en tiempo de ejecución para lógicas temporales.