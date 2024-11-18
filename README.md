# Mokito y JUnit

## Tipos de Pruebas

### Pruebas Funcionales:
Estas pruebas verifican el correcto funcionamiento del código y sus componentes, asegurándose de que cumplan con los requisitos definidos. 

- **Pruebas Unitarias:**  
  Se enfocan en probar unidades específicas del código (como funciones o métodos) de forma aislada, asegurándose de que cada componente funcione correctamente por sí solo (*Unit Testing*).  
  *Herramientas comunes: JUnit, Mockito.*

- **Pruebas de Integración:**  
  Validan la interacción entre múltiples componentes o módulos del sistema, garantizando que trabajen juntos de manera adecuada (*Integration Testing*).  
  *Ejemplo: comprobar la conexión entre un servicio y una base de datos.*

- **Pruebas de Regresión:**  
  Aseguran que las modificaciones o correcciones en un componente no afecten el comportamiento de los demás componentes relacionados (*System Testing*). Este tipo de prueba es clave para mantener la estabilidad tras actualizaciones o mejoras.
  *Ejemplo: Una aplicación de comercio electrónico donde se modifica el cálculo del impuesto en el carrito de compras. Aunque esta funcionalidad fue ajustada, se realiza una prueba de regresión para asegurarse de que otras áreas del sistema, como el cálculo del total general, la generación de facturas y el historial de pedidos, continúen funcionando correctamente sin verse afectadas por el cambio implementado.*

- **Pruebas de Aceptación:**  
  Se aseguran de que el sistema cumpla con los requisitos del cliente o usuario final. Normalmente, estas pruebas verifican escenarios de negocio completos (*Acceptance Testing*).  
  *Ejemplo: probar un flujo de compra en una tienda en línea.*

### Pruebas No Funcionales
Evalúan aspectos relacionados con el rendimiento, la seguridad y otros factores no directamente vinculados con las funcionalidades del sistema.

- **Pruebas de Instalación:**  
  Validan que el sistema pueda ser instalado y configurado correctamente en diferentes entornos.

- **Pruebas de Performance:**  
  Evalúan la velocidad, capacidad de respuesta y estabilidad del sistema bajo condiciones normales.  
  *Ejemplo: medir el tiempo de respuesta para una consulta en la base de datos.*

- **Pruebas de Seguridad:**  
  Identifican vulnerabilidades en el sistema, garantizando que los datos y procesos estén protegidos frente a accesos no autorizados.

- **Pruebas de Carga:**  
  Analizan cómo se comporta el sistema bajo un aumento gradual de usuarios o transacciones.  
  *Ejemplo: probar una aplicación con 100, 500 y 1000 usuarios simultáneos.*

- **Pruebas de Estrés:**  
  Determinan el comportamiento del sistema en condiciones de alta demanda o recursos limitados, como un uso extremo de usuarios o un servidor con baja capacidad.  
  *Ejemplo: simular 10,000 usuarios conectados simultáneamente.*

- **Pruebas de Volumen:**  
  Evalúan cómo se maneja el sistema con grandes volúmenes de datos.  
  *Ejemplo: cargar un millón de registros en la base de datos y verificar el rendimiento.*


## Spring Boot

### Diferencias entre Spring Boot y Maeve:
- **Maven**
    - Es una herramienta de gestión del ciclo de vida de un proyecto. Proporciona una estructura de directorios estándar, descarga y administra dependencias, y ejecuta casos de prueba.
    - Spring Boot utiliza Maven (o Gradle) para gestionar las dependencias y la construcción del proyecto.

- **Spring Boot**
    - Es un marco de desarrollo construido sobre el ecosistema de Spring. Simplifica el desarrollo de aplicaciones al proporcionar configuraciones predefinidas y un servidor embebido, facilitando la creación rápida de proyectos robustos.

## JUNIT
JUnit es un framework de Java que permite realizar pruebas unitarias de forma rápida y sencilla. Facilita la ejecución controlada de clases y métodos para verificar que cumplan su propósito correctamente. Además, es útil para realizar pruebas de regresión, asegurando que cambios en el código no afecten funcionalidades existentes.

