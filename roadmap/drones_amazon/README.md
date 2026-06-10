# 🚁 Gestión de Drones (Amazon Logistics)

Proyecto desarrollado en **Java** como parte de mi ruta de aprendizaje en programación orientada a objetos (POO).

## 📋 Descripción del Programa
Este programa simula el sistema de gestión de una base logística de drones de reparto en la consola. Su objetivo es poner en práctica la interacción entre múltiples objetos almacenados en arrays clásicos, el control seguro de los espacios de memoria vacíos y la implementación de un ciclo de vida real mediante cambios de estado.

## 🛠️ Componentes del Código

* [`Dron.java`](./Dron.java): Define la clase plantilla para las unidades de la flota. Controla propiedades como el nivel de batería, el estado operativo (`EN_BASE`, `VOLANDO`, `AVERIADO`) y utiliza un contador estático para autogenerar identificadores únicos.
* [`BaseLogistica.java`](./BaseLogistica.java): Actúa como el motor del sistema. Gestiona un array de objetos `Dron` y contiene toda la lógica de negocio para comprar unidades, enviarlas a misiones, recargarlas y buscar el dron con más batería.
* [`CentroAmazon.java`](./CentroAmazon.java): Contiene el método `main`. Inicializa el programa solicitando datos por consola mediante `Scanner` para crear la base y ejecuta las pruebas de estrés del flujo logístico.

## 🚀 Conceptos Aprendidos / Practicados
* Gestión de arrays clásicos y prevención de errores `NullPointerException` (Programación defensiva).
* Diferencia y aplicación del contexto global de clase (`static`) vs. contexto individual de instancia (`this`).
* Optimización de bucles de búsqueda usando el patrón de retorno temprano (`return`).
* Composición de objetos (una clase contenedora que administra colecciones de otras clases).
* Refactorización y aplicación del principio DRY (Don't Repeat Yourself) mediante métodos privados.