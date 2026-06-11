# 🔑 Generador de Contraseñas Aleatorias

Proyecto desarrollado en **Java** como parte de mi ruta de aprendizaje en programación orientada a objetos (POO).

## 📋 Descripción del Programa
Este programa genera una cantidad determinada de contraseñas aleatorias con una longitud específica configurada por el usuario a través de ventanas de diálogo (`JOptionPane`). Además, evalúa de forma automatizada los caracteres generados para determinar de manera estricta si la contraseña es segura o no en función de sus componentes.

## 🛠️ Componentes del Código

* [`GeneradorContraseñas.java`](./GeneradorContraseñas.java): Clase modelo que representa una contraseña individual. Contiene la lógica matemática para la generación aleatoria de caracteres distribuidos de forma equitativa (números, mayúsculas y minúsculas) usando códigos ASCII y *casting*, así como el motor de evaluación de seguridad.
* [`MainContraseñas.java`](./MainContraseñas.java): Clase de entrada que interactúa con el usuario. Administra la creación de un array clásico de objetos para almacenar las instancias de las contraseñas generadas e imprime por consola un reporte tabulado con el texto, tamaño y nivel de seguridad de cada una.

## 🚀 Conceptos Aprendidos / Practicados
* Conversión explícita de tipos de datos primitivos mediante *Casting* (`int` a `char` para códigos ASCII).
* Uso de la clase envoltorio nativa `Character` de Java para la clasificación eficiente de caracteres (`isDigit` e `isUpperCase`).
* Instanciación y gestión de estructuras de datos fijas mediante arrays de objetos.
* Encapsulamiento de datos mediante modificadores de acceso `private` y exposición controlada con métodos `getter`.
* Generación de números pseudoaleatorios acotados por rangos mediante la clase `Random`.