### Principales Anotaciones de JUnit
- **@Before**: Se ejecuta antes del método de prueba; ideal para inicializar variables o configuraciones.
- **@After**: Se ejecuta después del método de prueba, útil para limpiar recursos.
- **@Test**: Inyecta el Bean de Test al metodo, define el método como una prueba.
- **@assertEquals**: Compara valores esperados con resultados obtenidos.

>NOTA: En JUnit, un Bean puede ser cualquier componente de tu aplicación que desees inicializar o probar.
### Pasos para realizar pruebas en JUnit:
1. En la carpeta de `test` generada por el software que configuró el entorno del proyecto, enfócarse en el paquete correspondiente.
2. Crear un subpaquete (Una subcarpeta en este caso) donde estarán los métodos de prueba JUnit. Es una buena práctica que el nombre del subpaquete se asemeje con el nombre del paquete que contiene el método a probar en la carpeta `main`.
3. Utilizar la anotación `@Test` para marcar los métodos que serán ejecutados como pruebas unitarias.
4. Dependiendo del IDE, simplemente selecciona el archivo de prueba con clic derecho y se ejecuta. En algunos IDEs, puede ser necesario especificar que se ejecute como un proyecto JUnit.

- **Ejemplo Practico 1** 

    - Archivo Principal  `Suma.java`:
    ```java
    package com.usac.backendtest.Suma;

    public class Suma {

        public int Suma(int a, int b) {
            return a + b;
        }
    }
    ```
    - Archivo de Prueba `SumaTest`:
    ``` java
    package com.usac.backendtest.Suma;

    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.assertEquals;

    public class SumaTest {

        Suma suma = new Suma(); //Clase a la que se le realizara una prueba unitaria

        @Before // Para ejecutar algo antes de los metodos test de este archivo
        public void before() {
            System.out.println("Antes de la suma");
        }

        @After // Para ejecutar algo despues de los metodos test de este archivo
        public void after() {
            System.out.println("Despues de la suma");
        }

        @Test
        public void testSuma() {
            int sumaTest = suma.Suma(1,2);
            int resultadoEsperado = 3;
            assertEquals(resultadoEsperado, sumaTest);
        }
    }
    ```
    >NOTA: De preferencia hacer la importación de assertEquals a mano.

    - Resultado de la ejecución:

    ![image](https://github.com/user-attachments/assets/042e6f01-a528-4183-999a-1e02247b4b0f)



## Mockito



## Instalación de Herramientas:
En el caso de querer trabajar spring boot en vscode (u otro editor de codigo) descargar la extension Spring Boot Extension Pack de VMware.

### Spring Boot
#### Creación de un Proyecto en Spring Boot:
Se pueden crear un proyecto en Spring Boot de dos formas principales:
- Desde un IDE, como IntelliJ IDEA.
- Desde su página oficial en [Spring Initializr](https://start.spring.io/).
#### Parámetros clave al crear el proyecto:
- **Group**: Define el nombre de la agrupación a la que pertenece el proyecto. Usualmente sigue el formato de un dominio invertido, por ejemplo, com.nombre.
- **Artifact**: Es el nombre del proyecto o módulo que estás desarrollando, utilizado para identificarlo dentro de la estructura de tu aplicación.
- **Name**: Define el nombre de la carpeta raíz donde se generarán todos los archivos relacionados con el proyecto.
- **Package Name**: Es el nombre completo del paquete principal donde se alojarán las clases base del proyecto, generado combinando Group y Artifact.



### JUnit
De no estar instalado, agregar la siguiente dependencia en el archivo `pom.xml`:

```xml
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <scope>test</scope>
</dependency>
```
### Mockito
Incluir esta dependencia en el archivo `pom.xml`:

```xml
<!-- https://mvnrepository.com/artifact/org.mockito/mockito-core -->
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <scope>test</scope>
</dependency>
```
### Spring Boot Starter Test
Esta dependencia integra las funcionalidades de JUnit y Mockito, eliminando la necesidad de incluir ambas por separado:

```xml
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```
## Errores:
- **Error: No tests found with test runner 'JUnit 5'**

Para resolverlo, agregar esta dependencia al archivo `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <scope>test</scope>
</dependency>
```
>NOTA: Es buena práctica incluir esta dependencia desde el inicio, especialmente al usar JUnit 5.

