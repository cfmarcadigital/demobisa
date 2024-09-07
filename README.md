# Project

* Demo Bisa

# Technology

* Java 17
* SpringBoot 3.3.3
* Maven 3.9.8
* Database H2 in memory

# Installation local

```bash
mvn clean
mvn compile
mvn install
mvn spring-boot:run
```

# Installation Docker

Instructions dockerfile 

````bash
FROM eclipse-temurin:17-jdk-alpine

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo JAR desde el directorio target de tu proyecto al contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

# Exponer el puerto en el que corre la aplicación (por defecto es 8080)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]
````

Execute docker image

```bash
docker run -dt demobisa
```

Generate docker image

```bash
docker build -t demobisa .
```