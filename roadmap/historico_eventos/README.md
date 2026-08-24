# 🖥️ Ejercicio: Registro Histórico de Eventos (Swing Avanzado)

## 📝 Descripción
Este proyecto es una aplicación de escritorio desarrollada en Java utilizando la biblioteca **Swing**. Consiste en una interfaz gráfica interactiva que captura los datos del usuario y registra en tiempo real las acciones realizadas sobre distintos componentes (pulsación de botones, activación/desactivación de casillas y selección de botones de radio), mostrándolas en un panel central a modo de historial (*log*).

Esta versión es una **refactorización optimizada** orientada a objetos que prioriza la escalabilidad, el código limpio (*Clean Code*) y el rendimiento frente a las soluciones de diseño tradicionales.

## 🚀 Conceptos Técnicos Aplicados

*   **Arquitectura de Layouts (Anidación):** Uso estratégico de un `BorderLayout` como contenedor principal, incrustando paneles secundarios con `FlowLayout` en las zonas `NORTH`, `CENTER` y `SOUTH` para garantizar una interfaz responsiva y bien estructurada.
*   **Polimorfismo y Casteo Seguro (`instanceof`):** Implementación de una única clase controladora (`ManejarAcciones`) que evalúa en tiempo de ejecución el tipo de componente que disparó el evento (`JButton`, `JCheckBox` o `JRadioButton`) para aplicar una lógica específica sin necesidad de crear múltiples *Listeners*.
*   **Inyección por Constructor:** Los componentes delegan su nombre al *Listener* a través del constructor. Esto permite reutilizar la misma clase para una cantidad infinita de botones sin modificar la lógica interna.
*   **Gestión Inteligente de Estados:** Implementación de memoria de estado (`ultimoRadioButton` y `esPrimeraVez`) para silenciar eventos redundantes (por ejemplo, evitar que un *Radio Button* genere un registro si ya estaba seleccionado).
*   **Optimización de Memoria:** Sustitución de concatenaciones ineficientes de `String` por el método nativo `JTextArea.append()`, mejorando el rendimiento al procesar historiales largos.
