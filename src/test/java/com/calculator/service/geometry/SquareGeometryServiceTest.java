package com.calculator.service.geometry;

import com.calculator.model.shapes.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareGeometryServiceTest {

    private SquareGeometryService squareService;
    private double side;
    private Square square;

    @BeforeEach
    public void setUp() {
        squareService = new SquareGeometryService();
        side = 5.0;
        square = new Square(side);
    }

    @Test
    public void testCalculateArea() {
        double expectedArea = side * side;
        double calculatedArea = squareService.calculateArea(square);

        assertEquals(expectedArea, calculatedArea);
    }

    @Test
    public void testCalculatePerimeter() {
        double expectedPerimeter = 4 * 5.0;
        double calculatedPerimeter = squareService.calculatePerimeter(square);

        assertEquals(expectedPerimeter, calculatedPerimeter);
    }
}