Geometric Calculator
The Geometric Calculator is a Spring Boot application that provides REST API endpoints to calculate the area and
perimeter of geometric shapes such as square, rectangle, triangle, and circle.

Technologies Used
Java 8
Spring Boot 2.7.1
Swagger 2 for API documentation
Lombok for reducing boilerplate code

Getting Started
Prerequisites
Java 8 or higher
Gradle build tool

Installation
Clone the repository:
git clone <https://github.com/sergei-okon/geometric-calculator>
cd geometric-calculator

Run the application using Docker:
run script from root build_and_run_geo_calculator.ps1 for windows or build_and_run_geo_calculator.sh for linux

API Documentation
API documentation is provided using Swagger. After starting the application, you can access the Swagger UI to explore
and test the APIs:

Swagger: http://localhost:8080/v2/api-docs

Endpoints
POST http://localhost:8080/api/v1/shape/calculate

Calculates the area and perimeter of a shape based on the provided JSON shape object. Supported shapes are square,
rectangle, triangle, and circle.

Request Body Example:
{
"type": "square",
"side": 5.0
}

{
"type": "circle",
"radius": 7.0
}

{
"type": "rectangle",
"length": 5.0,
"width": 3.0
}

{
"type": "triangle",
"sideA": 3.0,
"sideB": 4.0,
"sideC": 5.0
}

Response Example:
{
"shape": {
"type": "rectangle",
"length": 5.0,
"width": 3.0
},
"area": 15.0,
"perimeter": 16.0
}

Postman Collection:
You can import the Postman collection to test the API endpoints from the /postman folder.
