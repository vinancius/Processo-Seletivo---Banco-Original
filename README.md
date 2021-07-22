# Processo-Seletivo---Banco-Original

### Let’s build and run the program, that uses JAVA 11. Open a command line (or terminal) and navigate to the folder where you have the project files. We can build and run the application by issuing the following command:

* MacOS/Linux:
  
    `./mvnw spring-boot:run`
  

* Windows:
  
     `mvnw spring-boot:run`

## Applied Features

### Save Graph
- Endpoint: /graph
- HTTP Method: POST
- HTTP Success Response Code: CREATED (201)

### List Graph
- Endpoint: /graph/<graphId>
- HTTP Method: GET
- HTTP Success Response Code: OK (200)
- HTTP Error Response Code: NOT FOUND (404)

##Applied Unit Tests

- GrafoController

