# 🏫 Gestión de Colegio (POO en Java)

Proyecto desarrollado en **Java** como parte de mi ruta de aprendizaje en **Desarrollo de Aplicaciones Multiplataforma (DAM)**. El objetivo principal es poner en práctica los pilares de la Programación Orientada a Objetos mediante un sistema de gestión de alumnos y centros educativos.

## 📋 Descripción del Programa

El programa simula el comportamiento de un entorno escolar. Permite la creación de diferentes colegios con un límite de aforo personalizado, y expone una serie de métodos para matricular nuevos estudiantes, expulsarlos, modificar sus calificaciones académicas y consultar la información de la base de datos local en memoria.

---

## 🛠️ Componentes y Estructura del Código

El proyecto está dividido de forma limpia en tres clases principales que interactúan entre sí:

### 1. `Alumno.java`
Es la clase plantilla o POJO (*Plain Old Java Object*) que define el modelo de datos de un estudiante.
* **Atributos:** Gestiona información privada (`private`) como el nombre del alumno, su nota media y el centro en el que está matriculado.
* **Lógica:** Implementa métodos constructores personalizados y métodos de acceso (`getters` y `setters`) para garantizar la encapsulación segura de los datos.

### 2. `Colegio.java`
Actúa como el controlador principal de la lógica de negocio del centro educativo.
* **Atributos:** Contiene el nombre del colegio y un **array de objetos `Alumno[]`** cuyo tamaño se define dinámicamente al instanciar el centro.
* **Métodos principales:**
  * `nuevoAlumno(nombre, nota)`: Recorre el array buscando un hueco libre (`null`) para matricular al estudiante. Controla el error si el centro está lleno.
  * `expulsarAlumno(nombre)`: Busca al alumno dentro del array mediante un método privado auxiliar (`buscarAlumno`) y, si existe, libera su posición asignándole un valor vació (`null`).
  * `setNotaMedia(nombre, nota)`: Permite localizar un estudiante específico y actualizar su rendimiento académico.
  * `getAlumno(nombre)`: Muestra por consola la ficha detallada de un alumno concreto.

### 3. `UsoColegio.java`
Contiene el método principal `main` y sirve como el entorno de pruebas (*Tester*) del programa. 
* Instancia diferentes centros (ej. *Colegio Salamanca* y *Colegio San Vicente*).
* Simula situaciones reales de ejecución: altas simultáneas, intentos de matriculación por encima del aforo permitido, expulsión de alumnos y visualización del estado del centro en tiempo real.

---

## 🚀 Conceptos Técnicos Practicados

* **Encapsulamiento:** Uso estricto de modificadores de acceso `private` para proteger las propiedades de las clases, interactuando con ellas únicamente mediante métodos públicos bien definidos.
* **Gestión de Arrays de Objetos:** Control manual de estructuras de datos fijas, validando posiciones nulas (`null`) para optimizar el espacio de memoria.
* **Paso de Parámetros y Relaciones entre Clases:** Inyección del nombre del colegio directamente en el constructor del alumno al momento del registro.
* **Algoritmos de Búsqueda:** Implementación de bucles indexados con condicionales anidados y métodos de ruptura de flujo (`return`) eficientes.
