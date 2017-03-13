# poc-springboot
RESTful API with SrpingBoot.

# Dependencies
- Maven
- Java^8

# Install Maven
- To install maven visit : https://maven.apache.org/install.html

# Instructions
- Clone the repository inside your go workspace
- Build the application
```sh
$ mvn spring-boot:run
```

- The app will start at port 8888

# Observations

- To change port of server edit the application.properties inside the common folder.

# The endpoints are as follows:

- GET /estabelecimentos http://localhost:8888/estabelecimentos
- GET /estabelecimentos/:id http://localhost:8888/estabelecimentos/:id
- GET /estabelecimentos http://localhost:8888/estabelecimentos
- GET /estabelecimentos/:id http://localhost:8888/estabelecimentos/:id
- POST /estabelecimentos for creating new widgets http://localhost:8888/estabelecimentos
- PUT /estabelecimentos/:id for updating existing widgets http://localhost:8888/estabelecimentos/:id

# Thanks!