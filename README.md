# Ejercicio: Sistema de Gestión de Vehículos
**Objetivo**

Desarrollar un programa en Java que gestione vehículos de distintos tipos en una
aplicación. Los vehículos estarán clasificados en cuatro categorías: Auto, Camión y
Bicicleta. La información de los vehículos será leída desde un archivo JSON, y el programa
deberá mostrar sus detalles en la consola. Este ejercicio también incluye la elaboración de
un diagrama UML de clases, junto con la implementación en código y las pruebas unitarias
correspondientes para verificar el funcionamiento de cada clase.

### Instrucciones
1. **Diagrama UML**:

   ○ Elaborar un diagrama UML de clases que represente la estructura y
   relaciones entre las clases del sistema, destacando la clase base Vehiculo,
   sus clases derivadas, la clase Automotora que gestionará los vehículos, y
   GestorDeDatos, que maneja la persistencia en archivos JSON.
2. **Definición de la Clase Base de Vehículo**:

   ○ Crear una clase Vehiculo con atributos comunes, como marca, modelo,
   año y precio.

   ○ Incluir métodos getter y setter, y un método para mostrar los detalles básicos
   del vehículo.
3. **Implementación de Herencia para Especialización de Clases**:

   ○ Definir tres clases que representen distintos tipos de vehículos: Auto,
   Camion y Bicicleta.

   ○ Cada clase debe heredar de Vehiculo y agregar al menos un atributo
   específico. Ejemplos:

   ■ Auto: número de puertas.

   ■ Camion: capacidad de carga (en toneladas).

   ■ Bicicleta: tipo de bicicleta (por ejemplo, "Montaña" o "Ciudad").
4. **Clase Automotora (Gestión de Vehículos)**:

   ○ Crear una clase Automotora que será la encargada de gestionar los
   vehículos dentro del sistema.

   ○ Esta clase debe incluir:
   ■ Un atributo para almacenar una lista de vehículos.

   ■ Métodos para agregar, listar, y mostrar los detalles de cada vehículo.

   ■ Deberá tener una relación con GestorDeDatos para realizar la carga
   y almacenamiento de datos.

5. **Clase GestorDeDatos (Gestión de Archivos)**:

   ○ Crear una clase GestorDeDatos que se encargará exclusivamente de la
   interacción con archivos JSON.

   ○ Esta clase debe incluir:

   ■ Un método para leer vehículos desde un archivo JSON, el cual
   retornará una lista de objetos Vehiculo que Automotora puede
   utilizar.

   ■ Un método para guardar una lista de vehículos en un archivo JSON,
   que recibe los datos de Automotora.

6. **Mostrar los Vehículos**:

   ○ Implementar en la clase Automotora un método para cargar los datos
   desde el archivo JSON en una lista de vehículos.

   ○ Iterar sobre la lista e imprimir los detalles específicos de cada vehículo
   usando el método adecuado para cada tipo.

7. **Creación de un Nuevo Archivo JSON**:

   ○ Crear un nuevo archivo JSON en el sistema y agregar nuevos vehículos
   registrados durante la ejecución del programa.

   ○ Guardar este archivo JSON actualizado con los nuevos vehículos.

8. **Pruebas Unitarias**:

   ○ Implementar pruebas unitarias para validar el funcionamiento de las clases y
   métodos.