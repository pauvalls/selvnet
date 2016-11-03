selvnet, lectura de base de datos y tranformacion a xml usando JAX

tiene 2 selvnets, se iniciara desde el que se llama selvnet( el mismo nombre) y generara una sentencia sql  y se enviara en el jsp, creando un selector donde se enviara al post, este recibira desde el selector la opcion seleccionada y el codigo del alumno que se usará para generar la siquiente sentencia sql, cuando lo tengamos se enviara a request.jsp que es el jsp de respuesta que mostrara los datos de la persona.

si queremos pasarlo a xml tendremos que usar el jax, que esta generado en  el selvnet  de xml ( que se recibira desde el respone.jsp con un boton que se envia en el post) cuando todo esto esté, se generara una consulta ( igual que la anterior para poder pasar los datos a el jax)
y se enviara al objeto Alumno de JAX, y se usa  el metodo objettoxml para pasarle el jax y mostrarlo en un StringWriter y se muestra directamente por pantalla.
