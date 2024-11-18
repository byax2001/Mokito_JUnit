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

### 2. **Pruebas No Funcionales**
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

## Herramientas:
En el caso de querer trabajar spring boot en vscode (u otro editor de codigo) descargar la extension Spring Boot Extension Pack de VMware.
