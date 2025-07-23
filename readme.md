Día 1 (L 02/06)
Configurar VNCServer (SB0900) / VNCViewer
¿Que es Java? - Lenguajes compilados / interpretados -> mixto
JVM -> JRE (usuario) || JDK (desarrollador)
Posibles herramientas: IDE v. Editor de Código
Instalar VSC + Extensiones (Plugin) JAVA
Otras extensiones: theme, icons
Ejemplo de Hola Mundo
Instalar y configurar git
Día 2 (M 03/06)
Instalar y configurar git (continuación)
Conceptos
Estado delos archivos: U - M - A (S) - C
Areas: WorkArea - Stage - Repositorio
Uso básico de Git
Creación del repositorio: git init
git add y git commit
git status y git log
GitHub: hosting de repositorios
Conexión con GitHub: git remote add
git push y git pull
git clone
Dia 3 (X 04/06)
Review: Git - GitHub

Java: Hola Mundo

Estructura de un programa

public class / método main

println()

Tipos de datos primitivos

Números (6)

Boolean y Chart

Datos referenciados (objetos): String

Formatos de la información: Template string

Ejercicio: Entidad con diversos tipos de datos

Entrada de información: Scanner

Concepto de Clases y Objetos

Ejercicio : Entidad con entrada de los datos

Dia 4 (J 05/06)
repaso tipos de datos
printf
Profundizar clases y objetos
Crear una clase e instanciar objetos
Ejercicio: la clase Car
Dia 5 (L 09/06)
Review:
Instalación y configuración del entorno
datos y variables
tipos primitivos
clases y objetos
entrada / salida para el usuario
Elementos estáticos de una clase
ejemplo clase Car
class Calc: cálculos básicos
Conceptos de funciones:
definición
parámetros y argumentos
retorno y efectos secundarios
invocación
ámbito de las variables
Dia 6 (M 10/06)
Review: Funciones
Ejercicio: Areas
Sobrecarga de funciones
Args en la función main
argumentos dese CLI
conversión de String a enteros
uso de métodos públicos de otras clases
Operadores
Asignación
Aritméticos
De comparación
Condiciones: IF
Ejercicio: números pares/impares
if
if defensivo: precondiciones
valores previos (else por defecto)
operador ternario
Ejercicio: saludo según la edad
else if
Dia 7 (X 11/06)
Solución ejercicio: saludo según la edad
Ejercicio: School
else if ()
Arrays
Ternarios
switch / case
Ejemplo: semana
Ejercicio: traducir semana
Operadores lógicos (AND - OR)
Ejercicio: Tienda
Día 8 (J 12/06)
Ejercicio Tienda - solución

Ejercicio tienda ampliado - solución

Constantes
Condiciones
Valores por defecto iniciales
Cálculo de valores
Salida con formato usando template strings
Reutilización de código
Números random

Math.random()
Random
Ejercicio: Adivinar número

Día 9 (V 13/06)
Iteraciones: bucles

Contadores (for...)
Centinelas (while...)
Iteraciones con contador

for
for each
Uso con arrays

Bucle infinito -> condición de salida

Ejemplo: tablas de multiplicar

Ejemplo: número primo

Ejemplo: lista de números primos

Día 10 (L 16/06)
Solución del ejercicio números primos

Iteraciones con centinela (while)

condición en el bucle
salida mediante break
continue
Ejemplo: manejo de Strings

Ejemplo: palíndromo

Otros ejercicios propuestos

Día 11 (M 17/06)
Iteraciones do - while. Diferencia con while

Uso de iteraciones al pedir datos al usuario

Arrays: vectores[] y matrices[][]

Creación
Recorrido: for / for each
Ejercicio: Pedirle palabras al usuario

Día 12 (X 18/06)
Ejercicios:

Fibonacci

Piedra, papel o tijera

Estadísticos -> Varargs

Factorial

Día 13 (J 19/06)
Factorial (recursivo)

VSC: Proyectos y packages

OOP

Concepto

Abstracción
Encapsulación
Herencia
Polimorfismo
Abstracción: clases y objetos

Ejemplo: clase Person
Propiedades y métodos
Propiedades estáticas
Constructores
Miembros estáticos
Encapsulación

Ámbitos
Private
Protected (default)
Public
Ámbitos y packages
Ejercicio: clase Character
Día 14 (V 20/06)
Ejercicio: clase Character
Añadir Enum
Añadir métodos de instancia
Añadir static: id
Ejercicio: Factura (Invoice)
Día 15 (L 23/06)
Ejercicio: Factura (Invoice) - solución

Análisis semántico -> modelado

Relaciones de dependencia (composición)

Crear class y enums

Repartir responsabilidades

chcp 65001 to switch the command prompt encoding to UTF-8

Herencia

class extends
constructor: super()
override methods: super.method()
visibilidad: public, protected, private
Ejemplo Pet -> Dog, Cat
instanceof
Object: toString
Día 16 (M 24/06)
Equality y tipos de datos
Primitivos
Wrapper objects
Strings
Objetos; clases propias
Arrays y listas
Valores y referencias
Comparación
Operador ==
método equals
Override de equals
Otros métodos y su override
Método toString
Casting o coercion
Paso de parámetros a funciones
Argumentos de tipo referencia
Clonado de objetos
Clonado de Arrays y listas
Día 17 (X 25/06)
Review

Clonado de objetos

Clonado y otros métodos de arrays

Polimorfismo (& herencia)

Overload
Override
Clases abstractas

Interfaces

Ejemplo de segregación de interfaces
Día 18 (J 26/06)
Ejercicio: supermercado (1)

