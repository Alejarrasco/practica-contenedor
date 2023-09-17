Agregar un endpoint REST al proyecto que implemente lo siguiente

GET /api/v1/task

POST /api/v1/task

DELETE /api/v1/task/v1

# Para construir la imagen Docker
```
docker build -t practicacontenedor:v1 .
docker run -p 8080:8080 practicacontenedor:v1
```