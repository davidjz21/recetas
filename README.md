# Recetas API

API REST para gestión de recetas de cocina, desarrollada con Spring Boot.

## Tecnologías

- **Java 17**
- **Spring Boot 4.0.4**
- **Spring Data JPA**
- **H2 Database** (base de datos en memoria)
- **Maven**

## Requisitos

- JDK 17+
- Maven 3.6+

## Instalación

```bash
./mvnw install
```

## Ejecución

```bash
./mvnw spring-boot:run
```

La aplicación estará disponible en `http://localhost:8080`

## Consola H2

Accede a `http://localhost:8080/h2-console` con:
- JDBC URL: `jdbc:h2:mem:recetasdb`
- Username: `sa`
- Password: (vacío)

## API Endpoints

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/recetas` | Listar todas las recetas |
| GET | `/recetas/{id}` | Obtener receta por ID |
| POST | `/recetas` | Crear nueva receta |
| DELETE | `/recetas/{id}` | Eliminar receta |

## Modelo de Datos

```json
{
  "id": 1,
  "nombre": "Ensalada César",
  "ingredientes": "Lechuga, parmesano, crutones, aderezo césar",
  "instrucciones": "Mezclar ingredientes y servir"
}
```

### Validaciones

- `nombre`: obligatorio, máximo 100 caracteres
- `ingredientes`: obligatorio
- `instrucciones`: obligatorio

## Ejemplo de Uso

**Crear receta:**
```bash
curl -X POST http://localhost:8080/recetas \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Tortilla","ingredientes":"Huevos,patatas","instrucciones":"Freir patatas, añadir huevos"}'
```

**Listar recetas:**
```bash
curl http://localhost:8080/recetas
```

## Testing

```bash
./mvnw test
```
