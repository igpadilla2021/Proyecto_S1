# Proyecto 

Grupo 5


Nombres:
Ignacio Padilla
Joaquin Garcia


Enunciado: 

El sistema de reserva de asientos de autobús permite al personal de una empresa de autobús elegir y reservar asientos de forma conveniente por su cliente. Los usuarios pueden  visualizar una representación gráfica de los asientos disponibles en el  autobús y seleccionar los que deseen ocupar. El sistema muestra información detallada sobre cada asiento, como su ubicación, número y  categoría (por ejemplo, semi cama, Salón Cama).

Una vez que los usuarios seleccionan los asientos deseados, el sistema verifica la disponibilidad y permite confirmar la reserva mostrando el precio a pagar. En caso de que algún asiento ya esté reservado por otro pasajero, se informa al usuario para que pueda elegir otro asiento disponible. El personal confirma el pago (no gestionado por el sistema) lo que reserva los asientos.

El sistema debe gestionar varios tipos de autobuses (por ejemplo, con diferente número de plazas, o de 1 o 2 pisos...).

El sistema debe mostrar un menú que permita seleccionar el autobús en función de su horario y recorrido (se supone que estos datos están disponibles con los autobuses vacíos cuando se lanza el software)


Patrones utilizados:

- PATRÓN STATE
Dado que este patrón se encuentra principalmente relacionado con los cambios de estado, resultó idóneo la implementación de este durante el proceso de reserva de asientos, pues cada asiento posee un estado inicial (false) que representa la disponibilidad de este. Mediante la implementación de este patrón se logró encapsular la manipulación de este parámetro de forma dinámica.

- PATRÓN SINGLETON
En la sección gráfica, nos resultaba imprescindible que la clase "SeleccionViaje" posea una única instancia durante el transcurso del programa, pues esta era la que inicializaba e incorporaba gran parte de la sección lógica. Por lo tanto, si por alguna razón se creaba otra instancia de esta clase, el programa se "reiniciaría", pues toda la información relacionada a la lógica se perdería. Es por todo lo anterior que se decidió incorporar el patrón Singleton. De esta forma, en la clase "SeleccionarViaje" se crearía una única instancia de clase a la cual se podría acceder cuantas veces se quisiera, y la instancia siempre sería la misma, evitando un posible error en el programa.


Decisiones importantes:

- Inicialmente, una vez seleccionado un tipo de viaje, iba a existir la posibilidad de elegir el tipo de asiento que se busca y en funcion de esto se entregaria un bus con los asientos solicitados, en vez de un bus con un tipo de asiento predefinido como resultó en la versión final del proyecto.
- Se determinó que el cambio de ventanas de la interfaz gráfica sería completamente manejado en el panel de ventanas en vez de generarse de forma secuencial mediante los botones.
- Antes de comenzar el proyecto, se decidió no incorporar excepciones en la sección lógica del código, pues resultaba poco útil considerando que en la sección gráfica evitaríamos cualquier posible interacción corrupta.


Problemas encontrados:

- Durante el proceso de creación de la sección lógica, en diversas ocasiones se intentó incorporar el patrón de diseño factory, sin embargo, esto solo lograba confundir tanto al programa como a nosotros, generando errores en diversas ocasiones debido a nuestra incapacidad para manejarlo.
- Sentimos que, a pesar de que se logró implementar de forma exitosa dos patrones de diseño, sentimos que con otro enfoque se podrían haber implementado algunos más.
- Actualmente, nuestra interfaz gráfica diseñada cumple su función de forma acertada y sin errores. Sin embargo, estéticamente puede resultar bastante minimalista, por lo que creemos que con una mejor distribución de tiempo se podría haber logrado un resultado mucho más atractivo.
- Cuando tan solo faltaban unas cuantas horas para la entrega del proyecto, aprendimos cómo aprovechar Maven para poder obtener la ubicación de un recurso y poder incorporarlo a nuestro código. Lamentablemente, no se pudo explotar al máximo esta capacidad.