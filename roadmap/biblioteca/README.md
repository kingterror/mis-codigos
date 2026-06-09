# 📚 Sistema de Gestión de Biblioteca (Estructuras Dinámicas en Java)

Proyecto desarrollado en **Java** como parte de mi ruta de aprendizaje en **Desarrollo de Aplicaciones Multiplataforma (DAM)**. El objetivo principal es profundizar en la Programación Orientada a Objetos (POO) y dominar el uso de colecciones dinámicas mediante el manejo de **`ArrayList`**.

## 📋 Descripción del Programa

El programa simula el control de inventario y préstamos de una biblioteca. Permite registrar libros con sus respectivos autores, gestionar el estado de disponibilidad de cada obra (prestado/disponible) y generar reportes en tiempo real para mostrar únicamente los ejemplares que se encuentran libres en las estanterías.

---

## 🛠️ Componentes y Estructura del Código

El proyecto consta de dos clases principales que demuestran un flujo de control dinámico:

### 1. `Libro.java`
Define la entidad del objeto que se va a gestionar. Aplica de forma excelente el principio de encapsulación.
* **Atributos:** Almacena información privada (`private`) como el título del libro, el autor y un indicador booleano (`estaPrestado`) para controlar su estado de disponibilidad.
* **Métodos principales:**
* `prestar()`: Cambia el estado del libro a prestado (`true`). Incluye una validación para avisar si el libro ya se encuentra ocupado.
* `devolver()`: Cambia el estado a disponible (`false`) de forma directa.
* `toString()`: Sobrescribe el método nativo de Java para formatear limpiamente los datos del libro y su disponibilidad mediante un **operador ternario** dinámico.

### 2. `Biblioteca.java`
Contiene el punto de entrada del programa (`main`) y gestiona la colección de libros.
* **Estructura:** Utiliza un **`ArrayList<Libro>`**, lo que permite un almacenamiento dinámico donde el tamaño de la colección crece o decrece de forma automática sin necesidad de definir un límite fijo.
* **Lógica:** Instancia múltiples obras, simula el préstamo de ejemplares específicos (ej. *Atlético de Madrid* e *Ilerna*) y utiliza un bucle **`for-each`** optimizado junto a una validación booleana (`!libro.estaPrestado()`) para imprimir en consola el listado de libros listos para lectura.

---

## 🚀 Conceptos Técnicos Practicados

* **Colecciones Dinámicas (`ArrayList`):** Transición de arrays tradicionales de tamaño fijo a estructuras de datos elásticas y eficientes del paquete `java.util`.
* **Sobrescritura de Métodos (`@Override / toString`):** Personalización de la salida impresa de objetos para evitar que Java muestre la dirección de memoria por defecto, facilitando la lectura de datos.
* **Lógica de Estados (Flags Booleanos):** Control del flujo y disponibilidad de un objeto mediante variables de tipo `boolean` y su respectiva negación lógica (`!`).
* **Operadores Ternarios:** Optimización de bloques condicionales `if-else` en una sola línea para asignar cadenas de texto dinámicas según el estado del objeto.
