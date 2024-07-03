package com.calculator.service.geometry;

import com.calculator.model.shapes.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleGeometryServiceTest {

    private TriangleGeometryService triangleService;
    private Triangle triangle;
    private double sideA;
    private double sideB;
    private double sideC;

    @BeforeEach
    public void setUp() {
        triangleService = new TriangleGeometryService();
        sideA = 5.0;
        sideB = 3.0;
        sideC = 4.0;
        triangle = new Triangle(sideA, sideB, sideC);
    }

    @Test
    void calculateArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double expectedArea = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        double calculatedArea = triangleService.calculateArea(triangle);

        assertEquals(expectedArea, calculatedArea);
    }

    @Test
    void calculatePerimeter() {
        double expectedPerimeter = sideA + sideB + sideC;

        double calculatedPerimeter = triangleService.calculatePerimeter(triangle);

        assertEquals(expectedPerimeter, calculatedPerimeter);
    }
}