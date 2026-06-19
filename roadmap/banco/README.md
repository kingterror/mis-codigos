# 🏦 Core Bancario en Java: Arquitectura OOP y Abstracción

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Eclipse IDE](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)
![Windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)

## 📌 Descripción del Proyecto
Este repositorio contiene el desarrollo de un motor transaccional bancario simulado, programado en Java. El objetivo principal de este proyecto es demostrar el dominio avanzado de los pilares de la Programación Orientada a Objetos (POO), haciendo especial énfasis en la **Abstracción**, el **Encapsulamiento estricto** y la aplicación de **Reglas de Negocio** en cascada para garantizar la seguridad de las transacciones.

El desarrollo se ha gestionado mediante un flujo de trabajo multiplataforma entre entornos Linux y Windows.

## 🚀 Arquitectura del Sistema

El núcleo del sistema está diseñado para evitar la creación de entidades genéricas y forzar contratos de desarrollo mediante herencia abstracta:

* **Abstracción Total:** La clase padre `Cuenta` se ha definido como `abstract`, actuando como un molde inalcanzable. Obliga a las clases hijas a implementar el contrato del método `informacionCuenta()`.
* **Seguridad y Encapsulamiento:** El atributo `saldo` está privatizado. Su modificación está restringida al método `protected setNuevoSaldo()`, obligando a cualquier transacción a pasar por los filtros de validación oficiales del sistema.
* **Validación en Cascada (Tipo `boolean`):** * El método de retiro en la clase abstracta filtra intentos de inyección de saldo fraudulento (cantidades negativas o nulas).
  * Si la validación base es exitosa (`true`), delega mediante `super.retirar()` la responsabilidad a las clases hijas.
* **Reglas de Negocio por Producto:**
  * `CuentaAhorro`: Bloqueo estricto de transacciones que generen saldo negativo.
  * `CuentaCorriente`: Implementación de lógica de crédito dinámico, permitiendo descubiertos hasta un límite máximo de -500€.

## 🛠️ Pruebas de Estrés (Unit Testing Manual)

El archivo `CuentaMain` incluye una batería de pruebas de ejecución exhaustivas que someten al motor a diferentes escenarios extremos:
- Ingresos y retiros cruzados entre múltiples cuentas en colecciones polimórficas (`ArrayList<Cuenta>`).
- Intentos de retiro por encima del saldo disponible.
- Comprobación de los límites de descubierto y bloqueos de seguridad.

## 👨‍💻 Autor
**Alex** - *Desarrollador de Software*
Proyecto de arquitectura POO perteneciente a mi roadmap principal de aprendizaje.
