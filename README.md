# Taller de Arquitectura Hexagonal

Importante! Levantar MongoDB en local con docker compose. En el directorio `item-hexagonal`:

``` 
docker compose up 
docker container start mongodb-logistics
```

Una vez levantado, los tests deberían de ejecutarse correctamente.

Cambios realizados:

- Eliminación del repositorio en memoria H2
- Integración de repositorio MongoDB
- Configuración de Spring para MongoDB