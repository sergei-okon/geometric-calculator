package com.calculator.service;

import com.calculator.model.dto.ShapeResponseDto;
import com.calculator.model.enums.ShapeType;
import com.calculator.model.shapes.Circle;
import com.calculator.model.shapes.Rectangle;
import com.calculator.model.shapes.Square;
import com.calculator.model.shapes.Triangle;
import com.calculator.service.geometry.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ShapeCalculationServiceTest {

    private ShapeCalculationService shapeCalculationService;
    private ShapeServiceFactory shapeServiceFactory;

    @BeforeEach
    public void setUp() {
        shapeServiceFactory = mock(ShapeServiceFactory.class);
        shapeCalculationService = new ShapeCalculationService(shapeServiceFactory);
    }

    @Test
    public void testCalculateSquare() {
        Square square = new Square(5.0);
        square.setShapeType(ShapeType.SQUARE);

        GeometryService squareGeometryService = mock(SquareGeometryService.class);
        when(shapeServiceFactory.getShapeService(ShapeType.SQUARE.getValue())).thenReturn(squareGeometryService);
        when(squareGeometryService.calculateArea(square)).thenReturn(25.0);
        when(squareGeometryService.calculatePerimeter(square)).thenReturn(20.0);

        ShapeResponseDto responseDto = shapeCalculationService.calculate(square);

        assertEquals(square, responseDto.getShape());
        assertEquals(25.0, responseDto.getArea());
        assertEquals(20.0, responseDto.getPerimeter());
    }

    @Test
    public void testCalculateRectangle() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        rectangle.setShapeType(ShapeType.RECTANGLE);

        GeometryService rectangleGeometryService = mock(RectangleGeometryService.class);
        when(shapeServiceFactory.getShapeService(ShapeType.RECTANGLE.getValue())).thenReturn(rectangleGeometryService);
        when(rectangleGeometryService.calculateArea(rectangle)).thenReturn(12.0);
        when(rectangleGeometryService.calculatePerimeter(rectangle)).thenReturn(14.0);

        ShapeResponseDto responseDto = shapeCalculationService.calculate(rectangle);

        assertEquals(rectangle, responseDto.getShape());
        assertEquals(12.0, responseDto.getArea());
        assertEquals(14.0, responseDto.getPerimeter());
    }

    @Test
    public void testCalculateTriangle() {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        triangle.setShapeType(ShapeType.TRIANGLE);

        GeometryService triangleGeometryService = mock(TriangleGeometryService.class);
        when(shapeServiceFactory.getShapeService(ShapeType.TRIANGLE.getValue())).thenReturn(triangleGeometryService);
        when(triangleGeometryService.calculateArea(triangle)).thenReturn(6.0);
        when(triangleGeometryService.calculatePerimeter(triangle)).thenReturn(12.0);

        ShapeResponseDto responseDto = shapeCalculationService.calculate(triangle);

        assertEquals(triangle, responseDto.getShape());
        assertEquals(6.0, responseDto.getArea());
        assertEquals(12.0, responseDto.getPerimeter());
    }

    @Test
    public void testCalculateCircle() {
        Circle circle = new Circle(5.0);
        circle.setShapeType(ShapeType.CIRCLE);

        GeometryService circleGeometryService = mock(CircleGeometryService.class);
        when(shapeServiceFactory.getShapeService(ShapeType.CIRCLE.getValue())).thenReturn(circleGeometryService);
        when(circleGeometryService.calculateArea(circle)).thenReturn(78.54);
        when(circleGeometryService.calculatePerimeter(circle)).thenReturn(31.42);

        ShapeResponseDto responseDto = shapeCalculationService.calculate(circle);

        assertEquals(circle, responseDto.getShape());
        assertEquals(78.54, responseDto.getArea(), 0.01);
        assertEquals(31.42, responseDto.getPerimeter(), 0.01);
    }
}
