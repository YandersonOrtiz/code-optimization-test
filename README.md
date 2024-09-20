
# Refactorization Quiz: Applying the SDLC Process

## Overview

This quiz is designed to test your ability to refactor code using **professional best practices**. Working in **pairs**, you will refactor provided code by improving its readability, efficiency, and scalability. You will also apply the **Software Development Life Cycle (SDLC)**, using structured phases to enhance the code. Each group will fork the repository, refactor the code, and submit a pull request with their improvements.

---

## Objectives

- Apply concepts from **Unit 1: Data Storage and Control Flow**:
  - Writing variables and constants
  - Arithmetic operators
  - Input/output system
  - Conditional operators
  - Control structures
  - Avoiding magic numbers
  - Lists of data with arrays
  - Basic SDLC principles

---

## SDLC Approach

You must follow the **SDLC process** to refactor the code:

1. **Phase 1: Requirements Analysis** – Understand the original code, identify its weaknesses, and define improvement requirements.
2. **Phase 2: Design** – Plan how to improve the code structure, renaming variables, optimizing logic, and making it more efficient.
3. **Phase 3: Implementation** – Refactor the code following your design plan, ensuring better readability and efficiency.
4. **Phase 4: Testing** – Test the refactored code with multiple inputs to ensure correctness and improvements.
5. **Phase 5: Documentation & Maintenance** – Write clear comments, and submit your final version, ensuring the code is easy to maintain.

---

## Instructions

1. **Repository Forking**:
   - Fork the repository to create a copy in your GitHub account.
   - Clone the repository to your local machine.

2. **Analyze the Code**:
   - Carefully read the provided code.
   - Identify magic numbers, unclear variable names, or inefficient logic.

3. **Refactor the Code**:
   - Improve the variable names, replace magic numbers with constants, and optimize the control structures.
   - Make sure to add comments explaining the logic and changes you made.
   - Apply **arrays** where repetition of variables exists.

4. **Test the Refactored Code**:
   - Run the program with different inputs to validate that the refactored code functions as expected.
   - Ensure the program handles errors gracefully (e.g., invalid input, edge cases).

5. **Submit Your Work**:
   - Once you complete the refactorization, push your changes to your forked repository.
   - Create a pull request (PR) to the original repository, explaining the improvements you made and how you followed the **SDLC** approach.

## AgeValidation

En mi código, implementé una clase llamada AgeValidation que evalúa si una persona tiene acceso según su edad. Aquí te explico los pasos que seguí en primera persona:

Importación de la clase Scanner: Comencé importando java.util.Scanner para poder leer la entrada del usuario desde la consola.

Inicialización del escáner: Creé un objeto Scanner llamado sc para manejar la entrada de datos.

Solicitud de la edad: Imprimí un mensaje pidiendo al usuario que ingresara su edad.

Definición de la edad: Utilicé sc.nextInt() para leer la edad ingresada por el usuario y la almacené en una constante llamada AGE_LIMIT.

Evaluación de la edad: Apliqué una estructura if-else para evaluar AGE_LIMIT:

Si la edad es mayor o igual a 18, imprimí "Access granted".
Si no, imprimí "Access denied".
El resultado de mi código es una validación simple de acceso basada en la edad ingresada por el usuario.

## Store
En mi código, implementé una clase llamada Store que calcula el rendimiento de ventas en función de precios y cantidades de productos. Aquí te explico los pasos que seguí en primera persona:

Definición de constantes: Establecí dos arreglos:

Uno llamado PRECIOS, que contiene los precios de los productos: 15, 10 y 5.
Otro llamado CANTIDADES, que contiene las cantidades vendidas de cada producto: 2, 3 y 4. También definí una constante llamada LIMTITE_DE_PRODUCCION_DE_SALES con un valor de 50, que utilizaría como umbral para evaluar el rendimiento de ventas.
Cálculo del total de ventas: Inicialicé una variable totalSales en 0 y utilicé un bucle for para iterar sobre los índices de los arreglos PRECIOS y CANTIDADES. En cada iteración, multipliqué el precio de un producto por su cantidad vendida y sumé el resultado a totalSales.

Evaluación del rendimiento de ventas: Después de calcular el total de ventas, utilicé una estructura if-else para comparar totalSales con el LIMTITE_DE_PRODUCCION_DE_SALES. Si totalSales es mayor que el límite, imprimí "Good sales performance". Si no, imprimí "Low sales performance".

El resultado de mi código es una evaluación simple del rendimiento de ventas, basada en los precios y cantidades de los productos.

## Tax calculation 
En mi código, implementé una clase llamada TaxCalculation que calcula los impuestos sobre dos productos con precios específicos. Aquí te explico los pasos que seguí:

Definición de constantes: Establecí tres constantes:

TASA_IMPUESTOS_ALTA, que es del 15% para productos de alto precio.
TASA_IMPUESTOS_BAJA, que es del 10% para productos de bajo precio.
TASA_IMPUESTO_LIMITE, que es el límite de 50 para determinar si el total de impuestos es alto o bajo.
Precios de productos: Creé un arreglo llamado productosPrecios con dos precios: 100 y 200.

Cálculo de tasas impositivas: Utilicé un bucle for para iterar sobre los precios de los productos. Dependiendo del índice:

Para el primer producto (índice 0), calculé el impuesto usando la tasa alta.
Para el segundo producto (índice 1), calculé el impuesto usando la tasa baja. Los resultados los almacené en un arreglo llamado tasasImpositivas.
Suma de tasas impositivas: Calculé el total de las tasas impositivas sumando ambos elementos del arreglo tasasImpositivas.

Comparación y salida: Finalmente, comparé el total de impuestos con el TASA_IMPUESTO_LIMITE:

Si el total supera el límite, imprimí un mensaje indicando que el impuesto total es alto.
De lo contrario, imprimí un mensaje que indica que el impuesto es bajo.
El resultado es una evaluación simple del impuesto total basado en dos productos y sus tasas impositivas asignadas.