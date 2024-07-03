package com.calculator.service;

import com.calculator.service.geometry.GeometryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class ShapeServiceFactory {

    private final Map<String, GeometryService> shapeServices;

    public GeometryService getShapeService(String shapeType) {
        return shapeServices.get(shapeType);
    }
}