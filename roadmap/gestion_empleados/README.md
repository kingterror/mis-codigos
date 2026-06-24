# 🏢 Sistema de Gestión de Empleados

## 📝 Descripción del Proyecto
Este proyecto es el módulo central para un sistema de Recursos Humanos diseñado para calcular y gestionar las nóminas de una plantilla. Resuelve la complejidad del cálculo salarial dinámico basándose en diferentes tipos de contratos (Asalariados con plus de antigüedad y Empleados a Comisión) garantizando un código escalable y mantenible. 

La arquitectura se sostiene sobre los principios de la Programación Orientada a Objetos (POO), eliminando la redundancia de código y delegando la lógica matemática a los modelos correspondientes.

## 🛠️ Conceptos Técnicos y Arquitectónicos Aplicados

* **Clases Abstractas (`abstract`):** Implementación del modelo base `Empleado` para definir el ADN común, bloqueando la instanciación directa (`new Empleado()`) y obligando a los modelos hijos a cumplir el contrato.
* **Polimorfismo Dinámico (Enlazado Tardío):** Ejecución del método `getSalario()` sobre un array genérico. La Máquina Virtual de Java (JVM) decide en tiempo de ejecución a qué hijo llamar dependiendo del objeto instanciado en la RAM.
* **Delegación de Constructores (`super()`):** Correcta inicialización del ciclo de vida del objeto, enviando los parámetros base desde los hijos hacia la superclase para mantener el encapsulamiento de los atributos `private`.
* **Downcasting Manual:** Desempaquetado explícito de objetos genéricos (ej. `((EmpleadoComision) empleados[2]).setClientesCaptados(300)`) para inyectar datos en atributos exclusivos de las clases hijas.
* **Separación de Responsabilidades (SoC):** Extracción de los métodos de utilidad estáticos (`mostrarTodos`, `mostrarMayor`) fuera de los modelos de datos para delegarlos a la clase controladora (`GestionEmpleados`).

# 🏢 Sistema de Gestión de Empleados

## 📝 Descripción del Proyecto
Este proyecto es el módulo central para un sistema de Recursos Humanos diseñado para calcular y gestionar las nóminas de una plantilla. Resuelve la complejidad del cálculo salarial dinámico basándose en diferentes tipos de contratos (Asalariados con plus de antigüedad y Empleados a Comisión) garantizando un código escalable y mantenible. 

La arquitectura se sostiene sobre los principios de la Programación Orientada a Objetos (POO), eliminando la redundancia de código y delegando la lógica matemática a los modelos correspondientes.

## 🛠️ Conceptos Técnicos y Arquitectónicos Aplicados

* **Clases Abstractas (`abstract`):** Implementación del modelo base `Empleado` para definir el ADN común, bloqueando la instanciación directa (`new Empleado()`) y obligando a los modelos hijos a cumplir el contrato.
* **Polimorfismo Dinámico (Enlazado Tardío):** Ejecución del método `getSalario()` sobre un array genérico. La Máquina Virtual de Java (JVM) decide en tiempo de ejecución a qué hijo llamar dependiendo del objeto instanciado en la RAM.
* **Delegación de Constructores (`super()`):** Correcta inicialización del ciclo de vida del objeto, enviando los parámetros base desde los hijos hacia la superclase para mantener el encapsulamiento de los atributos `private`.
* **Downcasting Manual:** Desempaquetado explícito de objetos genéricos (ej. `((EmpleadoComision) empleados[2]).setClientesCaptados(300)`) para inyectar datos en atributos exclusivos de las clases hijas.
* **Separación de Responsabilidades (SoC):** Extracción de los métodos de utilidad estáticos (`mostrarTodos`, `mostrarMayor`) fuera de los modelos de datos para delegarlos a la clase controladora (`GestionEmpleados`).
