# pa2_api_u1_p6_jpl
# Proyecto Quarkus - Ambitos y Contextos CDI en Consola

Este proyecto demuestra el comportamiento de los contextos de CDI en Quarkus utilizando una aplicación de consola.

Se implementa una lógica simple basada en generación de valores (contador), con el objetivo de observar cómo cada contexto maneja el estado y las instancias.

Contextos utilizados:
- ApplicationScoped
- Dependent
- Singleton

---

## ApplicationScoped

Este contexto mantiene **una única instancia durante toda la ejecución de la aplicación**, por lo que el estado se comparte globalmente.

### Ejemplo 1: Contador Global de Usuarios
Cada vez que se registra un usuario, el contador aumenta globalmente.

contador.incrementar(); 
contador.incrementar(); 

### Ejemplo 2: Contador de productos vendidos
Se aumenta el valor para incrementar la cantidad de ventas realizadas

venta.incrementar(); 
venta.incrementar(); 

### Ejemplo 3: Contador de accesos al sistema
El valor incrementa con cada acceso hecho dentro del sistema

acceso.incrementar();
acceso.incrementar(); 

### Ejemplo 4: Contador de pedidos procesados
Mantener registrado cuantos pedidos fueron realizados

pedido.incrementar();
pedido.incrementar(); 

### Ejemplo 5: Contador de logs generados
Útil para métricas globales

log.incrementar(); 
log.incrementar(); 

### Ejemplo 6: Contador de conexiones activas
Utilizado para que todos puedan visualizar un mismo número

conexion.incrementar(); 
conexion.incrementar(); 

### Ejemplo 7: Contador de operaciones realizadas
Método de ejemplo para evaluar la persistencia durante la operacion

operacion.incrementar();
operacion.incrementar();

---

## Dependant

Este contexto **crea una nueva instancia cada vez que se inyecta**, por lo que el estado no se comparte.

### Ejemplo 1: Contador temporal de sesión
El contador incrementa dentro de la misma instancia temporal.

temp.incrementar();
temp.incrementar(); 

### Ejemplo 2: Contador de prueba
Se crea una nueva instancia y el contador comienza desde cero.

test.incrementar();

### Ejemplo 3: Contador de cálculo temporal
Cada nueva inyección no es capaz de guardar el estado entre usos.

calc.incrementar();

### Ejemplo 4: Contador de validaciones
Cada inyeccion crea un nuevo objeto dentro de cada operación

val.incrementar();

### Ejemplo 5: Contador de procesos cortos
Dentro de la misma instancia, el contador funciona normalmente.

proc.incrementar();

### Ejemplo 6: Contador de tareas individuales
Cada vez que se inyecta, se genera un nuevo ciclo de ejecución.

task.incrementar(); 

### Ejemplo 7: Contador de ejecuciones
El valor no se conserva entre diferentes usos o clases.

exec.incrementar();

---

## Singleton

Este contexto garantiza una **única instancia global en toda la aplicación**, compartiendo estado en todos los puntos donde se utilice.

### Ejemplo 1: Generador único de IDs
El contador incrementa en una única instancia global, por lo que nunca se duplica.

id.generar(); 
id.generar(); 

### Ejemplo 2: Contador de sistema
Todos los componentes comparten el mismo estado global.

sys.incrementar(); 
sys.incrementar(); 

### Ejemplo 3: Controlador de recursos
Se utiliza la misma instancia en otra clase y el valor continúa.

recurso.incrementar();

### Ejemplo 4: Registro de eventos
El valor se mantiene durante toda la ejecución del sistema.

evento.incrementar(); 
evento.incrementar(); 

### Ejemplo 5: Contador de errores
Puede utilizarser para mantener un estado único global

error.incrementar(); 
error.incrementar(); 

### Ejemplo 6: Monitor del sistema
Las llamadas siguen acumulando el valor sin reinicio.

monitor.incrementar();

### Ejemplo 7: Control de sesiones activas
El valor incrementado en la instancia es compartido en toda la app

sesion.incrementar(); 
sesion.incrementar(); 
