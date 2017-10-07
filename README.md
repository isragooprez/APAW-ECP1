# PATRONES DE DISEÑO
#### Asignatura: *Ingeniería Web: Visión General*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)
##### Autor: Santiago Pérez 

### Tecnologías necesarias
* Java
* Maven
* Eclipse
* GitHub
* Travis-ci
* SonarCloud

### PATRON STRATEGY 
#### PATRONES DE DISEÑO
##### 1	PATRON ESTRATEGIA (STRATEGY) (POLITICA)
###### 1.1	¿Qué es el patrón estrategia?
Definir una familia de algoritmos, encapsular cada uno y hacerlos intercambiables. Este patrón permite cambiar de algoritmo independientemente del cliente.
###### 1.2	Clasificación
    * Ambito: Objeto
    * Patron de cmportamiento
 
###### 1.3	Intención

  Elimina las estructuras condicionales
  La jerarquía de clases define una familia de algoritmos o de comportamientos que se pueden reutilizar

###### 1.4	Motivación 

  Codificar los algoritmos en las clases que los necesitan no es deseable por lo siguiente:
  1.	Los clientes se hacen más complejos
  2.	Distintos algoritmos serán apropiados en distintos momentos
  3.	Es difícil añadir nuevos algoritmos y modificar los existentes
  4.	No hay reutilización
  
###### 1.5 Solución

Definir clases que encapsulen los distintos algoritmos.
Muchas veces tenemos un método con varias versiones. Por ejemplo un método para encriptar una cadena de texto. Existen muchos algoritmos para encriptar una cadena de texto y en función de ciertos aspectos debemos utilizar uno u otro. Si no utilizáramos ningún patrón esto se traduciría en un montón de ifs o en un switch en nuestro método. Para solucionar eso, lo que hacemos es definir clases para encapsular en cada una versión del algoritmo de tal forma que el cliente llamaría a una de esas clases y permanecería ajeno a si el método varía o no.

###### 1.6	Aplicabilidad

El patrón Estrategia se usa cuando:
Varias clases difieren en el comportamiento de una o dos responsabilidades.
Es necesario implementar diversas variantes de un mismo algoritmo y seleccionar una variante concreta en tiempo de ejecución.
Una clase define muchos comportamientos y eso se traduce en un montón de condicionales en sus métodos.
Definir una familia de algoritmos, encapsular cada uno y hacerlos intercambiables. Este patrón permite cambiar de algoritmo independientemente del cliente.


###### 1.7 Ejemplo Video Juego Soldado

Un videojuego con  soldado que puede portar y utilizar varias armas distintas. La clase (o clases) que representan a nuestro soldado no deberían de preocuparse de los detalles de las armas que porta: debería bastar, por ejemplo, con un método de interfaz “atacar” que dispare el arma actual y otro método “recargar” que inserte munición. Da igual que nuestro soldado porte un rifle, una pistola o un fusil: los detalles de cada estrategia estarán encapsulados dentro de cada una de las clases intercambiables que representan las armas. Nuestra clase cliente (el soldado) únicamente debe preocuparse de las acciones comunes a todas ellas: atacar.
Nuestro diagrama de clases muestra una interfaz denominada IStrategy que expone un método operaciones. Las clases que implementen esta interfaz serán aquellas que implementen las distintas estrategias a realizar por el cliente, y cómo podemos observar, no tienen mayor dificultad: una interfaz, varias clases que la implementan. 
La filosofía del patrón, por lo tanto, radica en el enlace entre la llamada clase de contexto y la propia interfaz. Esta clase de contexto será el “broker” o intermediario entre el cliente y las clases que implementan la estrategia, y por lo tanto, sus funciones serán simples: cambiar la estrategia actual y ejecutarla. 

* VER MAS 
https://github.com/isragooprez/APAW-ECP1/wiki
 
