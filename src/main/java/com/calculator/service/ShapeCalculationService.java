package com.calculator.service;

import com.calculator.model.Shape;
import com.calculator.model.dto.ShapeResponseDto;
import com.calculator.service.geometry.GeometryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShapeCalculationService {

    private final ShapeServiceFactory shapeServiceFactory;

    public ShapeResponseDto calculate(Shape shape) {
        String shapeType = shape.getShapeType().getValue();

        GeometryService geometryService = shapeServiceFactory.getShapeService(shapeType);

        double area = geometryService.calculateArea(shape);
        double perimeter = geometryService.calculatePerimeter(shape);

        return ShapeResponseDto.builder()
                .shape(shape)
                .area(area)
                .perimeter(perimeter)
                .build();
    }
}

