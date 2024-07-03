package com.calculator.service.geometry;

import com.calculator.model.shapes.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleGeometryServiceTest {

    private CircleGeometryService circleGeometryService;
    private Circle circle;
    private double radius;

    @BeforeEach
    public void setUp() {
        circleGeometryService = new CircleGeometryService();
        radius = 5.0;
        circle = new Circle(radius);
    }

    @Test
    void calculateArea() {
        double expectedArea = Math.PI * radius * radius;

        double calculatedArea = circleGeometryService.calculateArea(circle);

        assertEquals(expectedArea, calculatedArea);
    }

    @Test
    void calculatePerimeter() {
        double expectedPerimeter = 2 * Math.PI * radius;

        double calculatedPerimeter = circleGeometryService.calculatePerimeter(circle);

        assertEquals(expectedPerimeter, calculatedPerimeter);
    }
}