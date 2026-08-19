# 🎮 Generador de GamerTags

Proyecto básico desarrollado en **Python** como parte de mi ruta de aprendizaje en los fundamentos del lenguaje y manipulación de texto.

## 📋 Descripción del Programa
Este programa funciona como un asistente en la consola para crear "nicks" o nombres de usuario para videojuegos. A partir de los datos personales introducidos por el usuario (nombre, apellido y número favorito)[cite: 2], el script genera un abanico de opciones creativas de GamerTags aplicando diferentes transformaciones de texto[cite: 2]. Además, incluye una función de análisis que muestra estadísticas de los caracteres del nombre introducido[cite: 2].

## 🛠️ Componentes del Código

* [`gametarget.py`](./gametarget.py): Archivo principal que agrupa toda la lógica de la aplicación[cite: 2]. Contiene funciones modulares para cada estilo de tag (básico, invertido, intercalado, élite y numérico)[cite: 2], así como el bloque de ejecución o aplicación principal que gestiona las peticiones `input()` al usuario[cite: 2].

## 🚀 Conceptos Aprendidos / Practicados
* Definición y estructuración de **funciones** (`def`, paso de parámetros y sentencias `return`)[cite: 2].
* Buenas prácticas de documentación utilizando **Docstrings** (`"""..."""`)[cite: 2].
* Manipulación avanzada de cadenas de texto en Python (**String Slicing** e **Indexing**), incluyendo índices negativos y saltos (strides) como `[::-1]` para invertir cadenas[cite: 2].
* Interacción con el usuario a través de la consola (`input()` y `print()`)[cite: 2].