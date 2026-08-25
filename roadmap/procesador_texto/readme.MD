# 📝 Ejercicio: Procesador de Textos Básico (Swing Avanzado)

## 📌 Descripción
Este proyecto es un procesador de textos rudimentario desarrollado en Java Swing. La aplicación permite al usuario escribir texto libremente y modificar sus propiedades tipográficas (fuente, estilo y tamaño) a través de una barra de menús interactiva. 

A diferencia de los editores de texto plano, este proyecto implementa un lienzo de texto enriquecido, permitiendo que coexistan múltiples formatos, tamaños y estilos tipográficos dentro del mismo documento.

## 🚀 Conceptos Técnicos Aplicados

*   **Texto Enriquecido (`JTextPane`):** Sustitución del tradicional `JTextArea` (texto plano) por un componente capaz de manejar documentos con múltiples atributos de formato a través de un `StyledDocument`.
*   **Menús Desplegables:** Construcción de una jerarquía de navegación nativa utilizando `JMenuBar` como contenedor principal, `JMenu` para las categorías desplegables y `JMenuItem` para las opciones interactivas.
*   **Acciones Prefabricadas (`StyledEditorKit`):** Implementación de la API avanzada de estilos de Java para manipular el texto seleccionado sin necesidad de programar *Listeners* personalizados. Se han inyectado directamente las siguientes acciones en los eventos de los menús:
    *   `BoldAction` e `ItalicAction` para estilos estáticos.
    *   `FontFamilyAction` para el cambio dinámico de tipografías.
    *   `FontSizeAction` para el redimensionamiento paramétrico del texto.
*   **Arquitectura de Layouts:** Uso del `BorderLayout` para anclar la barra de menús al `NORTH` y forzar al lienzo de texto (envuelto en un `JScrollPane`) a expandirse dinámicamente en el `CENTER` ocupando todo el espacio disponible.