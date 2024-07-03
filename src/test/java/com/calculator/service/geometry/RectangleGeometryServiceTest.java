package com.calculator.service.geometry;

import com.calculator.model.shapes.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleGeometryServiceTest {

    private RectangleGeometryService rectangleService;
    private Rectangle rectangle;
    private double length;
    private double width;

    @BeforeEach
    public void setUp() {
        rectangleService = new RectangleGeometryService();
        length = 5.0;
        width = 3.0;
        rectangle = new Rectangle(length, width);
    }

    @Test
    void calculateArea() {
        double expectedArea = length * width;

        double calculatedArea = rectangleService.calculateArea(rectangle);

        assertEquals(expectedArea, calculatedArea);
    }

    @Test
    void calculatePerimeter() {
        double expectedPerimeter = 2 * (length + width);

        double calculatedPerimeter = rectangleService.calculatePerimeter(rectangle);

        assertEquals(expectedPerimeter, calculatedPerimeter);
    }
}