Análisis y diseño.

UML

Interfaces

Estructura de datos: Set

Clases principales

Supermarket (main)
Order
Container
Product
Enums

Día 19 (V 27/06)
Ejercicio: supermercado (2)

Review

Jerarquía de Clases

Container (Abstract) -> Box / Bag
Instancia de objetos

Override de toString
Jerarquía de Clases

Product (Abstract)
Food
Hygiene
Drugstore
Pet
Lógica del embolsado

Día 20 (L 30/06)
Ejercicio: supermercado (3)

Lógica del embolsado (continuación)

Proyectos Maven

Javadoc

Errores y excepciones en Java

Errores
Tipos de excepciones en Java
Runtime exceptions: IndexOutOfBoundsException, NullPointerException,
Checked exceptions
Aparición de excepciones en Java

Creación de excepciones en el sistema
Tratamiento de excepciones
Throws
Throw
Try
Catch
Día 21 (M 01/07)
Lanzamiento de runtime exceptions propias de java
IndexOutOfBoundsException -> throw en el código de charAt()
NullPointerException
ClassCastException
API de las excepciones
Excepciones propias
RuntimeException - TechnicalException
Checked Exception - BusinessException
Ejemplo.calculadora
Refactorización OOP
División por 0 - ArithmeticException
Rethrow como BusinessException
Exception cause
Scanner y Try with resources
Ejercicio: Factorial
Refactorización OOP
Gestión de excepciones
Día 22 (X 02/07)
Ejercicio: Factorial (solución)

Refactorización OOP
Formateo de números: NumberFormat
Gestión de excepciones
Excepciones en Java (continuación)

Finally
Uso después de un catch con throw o return
Novedades
Con recursos (try-with-resources)
Multi-captura de excepciones
Malas prácticas
No tratadas
Tratadas incorrectamente (e.g. imprimir stack trace: e.printStackTrace())
Perder la historia
Generalización
Arquitectura/Patrones de diseño

MVC
Vistas y controladores
Ejemplo: calculadora
Vista: CalcView
Controlador: CalcController
Aplicación: CalcApp
Inyección de dependencias
Día 23 (J 03/07)
Arquitectura/Patrones de diseño (continuación)
Ejercicio: calculadora
Gestión de excepciones
Testing
¿Qué es un test?
Tipos de test
Unitarios
De integración
De sistema
Herramientas de testing en Java
JUnit
(Mockito)
Día 24 (V 04/07)
Tests unitarios con JUnit
Configuración (review)
Configuración sin Maven
Tests de CalcController
assertEquals
casos de uso
casos con excepciones
assertTrue() / fail
valores especiales
Double.NaN
Double.POSITIVE_INFINITY
Día 25 (L 07/07)
Actualizaciones del sistema

JDK 21
Maven 3.9
JUnit 5
Mockito
Tests unitarios con JUnit

casos con excepciones -> lambdas
métodos privados en la vista
tests de la vista
mock input (Streams)
mock output (Streams)
mock controller (Mockito)
casos correctos thenReturn()
casos con excepciones thenThrow()
TDD
Día 26 (M 08/07)
Ampliación de CLI
2 menus
System.exit(0)
test ajustados al nuevo CLI
Test parametrizados
Instalación con Maven
Uso
Lambdas
Definición: @FunctionalInterface
Uso
Datos
Valores primitivos: números
Objetos numéricos
Día 27 (X 09/07)
Datos (continuación)
Strings / StringBuffers
LocalDates / LocalTimeDates
Ejemplo: calcular edad
Arrays
Instancias
Clase de utilidad Arrays
Genéricos
Creación
Uso
Collection: Introducción
Día 28 (J 10/07)
Collections
Interface Collections
List
ArrayList
LinkedList
Set
HashSet
LinkedHashSet
TreeSet
Ejercicio: Listas
Día 29 (V 11/07)
Iterators
Ejercicio: solución
Versión básica
Versión OOP
Ejercicio: Palíndromo (Stack)
Ejercicio: Figuras (Listas & Interfaces)
Ejercicio propuesto: Baraja
Día 30 (L 14/07)
Ejercicio propuesto: Baraja
Maps
Ejercicio:
PhoneAgenda (Map)
PhoneAgenda (sin Map)
Día 31 (M 15/07)
Solución PhoneAgenda (Map v. sin Map)
== v. equals
uso de streams
Persistencia: Ficheros (1)
java.io.File;
Ejercicio: SaveUserData
Día 32 (X 16/07)
Solución ejercicio SaveUserData
Persistencia: Ficheros (2)
java.nio.file.Path...
manejo de Streams
Ejercicio: completar FileSystem2
Día 33 (J 17/07)
Revisión FileSystem2
Streams
Serialización
JSON
Serialización JSON con Jackson
Configuración de Jackson
Ejemplo: serializar un objeto
Ejemplo: serializar una lista de objetos
Problemas con LocalDate y LocalDateTime
Día 34 (V 18/07)
Serialización - JSON (continuación)

Serialización de fechas y horas LocalDate y LocalDateTime (https://www.baeldung.com/jackson-serialize-dates)
Abstracción de los métodos de serialización

CRUD

Concepto de CRUD
Patrón de diseño: Repositorio
Demo: interface Repository
Demo: entidad Product
Demo: ProductInMemoryRepository
Propuestas

Testing de ProductInMemoryRepository
Demo: ProductFileRepository
## Día 35 (L 21/07)
Review: ProductFileRepository
-Persistencia en bases de datos (DB)