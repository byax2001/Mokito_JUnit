# Tutorial Fase 1 Mockito y JUnit

### Explicación del Proyecto

Este proyecto backend proporciona información sobre un país al realizar una solicitud GET, pasando el acrónimo del país en la URL. Por ejemplo, para obtener información sobre la República Dominicana, se utiliza el acrónimo `do`, con la siguiente URL: `http://localhost:8080/country/[Codigo ISO]`. 

El proyecto utiliza una base de datos en memoria gestionada por la librería **H2Database**, lo que significa que la base de datos es volátil y se eliminará cada vez que se detenga el backend.

1. La API responde con los siguientes datos sobre el país:

- Nombre del país
- Capital
- Día de la independencia
- Años de independencia
- Meses de independencia
- Días actuales de independencia

2. **Datos de la base de datos:**
   Los datos que se ingresan en la base de datos al compilar el proyecto se encuentran en el archivo `import.sql` presente en la carpeta `resources`.

3. **DiferenciaEntreFechas.java:**
   Este archivo contiene métodos para calcular diversos datos según la fecha actual, lo cual es útil para proporcionar las respuestas correctas en la API.

4. **Country.java (Entity):**
   El archivo `Country` es una clase `Entity` que define la tabla que se crea en la base de datos, especificando los elementos y tipos de cada columna.

5. **CountryResponse.java:**
   La clase `CountryResponse` se encarga de mostrar las respuestas cuando se realiza una consulta utilizando el código ISO del país. La respuesta es un JSON con la información del país consultado.

6. **CountryRepository.java:**
   Este archivo contiene la lógica para buscar los países utilizando el código ISO del país. Es responsable de realizar las consultas necesarias en la base de datos.

7. **IndependencyController.java:**
   El archivo `IndependencyController` maneja el endpoint de la API, gestionando las peticiones y respuestas que se generan cuando se consulta la información de un país.


### Ejemplo de respuesta en formato JSON al consultar el endpoint:

```json
{
  "countryName": "República Dominicana",
  "capitalName": "Santo Domingo",
  "independenceDate": "23/11/1986",
  "yearsOfIndependency": 37,
  "monthsOfIndependency": 11,
  "daysOfIndependency": 25
}
```
### Conexión a la Base de Datos Volátil

Para conectarse a la base de datos volátil, puedes utilizar la siguiente línea que aparece al compilar el proyecto en Spring Boot:

- Para conectarse a la base de datos volatil usar la siguiente linea que aparece al compilar el proyecto en spring boot:

```
2024-11-17 23:34:59.136 INFO 26896 --- [ restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:0d60d0b5-0ab6-4c06-a29b-191d354c4155'
```

- La URL para acceder a la consola de H2 es la siguiente:
```
http://localhost:8080/h2-console/
```
- En la consola de H2, en el campo **JDBC URL**, debes colocar lo que está entre comillas después de la línea `"Database available at"`. En este caso, la URL será:

```
jdbc:h2:mem:0d60d0b5-0ab6-4c06-a29b-191d354c4155
```
Este procedimiento te permitirá acceder a la base de datos en memoria para realizar consultas o manipulaciones directamente desde la consola de H2.
